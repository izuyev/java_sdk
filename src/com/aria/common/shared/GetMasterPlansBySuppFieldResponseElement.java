package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"masterPlansBySuppField", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_master_plans_by_supp_fieldResponseElement")
public class GetMasterPlansBySuppFieldResponseElement {

    @XmlElement(name = "master_plans_by_supp_field")
    protected List<MasterPlansBySuppFieldReturnElement> masterPlansBySuppField;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<MasterPlansBySuppFieldReturnElement> getMasterPlansBySuppField() {
        if (this.masterPlansBySuppField == null) {
            this.masterPlansBySuppField = new ArrayList<MasterPlansBySuppFieldReturnElement>();
        }
        return this.masterPlansBySuppField;
    }public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
