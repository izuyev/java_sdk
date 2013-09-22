package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web_vals_out_ReturnElement", propOrder = {"outReplacementNames", "outReplacementValues"})
public class WebValsOutReturnElement {

    @XmlElement(name = "out_replacement_names")
    protected String outReplacementNames;
    @XmlElement(name = "out_replacement_values")
    protected String outReplacementValues;
    
    public String getOutReplacementNames() {
        return outReplacementNames;
    }

    public void setOutReplacementNames(String value) {
        this.outReplacementNames = value;
    }

    public String getOutReplacementValues() {
        return outReplacementValues;
    }

    public void setOutReplacementValues(String value) {
        this.outReplacementValues = value;
    }

    
}
