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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "response"
})
@XmlRootElement(name = "property", namespace = "http://www.example.org/response/")
public class Property {

    @XmlElement(namespace = "http://www.example.org/response/", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.example.org/response/")
    protected boolean response;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "direction")
    protected String direction;

    /**
     * Gets the value of the name property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the response property.
     */
    public boolean isResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     */
    public void setResponse(boolean value) {
        this.response = value;
    }

    /**
     * Gets the value of the source property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the direction property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
