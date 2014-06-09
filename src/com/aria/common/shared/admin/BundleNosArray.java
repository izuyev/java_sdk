package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bundle_nos_array", propOrder = {
    "bundleNosRow"
})
public class BundleNosArray {

    @XmlElement(name = "bundle_nos_row")
    protected List<BundleNosRow> bundleNosRow;

    public List<BundleNosRow> getBundleNosRow() {
        if (this.bundleNosRow == null) {
            this.bundleNosRow = new ArrayList<BundleNosRow>();
        }
        return this.bundleNosRow;
    }

}
