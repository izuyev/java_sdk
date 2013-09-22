package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_field_values_ReturnElement", propOrder = {"suppFieldValues"})
public class SuppFieldValuesReturnElement {

    @XmlElement(name = "supp_field_values")
    protected String suppFieldValues;
    
    public String getSuppFieldValues() {
        return suppFieldValues;
    }

    public void setSuppFieldValues(String value) {
        this.suppFieldValues = value;
    }

    
}
