package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_fields_ReturnElement", propOrder = {"fieldName", "fieldValue"})
public class SuppFieldsReturnElement {

    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "field_value")
    protected String fieldValue;
    
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    
}
