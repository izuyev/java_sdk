package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_2_row", propOrder = {
    "usageQualifier2"
    })
public class UsageQualifier2Row {

    @XmlElement(name = "usage_qualifier_2")
    protected String usageQualifier2;
    public String getUsageQualifier2() {
        return usageQualifier2;
    }

    public void setUsageQualifier2(String value) {
        this.usageQualifier2 = value;
    }

    
}
