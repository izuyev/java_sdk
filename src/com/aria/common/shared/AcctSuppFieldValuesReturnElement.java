package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_supp_field_values_ReturnElement", propOrder = {"suppFieldValue"})
public class AcctSuppFieldValuesReturnElement {

    @XmlElement(name = "supp_field_value")
    protected String suppFieldValue;
    
    public String getSuppFieldValue() {
        return suppFieldValue;
    }

    public void setSuppFieldValue(String value) {
        this.suppFieldValue = value;
    }

    
}
