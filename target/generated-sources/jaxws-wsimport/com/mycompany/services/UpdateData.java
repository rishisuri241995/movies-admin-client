
package com.mycompany.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateData" type="{http://services.mycompany.com/}assignmentMovie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateData", propOrder = {
    "updateData"
})
public class UpdateData {

    protected AssignmentMovie updateData;

    /**
     * Gets the value of the updateData property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentMovie }
     *     
     */
    public AssignmentMovie getUpdateData() {
        return updateData;
    }

    /**
     * Sets the value of the updateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentMovie }
     *     
     */
    public void setUpdateData(AssignmentMovie value) {
        this.updateData = value;
    }

}
