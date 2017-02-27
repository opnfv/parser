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
 * <p>Java class for epType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="epType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flowspace">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.example.org/nffg/}L2HeaderParameters"/>
 *                   &lt;group ref="{http://www.example.org/nffg/}L3HeaderParameters"/>
 *                   &lt;group ref="{http://www.example.org/nffg/}L4HeaderParameters"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ingPhysPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.example.org/nffg/}epIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "epType", propOrder = {
    "flowspace"
})
public class EpType {

    @XmlElement(required = true)
    protected EpType.Flowspace flowspace;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the flowspace property.
     * @return
     *     possible object is
     *     {@link EpType.Flowspace }
     */
    public EpType.Flowspace getFlowspace() {
        return flowspace;
    }

    /**
     * Sets the value of the flowspace property.
     * @param value
     *     allowed object is
     *     {@link EpType.Flowspace }
     */
    public void setFlowspace(EpType.Flowspace value) {
        this.flowspace = value;
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
     * <p>Java class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.example.org/nffg/}L2HeaderParameters"/>
     *         &lt;group ref="{http://www.example.org/nffg/}L3HeaderParameters"/>
     *         &lt;group ref="{http://www.example.org/nffg/}L4HeaderParameters"/>
     *       &lt;/sequence>
     *       &lt;attribute name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ingPhysPort" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mac",
        "ip",
        "tcp",
        "udp"
    })
    public static class Flowspace {

        protected it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Mac mac;
        protected it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Ip ip;
        protected it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Tcp tcp;
        protected it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Udp udp;
        @XmlAttribute(name = "nodeId")
        protected String nodeId;
        @XmlAttribute(name = "ingPhysPort")
        protected String ingPhysPort;

        /**
         * Gets the value of the mac property.
         * @return
         *     possible object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Mac }
         */
        public it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Mac getMac() {
            return mac;
        }

        /**
         * Sets the value of the mac property.
         * @param value
         *     allowed object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Mac }
         */
        public void setMac(it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Mac value) {
            this.mac = value;
        }

        /**
         * Gets the value of the ip property.
         * @return
         *     possible object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Ip }
         */
        public it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Ip getIp() {
            return ip;
        }

        /**
         * Sets the value of the ip property.
         * @param value
         *     allowed object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Ip }
         */
        public void setIp(it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Ip value) {
            this.ip = value;
        }

        /**
         * Gets the value of the tcp property.
         * @return
         *     possible object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Tcp }
         */
        public it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Tcp getTcp() {
            return tcp;
        }

        /**
         * Sets the value of the tcp property.
         * @param value
         *     allowed object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Tcp }
         */
        public void setTcp(it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Tcp value) {
            this.tcp = value;
        }

        /**
         * Gets the value of the udp property.
         * @return
         *     possible object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Udp }
         */
        public it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Udp getUdp() {
            return udp;
        }

        /**
         * Sets the value of the udp property.
         * @param value
         *     allowed object is
         *     {@link it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Udp }
         */
        public void setUdp(it.polito.nffg.neo4j.jaxb.FlowrulesType.Flowspace.Udp value) {
            this.udp = value;
        }

        /**
         * Gets the value of the nodeId property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getNodeId() {
            return nodeId;
        }

        /**
         * Sets the value of the nodeId property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setNodeId(String value) {
            this.nodeId = value;
        }

        /**
         * Gets the value of the ingPhysPort property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getIngPhysPort() {
            return ingPhysPort;
        }

        /**
         * Sets the value of the ingPhysPort property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setIngPhysPort(String value) {
            this.ingPhysPort = value;
        }

    }

}
