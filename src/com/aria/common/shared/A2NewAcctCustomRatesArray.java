package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_new_acct_custom_rates_array", propOrder = {
    "a2NewAcctCustomRatesRow"
})
public class A2NewAcctCustomRatesArray {

    @XmlElement(name = "a2_new_acct_custom_rates_row")
    protected List<A2NewAcctCustomRatesRow> a2NewAcctCustomRatesRow;

    public List<A2NewAcctCustomRatesRow> getA2NewAcctCustomRatesRow() {
        if (this.a2NewAcctCustomRatesRow == null) {
            this.a2NewAcctCustomRatesRow = new ArrayList<A2NewAcctCustomRatesRow>();
        }
        return this.a2NewAcctCustomRatesRow;
    }

}
