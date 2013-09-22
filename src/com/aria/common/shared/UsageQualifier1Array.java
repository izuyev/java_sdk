package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_qualifier_1_array", propOrder = {
    "usageQualifier1Row"
})
public class UsageQualifier1Array {

    @XmlElement(name = "usage_qualifier_1_row")
    protected List<UsageQualifier1Row> usageQualifier1Row;

    public List<UsageQualifier1Row> getUsageQualifier1Row() {
        if (this.usageQualifier1Row == null) {
            this.usageQualifier1Row = new ArrayList<UsageQualifier1Row>();
        }
        return this.usageQualifier1Row;
    }

}
