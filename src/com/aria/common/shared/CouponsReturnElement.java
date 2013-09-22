package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupons_ReturnElement", propOrder = {"outCouponCd", "description", "startDate", "expDate", "maxUses", "totalUses", "currencyCd", "recurDiscountFlatAmt", "oneTimeDiscountFlatAmt", "recurDiscountPct", "oneTimeDiscountPct", "statusInd", "creditTemplates", "discountRules", "discountBundles"})
public class CouponsReturnElement {

    @XmlElement(name = "out_coupon_cd")
    protected String outCouponCd;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "exp_date")
    protected String expDate;
    @XmlElement(name = "max_uses")
    protected Long maxUses;
    @XmlElement(name = "total_uses")
    protected Long totalUses;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "recur_discount_flat_amt")
    protected Double recurDiscountFlatAmt;
    @XmlElement(name = "one_time_discount_flat_amt")
    protected Double oneTimeDiscountFlatAmt;
    @XmlElement(name = "recur_discount_pct")
    protected Double recurDiscountPct;
    @XmlElement(name = "one_time_discount_pct")
    protected Double oneTimeDiscountPct;
    @XmlElement(name = "status_ind")
    protected Long statusInd;
    @XmlElement(name = "credit_templates")
    protected List<CreditTemplatesReturnElement> creditTemplates;
    @XmlElement(name = "discount_rules")
    protected List<DiscountRulesReturnElement> discountRules;
    @XmlElement(name = "discount_bundles")
    protected List<DiscountBundlesReturnElement> discountBundles;
    
    public String getOutCouponCd() {
        return outCouponCd;
    }

    public void setOutCouponCd(String value) {
        this.outCouponCd = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String value) {
        this.expDate = value;
    }

    public Long getMaxUses() {
        return maxUses;
    }

    public void setMaxUses(Long value) {
        this.maxUses = value;
    }

    public Long getTotalUses() {
        return totalUses;
    }

    public void setTotalUses(Long value) {
        this.totalUses = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Double getRecurDiscountFlatAmt() {
        return recurDiscountFlatAmt;
    }

    public void setRecurDiscountFlatAmt(Double value) {
        this.recurDiscountFlatAmt = value;
    }

    public Double getOneTimeDiscountFlatAmt() {
        return oneTimeDiscountFlatAmt;
    }

    public void setOneTimeDiscountFlatAmt(Double value) {
        this.oneTimeDiscountFlatAmt = value;
    }

    public Double getRecurDiscountPct() {
        return recurDiscountPct;
    }

    public void setRecurDiscountPct(Double value) {
        this.recurDiscountPct = value;
    }

    public Double getOneTimeDiscountPct() {
        return oneTimeDiscountPct;
    }

    public void setOneTimeDiscountPct(Double value) {
        this.oneTimeDiscountPct = value;
    }

    public Long getStatusInd() {
        return statusInd;
    }

    public void setStatusInd(Long value) {
        this.statusInd = value;
    }

    public List<CreditTemplatesReturnElement> getCreditTemplates() {
        if (this.creditTemplates == null) {
            this.creditTemplates = new ArrayList<CreditTemplatesReturnElement>();
        }
        return this.creditTemplates;
    }public List<DiscountRulesReturnElement> getDiscountRules() {
        if (this.discountRules == null) {
            this.discountRules = new ArrayList<DiscountRulesReturnElement>();
        }
        return this.discountRules;
    }public List<DiscountBundlesReturnElement> getDiscountBundles() {
        if (this.discountBundles == null) {
            this.discountBundles = new ArrayList<DiscountBundlesReturnElement>();
        }
        return this.discountBundles;
    }
}
