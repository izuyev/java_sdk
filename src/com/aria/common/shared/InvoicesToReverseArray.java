package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoices_to_reverse_array", propOrder = {
    "invoicesToReverseRow"
})
public class InvoicesToReverseArray {

    @XmlElement(name = "invoices_to_reverse_row")
    protected List<InvoicesToReverseRow> invoicesToReverseRow;

    public List<InvoicesToReverseRow> getInvoicesToReverseRow() {
        if (this.invoicesToReverseRow == null) {
            this.invoicesToReverseRow = new ArrayList<InvoicesToReverseRow>();
        }
        return this.invoicesToReverseRow;
    }

}
