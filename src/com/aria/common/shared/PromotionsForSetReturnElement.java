package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotions_for_set_ReturnElement", propOrder = {"promoCode", "promoCodeDesc"})
public class PromotionsForSetReturnElement {

    @XmlElement(name = "promo_code")
    protected String promoCode;
    @XmlElement(name = "promo_code_desc")
    protected String promoCodeDesc;
    
    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    public String getPromoCodeDesc() {
        return promoCodeDesc;
    }

    public void setPromoCodeDesc(String value) {
        this.promoCodeDesc = value;
    }

    
}
