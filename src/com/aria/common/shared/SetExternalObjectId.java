package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "destinationId",    "sourceTypeId",    "objectId",    "externalId",    "actionDirective"})
@XmlRootElement(name = "set_external_object_id")
public class SetExternalObjectId {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "destination_id")
    protected Long destinationId;
        @XmlElement(name = "source_type_id")
    protected Long sourceTypeId;
        @XmlElement(name = "object_id")
    protected Long objectId;
        @XmlElement(name = "external_id")
    protected String externalId;
        @XmlElement(name = "action_directive")
    protected Long actionDirective;
    
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

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long value) {
        this.destinationId = value;
    }
            public Long getSourceTypeId() {
        return sourceTypeId;
    }

    public void setSourceTypeId(Long value) {
        this.sourceTypeId = value;
    }
            public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long value) {
        this.objectId = value;
    }
            public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String value) {
        this.externalId = value;
    }
            public Long getActionDirective() {
        return actionDirective;
    }

    public void setActionDirective(Long value) {
        this.actionDirective = value;
    }
            
}
