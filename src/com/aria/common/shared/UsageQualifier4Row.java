package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_4_row", propOrder = {
    "usageQualifier4"
    })
public class UsageQualifier4Row {

    @XmlElement(name = "usage_qualifier_4")
    protected String usageQualifier4;
    public String getUsageQualifier4() {
        return usageQualifier4;
    }

    public void setUsageQualifier4(String value) {
        this.usageQualifier4 = value;
    }

    
}
