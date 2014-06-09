package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order_item_ReturnElement", propOrder = {"sku", "description", "units", "unitPrice", "subtotal"})
public class OrderItemReturnElement {

    @XmlElement(name = "sku")
    protected String sku;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "unit_price")
    protected Double unitPrice;
    @XmlElement(name = "subtotal")
    protected Double subtotal;
    
    public String getSku() {
        return sku;
    }

    public void setSku(String value) {
        this.sku = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double value) {
        this.subtotal = value;
    }

    
}
