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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for portType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="portType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="direction" use="required" type="{http://www.example.org/nffg/}portDirEnumType" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portType")
public class PortType {

    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int id;
    @XmlAttribute(name = "direction", required = true)
    protected PortDirEnumType direction;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the id property.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the direction property.
     * @return
     *     possible object is
     *     {@link PortDirEnumType }
     */
    public PortDirEnumType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * @param value
     *     allowed object is
     *     {@link PortDirEnumType }
     */
    public void setDirection(PortDirEnumType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the type property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getType() {
        if (type == null) {
            return "N.A.";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
