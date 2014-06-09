package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource_row", propOrder = {
    "resourceNo",
    "resourceName",
    "resourceDescription",
    "flatThreshold",
    "resourceUnits",
    "expireOnPaidThrough",
    "additionalDays",
    "resetOnUpdate"
    })
public class ResourceRow {

    @XmlElement(name = "resource_no")
    protected Long resourceNo;
    @XmlElement(name = "resource_name")
    protected String resourceName;
    @XmlElement(name = "resource_description")
    protected String resourceDescription;
    @XmlElement(name = "flat_threshold")
    protected Long flatThreshold;
    @XmlElement(name = "resource_units")
    protected Long resourceUnits;
    @XmlElement(name = "expire_on_paid_through")
    protected String expireOnPaidThrough;
    @XmlElement(name = "additional_days")
    protected Long additionalDays;
    @XmlElement(name = "reset_on_update")
    protected String resetOnUpdate;
    public Long getResourceNo() {
        return resourceNo;
    }

    public void setResourceNo(Long value) {
        this.resourceNo = value;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String value) {
        this.resourceName = value;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String value) {
        this.resourceDescription = value;
    }

    public Long getFlatThreshold() {
        return flatThreshold;
    }

    public void setFlatThreshold(Long value) {
        this.flatThreshold = value;
    }

    public Long getResourceUnits() {
        return resourceUnits;
    }

    public void setResourceUnits(Long value) {
        this.resourceUnits = value;
    }

    public String getExpireOnPaidThrough() {
        return expireOnPaidThrough;
    }

    public void setExpireOnPaidThrough(String value) {
        this.expireOnPaidThrough = value;
    }

    public Long getAdditionalDays() {
        return additionalDays;
    }

    public void setAdditionalDays(Long value) {
        this.additionalDays = value;
    }

    public String getResetOnUpdate() {
        return resetOnUpdate;
    }

    public void setResetOnUpdate(String value) {
        this.resetOnUpdate = value;
    }

    
}
