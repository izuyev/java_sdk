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
    protected String existingBundleIds;
    public String getExistingBundleIds() {
        return existingBundleIds;
    }

    public void setExistingBundleIds(String value) {
        this.existingBundleIds = value;
    }

    
}
