package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_3_row", propOrder = {
    "usageQualifier3"
    })
public class UsageQualifier3Row {

    @XmlElement(name = "usage_qualifier_3")
    protected String usageQualifier3;
    public String getUsageQualifier3() {
        return usageQualifier3;
    }

    public void setUsageQualifier3(String value) {
        this.usageQualifier3 = value;
    }

    
}
