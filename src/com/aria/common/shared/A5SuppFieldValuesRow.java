package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_field_values_row", propOrder = {
    "a5SuppFieldValues"
    })
public class A5SuppFieldValuesRow {

    @XmlElement(name = "a5_supp_field_values")
    protected String a5SuppFieldValues;
    public String getA5SuppFieldValues() {
        return a5SuppFieldValues;
    }

    public void setA5SuppFieldValues(String value) {
        this.a5SuppFieldValues = value;
    }

    
}
