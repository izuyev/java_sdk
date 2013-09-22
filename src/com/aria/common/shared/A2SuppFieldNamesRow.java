package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_field_names_row", propOrder = {
    "a2SuppFieldNames"
    })
public class A2SuppFieldNamesRow {

    @XmlElement(name = "a2_supp_field_names")
    protected String a2SuppFieldNames;
    public String getA2SuppFieldNames() {
        return a2SuppFieldNames;
    }

    public void setA2SuppFieldNames(String value) {
        this.a2SuppFieldNames = value;
    }

    
}
