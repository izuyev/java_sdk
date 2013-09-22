package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_field_names_row", propOrder = {
    "a1SuppFieldNames"
    })
public class A1SuppFieldNamesRow {

    @XmlElement(name = "a1_supp_field_names")
    protected String a1SuppFieldNames;
    public String getA1SuppFieldNames() {
        return a1SuppFieldNames;
    }

    public void setA1SuppFieldNames(String value) {
        this.a1SuppFieldNames = value;
    }

    
}
