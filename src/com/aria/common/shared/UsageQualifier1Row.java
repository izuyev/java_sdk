package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_1_row", propOrder = {
    "usageQualifier1"
    })
public class UsageQualifier1Row {

    @XmlElement(name = "usage_qualifier_1")
    protected String usageQualifier1;
    public String getUsageQualifier1() {
        return usageQualifier1;
    }

    public void setUsageQualifier1(String value) {
        this.usageQualifier1 = value;
    }

    
}
