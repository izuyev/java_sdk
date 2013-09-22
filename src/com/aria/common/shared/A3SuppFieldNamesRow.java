package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_field_names_row", propOrder = {
    "a3SuppFieldNames"
    })
public class A3SuppFieldNamesRow {

    @XmlElement(name = "a3_supp_field_names")
    protected String a3SuppFieldNames;
    public String getA3SuppFieldNames() {
        return a3SuppFieldNames;
    }

    public void setA3SuppFieldNames(String value) {
        this.a3SuppFieldNames = value;
    }

    
}
