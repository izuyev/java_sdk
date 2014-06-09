package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotional_plan_sets_ReturnElement", propOrder = {"promoSetNo", "promoSetName", "promoSetDesc", "promotionsForSet", "clientPromoSetId"})
public class PromotionalPlanSetsReturnElement {

    @XmlElement(name = "promo_set_no")
    protected Long promoSetNo;
    @XmlElement(name = "promo_set_name")
    protected String promoSetName;
    @XmlElement(name = "promo_set_desc")
    protected String promoSetDesc;
    @XmlElement(name = "promotions_for_set")
    protected List<PromotionsForSetReturnElement> promotionsForSet;
    @XmlElement(name = "client_promo_set_id")
    protected String clientPromoSetId;
    
    public Long getPromoSetNo() {
        return promoSetNo;
    }

    public void setPromoSetNo(Long value) {
        this.promoSetNo = value;
    }

    public String getPromoSetName() {
        return promoSetName;
    }

    public void setPromoSetName(String value) {
        this.promoSetName = value;
    }

    public String getPromoSetDesc() {
        return promoSetDesc;
    }

    public void setPromoSetDesc(String value) {
        this.promoSetDesc = value;
    }

    public List<PromotionsForSetReturnElement> getPromotionsForSet() {
        if (this.promotionsForSet == null) {
            this.promotionsForSet = new ArrayList<PromotionsForSetReturnElement>();
        }
        return this.promotionsForSet;
    }public String getClientPromoSetId() {
        return clientPromoSetId;
    }

    public void setClientPromoSetId(String value) {
        this.clientPromoSetId = value;
    }

    
}
