package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_fields_ReturnElement", propOrder = {"fieldName", "fieldDesc", "fieldOrder"})
public class SuppFieldsReturnElement {

    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "field_desc")
    protected String fieldDesc;
    @XmlElement(name = "field_order")
    protected Long fieldOrder;
    
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String value) {
        this.fieldDesc = value;
    }

    public Long getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(Long value) {
        this.fieldOrder = value;
    }

    
}
