package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web_vals_in_row", propOrder = {
    "inReplacementNames"
    })
public class WebValsInRow {

    @XmlElement(name = "in_replacement_names")
    protected String inReplacementNames;
    public String getInReplacementNames() {
        return inReplacementNames;
    }

    public void setInReplacementNames(String value) {
        this.inReplacementNames = value;
    }

    
}
