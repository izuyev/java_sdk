package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_new_acct_plan_contracts_array", propOrder = {
    "a4NewAcctPlanContractsRow"
})
public class A4NewAcctPlanContractsArray {

    @XmlElement(name = "a4_new_acct_plan_contracts_row")
    protected List<A4NewAcctPlanContractsRow> a4NewAcctPlanContractsRow;

    public List<A4NewAcctPlanContractsRow> getA4NewAcctPlanContractsRow() {
        if (this.a4NewAcctPlanContractsRow == null) {
            this.a4NewAcctPlanContractsRow = new ArrayList<A4NewAcctPlanContractsRow>();
        }
        return this.a4NewAcctPlanContractsRow;
    }

}
