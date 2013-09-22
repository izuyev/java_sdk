package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "in_reg_uss_config_params_row", propOrder = {
    "paramName",
    "paramVal"
    })
public class InRegUssConfigParamsRow {

    @XmlElement(name = "param_name")
    protected String paramName;
    @XmlElement(name = "param_val")
    protected String paramVal;
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String value) {
        this.paramName = value;
    }

    public String getParamVal() {
        return paramVal;
    }

    public void setParamVal(String value) {
        this.paramVal = value;
    }

    
}
