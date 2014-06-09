package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_bundle_array", propOrder = {
    "discountBundleRow"
})
public class DiscountBundleArray {

    @XmlElement(name = "discount_bundle_row")
    protected List<DiscountBundleRow> discountBundleRow;

    public List<DiscountBundleRow> getDiscountBundleRow() {
        if (this.discountBundleRow == null) {
            this.discountBundleRow = new ArrayList<DiscountBundleRow>();
        }
        return this.discountBundleRow;
    }

}
