package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_new_acct_custom_rates_array", propOrder = {
    "a1NewAcctCustomRatesRow"
})
public class A1NewAcctCustomRatesArray {

    @XmlElement(name = "a1_new_acct_custom_rates_row")
    protected List<A1NewAcctCustomRatesRow> a1NewAcctCustomRatesRow;

    public List<A1NewAcctCustomRatesRow> getA1NewAcctCustomRatesRow() {
        if (this.a1NewAcctCustomRatesRow == null) {
            this.a1NewAcctCustomRatesRow = new ArrayList<A1NewAcctCustomRatesRow>();
        }
        return this.a1NewAcctCustomRatesRow;
    }

}
