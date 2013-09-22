package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order_line_items_array", propOrder = {
    "orderLineItemsRow"
})
public class OrderLineItemsArray {

    @XmlElement(name = "order_line_items_row")
    protected List<OrderLineItemsRow> orderLineItemsRow;

    public List<OrderLineItemsRow> getOrderLineItemsRow() {
        if (this.orderLineItemsRow == null) {
            this.orderLineItemsRow = new ArrayList<OrderLineItemsRow>();
        }
        return this.orderLineItemsRow;
    }

}
