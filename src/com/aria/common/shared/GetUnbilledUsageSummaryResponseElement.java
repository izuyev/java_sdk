package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "currencyCd", "currencyName", "acctMtdThresholdAmount", "acctPtdThresholdAmount", "clientMtdThresholdAmount", "clientPtdThresholdAmount", "mtdBalanceAmount", "ptdBalanceAmount", "acctMtdDeltaSign", "acctMtdDeltaAmount", "acctPtdDeltaSign", "acctPtdDeltaAmount", "clientMtdDeltaSign", "clientMtdDeltaAmount", "clientPtdDeltaSign", "clientPtdDeltaAmount", "unappSvcCreditBalAmount", "unappSvcCreditDeltaSign", "unappSvcCreditDeltaAmount", "unbilledUsageRecs"})
@XmlRootElement(name = "get_unbilled_usage_summaryResponseElement")
public class GetUnbilledUsageSummaryResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "currency_name")
    protected String currencyName;
    @XmlElement(name = "acct_mtd_threshold_amount")
    protected Double acctMtdThresholdAmount;
    @XmlElement(name = "acct_ptd_threshold_amount")
    protected Double acctPtdThresholdAmount;
    @XmlElement(name = "client_mtd_threshold_amount")
    protected Double clientMtdThresholdAmount;
    @XmlElement(name = "client_ptd_threshold_amount")
    protected Double clientPtdThresholdAmount;
    @XmlElement(name = "mtd_balance_amount")
    protected Double mtdBalanceAmount;
    @XmlElement(name = "ptd_balance_amount")
    protected Double ptdBalanceAmount;
    @XmlElement(name = "acct_mtd_delta_sign")
    protected String acctMtdDeltaSign;
    @XmlElement(name = "acct_mtd_delta_amount")
    protected Double acctMtdDeltaAmount;
    @XmlElement(name = "acct_ptd_delta_sign")
    protected String acctPtdDeltaSign;
    @XmlElement(name = "acct_ptd_delta_amount")
    protected Double acctPtdDeltaAmount;
    @XmlElement(name = "client_mtd_delta_sign")
    protected String clientMtdDeltaSign;
    @XmlElement(name = "client_mtd_delta_amount")
    protected Double clientMtdDeltaAmount;
    @XmlElement(name = "client_ptd_delta_sign")
    protected String clientPtdDeltaSign;
    @XmlElement(name = "client_ptd_delta_amount")
    protected Double clientPtdDeltaAmount;
    @XmlElement(name = "unapp_svc_credit_bal_amount")
    protected Double unappSvcCreditBalAmount;
    @XmlElement(name = "unapp_svc_credit_delta_sign")
    protected String unappSvcCreditDeltaSign;
    @XmlElement(name = "unapp_svc_credit_delta_amount")
    protected Double unappSvcCreditDeltaAmount;
    @XmlElement(name = "unbilled_usage_recs")
    protected List<UnbilledUsageRecsReturnElement> unbilledUsageRecs;
    
    public Long getErrorCode() {
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

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    public Double getAcctMtdThresholdAmount() {
        return acctMtdThresholdAmount;
    }

    public void setAcctMtdThresholdAmount(Double value) {
        this.acctMtdThresholdAmount = value;
    }

    public Double getAcctPtdThresholdAmount() {
        return acctPtdThresholdAmount;
    }

    public void setAcctPtdThresholdAmount(Double value) {
        this.acctPtdThresholdAmount = value;
    }

    public Double getClientMtdThresholdAmount() {
        return clientMtdThresholdAmount;
    }

    public void setClientMtdThresholdAmount(Double value) {
        this.clientMtdThresholdAmount = value;
    }

    public Double getClientPtdThresholdAmount() {
        return clientPtdThresholdAmount;
    }

    public void setClientPtdThresholdAmount(Double value) {
        this.clientPtdThresholdAmount = value;
    }

    public Double getMtdBalanceAmount() {
        return mtdBalanceAmount;
    }

    public void setMtdBalanceAmount(Double value) {
        this.mtdBalanceAmount = value;
    }

    public Double getPtdBalanceAmount() {
        return ptdBalanceAmount;
    }

    public void setPtdBalanceAmount(Double value) {
        this.ptdBalanceAmount = value;
    }

    public String getAcctMtdDeltaSign() {
        return acctMtdDeltaSign;
    }

    public void setAcctMtdDeltaSign(String value) {
        this.acctMtdDeltaSign = value;
    }

    public Double getAcctMtdDeltaAmount() {
        return acctMtdDeltaAmount;
    }

    public void setAcctMtdDeltaAmount(Double value) {
        this.acctMtdDeltaAmount = value;
    }

    public String getAcctPtdDeltaSign() {
        return acctPtdDeltaSign;
    }

    public void setAcctPtdDeltaSign(String value) {
        this.acctPtdDeltaSign = value;
    }

    public Double getAcctPtdDeltaAmount() {
        return acctPtdDeltaAmount;
    }

    public void setAcctPtdDeltaAmount(Double value) {
        this.acctPtdDeltaAmount = value;
    }

    public String getClientMtdDeltaSign() {
        return clientMtdDeltaSign;
    }

    public void setClientMtdDeltaSign(String value) {
        this.clientMtdDeltaSign = value;
    }

    public Double getClientMtdDeltaAmount() {
        return clientMtdDeltaAmount;
    }

    public void setClientMtdDeltaAmount(Double value) {
        this.clientMtdDeltaAmount = value;
    }

    public String getClientPtdDeltaSign() {
        return clientPtdDeltaSign;
    }

    public void setClientPtdDeltaSign(String value) {
        this.clientPtdDeltaSign = value;
    }

    public Double getClientPtdDeltaAmount() {
        return clientPtdDeltaAmount;
    }

    public void setClientPtdDeltaAmount(Double value) {
        this.clientPtdDeltaAmount = value;
    }

    public Double getUnappSvcCreditBalAmount() {
        return unappSvcCreditBalAmount;
    }

    public void setUnappSvcCreditBalAmount(Double value) {
        this.unappSvcCreditBalAmount = value;
    }

    public String getUnappSvcCreditDeltaSign() {
        return unappSvcCreditDeltaSign;
    }

    public void setUnappSvcCreditDeltaSign(String value) {
        this.unappSvcCreditDeltaSign = value;
    }

    public Double getUnappSvcCreditDeltaAmount() {
        return unappSvcCreditDeltaAmount;
    }

    public void setUnappSvcCreditDeltaAmount(Double value) {
        this.unappSvcCreditDeltaAmount = value;
    }

    public List<UnbilledUsageRecsReturnElement> getUnbilledUsageRecs() {
        if (this.unbilledUsageRecs == null) {
            this.unbilledUsageRecs = new ArrayList<UnbilledUsageRecsReturnElement>();
        }
        return this.unbilledUsageRecs;
    }
}
