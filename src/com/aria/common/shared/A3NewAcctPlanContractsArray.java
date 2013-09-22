package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_new_acct_plan_contracts_array", propOrder = {
    "a3NewAcctPlanContractsRow"
})
public class A3NewAcctPlanContractsArray {

    @XmlElement(name = "a3_new_acct_plan_contracts_row")
    protected List<A3NewAcctPlanContractsRow> a3NewAcctPlanContractsRow;

    public List<A3NewAcctPlanContractsRow> getA3NewAcctPlanContractsRow() {
        if (this.a3NewAcctPlanContractsRow == null) {
            this.a3NewAcctPlanContractsRow = new ArrayList<A3NewAcctPlanContractsRow>();
        }
        return this.a3NewAcctPlanContractsRow;
    }

}
