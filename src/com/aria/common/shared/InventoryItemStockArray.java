package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventory_item_stock_array", propOrder = {
    "inventoryItemStockRow"
})
public class InventoryItemStockArray {

    @XmlElement(name = "inventory_item_stock_row")
    protected List<InventoryItemStockRow> inventoryItemStockRow;

    public List<InventoryItemStockRow> getInventoryItemStockRow() {
        if (this.inventoryItemStockRow == null) {
            this.inventoryItemStockRow = new ArrayList<InventoryItemStockRow>();
        }
        return this.inventoryItemStockRow;
    }

}
