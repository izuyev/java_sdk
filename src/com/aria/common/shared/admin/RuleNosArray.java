package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule_nos_array", propOrder = {
    "ruleNosRow"
})
public class RuleNosArray {

    @XmlElement(name = "rule_nos_row")
    protected List<RuleNosRow> ruleNosRow;

    public List<RuleNosRow> getRuleNosRow() {
        if (this.ruleNosRow == null) {
            this.ruleNosRow = new ArrayList<RuleNosRow>();
        }
        return this.ruleNosRow;
    }

}
