package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_field_values_row", propOrder = {
    "a1SuppFieldValues"
    })
public class A1SuppFieldValuesRow {

    @XmlElement(name = "a1_supp_field_values")
    protected String a1SuppFieldValues;
    public String getA1SuppFieldValues() {
        return a1SuppFieldValues;
    }

    public void setA1SuppFieldValues(String value) {
        this.a1SuppFieldValues = value;
    }

    
}
