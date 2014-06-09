package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_no_array", propOrder = {
    "serviceNoRow"
})
public class ServiceNoArray {

    @XmlElement(name = "service_no_row")
    protected List<ServiceNoRow> serviceNoRow;

    public List<ServiceNoRow> getServiceNoRow() {
        if (this.serviceNoRow == null) {
            this.serviceNoRow = new ArrayList<ServiceNoRow>();
        }
        return this.serviceNoRow;
    }

}
