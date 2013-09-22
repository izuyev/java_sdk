package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_field_names_row", propOrder = {
    "a5SuppFieldNames"
    })
public class A5SuppFieldNamesRow {

    @XmlElement(name = "a5_supp_field_names")
    protected String a5SuppFieldNames;
    public String getA5SuppFieldNames() {
        return a5SuppFieldNames;
    }

    public void setA5SuppFieldNames(String value) {
        this.a5SuppFieldNames = value;
    }

    
}
