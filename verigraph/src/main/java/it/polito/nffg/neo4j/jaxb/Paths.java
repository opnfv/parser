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
 *       &lt;choice>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/choice>
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
    "message",
    "path"
})
@XmlRootElement(name = "paths", namespace = "http://www.example.org/response/")
public class Paths {

    @XmlElement(namespace = "http://www.example.org/response/")
    protected String message;
    @XmlElement(namespace = "http://www.example.org/response/")
    protected List<String> path;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "direction")
    protected String direction;

    /**
     * Gets the value of the message property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the path property.
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPath().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPath() {
        if (path == null) {
            path = new ArrayList<String>();
        }
        return this.path;
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
