/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package it.polito.nffg.neo4j.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpointsType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="cpointsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connection_point" type="{http://www.example.org/nffg/}cpType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpointsType", propOrder = {
    "connectionPoint"
})
public class CpointsType {

    @XmlElement(name = "connection_point", required = true)
    protected List<CpType> connectionPoint;

    /**
     * Gets the value of the connectionPoint property.
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionPoint().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CpType }
     */
    public List<CpType> getConnectionPoint() {
        if (connectionPoint == null) {
            connectionPoint = new ArrayList<CpType>();
        }
        return this.connectionPoint;
    }

}
