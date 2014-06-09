package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rules_ReturnElement", propOrder = {"rule"})
public class RulesReturnElement {

    @XmlElement(name = "rule")
    protected Long rule;
    
    public Long getRule() {
        return rule;
    }

    public void setRule(Long value) {
        this.rule = value;
    }

    
}
