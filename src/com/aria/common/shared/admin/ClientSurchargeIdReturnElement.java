package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_surcharge_id_ReturnElement", propOrder = {"clientSurchargeIds"})
public class ClientSurchargeIdReturnElement {

    @XmlElement(name = "client_surcharge_ids")
    protected String clientSurchargeIds;
    
    public String getClientSurchargeIds() {
        return clientSurchargeIds;
    }

    public void setClientSurchargeIds(String value) {
        this.clientSurchargeIds = value;
    }

    
}
