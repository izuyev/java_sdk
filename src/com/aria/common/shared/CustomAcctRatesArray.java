package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custom_acct_rates_array", propOrder = {
    "customAcctRatesRow"
})
public class CustomAcctRatesArray {

    @XmlElement(name = "custom_acct_rates_row")
    protected List<CustomAcctRatesRow> customAcctRatesRow;

    public List<CustomAcctRatesRow> getCustomAcctRatesRow() {
        if (this.customAcctRatesRow == null) {
            this.customAcctRatesRow = new ArrayList<CustomAcctRatesRow>();
        }
        return this.customAcctRatesRow;
    }

}
