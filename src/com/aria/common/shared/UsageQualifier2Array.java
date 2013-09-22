package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_2_array", propOrder = {
    "usageQualifier2Row"
})
public class UsageQualifier2Array {

    @XmlElement(name = "usage_qualifier_2_row")
    protected List<UsageQualifier2Row> usageQualifier2Row;

    public List<UsageQualifier2Row> getUsageQualifier2Row() {
        if (this.usageQualifier2Row == null) {
            this.usageQualifier2Row = new ArrayList<UsageQualifier2Row>();
        }
        return this.usageQualifier2Row;
    }

}
