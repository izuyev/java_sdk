package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_bundle_id_row", propOrder = {
    "existingBundleIds"
    })
public class ExistingDiscountBundleIdRow {

    @XmlElement(name = "existing_bundle_ids")
    protected Long existingBundleIds;
    public Long getExistingBundleIds() {
        return existingBundleIds;
    }

    public void setExistingBundleIds(Long value) {
        this.existingBundleIds = value;
    }

    
}
