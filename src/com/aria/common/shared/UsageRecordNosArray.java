package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_record_nos_array", propOrder = {
    "usageRecordNosRow"
})
public class UsageRecordNosArray {

    @XmlElement(name = "usage_record_nos_row")
    protected List<UsageRecordNosRow> usageRecordNosRow;

    public List<UsageRecordNosRow> getUsageRecordNosRow() {
        if (this.usageRecordNosRow == null) {
            this.usageRecordNosRow = new ArrayList<UsageRecordNosRow>();
        }
        return this.usageRecordNosRow;
    }

}
