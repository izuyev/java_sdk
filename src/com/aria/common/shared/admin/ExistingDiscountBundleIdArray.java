package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_bundle_id_array", propOrder = {
    "existingDiscountBundleIdRow"
})
public class ExistingDiscountBundleIdArray {

    @XmlElement(name = "existing_discount_bundle_id_row")
    protected List<ExistingDiscountBundleIdRow> existingDiscountBundleIdRow;

    public List<ExistingDiscountBundleIdRow> getExistingDiscountBundleIdRow() {
        if (this.existingDiscountBundleIdRow == null) {
            this.existingDiscountBundleIdRow = new ArrayList<ExistingDiscountBundleIdRow>();
        }
        return this.existingDiscountBundleIdRow;
    }

}
