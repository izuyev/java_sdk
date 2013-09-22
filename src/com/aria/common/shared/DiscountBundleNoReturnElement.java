package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_bundle_no_ReturnElement", propOrder = {"bundleNo"})
public class DiscountBundleNoReturnElement {

    @XmlElement(name = "bundle_no")
    protected Long bundleNo;
    
    public Long getBundleNo() {
        return bundleNo;
    }

    public void setBundleNo(Long value) {
        this.bundleNo = value;
    }

    
}
