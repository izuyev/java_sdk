package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pre_calc_sku_row", propOrder = {
    "sku",
    "skuPlanNo",
    "skuUnits",
    "skuUnitAmount"
    })
public class PreCalcSkuRow {

    @XmlElement(name = "sku")
    protected String sku;
    @XmlElement(name = "sku_plan_no")
    protected Long skuPlanNo;
    @XmlElement(name = "sku_units")
    protected Double skuUnits;
    @XmlElement(name = "sku_unit_amount")
    protected Double skuUnitAmount;
    public String getSku() {
        return sku;
    }

    public void setSku(String value) {
        this.sku = value;
    }

    public Long getSkuPlanNo() {
        return skuPlanNo;
    }

    public void setSkuPlanNo(Long value) {
        this.skuPlanNo = value;
    }

    public Double getSkuUnits() {
        return skuUnits;
    }

    public void setSkuUnits(Double value) {
        this.skuUnits = value;
    }

    public Double getSkuUnitAmount() {
        return skuUnitAmount;
    }

    public void setSkuUnitAmount(Double value) {
        this.skuUnitAmount = value;
    }

    
}
