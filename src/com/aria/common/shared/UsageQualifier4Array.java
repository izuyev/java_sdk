package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_4_array", propOrder = {
    "usageQualifier4Row"
})
public class UsageQualifier4Array {

    @XmlElement(name = "usage_qualifier_4_row")
    protected List<UsageQualifier4Row> usageQualifier4Row;

    public List<UsageQualifier4Row> getUsageQualifier4Row() {
        if (this.usageQualifier4Row == null) {
            this.usageQualifier4Row = new ArrayList<UsageQualifier4Row>();
        }
        return this.usageQualifier4Row;
    }

}
