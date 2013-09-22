package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cart_supp_plans_array", propOrder = {
    "cartSuppPlansRow"
})
public class CartSuppPlansArray {

    @XmlElement(name = "cart_supp_plans_row")
    protected List<CartSuppPlansRow> cartSuppPlansRow;

    public List<CartSuppPlansRow> getCartSuppPlansRow() {
        if (this.cartSuppPlansRow == null) {
            this.cartSuppPlansRow = new ArrayList<CartSuppPlansRow>();
        }
        return this.cartSuppPlansRow;
    }

}
