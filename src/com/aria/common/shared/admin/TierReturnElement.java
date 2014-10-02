package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tier_ReturnElement", propOrder = {"from", "to", "rate"})
public class TierReturnElement {

    @XmlElement(name = "from")
    protected Long from;
    @XmlElement(name = "to")
    protected Long to;
    @XmlElement(name = "rate")
    protected Long rate;
    
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

    public Long getRate() {
        return rate;
    }

    public void setRate(Long value) {
        this.rate = value;
    }

    
}
