/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package it.polito.nffg.neo4j.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for portDirEnumType.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="portDirEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="out"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "portDirEnumType")
@XmlEnum
public enum PortDirEnumType {

    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("out")
    OUT("out"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    PortDirEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortDirEnumType fromValue(String v) {
        for (PortDirEnumType c: PortDirEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
