package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_bundle_row", propOrder = {
    "bundleName",
    "bundleId",
    "bundleDescription",
    "allowOverlapInd",
    "rules",
    "ruleIds"
    })
public class DiscountBundleRow {

    @XmlElement(name = "bundle_name")
    protected String bundleName;
    @XmlElement(name = "bundle_id")
    protected String bundleId;
    @XmlElement(name = "bundle_description")
    protected String bundleDescription;
    @XmlElement(name = "allow_overlap_ind")
    protected String allowOverlapInd;
    @XmlElement(name = "rules")
    protected com.aria.common.shared.admin.RulesArray rules;
    @XmlElement(name = "rule_ids")
    protected com.aria.common.shared.admin.RuleIdsArray ruleIds;
    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String value) {
        this.bundleName = value;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String value) {
        this.bundleId = value;
    }

    public String getBundleDescription() {
        return bundleDescription;
    }

    public void setBundleDescription(String value) {
        this.bundleDescription = value;
    }

    public String getAllowOverlapInd() {
        return allowOverlapInd;
    }

    public void setAllowOverlapInd(String value) {
        this.allowOverlapInd = value;
    }

    public com.aria.common.shared.admin.RulesArray getRules() {
        return rules;
    }

    public void setRules(com.aria.common.shared.admin.RulesArray value) {
        this.rules = value;
    }

    public com.aria.common.shared.admin.RuleIdsArray getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(com.aria.common.shared.admin.RuleIdsArray value) {
        this.ruleIds = value;
    }

    
}
