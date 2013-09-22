package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_3_array", propOrder = {
    "usageQualifier3Row"
})
public class UsageQualifier3Array {

    @XmlElement(name = "usage_qualifier_3_row")
    protected List<UsageQualifier3Row> usageQualifier3Row;

    public List<UsageQualifier3Row> getUsageQualifier3Row() {
        if (this.usageQualifier3Row == null) {
            this.usageQualifier3Row = new ArrayList<UsageQualifier3Row>();
        }
        return this.usageQualifier3Row;
    }

}
