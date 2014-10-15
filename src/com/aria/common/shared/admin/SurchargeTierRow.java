package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_tier_row", propOrder = {
    "from",
    "to",
    "rate",
    "includeZero"
    })
public class SurchargeTierRow {

    @XmlElement(name = "from")
    protected Long from;
    @XmlElement(name = "to")
    protected Long to;
    @XmlElement(name = "rate")
    protected  rate;
    @XmlElement(name = "include_zero")
    protected  includeZero;
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long value) {
        this.from = value;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long value) {
        this.to = value;
    }

    public  getRate() {
        return rate;
    }

    public void setRate( value) {
        this.rate = value;
    }

    public  getIncludeZero() {
        return includeZero;
    }

    public void setIncludeZero( value) {
        this.includeZero = value;
    }

    
}
