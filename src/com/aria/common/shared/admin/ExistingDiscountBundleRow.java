package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_bundle_row", propOrder = {
    "existingBundles"
    })
public class ExistingDiscountBundleRow {

    @XmlElement(name = "existing_bundles")
    protected Long existingBundles;
    public Long getExistingBundles() {
        return existingBundles;
    }

    public void setExistingBundles(Long value) {
        this.existingBundles = value;
    }

    
}
