package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custom_acct_rates_row", propOrder = {
    "rateSeqNo",
    "ratePerUnit",
    "fromUnit",
    "toUnit"
    })
public class CustomAcctRatesRow {

    @XmlElement(name = "rate_seq_no")
    protected Long rateSeqNo;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "from_unit")
    protected Long fromUnit;
    @XmlElement(name = "to_unit")
    protected Long toUnit;
    public Long getRateSeqNo() {
        return rateSeqNo;
    }

    public void setRateSeqNo(Long value) {
        this.rateSeqNo = value;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double value) {
        this.ratePerUnit = value;
    }

    public Long getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(Long value) {
        this.fromUnit = value;
    }

    public Long getToUnit() {
        return toUnit;
    }

    public void setToUnit(Long value) {
        this.toUnit = value;
    }

    
}
