package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource_array", propOrder = {
    "resourceRow"
})
public class ResourceArray {

    @XmlElement(name = "resource_row")
    protected List<ResourceRow> resourceRow;

    public List<ResourceRow> getResourceRow() {
        if (this.resourceRow == null) {
            this.resourceRow = new ArrayList<ResourceRow>();
        }
        return this.resourceRow;
    }

}
