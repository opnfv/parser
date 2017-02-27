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
 * <p>Java class for specType complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="specType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deployment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="image">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="N.A." />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cpu">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *                 &lt;attribute name="architecture" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *                 &lt;attribute name="numCores" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="1" />
 *                 &lt;attribute name="clockSpeed" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="memory">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *                 &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="storage">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *                 &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specType", propOrder = {
    "deployment",
    "image",
    "cpu",
    "memory",
    "storage"
})
public class SpecType {

    @XmlElement(required = true)
    protected SpecType.Deployment deployment;
    @XmlElement(required = true)
    protected SpecType.Image image;
    @XmlElement(required = true)
    protected SpecType.Cpu cpu;
    @XmlElement(required = true)
    protected SpecType.Memory memory;
    @XmlElement(required = true)
    protected SpecType.Storage storage;

    /**
     * Gets the value of the deployment property.
     * @return
     *     possible object is
     *     {@link SpecType.Deployment }
     */
    public SpecType.Deployment getDeployment() {
        return deployment;
    }

    /**
     * Sets the value of the deployment property.
     * @param value
     *     allowed object is
     *     {@link SpecType.Deployment }
     */
    public void setDeployment(SpecType.Deployment value) {
        this.deployment = value;
    }

    /**
     * Gets the value of the image property.
     * @return
     *     possible object is
     *     {@link SpecType.Image }
     */
    public SpecType.Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * @param value
     *     allowed object is
     *     {@link SpecType.Image }
     */
    public void setImage(SpecType.Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the cpu property.
     * @return
     *     possible object is
     *     {@link SpecType.Cpu }
     */
    public SpecType.Cpu getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * @param value
     *     allowed object is
     *     {@link SpecType.Cpu }
     */
    public void setCpu(SpecType.Cpu value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the memory property.
     * @return
     *     possible object is
     *     {@link SpecType.Memory }
     */
    public SpecType.Memory getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * @param value
     *     allowed object is
     *     {@link SpecType.Memory }
     */
    public void setMemory(SpecType.Memory value) {
        this.memory = value;
    }

    /**
     * Gets the value of the storage property.
     * @return
     *     possible object is
     *     {@link SpecType.Storage }
     */
    public SpecType.Storage getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * @param value
     *     allowed object is
     *     {@link SpecType.Storage }
     */
    public void setStorage(SpecType.Storage value) {
        this.storage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *       &lt;attribute name="architecture" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *       &lt;attribute name="numCores" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="1" />
     *       &lt;attribute name="clockSpeed" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cpu {

        @XmlAttribute(name = "model")
        protected String model;
        @XmlAttribute(name = "architecture")
        protected String architecture;
        @XmlAttribute(name = "numCores")
        @XmlSchemaType(name = "unsignedByte")
        protected Short numCores;
        @XmlAttribute(name = "clockSpeed")
        protected String clockSpeed;

        /**
         * Gets the value of the model property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getModel() {
            if (model == null) {
                return "N.A.";
            } else {
                return model;
            }
        }

        /**
         * Sets the value of the model property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setModel(String value) {
            this.model = value;
        }

        /**
         * Gets the value of the architecture property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getArchitecture() {
            if (architecture == null) {
                return "N.A.";
            } else {
                return architecture;
            }
        }

        /**
         * Sets the value of the architecture property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setArchitecture(String value) {
            this.architecture = value;
        }

        /**
         * Gets the value of the numCores property.
         * @return
         *     possible object is
         *     {@link Short }
         */
        public short getNumCores() {
            if (numCores == null) {
                return ((short) 1);
            } else {
                return numCores;
            }
        }

        /**
         * Sets the value of the numCores property.
         * @param value
         *     allowed object is
         *     {@link Short }
         */
        public void setNumCores(Short value) {
            this.numCores = value;
        }

        /**
         * Gets the value of the clockSpeed property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getClockSpeed() {
            if (clockSpeed == null) {
                return "N.A.";
            } else {
                return clockSpeed;
            }
        }

        /**
         * Sets the value of the clockSpeed property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setClockSpeed(String value) {
            this.clockSpeed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Deployment {

        @XmlAttribute(name = "type")
        protected String type;

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


    /**
     * <p>Java class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="N.A." />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Image {

        @XmlAttribute(name = "uri")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * Gets the value of the uri property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getUri() {
            if (uri == null) {
                return "N.A.";
            } else {
                return uri;
            }
        }

        /**
         * Sets the value of the uri property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setUri(String value) {
            this.uri = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Memory {

        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "size")
        protected String size;

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

        /**
         * Gets the value of the size property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getSize() {
            if (size == null) {
                return "N.A.";
            } else {
                return size;
            }
        }

        /**
         * Sets the value of the size property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setSize(String value) {
            this.size = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}string" default="N.A." />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Storage {

        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "size")
        protected String size;

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

        /**
         * Gets the value of the size property.
         * @return
         *     possible object is
         *     {@link String }
         */
        public String getSize() {
            if (size == null) {
                return "N.A.";
            } else {
                return size;
            }
        }

        /**
         * Sets the value of the size property.
         * @param value
         *     allowed object is
         *     {@link String }
         */
        public void setSize(String value) {
            this.size = value;
        }

    }

}
