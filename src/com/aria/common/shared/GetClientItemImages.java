package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "itemNo",    "clientItemId"})
@XmlRootElement(name = "get_client_item_images")
public class GetClientItemImages {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "item_no")
    protected Long itemNo;
        @XmlElement(name = "client_item_id")
    protected String clientItemId;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }
            public String getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(String value) {
        this.clientItemId = value;
    }
            
}
