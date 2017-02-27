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
 * <p>Java class for nfType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="nfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specification" type="{http://www.example.org/nffg/}specType"/>
 *         &lt;element name="connection_points" type="{http://www.example.org/nffg/}cpointsType"/>
 *         &lt;element name="control_interfaces" type="{http://www.example.org/nffg/}ctrlInterfacesType"/>
 *         &lt;element name="monitoring_parameters" type="{http://www.example.org/nffg/}monParamsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.example.org/nffg/}nfIdType" />
 *       &lt;attribute name="functionalType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nfType", propOrder = {
    "specification",
    "connectionPoints",
    "controlInterfaces",
    "monitoringParameters"
})
public class NfType {

    @XmlElement(required = true)
    protected SpecType specification;
    @XmlElement(name = "connection_points", required = true)
    protected CpointsType connectionPoints;
    @XmlElement(name = "control_interfaces", required = true)
    protected CtrlInterfacesType controlInterfaces;
    @XmlElement(name = "monitoring_parameters", required = true)
    protected MonParamsType monitoringParameters;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "functionalType", required = true)
    protected String functionalType;

    /**
     * Gets the value of the specification property.
     * @return
     *     possible object is
     *     {@link SpecType }
     */
    public SpecType getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * @param value
     *     allowed object is
     *     {@link SpecType }
     */
    public void setSpecification(SpecType value) {
        this.specification = value;
    }

    /**
     * Gets the value of the connectionPoints property.
     * @return
     *     possible object is
     *     {@link CpointsType }
     */
    public CpointsType getConnectionPoints() {
        return connectionPoints;
    }

    /**
     * Sets the value of the connectionPoints property.
     * @param value
     *     allowed object is
     *     {@link CpointsType }
     */
    public void setConnectionPoints(CpointsType value) {
        this.connectionPoints = value;
    }

    /**
     * Gets the value of the controlInterfaces property.
     * @return
     *     possible object is
     *     {@link CtrlInterfacesType }
     */
    public CtrlInterfacesType getControlInterfaces() {
        return controlInterfaces;
    }

    /**
     * Sets the value of the controlInterfaces property.
     * @param value
     *     allowed object is
     *     {@link CtrlInterfacesType }
     */
    public void setControlInterfaces(CtrlInterfacesType value) {
        this.controlInterfaces = value;
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
     * Gets the value of the functionalType property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getFunctionalType() {
        return functionalType;
    }

    /**
     * Sets the value of the functionalType property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setFunctionalType(String value) {
        this.functionalType = value;
    }

}
