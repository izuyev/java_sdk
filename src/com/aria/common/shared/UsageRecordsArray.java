package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_records_array", propOrder = {
    "usageRecordsRow"
})
public class UsageRecordsArray {

    @XmlElement(name = "usage_records_row")
    protected List<UsageRecordsRow> usageRecordsRow;

    public List<UsageRecordsRow> getUsageRecordsRow() {
        if (this.usageRecordsRow == null) {
            this.usageRecordsRow = new ArrayList<UsageRecordsRow>();
        }
        return this.usageRecordsRow;
    }

}
