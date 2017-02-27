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
 * <p>Java class for neType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="neType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eps-cps" type="{http://www.example.org/nffg/}eps-cpsType"/>
 *         &lt;element name="monitoring_parameters" type="{http://www.example.org/nffg/}monParamsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.example.org/nffg/}neIdType" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "neType", propOrder = {
    "epsCps",
    "monitoringParameters"
})
public class NeType {

    @XmlElement(name = "eps-cps", required = true)
    protected EpsCpsType epsCps;
    @XmlElement(name = "monitoring_parameters", required = true)
    protected MonParamsType monitoringParameters;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the epsCps property.
     * @return
     *     possible object is
     *     {@link EpsCpsType }
     */
    public EpsCpsType getEpsCps() {
        return epsCps;
    }

    /**
     * Sets the value of the epsCps property.
     * @param value
     *     allowed object is
     *     {@link EpsCpsType }
     */
    public void setEpsCps(EpsCpsType value) {
        this.epsCps = value;
    }

    /**
     * Gets the value of the monitoringParameters property.
     * @return
     *     possible object is
     *     {@link MonParamsType }
     */
    public MonParamsType getMonitoringParameters() {
        return monitoringParameters;
    }

    /**
     * Sets the value of the monitoringParameters property.
     * @param value
     *     allowed object is
     *     {@link MonParamsType }
     */
    public void setMonitoringParameters(MonParamsType value) {
        this.monitoringParameters = value;
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

    /**
     * Gets the value of the type property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getType() {
        return type;
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
