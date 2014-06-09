package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bundle_nos_row", propOrder = {
    "bundleNos"
    })
public class BundleNosRow {

    @XmlElement(name = "bundle_nos")
    protected Long bundleNos;
    public Long getBundleNos() {
        return bundleNos;
    }

    public void setBundleNos(Long value) {
        this.bundleNos = value;
    }

    
}
