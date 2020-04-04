
package com.mycompany.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addData" type="{http://services.mycompany.com/}assignmentMovie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addData", propOrder = {
    "addData"
})
public class AddData {

    protected AssignmentMovie addData;

    /**
     * Gets the value of the addData property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentMovie }
     *     
     */
    public AssignmentMovie getAddData() {
        return addData;
    }

    /**
     * Sets the value of the addData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentMovie }
     *     
     */
    public void setAddData(AssignmentMovie value) {
        this.addData = value;
    }

}
