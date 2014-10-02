package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_no_array", propOrder = {
    "invoiceNoRow"
})
public class InvoiceNoArray {

    @XmlElement(name = "invoice_no_row")
    protected List<InvoiceNoRow> invoiceNoRow;

    public List<InvoiceNoRow> getInvoiceNoRow() {
        if (this.invoiceNoRow == null) {
            this.invoiceNoRow = new ArrayList<InvoiceNoRow>();
        }
        return this.invoiceNoRow;
    }

}
