/*******************************************************************************
 * Copyright (c) 2017 Politecnico di Torino and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/

package it.polito.nffg.neo4j.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="cpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="port" type="{http://www.example.org/nffg/}portType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.example.org/nffg/}cpIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpType", propOrder = {
    "port"
})
public class CpType {

    @XmlElement(required = true)
    protected PortType port;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the port property.
     * @return
     *     possible object is
     *     {@link PortType }
     */
    public PortType getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * @param value
     *     allowed object is
     *     {@link PortType }
     */
    public void setPort(PortType value) {
        this.port = value;
    }

    /**
     * Gets the value of the id property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

}
