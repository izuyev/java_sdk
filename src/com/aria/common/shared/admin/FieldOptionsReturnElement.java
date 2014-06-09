package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_options_ReturnElement", propOrder = {"displayText", "optionValue", "fieldOrder"})
public class FieldOptionsReturnElement {

    @XmlElement(name = "display_text")
    protected String displayText;
    @XmlElement(name = "option_value")
    protected String optionValue;
    @XmlElement(name = "field_order")
    protected Long fieldOrder;
    
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String value) {
        this.displayText = value;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String value) {
        this.optionValue = value;
    }

    public Long getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(Long value) {
        this.fieldOrder = value;
    }

    
}
