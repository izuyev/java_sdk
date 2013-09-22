package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_field_values_row", propOrder = {
    "a3SuppFieldValues"
    })
public class A3SuppFieldValuesRow {

    @XmlElement(name = "a3_supp_field_values")
    protected String a3SuppFieldValues;
    public String getA3SuppFieldValues() {
        return a3SuppFieldValues;
    }

    public void setA3SuppFieldValues(String value) {
        this.a3SuppFieldValues = value;
    }

    
}
