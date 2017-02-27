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
 *         &lt;element name="endpoints" type="{http://www.example.org/nffg/}epointsType"/>
 *         &lt;element name="network_functions" type="{http://www.example.org/nffg/}nfunctionsType"/>
 *         &lt;element name="network_elements" type="{http://www.example.org/nffg/}nelementsType"/>
 *         &lt;element name="monitoring_parameters" type="{http://www.example.org/nffg/}monParamsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.example.org/nffg/}nffgIdType" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "endpoints",
    "networkFunctions",
    "networkElements",
    "monitoringParameters"
})
@XmlRootElement(name = "nffg")
public class Nffg {

    @XmlElement(required = true)
    protected EpointsType endpoints;
    @XmlElement(name = "network_functions", required = true)
    protected NfunctionsType networkFunctions;
    @XmlElement(name = "network_elements", required = true)
    protected NelementsType networkElements;
    @XmlElement(name = "monitoring_parameters", required = true)
    protected MonParamsType monitoringParameters;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the endpoints property.
     * @return
     *     possible object is
     *     {@link EpointsType }
     */
    public EpointsType getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the value of the endpoints property.
     * @param value
     *     allowed object is
     *     {@link EpointsType }
     */
    public void setEndpoints(EpointsType value) {
        this.endpoints = value;
    }

    /**
     * Gets the value of the networkFunctions property.
     * @return
     *     possible object is
     *     {@link NfunctionsType }
     */
    public NfunctionsType getNetworkFunctions() {
        return networkFunctions;
    }

    /**
     * Sets the value of the networkFunctions property.
     * @param value
     *     allowed object is
     *     {@link NfunctionsType }
     */
    public void setNetworkFunctions(NfunctionsType value) {
        this.networkFunctions = value;
    }

    /**
     * Gets the value of the networkElements property.
     * @return
     *     possible object is
     *     {@link NelementsType }
     */
    public NelementsType getNetworkElements() {
        return networkElements;
    }

    /**
     * Sets the value of the networkElements property.
     * @param value
     *     allowed object is
     *     {@link NelementsType }
     */
    public void setNetworkElements(NelementsType value) {
        this.networkElements = value;
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
     * Gets the value of the version property.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
