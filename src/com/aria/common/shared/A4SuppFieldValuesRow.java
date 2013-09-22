package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_field_values_row", propOrder = {
    "a4SuppFieldValues"
    })
public class A4SuppFieldValuesRow {

    @XmlElement(name = "a4_supp_field_values")
    protected String a4SuppFieldValues;
    public String getA4SuppFieldValues() {
        return a4SuppFieldValues;
    }

    public void setA4SuppFieldValues(String value) {
        this.a4SuppFieldValues = value;
    }

    
}
