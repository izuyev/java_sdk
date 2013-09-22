package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_field_names_row", propOrder = {
    "a4SuppFieldNames"
    })
public class A4SuppFieldNamesRow {

    @XmlElement(name = "a4_supp_field_names")
    protected String a4SuppFieldNames;
    public String getA4SuppFieldNames() {
        return a4SuppFieldNames;
    }

    public void setA4SuppFieldNames(String value) {
        this.a4SuppFieldNames = value;
    }

    
}
