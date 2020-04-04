/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import com.mycompany.services.Assignment1MovieService;
import com.mycompany.services.Assignment1MovieService_Service;
import com.mycompany.services.AssignmentMovie;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.Convert;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.SOAPFaultException;

/**
 *
 * @author rishi
 */
@WebServlet(name = "MoviesServlet", urlPatterns = {"/MoviesServlet"})
@MultipartConfig
@WebListener
public class MoviesServlet extends HttpServlet implements ServletContextListener{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MoviesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MoviesServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         this.loadMovies(request);
        RequestDispatcher dispacher = request.getRequestDispatcher("/ListMovie.jsp");
        dispacher.forward(request, response);
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String addPage = request.getParameter("addPage");
        String addMovie = request.getParameter("addMovie");
        String deleteMovie = request.getParameter("deleteMovie");
        String updateid = request.getParameter("updateid");
        String updateMovie = request.getParameter("updateMovie");
        HttpSession session = request.getSession();
 
Assignment1MovieService_Service service = new Assignment1MovieService_Service();
Assignment1MovieService port = service.getAssignment1MovieServicePort();

        if (addMovie != null || updateMovie != null) {
            String title = request.getParameter("title");
            String description = request.getParameter("description");
            String producer = request.getParameter("producer");
            String director = request.getParameter("director");
            Double budget = null;
            try{
                 budget = Double.parseDouble(request.getParameter("budget"));
            }
            catch (NumberFormatException e) {
                request.setAttribute("error", "Error!!! Budget must contain a numeric double value only.");
                RequestDispatcher dispacher = request.getRequestDispatcher("/AddMovie.jsp");
                dispacher.forward(request, response);
            }
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = null;
            try {
                date1 = format.parse(request.getParameter("releasedate"));
            } catch (ParseException ex) {
                Logger.getLogger(MoviesServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTime(date1);
            XMLGregorianCalendar calendar = null;
            try {
                calendar = DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(
                                gregory);
            } catch (DatatypeConfigurationException ex) {
                Logger.getLogger(MoviesServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(calendar);

            AssignmentMovie movie = new AssignmentMovie();
            movie.setTitle(title);
            movie.setDescription(description);
            movie.setProducer(producer);
            movie.setDirector(director);
            movie.setBudget(budget);
            movie.setReleaseDate(calendar);
            
            try {
                    Part part = null;
                    byte[] buffer ;
                    part = request.getPart("img");
                    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                    InputStream filecontent = part.getInputStream();
                    if(part.getSize() <= 0){
                        buffer = new byte[(int)(session.getAttribute("oldImg").toString().length())];
                        buffer = (byte[])session.getAttribute("oldImg");
                    }
    //                ImageIO.read(filecontent).toString();
                    else{
                        buffer = new byte[(int) part.getSize()];
                        int read = 0;
                        while ((read = filecontent.read(buffer)) != -1) {
                            bytes.write(buffer, 0, read);
                        }
                    }
                    
                movie.setImage(buffer);
                if (addMovie != null) {
                    port.addData(movie);
                } else {
                    int movieid = Integer.parseInt((session.getAttribute("movieid").toString()));
                    movie.setId(BigDecimal.valueOf(movieid));
                    port.updateData(movie);
                }
            }
            catch (SOAPFaultException ex) {
                request.setAttribute("handlerError", "Copyright Issues!!! Cannot add a movie with the name 'Disney' in any field.");
                RequestDispatcher dispacher = request.getRequestDispatcher("/AddMovie.jsp");
                dispacher.forward(request, response);
            } catch (IOException | ServletException ex){
                request.setAttribute("imageError", "Please upload a valid image.");
                RequestDispatcher dispacher = request.getRequestDispatcher("/AddMovie.jsp");
                dispacher.forward(request, response);
            }
            System.out.println("trying to redirect");
            this.loadMovies(request);
            RequestDispatcher dispacher = request.getRequestDispatcher("/ListMovie.jsp");
            dispacher.forward(request, response);
        }

        if (deleteMovie != null) {
            int movieId = Integer.parseInt(deleteMovie);
            port.removeData(BigDecimal.valueOf(movieId));
            this.loadMovies(request);
            RequestDispatcher dispacher = request.getRequestDispatcher("/ListMovie.jsp");
            dispacher.forward(request, response);
        }

        if (updateid!= null) {
            int movieId = Integer.parseInt(updateid);
            AssignmentMovie movie = port.findData(BigDecimal.valueOf(movieId));
            byte[] imageData = movie.getImage();
            String base64Image = Base64.getEncoder().encodeToString(imageData);
            session.setAttribute("oldImg", imageData);
            request.setAttribute("uploadedImg", base64Image);
            session.setAttribute("movieid", updateid);
            request.setAttribute("movie", movie);
            RequestDispatcher dispacher = request.getRequestDispatcher("/UpdateMovie.jsp");
            dispacher.forward(request, response);
        }
        if (addPage != null) {
            RequestDispatcher dispacher = request.getRequestDispatcher("/AddMovie.jsp");
            dispacher.forward(request, response);
        }

        processRequest(request, response);
    }

    

      private void loadMovies(HttpServletRequest request) {
       Assignment1MovieService_Service service = new Assignment1MovieService_Service();
        Assignment1MovieService port = service.getAssignment1MovieServicePort();
        List<AssignmentMovie> movies = port.displayData();
        ArrayList<String> base64images = new ArrayList<>(); 
        ArrayList<String> dates = new ArrayList<>(); 
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        for (AssignmentMovie mov : movies){
            GregorianCalendar gCalendar = mov.getReleaseDate().toGregorianCalendar();
            Date date = gCalendar.getTime();
            dates.add(df.format(date));
            byte[] bytearray = mov.getImage();
            base64images.add(Base64.getEncoder().encodeToString(bytearray));
        } 
        request.setAttribute("dates", dates);
        request.setAttribute("image", base64images);
        request.setAttribute("movie", movies);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
