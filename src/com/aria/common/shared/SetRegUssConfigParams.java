package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","setName","inRegUssConfigParams","setDescription","setTypeNo"})
@XmlRootElement(name = "set_reg_uss_config_params")
public class SetRegUssConfigParams {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "set_name")
    protected String setName;
    @XmlElement(name = "in_reg_uss_config_params")
    protected InRegUssConfigParamsArray inRegUssConfigParams;
    @XmlElement(name = "set_description")
    protected String setDescription;
    @XmlElement(name = "set_type_no")
    protected Long setTypeNo;
    
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

    public String getSetName() {
        return setName;
    }

    public void setSetName(String value) {
        this.setName = value;
    }
    
    public InRegUssConfigParamsArray getInRegUssConfigParams() {
        return inRegUssConfigParams;
    }

    public void setInRegUssConfigParams(InRegUssConfigParamsArray value) {
        this.inRegUssConfigParams = value;
    }
    
    public String getSetDescription() {
        return setDescription;
    }

    public void setSetDescription(String value) {
        this.setDescription = value;
    }
    
    public Long getSetTypeNo() {
        return setTypeNo;
    }

    public void setSetTypeNo(Long value) {
        this.setTypeNo = value;
    }
    
    
}
