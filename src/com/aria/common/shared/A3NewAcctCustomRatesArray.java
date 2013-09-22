package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_new_acct_custom_rates_array", propOrder = {
    "a3NewAcctCustomRatesRow"
})
public class A3NewAcctCustomRatesArray {

    @XmlElement(name = "a3_new_acct_custom_rates_row")
    protected List<A3NewAcctCustomRatesRow> a3NewAcctCustomRatesRow;

    public List<A3NewAcctCustomRatesRow> getA3NewAcctCustomRatesRow() {
        if (this.a3NewAcctCustomRatesRow == null) {
            this.a3NewAcctCustomRatesRow = new ArrayList<A3NewAcctCustomRatesRow>();
        }
        return this.a3NewAcctCustomRatesRow;
    }

}
