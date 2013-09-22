package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_field_values_row", propOrder = {
    "a2SuppFieldValues"
    })
public class A2SuppFieldValuesRow {

    @XmlElement(name = "a2_supp_field_values")
    protected String a2SuppFieldValues;
    public String getA2SuppFieldValues() {
        return a2SuppFieldValues;
    }

    public void setA2SuppFieldValues(String value) {
        this.a2SuppFieldValues = value;
    }

    
}
