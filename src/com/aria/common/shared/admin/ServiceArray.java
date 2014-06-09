package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_array", propOrder = {
    "serviceRow"
})
public class ServiceArray {

    @XmlElement(name = "service_row")
    protected List<ServiceRow> serviceRow;

    public List<ServiceRow> getServiceRow() {
        if (this.serviceRow == null) {
            this.serviceRow = new ArrayList<ServiceRow>();
        }
        return this.serviceRow;
    }

}
