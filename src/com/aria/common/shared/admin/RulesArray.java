package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rules_array", propOrder = {
    "rulesRow"
})
public class RulesArray {

    @XmlElement(name = "rules_row")
    protected List<RulesRow> rulesRow;

    public List<RulesRow> getRulesRow() {
        if (this.rulesRow == null) {
            this.rulesRow = new ArrayList<RulesRow>();
        }
        return this.rulesRow;
    }

}
