package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_bundle_array", propOrder = {
    "existingDiscountBundleRow"
})
public class ExistingDiscountBundleArray {

    @XmlElement(name = "existing_discount_bundle_row")
    protected List<ExistingDiscountBundleRow> existingDiscountBundleRow;

    public List<ExistingDiscountBundleRow> getExistingDiscountBundleRow() {
        if (this.existingDiscountBundleRow == null) {
            this.existingDiscountBundleRow = new ArrayList<ExistingDiscountBundleRow>();
        }
        return this.existingDiscountBundleRow;
    }

}
