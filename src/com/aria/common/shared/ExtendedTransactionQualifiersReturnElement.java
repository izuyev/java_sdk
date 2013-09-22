package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extended_transaction_qualifiers_ReturnElement", propOrder = {"qualifierName", "qualifierValue"})
public class ExtendedTransactionQualifiersReturnElement {

    @XmlElement(name = "qualifier_name")
    protected String qualifierName;
    @XmlElement(name = "qualifier_value")
    protected String qualifierValue;
    
    public String getQualifierName() {
        return qualifierName;
    }

    public void setQualifierName(String value) {
        this.qualifierName = value;
    }

    public String getQualifierValue() {
        return qualifierValue;
    }

    public void setQualifierValue(String value) {
        this.qualifierValue = value;
    }

    
}
