package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule_ids_array", propOrder = {
    "ruleIdsRow"
})
public class RuleIdsArray {

    @XmlElement(name = "rule_ids_row")
    protected List<RuleIdsRow> ruleIdsRow;

    public List<RuleIdsRow> getRuleIdsRow() {
        if (this.ruleIdsRow == null) {
            this.ruleIdsRow = new ArrayList<RuleIdsRow>();
        }
        return this.ruleIdsRow;
    }

}
