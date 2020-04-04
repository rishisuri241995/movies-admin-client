
package com.mycompany.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AssignmentMovie_QNAME = new QName("http://services.mycompany.com/", "assignmentMovie");
    private final static QName _AddData_QNAME = new QName("http://services.mycompany.com/", "addData");
    private final static QName _DisplayData_QNAME = new QName("http://services.mycompany.com/", "displayData");
    private final static QName _RemoveDataResponse_QNAME = new QName("http://services.mycompany.com/", "removeDataResponse");
    private final static QName _RemoveData_QNAME = new QName("http://services.mycompany.com/", "removeData");
    private final static QName _UpdateDataResponse_QNAME = new QName("http://services.mycompany.com/", "updateDataResponse");
    private final static QName _AddDataResponse_QNAME = new QName("http://services.mycompany.com/", "addDataResponse");
    private final static QName _FindData_QNAME = new QName("http://services.mycompany.com/", "findData");
    private final static QName _FindDataResponse_QNAME = new QName("http://services.mycompany.com/", "findDataResponse");
    private final static QName _UpdateData_QNAME = new QName("http://services.mycompany.com/", "updateData");
    private final static QName _DisplayDataResponse_QNAME = new QName("http://services.mycompany.com/", "displayDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindDataResponse }
     * 
     */
    public FindDataResponse createFindDataResponse() {
        return new FindDataResponse();
    }

    /**
     * Create an instance of {@link UpdateData }
     * 
     */
    public UpdateData createUpdateData() {
        return new UpdateData();
    }

    /**
     * Create an instance of {@link DisplayDataResponse }
     * 
     */
    public DisplayDataResponse createDisplayDataResponse() {
        return new DisplayDataResponse();
    }

    /**
     * Create an instance of {@link AssignmentMovie }
     * 
     */
    public AssignmentMovie createAssignmentMovie() {
        return new AssignmentMovie();
    }

    /**
     * Create an instance of {@link AddData }
     * 
     */
    public AddData createAddData() {
        return new AddData();
    }

    /**
     * Create an instance of {@link DisplayData }
     * 
     */
    public DisplayData createDisplayData() {
        return new DisplayData();
    }

    /**
     * Create an instance of {@link RemoveDataResponse }
     * 
     */
    public RemoveDataResponse createRemoveDataResponse() {
        return new RemoveDataResponse();
    }

    /**
     * Create an instance of {@link RemoveData }
     * 
     */
    public RemoveData createRemoveData() {
        return new RemoveData();
    }

    /**
     * Create an instance of {@link UpdateDataResponse }
     * 
     */
    public UpdateDataResponse createUpdateDataResponse() {
        return new UpdateDataResponse();
    }

    /**
     * Create an instance of {@link AddDataResponse }
     * 
     */
    public AddDataResponse createAddDataResponse() {
        return new AddDataResponse();
    }

    /**
     * Create an instance of {@link FindData }
     * 
     */
    public FindData createFindData() {
        return new FindData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "assignmentMovie")
    public JAXBElement<AssignmentMovie> createAssignmentMovie(AssignmentMovie value) {
        return new JAXBElement<AssignmentMovie>(_AssignmentMovie_QNAME, AssignmentMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "addData")
    public JAXBElement<AddData> createAddData(AddData value) {
        return new JAXBElement<AddData>(_AddData_QNAME, AddData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "displayData")
    public JAXBElement<DisplayData> createDisplayData(DisplayData value) {
        return new JAXBElement<DisplayData>(_DisplayData_QNAME, DisplayData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "removeDataResponse")
    public JAXBElement<RemoveDataResponse> createRemoveDataResponse(RemoveDataResponse value) {
        return new JAXBElement<RemoveDataResponse>(_RemoveDataResponse_QNAME, RemoveDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "removeData")
    public JAXBElement<RemoveData> createRemoveData(RemoveData value) {
        return new JAXBElement<RemoveData>(_RemoveData_QNAME, RemoveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "updateDataResponse")
    public JAXBElement<UpdateDataResponse> createUpdateDataResponse(UpdateDataResponse value) {
        return new JAXBElement<UpdateDataResponse>(_UpdateDataResponse_QNAME, UpdateDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "addDataResponse")
    public JAXBElement<AddDataResponse> createAddDataResponse(AddDataResponse value) {
        return new JAXBElement<AddDataResponse>(_AddDataResponse_QNAME, AddDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "findData")
    public JAXBElement<FindData> createFindData(FindData value) {
        return new JAXBElement<FindData>(_FindData_QNAME, FindData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "findDataResponse")
    public JAXBElement<FindDataResponse> createFindDataResponse(FindDataResponse value) {
        return new JAXBElement<FindDataResponse>(_FindDataResponse_QNAME, FindDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "updateData")
    public JAXBElement<UpdateData> createUpdateData(UpdateData value) {
        return new JAXBElement<UpdateData>(_UpdateData_QNAME, UpdateData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "displayDataResponse")
    public JAXBElement<DisplayDataResponse> createDisplayDataResponse(DisplayDataResponse value) {
        return new JAXBElement<DisplayDataResponse>(_DisplayDataResponse_QNAME, DisplayDataResponse.class, null, value);
    }

}
