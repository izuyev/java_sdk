package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_record_nos_row", propOrder = {
    "usageRecordNo"
    })
public class UsageRecordNosRow {

    @XmlElement(name = "usage_record_no")
    protected Long usageRecordNo;
    public Long getUsageRecordNo() {
        return usageRecordNo;
    }

    public void setUsageRecordNo(Long value) {
        this.usageRecordNo = value;
    }

    
}
