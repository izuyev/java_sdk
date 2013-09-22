package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_field_values_row", propOrder = {
    "suppFieldValues"
    })
public class SuppFieldValuesRow {

    @XmlElement(name = "supp_field_values")
    protected String suppFieldValues;
    public String getSuppFieldValues() {
        return suppFieldValues;
    }

    public void setSuppFieldValues(String value) {
        this.suppFieldValues = value;
    }

    
}
