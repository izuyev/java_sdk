package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule_ids_ReturnElement", propOrder = {"rule"})
public class RuleIdsReturnElement {

    @XmlElement(name = "rule")
    protected String rule;
    
    public String getRule() {
        return rule;
    }

    public void setRule(String value) {
        this.rule = value;
    }

    
}
