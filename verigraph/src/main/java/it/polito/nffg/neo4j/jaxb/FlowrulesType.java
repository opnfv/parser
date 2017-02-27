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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flowrulesType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="flowrulesType">
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
 *                 &lt;attribute name="ingPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actions" type="{http://www.example.org/nffg/}actionsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowrulesType", propOrder = {
    "flowspace",
    "actions"
})
public class FlowrulesType {

    @XmlElement(required = true)
    protected FlowrulesType.Flowspace flowspace;
    @XmlElement(required = true)
    protected ActionsType actions;

    /**
     * Gets the value of the flowspace property.
     * @return
     *     possible object is
     *     {@link FlowrulesType.Flowspace }
     */
    public FlowrulesType.Flowspace getFlowspace() {
        return flowspace;
    }

    /**
     * Sets the value of the flowspace property.
     * @param value
     *     allowed object is
     *     {@link FlowrulesType.Flowspace }
     */
    public void setFlowspace(FlowrulesType.Flowspace value) {
        this.flowspace = value;
    }

    /**
     * Gets the value of the actions property.
     * @return
     *     possible object is
     *     {@link ActionsType }
     */
    public ActionsType getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * @param value
     *     allowed object is
     *     {@link ActionsType }
     */
    public void setActions(ActionsType value) {
        this.actions = value;
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
     *       &lt;attribute name="ingPort" type="{http://www.w3.org/2001/XMLSchema}string" />
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

        protected FlowrulesType.Flowspace.Mac mac;
        protected FlowrulesType.Flowspace.Ip ip;
        protected FlowrulesType.Flowspace.Tcp tcp;
        protected FlowrulesType.Flowspace.Udp udp;
        @XmlAttribute(name = "ingPort")
        protected String ingPort;

        /**
         * Gets the value of the mac property.
         * @return
         *     possible object is
         *     {@link FlowrulesType.Flowspace.Mac }
         */
        public FlowrulesType.Flowspace.Mac getMac() {
            return mac;
        }

        /**
         * Sets the value of the mac property.
         * @param value
         *     allowed object is
         *     {@link FlowrulesType.Flowspace.Mac }
         */
        public void setMac(FlowrulesType.Flowspace.Mac value) {
            this.mac = value;
        }

        /**
         * Gets the value of the ip property.
         * @return
         *     possible object is
         *     {@link FlowrulesType.Flowspace.Ip }
         */
        public FlowrulesType.Flowspace.Ip getIp() {
            return ip;
        }

        /**
         * Sets the value of the ip property.
         * @param value
         *     allowed object is
         *     {@link FlowrulesType.Flowspace.Ip }
         */
        public void setIp(FlowrulesType.Flowspace.Ip value) {
            this.ip = value;
        }

        /**
         * Gets the value of the tcp property.
         * @return
         *     possible object is
         *     {@link FlowrulesType.Flowspace.Tcp }
         */
        public FlowrulesType.Flowspace.Tcp getTcp() {
            return tcp;
        }

        /**
         * Sets the value of the tcp property.
         * @param value
         *     allowed object is
         *     {@link FlowrulesType.Flowspace.Tcp }
         */
        public void setTcp(FlowrulesType.Flowspace.Tcp value) {
            this.tcp = value;
        }

        /**
         * Gets the value of the udp property.
         * @return
         *     possible object is
         *     {@link FlowrulesType.Flowspace.Udp }
         */
        public FlowrulesType.Flowspace.Udp getUdp() {
            return udp;
        }

        /**
         * Sets the value of the udp property.
         * @param value
         *     allowed object is
         *     {@link FlowrulesType.Flowspace.Udp }
         */
        public void setUdp(FlowrulesType.Flowspace.Udp value) {
            this.udp = value;
        }

        /**
         * Gets the value of the ingPort property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getIngPort() {
            return ingPort;
        }

        /**
         * Sets the value of the ingPort property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setIngPort(String value) {
            this.ingPort = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="src" type="{http://www.example.org/net/}ipAddressType" />
         *       &lt;attribute name="dst" type="{http://www.example.org/net/}ipAddressType" />
         *       &lt;attribute name="ipProtocol" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="tos" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Ip {

            @XmlAttribute(name = "src")
            protected String src;
            @XmlAttribute(name = "dst")
            protected String dst;
            @XmlAttribute(name = "ipProtocol")
            @XmlSchemaType(name = "unsignedByte")
            protected Short ipProtocol;
            @XmlAttribute(name = "tos")
            @XmlSchemaType(name = "unsignedByte")
            protected Short tos;

            /**
             * Gets the value of the src property.
             * @return
             *     possible object is
             *     {@link String }
             */
            public String getSrc() {
                return src;
            }

            /**
             * Sets the value of the src property.
             * @param value
             *     allowed object is
             *     {@link String }
             */
            public void setSrc(String value) {
                this.src = value;
            }

            /**
             * Gets the value of the dst property.
             * @return
             *     possible object is
             *     {@link String }
             */
            public String getDst() {
                return dst;
            }

            /**
             * Sets the value of the dst property.
             * @param value
             *     allowed object is
             *     {@link String }
             */
            public void setDst(String value) {
                this.dst = value;
            }

            /**
             * Gets the value of the ipProtocol property.
             * @return
             *     possible object is
             *     {@link Short }
             */
            public Short getIpProtocol() {
                return ipProtocol;
            }

            /**
             * Sets the value of the ipProtocol property.
             * @param value
             *     allowed object is
             *     {@link Short }
             */
            public void setIpProtocol(Short value) {
                this.ipProtocol = value;
            }

            /**
             * Gets the value of the tos property.
             * @return
             *     possible object is
             *     {@link Short }
             */
            public Short getTos() {
                return tos;
            }

            /**
             * Sets the value of the tos property.
             * @param value
             *     allowed object is
             *     {@link Short }
             */
            public void setTos(Short value) {
                this.tos = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="src" type="{http://www.example.org/net/}macAddressType" />
         *       &lt;attribute name="dst" type="{http://www.example.org/net/}macAddressType" />
         *       &lt;attribute name="ethertype" type="{http://www.example.org/net/}ethertypeType" />
         *       &lt;attribute name="vlanId" type="{http://www.example.org/net/}vlanIdType" />
         *       &lt;attribute name="vlanPcp" type="{http://www.example.org/net/}vlanPcpType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Mac {

            @XmlAttribute(name = "src")
            protected String src;
            @XmlAttribute(name = "dst")
            protected String dst;
            @XmlAttribute(name = "ethertype")
            protected Integer ethertype;
            @XmlAttribute(name = "vlanId")
            protected Integer vlanId;
            @XmlAttribute(name = "vlanPcp")
            protected Integer vlanPcp;

            /**
             * Gets the value of the src property.
             * @return
             *     possible object is
             *     {@link String }
             */
            public String getSrc() {
                return src;
            }

            /**
             * Sets the value of the src property.
             * @param value
             *     allowed object is
             *     {@link String }
             */
            public void setSrc(String value) {
                this.src = value;
            }

            /**
             * Gets the value of the dst property.
             * @return
             *     possible object is
             *     {@link String }
             */
            public String getDst() {
                return dst;
            }

            /**
             * Sets the value of the dst property.
             * @param value
             *     allowed object is
             *     {@link String }
             */
            public void setDst(String value) {
                this.dst = value;
            }

            /**
             * Gets the value of the ethertype property.
             * @return
             *     possible object is
             *     {@link Integer }
             */
            public Integer getEthertype() {
                return ethertype;
            }

            /**
             * Sets the value of the ethertype property.
             * @param value
             *     allowed object is
             *     {@link Integer }
             */
            public void setEthertype(Integer value) {
                this.ethertype = value;
            }

            /**
             * Gets the value of the vlanId property.
             * @return
             *     possible object is
             *     {@link Integer }
             */
            public Integer getVlanId() {
                return vlanId;
            }

            /**
             * Sets the value of the vlanId property.
             * @param value
             *     allowed object is
             *     {@link Integer }
             */
            public void setVlanId(Integer value) {
                this.vlanId = value;
            }

            /**
             * Gets the value of the vlanPcp property.
             * @return
             *     possible object is
             *     {@link Integer }
             */
            public Integer getVlanPcp() {
                return vlanPcp;
            }

            /**
             * Sets the value of the vlanPcp property.
             * @param value
             *     allowed object is
             *     {@link Integer }
             */
            public void setVlanPcp(Integer value) {
                this.vlanPcp = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="src" type="{http://www.example.org/net/}portNumberType" />
         *       &lt;attribute name="dst" type="{http://www.example.org/net/}portNumberType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Tcp {

            @XmlAttribute(name = "src")
            protected Integer src;
            @XmlAttribute(name = "dst")
            protected Integer dst;

            /**
             * Gets the value of the src property.
             * @return
             *     possible object is
             *     {@link Integer }
             */
            public Integer getSrc() {
                return src;
            }

            /**
             * Sets the value of the src property.
             * @param value
             *     allowed object is
             *     {@link Integer }
             */
            public void setSrc(Integer value) {
                this.src = value;
            }

            /**
             * Gets the value of the dst property.
             * @return
             *     possible object is
             *     {@link Integer }
             */
            public Integer getDst() {
                return dst;
            }

            /**
             * Sets the value of the dst property.
             * @param value
             *     allowed object is
             *     {@link Integer }
             */
            public void setDst(Integer value) {
                this.dst = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="src" type="{http://www.example.org/net/}portNumberType" />
         *       &lt;attribute name="dst" type="{http://www.example.org/net/}portNumberType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Udp {

            @XmlAttribute(name = "src")
            protected Integer src;
            @XmlAttribute(name = "dst")
            protected Integer dst;

            /**
             * Gets the value of the src property.
             * @return
             *     possible object is
             *     {@link Integer }
             */
            public Integer getSrc() {
                return src;
            }

            /**
             * Sets the value of the src property.
             * @param value
             *     allowed object is
             *     {@link Integer }
             */
            public void setSrc(Integer value) {
                this.src = value;
            }

            /**
             * Gets the value of the dst property.
             * @return
             *     possible object is
             *     {@link Integer }
             */
            public Integer getDst() {
                return dst;
            }

            /**
             * Sets the value of the dst property.
             * @param value
             *     allowed object is
             *     {@link Integer }
             */
            public void setDst(Integer value) {
                this.dst = value;
            }

        }

    }

}
