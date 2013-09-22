package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_bundles_ReturnElement", propOrder = {"bundleNo", "clientBundleId", "bundleName", "description"})
public class DiscountBundlesReturnElement {

    @XmlElement(name = "bundle_no")
    protected Long bundleNo;
    @XmlElement(name = "client_bundle_id")
    protected String clientBundleId;
    @XmlElement(name = "bundle_name")
    protected String bundleName;
    @XmlElement(name = "description")
    protected String description;
    
    public Long getBundleNo() {
        return bundleNo;
    }

    public void setBundleNo(Long value) {
        this.bundleNo = value;
    }

    public String getClientBundleId() {
        return clientBundleId;
    }

    public void setClientBundleId(String value) {
        this.clientBundleId = value;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String value) {
        this.bundleName = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    
}
