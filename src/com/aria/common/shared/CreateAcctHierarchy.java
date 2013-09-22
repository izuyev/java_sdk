package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","a1MasterPlanNo","doWrite","clientReceiptId","a1AltStartDate","a1ClientAcctId","a1Userid","a1StatusCd","a1MasterPlanUnits","a1SuppPlans","a1SuppPlanUnits","a1NotifyMethod","a1PromoCd","a1Password","a1SecretQuestion","a1SecretQuestionAnswer","a1FirstName","a1Mi","a1LastName","a1CompanyName","a1Address1","a1Address2","a1City","a1Locality","a1StateProv","a1Country","a1PostalCd","a1Phone","a1PhoneExt","a1CellPhone","a1WorkPhone","a1WorkPhoneExt","a1Email","a1Birthdate","a1BillFirstName","a1BillMi","a1BillLastName","a1BillCompanyName","a1BillAddress1","a1BillAddress2","a1BillCity","a1BillLocality","a1BillStateProv","a1BillCountry","a1BillPostalCd","a1BillPhone","a1BillPhoneExt","a1BillCellPhone","a1BillWorkPhone","a1BillWorkPhoneExt","a1BillEmail","a1PayMethod","a1CcNumber","a1CcExpireMm","a1CcExpireYyyy","a1BankAcctNo","a1BankRoutingNo","a1RespLevelCd","a1FunctionalAcctGroups","a1CollectionsAcctGroups","a1SuppFieldNames","a1SuppFieldValues","a1TestAcctInd","a1StatusUntilAltStart","a1BalanceForward","a1AltBillDay","a1DoFullInvoicing","a1DoProratedInvoicing","a1MasterPlanAltRateSchedNo","a1SuppPlanAltRateSchedNo","a1CurrencyCd","a1Cvv","a1TaxpayerId","a1BillAgreementId","a1RetroactiveStartDate","a1CouponCodes","a1NewAcctCustomRates","a1AltMsgTemplateNo","a1SeqFuncGroupNo","a1NewAcctPlanContracts","a1Address3","a1BillAddress3","a1UsageAccumulationConfig","a1EnableUsagePoolingPlanNo","a1ClientFuncAcctGroupIds","a1ClientCollAcctGroupIds","a1TrackData1","a1TrackData2","a1TaxExemptionLevel","a1CnAltMsgTemplateNo","a2AltStartDate","a2ClientAcctId","a2Userid","a2StatusCd","a2MasterPlanNo","a2MasterPlanUnits","a2SuppPlans","a2SuppPlanUnits","a2NotifyMethod","a2PromoCd","a2Password","a2SecretQuestion","a2SecretQuestionAnswer","a2FirstName","a2Mi","a2LastName","a2CompanyName","a2Address1","a2Address2","a2City","a2Locality","a2StateProv","a2Country","a2PostalCd","a2Phone","a2PhoneExt","a2CellPhone","a2WorkPhone","a2WorkPhoneExt","a2Email","a2Birthdate","a2BillFirstName","a2BillMi","a2BillLastName","a2BillCompanyName","a2BillAddress1","a2BillAddress2","a2BillCity","a2BillLocality","a2BillStateProv","a2BillCountry","a2BillPostalCd","a2BillPhone","a2BillPhoneExt","a2BillCellPhone","a2BillWorkPhone","a2BillWorkPhoneExt","a2BillEmail","a2PayMethod","a2CcNumber","a2CcExpireMm","a2CcExpireYyyy","a2BankAcctNo","a2BankRoutingNo","a2RespLevelCd","a2FunctionalAcctGroups","a2CollectionsAcctGroups","a2SuppFieldNames","a2SuppFieldValues","a2TestAcctInd","a2StatusUntilAltStart","a2BalanceForward","a2AltBillDay","a2DoFullInvoicing","a2DoProratedInvoicing","a2MasterPlanAltRateSchedNo","a2SuppPlanAltRateSchedNo","a2CurrencyCd","a2Cvv","a2TaxpayerId","a2BillAgreementId","a2RetroactiveStartDate","a2CouponCodes","a2NewAcctCustomRates","a2AltMsgTemplateNo","a2SeqFuncGroupNo","a2NewAcctPlanContracts","a2Address3","a2BillAddress3","a2UsageAccumulationConfig","a2EnableUsagePoolingPlanNo","a2ClientFuncAcctGroupIds","a2ClientCollAcctGroupIds","a2TrackData1","a2TrackData2","a2TaxExemptionLevel","a2CnAltMsgTemplateNo","a3AltStartDate","a3ClientAcctId","a3Userid","a3StatusCd","a3MasterPlanNo","a3MasterPlanUnits","a3SuppPlans","a3SuppPlanUnits","a3NotifyMethod","a3PromoCd","a3Password","a3SecretQuestion","a3SecretQuestionAnswer","a3FirstName","a3Mi","a3LastName","a3CompanyName","a3Address1","a3Address2","a3City","a3Locality","a3StateProv","a3Country","a3PostalCd","a3Phone","a3PhoneExt","a3CellPhone","a3WorkPhone","a3WorkPhoneExt","a3Email","a3Birthdate","a3BillFirstName","a3BillMi","a3BillLastName","a3BillCompanyName","a3BillAddress1","a3BillAddress2","a3BillCity","a3BillLocality","a3BillStateProv","a3BillCountry","a3BillPostalCd","a3BillPhone","a3BillPhoneExt","a3BillCellPhone","a3BillWorkPhone","a3BillWorkPhoneExt","a3BillEmail","a3PayMethod","a3CcNumber","a3CcExpireMm","a3CcExpireYyyy","a3BankAcctNo","a3BankRoutingNo","a3RespLevelCd","a3FunctionalAcctGroups","a3CollectionsAcctGroups","a3SuppFieldNames","a3SuppFieldValues","a3TestAcctInd","a3StatusUntilAltStart","a3BalanceForward","a3AltBillDay","a3DoFullInvoicing","a3DoProratedInvoicing","a3MasterPlanAltRateSchedNo","a3SuppPlanAltRateSchedNo","a3CurrencyCd","a3Cvv","a3TaxpayerId","a3BillAgreementId","a3RetroactiveStartDate","a3CouponCodes","a3NewAcctCustomRates","a3AltMsgTemplateNo","a3SeqFuncGroupNo","a3NewAcctPlanContracts","a3Address3","a3BillAddress3","a3UsageAccumulationConfig","a3EnableUsagePoolingPlanNo","a3ClientFuncAcctGroupIds","a3ClientCollAcctGroupIds","a3TrackData1","a3TrackData2","a3TaxExemptionLevel","a3CnAltMsgTemplateNo","a4AltStartDate","a4ClientAcctId","a4Userid","a4StatusCd","a4MasterPlanNo","a4MasterPlanUnits","a4SuppPlans","a4SuppPlanUnits","a4NotifyMethod","a4PromoCd","a4Password","a4SecretQuestion","a4SecretQuestionAnswer","a4FirstName","a4Mi","a4LastName","a4CompanyName","a4Address1","a4Address2","a4City","a4Locality","a4StateProv","a4Country","a4PostalCd","a4Phone","a4PhoneExt","a4CellPhone","a4WorkPhone","a4WorkPhoneExt","a4Email","a4Birthdate","a4BillFirstName","a4BillMi","a4BillLastName","a4BillCompanyName","a4BillAddress1","a4BillAddress2","a4BillCity","a4BillLocality","a4BillStateProv","a4BillCountry","a4BillPostalCd","a4BillPhone","a4BillPhoneExt","a4BillCellPhone","a4BillWorkPhone","a4BillWorkPhoneExt","a4BillEmail","a4PayMethod","a4CcNumber","a4CcExpireMm","a4CcExpireYyyy","a4BankAcctNo","a4BankRoutingNo","a4RespLevelCd","a4FunctionalAcctGroups","a4CollectionsAcctGroups","a4SuppFieldNames","a4SuppFieldValues","a4TestAcctInd","a4StatusUntilAltStart","a4BalanceForward","a4AltBillDay","a4DoFullInvoicing","a4DoProratedInvoicing","a4MasterPlanAltRateSchedNo","a4SuppPlanAltRateSchedNo","a4CurrencyCd","a4Cvv","a4TaxpayerId","a4BillAgreementId","a4RetroactiveStartDate","a4CouponCodes","a4NewAcctCustomRates","a4AltMsgTemplateNo","a4SeqFuncGroupNo","a4NewAcctPlanContracts","a4Address3","a4BillAddress3","a4UsageAccumulationConfig","a4EnableUsagePoolingPlanNo","a4ClientFuncAcctGroupIds","a4ClientCollAcctGroupIds","a4TrackData1","a4TrackData2","a4TaxExemptionLevel","a4CnAltMsgTemplateNo","a5AltStartDate","a5ClientAcctId","a5Userid","a5StatusCd","a5MasterPlanNo","a5MasterPlanUnits","a5SuppPlans","a5SuppPlanUnits","a5NotifyMethod","a5PromoCd","a5Password","a5SecretQuestion","a5SecretQuestionAnswer","a5FirstName","a5Mi","a5LastName","a5CompanyName","a5Address1","a5Address2","a5City","a5Locality","a5StateProv","a5Country","a5PostalCd","a5Phone","a5PhoneExt","a5CellPhone","a5WorkPhone","a5WorkPhoneExt","a5Email","a5Birthdate","a5BillFirstName","a5BillMi","a5BillLastName","a5BillCompanyName","a5BillAddress1","a5BillAddress2","a5BillCity","a5BillLocality","a5BillStateProv","a5BillCountry","a5BillPostalCd","a5BillPhone","a5BillPhoneExt","a5BillCellPhone","a5BillWorkPhone","a5BillWorkPhoneExt","a5BillEmail","a5PayMethod","a5CcNumber","a5CcExpireMm","a5CcExpireYyyy","a5BankAcctNo","a5BankRoutingNo","a5RespLevelCd","a5FunctionalAcctGroups","a5CollectionsAcctGroups","a5SuppFieldNames","a5SuppFieldValues","a5TestAcctInd","a5StatusUntilAltStart","a5BalanceForward","a5AltBillDay","a5DoFullInvoicing","a5DoProratedInvoicing","a5MasterPlanAltRateSchedNo","a5SuppPlanAltRateSchedNo","a5CurrencyCd","a5Cvv","a5TaxpayerId","a5BillAgreementId","a5RetroactiveStartDate","a5CouponCodes","a5NewAcctCustomRates","a5AltMsgTemplateNo","a5SeqFuncGroupNo","a5NewAcctPlanContracts","a5Address3","a5BillAddress3","a5UsageAccumulationConfig","a5EnableUsagePoolingPlanNo","a5ClientFuncAcctGroupIds","a5ClientCollAcctGroupIds","a5TrackData1","a5TrackData2","a5TaxExemptionLevel","a5CnAltMsgTemplateNo"})
@XmlRootElement(name = "create_acct_hierarchy")
public class CreateAcctHierarchy {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "a1_master_plan_no")
    protected Long a1MasterPlanNo;
    @XmlElement(name = "do_write")
    protected String doWrite;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "a1_alt_start_date")
    protected String a1AltStartDate;
    @XmlElement(name = "a1_client_acct_id")
    protected String a1ClientAcctId;
    @XmlElement(name = "a1_userid")
    protected String a1Userid;
    @XmlElement(name = "a1_status_cd")
    protected Long a1StatusCd;
    @XmlElement(name = "a1_master_plan_units")
    protected Long a1MasterPlanUnits;
    @XmlElement(name = "a1_supp_plans")
    protected A1SuppPlansArray a1SuppPlans;
    @XmlElement(name = "a1_supp_plan_units")
    protected A1SuppPlanUnitsArray a1SuppPlanUnits;
    @XmlElement(name = "a1_notify_method")
    protected Long a1NotifyMethod;
    @XmlElement(name = "a1_promo_cd")
    protected String a1PromoCd;
    @XmlElement(name = "a1_password")
    protected String a1Password;
    @XmlElement(name = "a1_secret_question")
    protected String a1SecretQuestion;
    @XmlElement(name = "a1_secret_question_answer")
    protected String a1SecretQuestionAnswer;
    @XmlElement(name = "a1_first_name")
    protected String a1FirstName;
    @XmlElement(name = "a1_mi")
    protected String a1Mi;
    @XmlElement(name = "a1_last_name")
    protected String a1LastName;
    @XmlElement(name = "a1_company_name")
    protected String a1CompanyName;
    @XmlElement(name = "a1_address1")
    protected String a1Address1;
    @XmlElement(name = "a1_address2")
    protected String a1Address2;
    @XmlElement(name = "a1_city")
    protected String a1City;
    @XmlElement(name = "a1_locality")
    protected String a1Locality;
    @XmlElement(name = "a1_state_prov")
    protected String a1StateProv;
    @XmlElement(name = "a1_country")
    protected String a1Country;
    @XmlElement(name = "a1_postal_cd")
    protected String a1PostalCd;
    @XmlElement(name = "a1_phone")
    protected String a1Phone;
    @XmlElement(name = "a1_phone_ext")
    protected String a1PhoneExt;
    @XmlElement(name = "a1_cell_phone")
    protected String a1CellPhone;
    @XmlElement(name = "a1_work_phone")
    protected String a1WorkPhone;
    @XmlElement(name = "a1_work_phone_ext")
    protected String a1WorkPhoneExt;
    @XmlElement(name = "a1_email")
    protected String a1Email;
    @XmlElement(name = "a1_birthdate")
    protected String a1Birthdate;
    @XmlElement(name = "a1_bill_first_name")
    protected String a1BillFirstName;
    @XmlElement(name = "a1_bill_mi")
    protected String a1BillMi;
    @XmlElement(name = "a1_bill_last_name")
    protected String a1BillLastName;
    @XmlElement(name = "a1_bill_company_name")
    protected String a1BillCompanyName;
    @XmlElement(name = "a1_bill_address1")
    protected String a1BillAddress1;
    @XmlElement(name = "a1_bill_address2")
    protected String a1BillAddress2;
    @XmlElement(name = "a1_bill_city")
    protected String a1BillCity;
    @XmlElement(name = "a1_bill_locality")
    protected String a1BillLocality;
    @XmlElement(name = "a1_bill_state_prov")
    protected String a1BillStateProv;
    @XmlElement(name = "a1_bill_country")
    protected String a1BillCountry;
    @XmlElement(name = "a1_bill_postal_cd")
    protected String a1BillPostalCd;
    @XmlElement(name = "a1_bill_phone")
    protected String a1BillPhone;
    @XmlElement(name = "a1_bill_phone_ext")
    protected String a1BillPhoneExt;
    @XmlElement(name = "a1_bill_cell_phone")
    protected String a1BillCellPhone;
    @XmlElement(name = "a1_bill_work_phone")
    protected String a1BillWorkPhone;
    @XmlElement(name = "a1_bill_work_phone_ext")
    protected String a1BillWorkPhoneExt;
    @XmlElement(name = "a1_bill_email")
    protected String a1BillEmail;
    @XmlElement(name = "a1_pay_method")
    protected Long a1PayMethod;
    @XmlElement(name = "a1_cc_number")
    protected String a1CcNumber;
    @XmlElement(name = "a1_cc_expire_mm")
    protected Long a1CcExpireMm;
    @XmlElement(name = "a1_cc_expire_yyyy")
    protected Long a1CcExpireYyyy;
    @XmlElement(name = "a1_bank_acct_no")
    protected String a1BankAcctNo;
    @XmlElement(name = "a1_bank_routing_no")
    protected String a1BankRoutingNo;
    @XmlElement(name = "a1_resp_level_cd")
    protected Long a1RespLevelCd;
    @XmlElement(name = "a1_functional_acct_groups")
    protected A1FunctionalAcctGroupsArray a1FunctionalAcctGroups;
    @XmlElement(name = "a1_collections_acct_groups")
    protected A1CollectionsAcctGroupsArray a1CollectionsAcctGroups;
    @XmlElement(name = "a1_supp_field_names")
    protected A1SuppFieldNamesArray a1SuppFieldNames;
    @XmlElement(name = "a1_supp_field_values")
    protected A1SuppFieldValuesArray a1SuppFieldValues;
    @XmlElement(name = "a1_test_acct_ind")
    protected Long a1TestAcctInd;
    @XmlElement(name = "a1_status_until_alt_start")
    protected Long a1StatusUntilAltStart;
    @XmlElement(name = "a1_balance_forward")
    protected Double a1BalanceForward;
    @XmlElement(name = "a1_alt_bill_day")
    protected Long a1AltBillDay;
    @XmlElement(name = "a1_do_full_invoicing")
    protected String a1DoFullInvoicing;
    @XmlElement(name = "a1_do_prorated_invoicing")
    protected String a1DoProratedInvoicing;
    @XmlElement(name = "a1_master_plan_alt_rate_sched_no")
    protected Long a1MasterPlanAltRateSchedNo;
    @XmlElement(name = "a1_supp_plan_alt_rate_sched_no")
    protected A1SuppPlanAltRateSchedNoArray a1SuppPlanAltRateSchedNo;
    @XmlElement(name = "a1_currency_cd")
    protected String a1CurrencyCd;
    @XmlElement(name = "a1_cvv")
    protected String a1Cvv;
    @XmlElement(name = "a1_taxpayer_id")
    protected String a1TaxpayerId;
    @XmlElement(name = "a1_bill_agreement_id")
    protected String a1BillAgreementId;
    @XmlElement(name = "a1_retroactive_start_date")
    protected String a1RetroactiveStartDate;
    @XmlElement(name = "a1_coupon_codes")
    protected A1CouponCodesArray a1CouponCodes;
    @XmlElement(name = "a1_new_acct_custom_rates")
    protected A1NewAcctCustomRatesArray a1NewAcctCustomRates;
    @XmlElement(name = "a1_alt_msg_template_no")
    protected Long a1AltMsgTemplateNo;
    @XmlElement(name = "a1_seq_func_group_no")
    protected Long a1SeqFuncGroupNo;
    @XmlElement(name = "a1_new_acct_plan_contracts")
    protected A1NewAcctPlanContractsArray a1NewAcctPlanContracts;
    @XmlElement(name = "a1_address3")
    protected String a1Address3;
    @XmlElement(name = "a1_bill_address3")
    protected String a1BillAddress3;
    @XmlElement(name = "a1_usage_accumulation_config")
    protected A1UsageAccumulationConfigArray a1UsageAccumulationConfig;
    @XmlElement(name = "a1_enable_usage_pooling_plan_no")
    protected A1EnableUsagePoolingPlanNoArray a1EnableUsagePoolingPlanNo;
    @XmlElement(name = "a1_client_func_acct_group_ids")
    protected A1ClientFuncAcctGroupIdsArray a1ClientFuncAcctGroupIds;
    @XmlElement(name = "a1_client_coll_acct_group_ids")
    protected A1ClientCollAcctGroupIdsArray a1ClientCollAcctGroupIds;
    @XmlElement(name = "a1_track_data1")
    protected String a1TrackData1;
    @XmlElement(name = "a1_track_data2")
    protected String a1TrackData2;
    @XmlElement(name = "a1_tax_exemption_level")
    protected Long a1TaxExemptionLevel;
    @XmlElement(name = "a1_cn_alt_msg_template_no")
    protected Long a1CnAltMsgTemplateNo;
    @XmlElement(name = "a2_alt_start_date")
    protected String a2AltStartDate;
    @XmlElement(name = "a2_client_acct_id")
    protected String a2ClientAcctId;
    @XmlElement(name = "a2_userid")
    protected String a2Userid;
    @XmlElement(name = "a2_status_cd")
    protected Long a2StatusCd;
    @XmlElement(name = "a2_master_plan_no")
    protected Long a2MasterPlanNo;
    @XmlElement(name = "a2_master_plan_units")
    protected Long a2MasterPlanUnits;
    @XmlElement(name = "a2_supp_plans")
    protected A2SuppPlansArray a2SuppPlans;
    @XmlElement(name = "a2_supp_plan_units")
    protected A2SuppPlanUnitsArray a2SuppPlanUnits;
    @XmlElement(name = "a2_notify_method")
    protected Long a2NotifyMethod;
    @XmlElement(name = "a2_promo_cd")
    protected String a2PromoCd;
    @XmlElement(name = "a2_password")
    protected String a2Password;
    @XmlElement(name = "a2_secret_question")
    protected String a2SecretQuestion;
    @XmlElement(name = "a2_secret_question_answer")
    protected String a2SecretQuestionAnswer;
    @XmlElement(name = "a2_first_name")
    protected String a2FirstName;
    @XmlElement(name = "a2_mi")
    protected String a2Mi;
    @XmlElement(name = "a2_last_name")
    protected String a2LastName;
    @XmlElement(name = "a2_company_name")
    protected String a2CompanyName;
    @XmlElement(name = "a2_address1")
    protected String a2Address1;
    @XmlElement(name = "a2_address2")
    protected String a2Address2;
    @XmlElement(name = "a2_city")
    protected String a2City;
    @XmlElement(name = "a2_locality")
    protected String a2Locality;
    @XmlElement(name = "a2_state_prov")
    protected String a2StateProv;
    @XmlElement(name = "a2_country")
    protected String a2Country;
    @XmlElement(name = "a2_postal_cd")
    protected String a2PostalCd;
    @XmlElement(name = "a2_phone")
    protected String a2Phone;
    @XmlElement(name = "a2_phone_ext")
    protected String a2PhoneExt;
    @XmlElement(name = "a2_cell_phone")
    protected String a2CellPhone;
    @XmlElement(name = "a2_work_phone")
    protected String a2WorkPhone;
    @XmlElement(name = "a2_work_phone_ext")
    protected String a2WorkPhoneExt;
    @XmlElement(name = "a2_email")
    protected String a2Email;
    @XmlElement(name = "a2_birthdate")
    protected String a2Birthdate;
    @XmlElement(name = "a2_bill_first_name")
    protected String a2BillFirstName;
    @XmlElement(name = "a2_bill_mi")
    protected String a2BillMi;
    @XmlElement(name = "a2_bill_last_name")
    protected String a2BillLastName;
    @XmlElement(name = "a2_bill_company_name")
    protected String a2BillCompanyName;
    @XmlElement(name = "a2_bill_address1")
    protected String a2BillAddress1;
    @XmlElement(name = "a2_bill_address2")
    protected String a2BillAddress2;
    @XmlElement(name = "a2_bill_city")
    protected String a2BillCity;
    @XmlElement(name = "a2_bill_locality")
    protected String a2BillLocality;
    @XmlElement(name = "a2_bill_state_prov")
    protected String a2BillStateProv;
    @XmlElement(name = "a2_bill_country")
    protected String a2BillCountry;
    @XmlElement(name = "a2_bill_postal_cd")
    protected String a2BillPostalCd;
    @XmlElement(name = "a2_bill_phone")
    protected String a2BillPhone;
    @XmlElement(name = "a2_bill_phone_ext")
    protected String a2BillPhoneExt;
    @XmlElement(name = "a2_bill_cell_phone")
    protected String a2BillCellPhone;
    @XmlElement(name = "a2_bill_work_phone")
    protected String a2BillWorkPhone;
    @XmlElement(name = "a2_bill_work_phone_ext")
    protected String a2BillWorkPhoneExt;
    @XmlElement(name = "a2_bill_email")
    protected String a2BillEmail;
    @XmlElement(name = "a2_pay_method")
    protected Long a2PayMethod;
    @XmlElement(name = "a2_cc_number")
    protected String a2CcNumber;
    @XmlElement(name = "a2_cc_expire_mm")
    protected Long a2CcExpireMm;
    @XmlElement(name = "a2_cc_expire_yyyy")
    protected Long a2CcExpireYyyy;
    @XmlElement(name = "a2_bank_acct_no")
    protected String a2BankAcctNo;
    @XmlElement(name = "a2_bank_routing_no")
    protected String a2BankRoutingNo;
    @XmlElement(name = "a2_resp_level_cd")
    protected Long a2RespLevelCd;
    @XmlElement(name = "a2_functional_acct_groups")
    protected A2FunctionalAcctGroupsArray a2FunctionalAcctGroups;
    @XmlElement(name = "a2_collections_acct_groups")
    protected A2CollectionsAcctGroupsArray a2CollectionsAcctGroups;
    @XmlElement(name = "a2_supp_field_names")
    protected A2SuppFieldNamesArray a2SuppFieldNames;
    @XmlElement(name = "a2_supp_field_values")
    protected A2SuppFieldValuesArray a2SuppFieldValues;
    @XmlElement(name = "a2_test_acct_ind")
    protected Long a2TestAcctInd;
    @XmlElement(name = "a2_status_until_alt_start")
    protected Long a2StatusUntilAltStart;
    @XmlElement(name = "a2_balance_forward")
    protected Double a2BalanceForward;
    @XmlElement(name = "a2_alt_bill_day")
    protected Long a2AltBillDay;
    @XmlElement(name = "a2_do_full_invoicing")
    protected String a2DoFullInvoicing;
    @XmlElement(name = "a2_do_prorated_invoicing")
    protected String a2DoProratedInvoicing;
    @XmlElement(name = "a2_master_plan_alt_rate_sched_no")
    protected Long a2MasterPlanAltRateSchedNo;
    @XmlElement(name = "a2_supp_plan_alt_rate_sched_no")
    protected A2SuppPlanAltRateSchedNoArray a2SuppPlanAltRateSchedNo;
    @XmlElement(name = "a2_currency_cd")
    protected String a2CurrencyCd;
    @XmlElement(name = "a2_cvv")
    protected String a2Cvv;
    @XmlElement(name = "a2_taxpayer_id")
    protected String a2TaxpayerId;
    @XmlElement(name = "a2_bill_agreement_id")
    protected String a2BillAgreementId;
    @XmlElement(name = "a2_retroactive_start_date")
    protected String a2RetroactiveStartDate;
    @XmlElement(name = "a2_coupon_codes")
    protected A2CouponCodesArray a2CouponCodes;
    @XmlElement(name = "a2_new_acct_custom_rates")
    protected A2NewAcctCustomRatesArray a2NewAcctCustomRates;
    @XmlElement(name = "a2_alt_msg_template_no")
    protected Long a2AltMsgTemplateNo;
    @XmlElement(name = "a2_seq_func_group_no")
    protected Long a2SeqFuncGroupNo;
    @XmlElement(name = "a2_new_acct_plan_contracts")
    protected A2NewAcctPlanContractsArray a2NewAcctPlanContracts;
    @XmlElement(name = "a2_address3")
    protected String a2Address3;
    @XmlElement(name = "a2_bill_address3")
    protected String a2BillAddress3;
    @XmlElement(name = "a2_usage_accumulation_config")
    protected A2UsageAccumulationConfigArray a2UsageAccumulationConfig;
    @XmlElement(name = "a2_enable_usage_pooling_plan_no")
    protected A2EnableUsagePoolingPlanNoArray a2EnableUsagePoolingPlanNo;
    @XmlElement(name = "a2_client_func_acct_group_ids")
    protected A2ClientFuncAcctGroupIdsArray a2ClientFuncAcctGroupIds;
    @XmlElement(name = "a2_client_coll_acct_group_ids")
    protected A2ClientCollAcctGroupIdsArray a2ClientCollAcctGroupIds;
    @XmlElement(name = "a2_track_data1")
    protected String a2TrackData1;
    @XmlElement(name = "a2_track_data2")
    protected String a2TrackData2;
    @XmlElement(name = "a2_tax_exemption_level")
    protected Long a2TaxExemptionLevel;
    @XmlElement(name = "a2_cn_alt_msg_template_no")
    protected Long a2CnAltMsgTemplateNo;
    @XmlElement(name = "a3_alt_start_date")
    protected String a3AltStartDate;
    @XmlElement(name = "a3_client_acct_id")
    protected String a3ClientAcctId;
    @XmlElement(name = "a3_userid")
    protected String a3Userid;
    @XmlElement(name = "a3_status_cd")
    protected Long a3StatusCd;
    @XmlElement(name = "a3_master_plan_no")
    protected Long a3MasterPlanNo;
    @XmlElement(name = "a3_master_plan_units")
    protected Long a3MasterPlanUnits;
    @XmlElement(name = "a3_supp_plans")
    protected A3SuppPlansArray a3SuppPlans;
    @XmlElement(name = "a3_supp_plan_units")
    protected A3SuppPlanUnitsArray a3SuppPlanUnits;
    @XmlElement(name = "a3_notify_method")
    protected Long a3NotifyMethod;
    @XmlElement(name = "a3_promo_cd")
    protected String a3PromoCd;
    @XmlElement(name = "a3_password")
    protected String a3Password;
    @XmlElement(name = "a3_secret_question")
    protected String a3SecretQuestion;
    @XmlElement(name = "a3_secret_question_answer")
    protected String a3SecretQuestionAnswer;
    @XmlElement(name = "a3_first_name")
    protected String a3FirstName;
    @XmlElement(name = "a3_mi")
    protected String a3Mi;
    @XmlElement(name = "a3_last_name")
    protected String a3LastName;
    @XmlElement(name = "a3_company_name")
    protected String a3CompanyName;
    @XmlElement(name = "a3_address1")
    protected String a3Address1;
    @XmlElement(name = "a3_address2")
    protected String a3Address2;
    @XmlElement(name = "a3_city")
    protected String a3City;
    @XmlElement(name = "a3_locality")
    protected String a3Locality;
    @XmlElement(name = "a3_state_prov")
    protected String a3StateProv;
    @XmlElement(name = "a3_country")
    protected String a3Country;
    @XmlElement(name = "a3_postal_cd")
    protected String a3PostalCd;
    @XmlElement(name = "a3_phone")
    protected String a3Phone;
    @XmlElement(name = "a3_phone_ext")
    protected String a3PhoneExt;
    @XmlElement(name = "a3_cell_phone")
    protected String a3CellPhone;
    @XmlElement(name = "a3_work_phone")
    protected String a3WorkPhone;
    @XmlElement(name = "a3_work_phone_ext")
    protected String a3WorkPhoneExt;
    @XmlElement(name = "a3_email")
    protected String a3Email;
    @XmlElement(name = "a3_birthdate")
    protected String a3Birthdate;
    @XmlElement(name = "a3_bill_first_name")
    protected String a3BillFirstName;
    @XmlElement(name = "a3_bill_mi")
    protected String a3BillMi;
    @XmlElement(name = "a3_bill_last_name")
    protected String a3BillLastName;
    @XmlElement(name = "a3_bill_company_name")
    protected String a3BillCompanyName;
    @XmlElement(name = "a3_bill_address1")
    protected String a3BillAddress1;
    @XmlElement(name = "a3_bill_address2")
    protected String a3BillAddress2;
    @XmlElement(name = "a3_bill_city")
    protected String a3BillCity;
    @XmlElement(name = "a3_bill_locality")
    protected String a3BillLocality;
    @XmlElement(name = "a3_bill_state_prov")
    protected String a3BillStateProv;
    @XmlElement(name = "a3_bill_country")
    protected String a3BillCountry;
    @XmlElement(name = "a3_bill_postal_cd")
    protected String a3BillPostalCd;
    @XmlElement(name = "a3_bill_phone")
    protected String a3BillPhone;
    @XmlElement(name = "a3_bill_phone_ext")
    protected String a3BillPhoneExt;
    @XmlElement(name = "a3_bill_cell_phone")
    protected String a3BillCellPhone;
    @XmlElement(name = "a3_bill_work_phone")
    protected String a3BillWorkPhone;
    @XmlElement(name = "a3_bill_work_phone_ext")
    protected String a3BillWorkPhoneExt;
    @XmlElement(name = "a3_bill_email")
    protected String a3BillEmail;
    @XmlElement(name = "a3_pay_method")
    protected Long a3PayMethod;
    @XmlElement(name = "a3_cc_number")
    protected String a3CcNumber;
    @XmlElement(name = "a3_cc_expire_mm")
    protected Long a3CcExpireMm;
    @XmlElement(name = "a3_cc_expire_yyyy")
    protected Long a3CcExpireYyyy;
    @XmlElement(name = "a3_bank_acct_no")
    protected String a3BankAcctNo;
    @XmlElement(name = "a3_bank_routing_no")
    protected String a3BankRoutingNo;
    @XmlElement(name = "a3_resp_level_cd")
    protected Long a3RespLevelCd;
    @XmlElement(name = "a3_functional_acct_groups")
    protected A3FunctionalAcctGroupsArray a3FunctionalAcctGroups;
    @XmlElement(name = "a3_collections_acct_groups")
    protected A3CollectionsAcctGroupsArray a3CollectionsAcctGroups;
    @XmlElement(name = "a3_supp_field_names")
    protected A3SuppFieldNamesArray a3SuppFieldNames;
    @XmlElement(name = "a3_supp_field_values")
    protected A3SuppFieldValuesArray a3SuppFieldValues;
    @XmlElement(name = "a3_test_acct_ind")
    protected Long a3TestAcctInd;
    @XmlElement(name = "a3_status_until_alt_start")
    protected Long a3StatusUntilAltStart;
    @XmlElement(name = "a3_balance_forward")
    protected Double a3BalanceForward;
    @XmlElement(name = "a3_alt_bill_day")
    protected Long a3AltBillDay;
    @XmlElement(name = "a3_do_full_invoicing")
    protected String a3DoFullInvoicing;
    @XmlElement(name = "a3_do_prorated_invoicing")
    protected String a3DoProratedInvoicing;
    @XmlElement(name = "a3_master_plan_alt_rate_sched_no")
    protected Long a3MasterPlanAltRateSchedNo;
    @XmlElement(name = "a3_supp_plan_alt_rate_sched_no")
    protected A3SuppPlanAltRateSchedNoArray a3SuppPlanAltRateSchedNo;
    @XmlElement(name = "a3_currency_cd")
    protected String a3CurrencyCd;
    @XmlElement(name = "a3_cvv")
    protected String a3Cvv;
    @XmlElement(name = "a3_taxpayer_id")
    protected String a3TaxpayerId;
    @XmlElement(name = "a3_bill_agreement_id")
    protected String a3BillAgreementId;
    @XmlElement(name = "a3_retroactive_start_date")
    protected String a3RetroactiveStartDate;
    @XmlElement(name = "a3_coupon_codes")
    protected A3CouponCodesArray a3CouponCodes;
    @XmlElement(name = "a3_new_acct_custom_rates")
    protected A3NewAcctCustomRatesArray a3NewAcctCustomRates;
    @XmlElement(name = "a3_alt_msg_template_no")
    protected Long a3AltMsgTemplateNo;
    @XmlElement(name = "a3_seq_func_group_no")
    protected Long a3SeqFuncGroupNo;
    @XmlElement(name = "a3_new_acct_plan_contracts")
    protected A3NewAcctPlanContractsArray a3NewAcctPlanContracts;
    @XmlElement(name = "a3_address3")
    protected String a3Address3;
    @XmlElement(name = "a3_bill_address3")
    protected String a3BillAddress3;
    @XmlElement(name = "a3_usage_accumulation_config")
    protected A3UsageAccumulationConfigArray a3UsageAccumulationConfig;
    @XmlElement(name = "a3_enable_usage_pooling_plan_no")
    protected A3EnableUsagePoolingPlanNoArray a3EnableUsagePoolingPlanNo;
    @XmlElement(name = "a3_client_func_acct_group_ids")
    protected A3ClientFuncAcctGroupIdsArray a3ClientFuncAcctGroupIds;
    @XmlElement(name = "a3_client_coll_acct_group_ids")
    protected A3ClientCollAcctGroupIdsArray a3ClientCollAcctGroupIds;
    @XmlElement(name = "a3_track_data1")
    protected String a3TrackData1;
    @XmlElement(name = "a3_track_data2")
    protected String a3TrackData2;
    @XmlElement(name = "a3_tax_exemption_level")
    protected Long a3TaxExemptionLevel;
    @XmlElement(name = "a3_cn_alt_msg_template_no")
    protected Long a3CnAltMsgTemplateNo;
    @XmlElement(name = "a4_alt_start_date")
    protected String a4AltStartDate;
    @XmlElement(name = "a4_client_acct_id")
    protected String a4ClientAcctId;
    @XmlElement(name = "a4_userid")
    protected String a4Userid;
    @XmlElement(name = "a4_status_cd")
    protected Long a4StatusCd;
    @XmlElement(name = "a4_master_plan_no")
    protected Long a4MasterPlanNo;
    @XmlElement(name = "a4_master_plan_units")
    protected Long a4MasterPlanUnits;
    @XmlElement(name = "a4_supp_plans")
    protected A4SuppPlansArray a4SuppPlans;
    @XmlElement(name = "a4_supp_plan_units")
    protected A4SuppPlanUnitsArray a4SuppPlanUnits;
    @XmlElement(name = "a4_notify_method")
    protected Long a4NotifyMethod;
    @XmlElement(name = "a4_promo_cd")
    protected String a4PromoCd;
    @XmlElement(name = "a4_password")
    protected String a4Password;
    @XmlElement(name = "a4_secret_question")
    protected String a4SecretQuestion;
    @XmlElement(name = "a4_secret_question_answer")
    protected String a4SecretQuestionAnswer;
    @XmlElement(name = "a4_first_name")
    protected String a4FirstName;
    @XmlElement(name = "a4_mi")
    protected String a4Mi;
    @XmlElement(name = "a4_last_name")
    protected String a4LastName;
    @XmlElement(name = "a4_company_name")
    protected String a4CompanyName;
    @XmlElement(name = "a4_address1")
    protected String a4Address1;
    @XmlElement(name = "a4_address2")
    protected String a4Address2;
    @XmlElement(name = "a4_city")
    protected String a4City;
    @XmlElement(name = "a4_locality")
    protected String a4Locality;
    @XmlElement(name = "a4_state_prov")
    protected String a4StateProv;
    @XmlElement(name = "a4_country")
    protected String a4Country;
    @XmlElement(name = "a4_postal_cd")
    protected String a4PostalCd;
    @XmlElement(name = "a4_phone")
    protected String a4Phone;
    @XmlElement(name = "a4_phone_ext")
    protected String a4PhoneExt;
    @XmlElement(name = "a4_cell_phone")
    protected String a4CellPhone;
    @XmlElement(name = "a4_work_phone")
    protected String a4WorkPhone;
    @XmlElement(name = "a4_work_phone_ext")
    protected String a4WorkPhoneExt;
    @XmlElement(name = "a4_email")
    protected String a4Email;
    @XmlElement(name = "a4_birthdate")
    protected String a4Birthdate;
    @XmlElement(name = "a4_bill_first_name")
    protected String a4BillFirstName;
    @XmlElement(name = "a4_bill_mi")
    protected String a4BillMi;
    @XmlElement(name = "a4_bill_last_name")
    protected String a4BillLastName;
    @XmlElement(name = "a4_bill_company_name")
    protected String a4BillCompanyName;
    @XmlElement(name = "a4_bill_address1")
    protected String a4BillAddress1;
    @XmlElement(name = "a4_bill_address2")
    protected String a4BillAddress2;
    @XmlElement(name = "a4_bill_city")
    protected String a4BillCity;
    @XmlElement(name = "a4_bill_locality")
    protected String a4BillLocality;
    @XmlElement(name = "a4_bill_state_prov")
    protected String a4BillStateProv;
    @XmlElement(name = "a4_bill_country")
    protected String a4BillCountry;
    @XmlElement(name = "a4_bill_postal_cd")
    protected String a4BillPostalCd;
    @XmlElement(name = "a4_bill_phone")
    protected String a4BillPhone;
    @XmlElement(name = "a4_bill_phone_ext")
    protected String a4BillPhoneExt;
    @XmlElement(name = "a4_bill_cell_phone")
    protected String a4BillCellPhone;
    @XmlElement(name = "a4_bill_work_phone")
    protected String a4BillWorkPhone;
    @XmlElement(name = "a4_bill_work_phone_ext")
    protected String a4BillWorkPhoneExt;
    @XmlElement(name = "a4_bill_email")
    protected String a4BillEmail;
    @XmlElement(name = "a4_pay_method")
    protected Long a4PayMethod;
    @XmlElement(name = "a4_cc_number")
    protected String a4CcNumber;
    @XmlElement(name = "a4_cc_expire_mm")
    protected Long a4CcExpireMm;
    @XmlElement(name = "a4_cc_expire_yyyy")
    protected Long a4CcExpireYyyy;
    @XmlElement(name = "a4_bank_acct_no")
    protected String a4BankAcctNo;
    @XmlElement(name = "a4_bank_routing_no")
    protected String a4BankRoutingNo;
    @XmlElement(name = "a4_resp_level_cd")
    protected Long a4RespLevelCd;
    @XmlElement(name = "a4_functional_acct_groups")
    protected A4FunctionalAcctGroupsArray a4FunctionalAcctGroups;
    @XmlElement(name = "a4_collections_acct_groups")
    protected A4CollectionsAcctGroupsArray a4CollectionsAcctGroups;
    @XmlElement(name = "a4_supp_field_names")
    protected A4SuppFieldNamesArray a4SuppFieldNames;
    @XmlElement(name = "a4_supp_field_values")
    protected A4SuppFieldValuesArray a4SuppFieldValues;
    @XmlElement(name = "a4_test_acct_ind")
    protected Long a4TestAcctInd;
    @XmlElement(name = "a4_status_until_alt_start")
    protected Long a4StatusUntilAltStart;
    @XmlElement(name = "a4_balance_forward")
    protected Double a4BalanceForward;
    @XmlElement(name = "a4_alt_bill_day")
    protected Long a4AltBillDay;
    @XmlElement(name = "a4_do_full_invoicing")
    protected String a4DoFullInvoicing;
    @XmlElement(name = "a4_do_prorated_invoicing")
    protected String a4DoProratedInvoicing;
    @XmlElement(name = "a4_master_plan_alt_rate_sched_no")
    protected Long a4MasterPlanAltRateSchedNo;
    @XmlElement(name = "a4_supp_plan_alt_rate_sched_no")
    protected A4SuppPlanAltRateSchedNoArray a4SuppPlanAltRateSchedNo;
    @XmlElement(name = "a4_currency_cd")
    protected String a4CurrencyCd;
    @XmlElement(name = "a4_cvv")
    protected String a4Cvv;
    @XmlElement(name = "a4_taxpayer_id")
    protected String a4TaxpayerId;
    @XmlElement(name = "a4_bill_agreement_id")
    protected String a4BillAgreementId;
    @XmlElement(name = "a4_retroactive_start_date")
    protected String a4RetroactiveStartDate;
    @XmlElement(name = "a4_coupon_codes")
    protected A4CouponCodesArray a4CouponCodes;
    @XmlElement(name = "a4_new_acct_custom_rates")
    protected A4NewAcctCustomRatesArray a4NewAcctCustomRates;
    @XmlElement(name = "a4_alt_msg_template_no")
    protected Long a4AltMsgTemplateNo;
    @XmlElement(name = "a4_seq_func_group_no")
    protected Long a4SeqFuncGroupNo;
    @XmlElement(name = "a4_new_acct_plan_contracts")
    protected A4NewAcctPlanContractsArray a4NewAcctPlanContracts;
    @XmlElement(name = "a4_address3")
    protected String a4Address3;
    @XmlElement(name = "a4_bill_address3")
    protected String a4BillAddress3;
    @XmlElement(name = "a4_usage_accumulation_config")
    protected A4UsageAccumulationConfigArray a4UsageAccumulationConfig;
    @XmlElement(name = "a4_enable_usage_pooling_plan_no")
    protected A4EnableUsagePoolingPlanNoArray a4EnableUsagePoolingPlanNo;
    @XmlElement(name = "a4_client_func_acct_group_ids")
    protected A4ClientFuncAcctGroupIdsArray a4ClientFuncAcctGroupIds;
    @XmlElement(name = "a4_client_coll_acct_group_ids")
    protected A4ClientCollAcctGroupIdsArray a4ClientCollAcctGroupIds;
    @XmlElement(name = "a4_track_data1")
    protected String a4TrackData1;
    @XmlElement(name = "a4_track_data2")
    protected String a4TrackData2;
    @XmlElement(name = "a4_tax_exemption_level")
    protected Long a4TaxExemptionLevel;
    @XmlElement(name = "a4_cn_alt_msg_template_no")
    protected Long a4CnAltMsgTemplateNo;
    @XmlElement(name = "a5_alt_start_date")
    protected String a5AltStartDate;
    @XmlElement(name = "a5_client_acct_id")
    protected String a5ClientAcctId;
    @XmlElement(name = "a5_userid")
    protected String a5Userid;
    @XmlElement(name = "a5_status_cd")
    protected Long a5StatusCd;
    @XmlElement(name = "a5_master_plan_no")
    protected Long a5MasterPlanNo;
    @XmlElement(name = "a5_master_plan_units")
    protected Long a5MasterPlanUnits;
    @XmlElement(name = "a5_supp_plans")
    protected A5SuppPlansArray a5SuppPlans;
    @XmlElement(name = "a5_supp_plan_units")
    protected A5SuppPlanUnitsArray a5SuppPlanUnits;
    @XmlElement(name = "a5_notify_method")
    protected Long a5NotifyMethod;
    @XmlElement(name = "a5_promo_cd")
    protected String a5PromoCd;
    @XmlElement(name = "a5_password")
    protected String a5Password;
    @XmlElement(name = "a5_secret_question")
    protected String a5SecretQuestion;
    @XmlElement(name = "a5_secret_question_answer")
    protected String a5SecretQuestionAnswer;
    @XmlElement(name = "a5_first_name")
    protected String a5FirstName;
    @XmlElement(name = "a5_mi")
    protected String a5Mi;
    @XmlElement(name = "a5_last_name")
    protected String a5LastName;
    @XmlElement(name = "a5_company_name")
    protected String a5CompanyName;
    @XmlElement(name = "a5_address1")
    protected String a5Address1;
    @XmlElement(name = "a5_address2")
    protected String a5Address2;
    @XmlElement(name = "a5_city")
    protected String a5City;
    @XmlElement(name = "a5_locality")
    protected String a5Locality;
    @XmlElement(name = "a5_state_prov")
    protected String a5StateProv;
    @XmlElement(name = "a5_country")
    protected String a5Country;
    @XmlElement(name = "a5_postal_cd")
    protected String a5PostalCd;
    @XmlElement(name = "a5_phone")
    protected String a5Phone;
    @XmlElement(name = "a5_phone_ext")
    protected String a5PhoneExt;
    @XmlElement(name = "a5_cell_phone")
    protected String a5CellPhone;
    @XmlElement(name = "a5_work_phone")
    protected String a5WorkPhone;
    @XmlElement(name = "a5_work_phone_ext")
    protected String a5WorkPhoneExt;
    @XmlElement(name = "a5_email")
    protected String a5Email;
    @XmlElement(name = "a5_birthdate")
    protected String a5Birthdate;
    @XmlElement(name = "a5_bill_first_name")
    protected String a5BillFirstName;
    @XmlElement(name = "a5_bill_mi")
    protected String a5BillMi;
    @XmlElement(name = "a5_bill_last_name")
    protected String a5BillLastName;
    @XmlElement(name = "a5_bill_company_name")
    protected String a5BillCompanyName;
    @XmlElement(name = "a5_bill_address1")
    protected String a5BillAddress1;
    @XmlElement(name = "a5_bill_address2")
    protected String a5BillAddress2;
    @XmlElement(name = "a5_bill_city")
    protected String a5BillCity;
    @XmlElement(name = "a5_bill_locality")
    protected String a5BillLocality;
    @XmlElement(name = "a5_bill_state_prov")
    protected String a5BillStateProv;
    @XmlElement(name = "a5_bill_country")
    protected String a5BillCountry;
    @XmlElement(name = "a5_bill_postal_cd")
    protected String a5BillPostalCd;
    @XmlElement(name = "a5_bill_phone")
    protected String a5BillPhone;
    @XmlElement(name = "a5_bill_phone_ext")
    protected String a5BillPhoneExt;
    @XmlElement(name = "a5_bill_cell_phone")
    protected String a5BillCellPhone;
    @XmlElement(name = "a5_bill_work_phone")
    protected String a5BillWorkPhone;
    @XmlElement(name = "a5_bill_work_phone_ext")
    protected String a5BillWorkPhoneExt;
    @XmlElement(name = "a5_bill_email")
    protected String a5BillEmail;
    @XmlElement(name = "a5_pay_method")
    protected Long a5PayMethod;
    @XmlElement(name = "a5_cc_number")
    protected String a5CcNumber;
    @XmlElement(name = "a5_cc_expire_mm")
    protected Long a5CcExpireMm;
    @XmlElement(name = "a5_cc_expire_yyyy")
    protected Long a5CcExpireYyyy;
    @XmlElement(name = "a5_bank_acct_no")
    protected String a5BankAcctNo;
    @XmlElement(name = "a5_bank_routing_no")
    protected String a5BankRoutingNo;
    @XmlElement(name = "a5_resp_level_cd")
    protected Long a5RespLevelCd;
    @XmlElement(name = "a5_functional_acct_groups")
    protected A5FunctionalAcctGroupsArray a5FunctionalAcctGroups;
    @XmlElement(name = "a5_collections_acct_groups")
    protected A5CollectionsAcctGroupsArray a5CollectionsAcctGroups;
    @XmlElement(name = "a5_supp_field_names")
    protected A5SuppFieldNamesArray a5SuppFieldNames;
    @XmlElement(name = "a5_supp_field_values")
    protected A5SuppFieldValuesArray a5SuppFieldValues;
    @XmlElement(name = "a5_test_acct_ind")
    protected Long a5TestAcctInd;
    @XmlElement(name = "a5_status_until_alt_start")
    protected Long a5StatusUntilAltStart;
    @XmlElement(name = "a5_balance_forward")
    protected Double a5BalanceForward;
    @XmlElement(name = "a5_alt_bill_day")
    protected Long a5AltBillDay;
    @XmlElement(name = "a5_do_full_invoicing")
    protected String a5DoFullInvoicing;
    @XmlElement(name = "a5_do_prorated_invoicing")
    protected String a5DoProratedInvoicing;
    @XmlElement(name = "a5_master_plan_alt_rate_sched_no")
    protected Long a5MasterPlanAltRateSchedNo;
    @XmlElement(name = "a5_supp_plan_alt_rate_sched_no")
    protected A5SuppPlanAltRateSchedNoArray a5SuppPlanAltRateSchedNo;
    @XmlElement(name = "a5_currency_cd")
    protected String a5CurrencyCd;
    @XmlElement(name = "a5_cvv")
    protected String a5Cvv;
    @XmlElement(name = "a5_taxpayer_id")
    protected String a5TaxpayerId;
    @XmlElement(name = "a5_bill_agreement_id")
    protected String a5BillAgreementId;
    @XmlElement(name = "a5_retroactive_start_date")
    protected String a5RetroactiveStartDate;
    @XmlElement(name = "a5_coupon_codes")
    protected A5CouponCodesArray a5CouponCodes;
    @XmlElement(name = "a5_new_acct_custom_rates")
    protected A5NewAcctCustomRatesArray a5NewAcctCustomRates;
    @XmlElement(name = "a5_alt_msg_template_no")
    protected Long a5AltMsgTemplateNo;
    @XmlElement(name = "a5_seq_func_group_no")
    protected Long a5SeqFuncGroupNo;
    @XmlElement(name = "a5_new_acct_plan_contracts")
    protected A5NewAcctPlanContractsArray a5NewAcctPlanContracts;
    @XmlElement(name = "a5_address3")
    protected String a5Address3;
    @XmlElement(name = "a5_bill_address3")
    protected String a5BillAddress3;
    @XmlElement(name = "a5_usage_accumulation_config")
    protected A5UsageAccumulationConfigArray a5UsageAccumulationConfig;
    @XmlElement(name = "a5_enable_usage_pooling_plan_no")
    protected A5EnableUsagePoolingPlanNoArray a5EnableUsagePoolingPlanNo;
    @XmlElement(name = "a5_client_func_acct_group_ids")
    protected A5ClientFuncAcctGroupIdsArray a5ClientFuncAcctGroupIds;
    @XmlElement(name = "a5_client_coll_acct_group_ids")
    protected A5ClientCollAcctGroupIdsArray a5ClientCollAcctGroupIds;
    @XmlElement(name = "a5_track_data1")
    protected String a5TrackData1;
    @XmlElement(name = "a5_track_data2")
    protected String a5TrackData2;
    @XmlElement(name = "a5_tax_exemption_level")
    protected Long a5TaxExemptionLevel;
    @XmlElement(name = "a5_cn_alt_msg_template_no")
    protected Long a5CnAltMsgTemplateNo;
    
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

    public Long getA1MasterPlanNo() {
        return a1MasterPlanNo;
    }

    public void setA1MasterPlanNo(Long value) {
        this.a1MasterPlanNo = value;
    }
    
    public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
    
    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
    
    public String getA1AltStartDate() {
        return a1AltStartDate;
    }

    public void setA1AltStartDate(String value) {
        this.a1AltStartDate = value;
    }
    
    public String getA1ClientAcctId() {
        return a1ClientAcctId;
    }

    public void setA1ClientAcctId(String value) {
        this.a1ClientAcctId = value;
    }
    
    public String getA1Userid() {
        return a1Userid;
    }

    public void setA1Userid(String value) {
        this.a1Userid = value;
    }
    
    public Long getA1StatusCd() {
        return a1StatusCd;
    }

    public void setA1StatusCd(Long value) {
        this.a1StatusCd = value;
    }
    
    public Long getA1MasterPlanUnits() {
        return a1MasterPlanUnits;
    }

    public void setA1MasterPlanUnits(Long value) {
        this.a1MasterPlanUnits = value;
    }
    
    public A1SuppPlansArray getA1SuppPlans() {
        return a1SuppPlans;
    }

    public void setA1SuppPlans(A1SuppPlansArray value) {
        this.a1SuppPlans = value;
    }
    
    public A1SuppPlanUnitsArray getA1SuppPlanUnits() {
        return a1SuppPlanUnits;
    }

    public void setA1SuppPlanUnits(A1SuppPlanUnitsArray value) {
        this.a1SuppPlanUnits = value;
    }
    
    public Long getA1NotifyMethod() {
        return a1NotifyMethod;
    }

    public void setA1NotifyMethod(Long value) {
        this.a1NotifyMethod = value;
    }
    
    public String getA1PromoCd() {
        return a1PromoCd;
    }

    public void setA1PromoCd(String value) {
        this.a1PromoCd = value;
    }
    
    public String getA1Password() {
        return a1Password;
    }

    public void setA1Password(String value) {
        this.a1Password = value;
    }
    
    public String getA1SecretQuestion() {
        return a1SecretQuestion;
    }

    public void setA1SecretQuestion(String value) {
        this.a1SecretQuestion = value;
    }
    
    public String getA1SecretQuestionAnswer() {
        return a1SecretQuestionAnswer;
    }

    public void setA1SecretQuestionAnswer(String value) {
        this.a1SecretQuestionAnswer = value;
    }
    
    public String getA1FirstName() {
        return a1FirstName;
    }

    public void setA1FirstName(String value) {
        this.a1FirstName = value;
    }
    
    public String getA1Mi() {
        return a1Mi;
    }

    public void setA1Mi(String value) {
        this.a1Mi = value;
    }
    
    public String getA1LastName() {
        return a1LastName;
    }

    public void setA1LastName(String value) {
        this.a1LastName = value;
    }
    
    public String getA1CompanyName() {
        return a1CompanyName;
    }

    public void setA1CompanyName(String value) {
        this.a1CompanyName = value;
    }
    
    public String getA1Address1() {
        return a1Address1;
    }

    public void setA1Address1(String value) {
        this.a1Address1 = value;
    }
    
    public String getA1Address2() {
        return a1Address2;
    }

    public void setA1Address2(String value) {
        this.a1Address2 = value;
    }
    
    public String getA1City() {
        return a1City;
    }

    public void setA1City(String value) {
        this.a1City = value;
    }
    
    public String getA1Locality() {
        return a1Locality;
    }

    public void setA1Locality(String value) {
        this.a1Locality = value;
    }
    
    public String getA1StateProv() {
        return a1StateProv;
    }

    public void setA1StateProv(String value) {
        this.a1StateProv = value;
    }
    
    public String getA1Country() {
        return a1Country;
    }

    public void setA1Country(String value) {
        this.a1Country = value;
    }
    
    public String getA1PostalCd() {
        return a1PostalCd;
    }

    public void setA1PostalCd(String value) {
        this.a1PostalCd = value;
    }
    
    public String getA1Phone() {
        return a1Phone;
    }

    public void setA1Phone(String value) {
        this.a1Phone = value;
    }
    
    public String getA1PhoneExt() {
        return a1PhoneExt;
    }

    public void setA1PhoneExt(String value) {
        this.a1PhoneExt = value;
    }
    
    public String getA1CellPhone() {
        return a1CellPhone;
    }

    public void setA1CellPhone(String value) {
        this.a1CellPhone = value;
    }
    
    public String getA1WorkPhone() {
        return a1WorkPhone;
    }

    public void setA1WorkPhone(String value) {
        this.a1WorkPhone = value;
    }
    
    public String getA1WorkPhoneExt() {
        return a1WorkPhoneExt;
    }

    public void setA1WorkPhoneExt(String value) {
        this.a1WorkPhoneExt = value;
    }
    
    public String getA1Email() {
        return a1Email;
    }

    public void setA1Email(String value) {
        this.a1Email = value;
    }
    
    public String getA1Birthdate() {
        return a1Birthdate;
    }

    public void setA1Birthdate(String value) {
        this.a1Birthdate = value;
    }
    
    public String getA1BillFirstName() {
        return a1BillFirstName;
    }

    public void setA1BillFirstName(String value) {
        this.a1BillFirstName = value;
    }
    
    public String getA1BillMi() {
        return a1BillMi;
    }

    public void setA1BillMi(String value) {
        this.a1BillMi = value;
    }
    
    public String getA1BillLastName() {
        return a1BillLastName;
    }

    public void setA1BillLastName(String value) {
        this.a1BillLastName = value;
    }
    
    public String getA1BillCompanyName() {
        return a1BillCompanyName;
    }

    public void setA1BillCompanyName(String value) {
        this.a1BillCompanyName = value;
    }
    
    public String getA1BillAddress1() {
        return a1BillAddress1;
    }

    public void setA1BillAddress1(String value) {
        this.a1BillAddress1 = value;
    }
    
    public String getA1BillAddress2() {
        return a1BillAddress2;
    }

    public void setA1BillAddress2(String value) {
        this.a1BillAddress2 = value;
    }
    
    public String getA1BillCity() {
        return a1BillCity;
    }

    public void setA1BillCity(String value) {
        this.a1BillCity = value;
    }
    
    public String getA1BillLocality() {
        return a1BillLocality;
    }

    public void setA1BillLocality(String value) {
        this.a1BillLocality = value;
    }
    
    public String getA1BillStateProv() {
        return a1BillStateProv;
    }

    public void setA1BillStateProv(String value) {
        this.a1BillStateProv = value;
    }
    
    public String getA1BillCountry() {
        return a1BillCountry;
    }

    public void setA1BillCountry(String value) {
        this.a1BillCountry = value;
    }
    
    public String getA1BillPostalCd() {
        return a1BillPostalCd;
    }

    public void setA1BillPostalCd(String value) {
        this.a1BillPostalCd = value;
    }
    
    public String getA1BillPhone() {
        return a1BillPhone;
    }

    public void setA1BillPhone(String value) {
        this.a1BillPhone = value;
    }
    
    public String getA1BillPhoneExt() {
        return a1BillPhoneExt;
    }

    public void setA1BillPhoneExt(String value) {
        this.a1BillPhoneExt = value;
    }
    
    public String getA1BillCellPhone() {
        return a1BillCellPhone;
    }

    public void setA1BillCellPhone(String value) {
        this.a1BillCellPhone = value;
    }
    
    public String getA1BillWorkPhone() {
        return a1BillWorkPhone;
    }

    public void setA1BillWorkPhone(String value) {
        this.a1BillWorkPhone = value;
    }
    
    public String getA1BillWorkPhoneExt() {
        return a1BillWorkPhoneExt;
    }

    public void setA1BillWorkPhoneExt(String value) {
        this.a1BillWorkPhoneExt = value;
    }
    
    public String getA1BillEmail() {
        return a1BillEmail;
    }

    public void setA1BillEmail(String value) {
        this.a1BillEmail = value;
    }
    
    public Long getA1PayMethod() {
        return a1PayMethod;
    }

    public void setA1PayMethod(Long value) {
        this.a1PayMethod = value;
    }
    
    public String getA1CcNumber() {
        return a1CcNumber;
    }

    public void setA1CcNumber(String value) {
        this.a1CcNumber = value;
    }
    
    public Long getA1CcExpireMm() {
        return a1CcExpireMm;
    }

    public void setA1CcExpireMm(Long value) {
        this.a1CcExpireMm = value;
    }
    
    public Long getA1CcExpireYyyy() {
        return a1CcExpireYyyy;
    }

    public void setA1CcExpireYyyy(Long value) {
        this.a1CcExpireYyyy = value;
    }
    
    public String getA1BankAcctNo() {
        return a1BankAcctNo;
    }

    public void setA1BankAcctNo(String value) {
        this.a1BankAcctNo = value;
    }
    
    public String getA1BankRoutingNo() {
        return a1BankRoutingNo;
    }

    public void setA1BankRoutingNo(String value) {
        this.a1BankRoutingNo = value;
    }
    
    public Long getA1RespLevelCd() {
        return a1RespLevelCd;
    }

    public void setA1RespLevelCd(Long value) {
        this.a1RespLevelCd = value;
    }
    
    public A1FunctionalAcctGroupsArray getA1FunctionalAcctGroups() {
        return a1FunctionalAcctGroups;
    }

    public void setA1FunctionalAcctGroups(A1FunctionalAcctGroupsArray value) {
        this.a1FunctionalAcctGroups = value;
    }
    
    public A1CollectionsAcctGroupsArray getA1CollectionsAcctGroups() {
        return a1CollectionsAcctGroups;
    }

    public void setA1CollectionsAcctGroups(A1CollectionsAcctGroupsArray value) {
        this.a1CollectionsAcctGroups = value;
    }
    
    public A1SuppFieldNamesArray getA1SuppFieldNames() {
        return a1SuppFieldNames;
    }

    public void setA1SuppFieldNames(A1SuppFieldNamesArray value) {
        this.a1SuppFieldNames = value;
    }
    
    public A1SuppFieldValuesArray getA1SuppFieldValues() {
        return a1SuppFieldValues;
    }

    public void setA1SuppFieldValues(A1SuppFieldValuesArray value) {
        this.a1SuppFieldValues = value;
    }
    
    public Long getA1TestAcctInd() {
        return a1TestAcctInd;
    }

    public void setA1TestAcctInd(Long value) {
        this.a1TestAcctInd = value;
    }
    
    public Long getA1StatusUntilAltStart() {
        return a1StatusUntilAltStart;
    }

    public void setA1StatusUntilAltStart(Long value) {
        this.a1StatusUntilAltStart = value;
    }
    
    public Double getA1BalanceForward() {
        return a1BalanceForward;
    }

    public void setA1BalanceForward(Double value) {
        this.a1BalanceForward = value;
    }
    
    public Long getA1AltBillDay() {
        return a1AltBillDay;
    }

    public void setA1AltBillDay(Long value) {
        this.a1AltBillDay = value;
    }
    
    public String getA1DoFullInvoicing() {
        return a1DoFullInvoicing;
    }

    public void setA1DoFullInvoicing(String value) {
        this.a1DoFullInvoicing = value;
    }
    
    public String getA1DoProratedInvoicing() {
        return a1DoProratedInvoicing;
    }

    public void setA1DoProratedInvoicing(String value) {
        this.a1DoProratedInvoicing = value;
    }
    
    public Long getA1MasterPlanAltRateSchedNo() {
        return a1MasterPlanAltRateSchedNo;
    }

    public void setA1MasterPlanAltRateSchedNo(Long value) {
        this.a1MasterPlanAltRateSchedNo = value;
    }
    
    public A1SuppPlanAltRateSchedNoArray getA1SuppPlanAltRateSchedNo() {
        return a1SuppPlanAltRateSchedNo;
    }

    public void setA1SuppPlanAltRateSchedNo(A1SuppPlanAltRateSchedNoArray value) {
        this.a1SuppPlanAltRateSchedNo = value;
    }
    
    public String getA1CurrencyCd() {
        return a1CurrencyCd;
    }

    public void setA1CurrencyCd(String value) {
        this.a1CurrencyCd = value;
    }
    
    public String getA1Cvv() {
        return a1Cvv;
    }

    public void setA1Cvv(String value) {
        this.a1Cvv = value;
    }
    
    public String getA1TaxpayerId() {
        return a1TaxpayerId;
    }

    public void setA1TaxpayerId(String value) {
        this.a1TaxpayerId = value;
    }
    
    public String getA1BillAgreementId() {
        return a1BillAgreementId;
    }

    public void setA1BillAgreementId(String value) {
        this.a1BillAgreementId = value;
    }
    
    public String getA1RetroactiveStartDate() {
        return a1RetroactiveStartDate;
    }

    public void setA1RetroactiveStartDate(String value) {
        this.a1RetroactiveStartDate = value;
    }
    
    public A1CouponCodesArray getA1CouponCodes() {
        return a1CouponCodes;
    }

    public void setA1CouponCodes(A1CouponCodesArray value) {
        this.a1CouponCodes = value;
    }
    
    public A1NewAcctCustomRatesArray getA1NewAcctCustomRates() {
        return a1NewAcctCustomRates;
    }

    public void setA1NewAcctCustomRates(A1NewAcctCustomRatesArray value) {
        this.a1NewAcctCustomRates = value;
    }
    
    public Long getA1AltMsgTemplateNo() {
        return a1AltMsgTemplateNo;
    }

    public void setA1AltMsgTemplateNo(Long value) {
        this.a1AltMsgTemplateNo = value;
    }
    
    public Long getA1SeqFuncGroupNo() {
        return a1SeqFuncGroupNo;
    }

    public void setA1SeqFuncGroupNo(Long value) {
        this.a1SeqFuncGroupNo = value;
    }
    
    public A1NewAcctPlanContractsArray getA1NewAcctPlanContracts() {
        return a1NewAcctPlanContracts;
    }

    public void setA1NewAcctPlanContracts(A1NewAcctPlanContractsArray value) {
        this.a1NewAcctPlanContracts = value;
    }
    
    public String getA1Address3() {
        return a1Address3;
    }

    public void setA1Address3(String value) {
        this.a1Address3 = value;
    }
    
    public String getA1BillAddress3() {
        return a1BillAddress3;
    }

    public void setA1BillAddress3(String value) {
        this.a1BillAddress3 = value;
    }
    
    public A1UsageAccumulationConfigArray getA1UsageAccumulationConfig() {
        return a1UsageAccumulationConfig;
    }

    public void setA1UsageAccumulationConfig(A1UsageAccumulationConfigArray value) {
        this.a1UsageAccumulationConfig = value;
    }
    
    public A1EnableUsagePoolingPlanNoArray getA1EnableUsagePoolingPlanNo() {
        return a1EnableUsagePoolingPlanNo;
    }

    public void setA1EnableUsagePoolingPlanNo(A1EnableUsagePoolingPlanNoArray value) {
        this.a1EnableUsagePoolingPlanNo = value;
    }
    
    public A1ClientFuncAcctGroupIdsArray getA1ClientFuncAcctGroupIds() {
        return a1ClientFuncAcctGroupIds;
    }

    public void setA1ClientFuncAcctGroupIds(A1ClientFuncAcctGroupIdsArray value) {
        this.a1ClientFuncAcctGroupIds = value;
    }
    
    public A1ClientCollAcctGroupIdsArray getA1ClientCollAcctGroupIds() {
        return a1ClientCollAcctGroupIds;
    }

    public void setA1ClientCollAcctGroupIds(A1ClientCollAcctGroupIdsArray value) {
        this.a1ClientCollAcctGroupIds = value;
    }
    
    public String getA1TrackData1() {
        return a1TrackData1;
    }

    public void setA1TrackData1(String value) {
        this.a1TrackData1 = value;
    }
    
    public String getA1TrackData2() {
        return a1TrackData2;
    }

    public void setA1TrackData2(String value) {
        this.a1TrackData2 = value;
    }
    
    public Long getA1TaxExemptionLevel() {
        return a1TaxExemptionLevel;
    }

    public void setA1TaxExemptionLevel(Long value) {
        this.a1TaxExemptionLevel = value;
    }
    
    public Long getA1CnAltMsgTemplateNo() {
        return a1CnAltMsgTemplateNo;
    }

    public void setA1CnAltMsgTemplateNo(Long value) {
        this.a1CnAltMsgTemplateNo = value;
    }
    
    public String getA2AltStartDate() {
        return a2AltStartDate;
    }

    public void setA2AltStartDate(String value) {
        this.a2AltStartDate = value;
    }
    
    public String getA2ClientAcctId() {
        return a2ClientAcctId;
    }

    public void setA2ClientAcctId(String value) {
        this.a2ClientAcctId = value;
    }
    
    public String getA2Userid() {
        return a2Userid;
    }

    public void setA2Userid(String value) {
        this.a2Userid = value;
    }
    
    public Long getA2StatusCd() {
        return a2StatusCd;
    }

    public void setA2StatusCd(Long value) {
        this.a2StatusCd = value;
    }
    
    public Long getA2MasterPlanNo() {
        return a2MasterPlanNo;
    }

    public void setA2MasterPlanNo(Long value) {
        this.a2MasterPlanNo = value;
    }
    
    public Long getA2MasterPlanUnits() {
        return a2MasterPlanUnits;
    }

    public void setA2MasterPlanUnits(Long value) {
        this.a2MasterPlanUnits = value;
    }
    
    public A2SuppPlansArray getA2SuppPlans() {
        return a2SuppPlans;
    }

    public void setA2SuppPlans(A2SuppPlansArray value) {
        this.a2SuppPlans = value;
    }
    
    public A2SuppPlanUnitsArray getA2SuppPlanUnits() {
        return a2SuppPlanUnits;
    }

    public void setA2SuppPlanUnits(A2SuppPlanUnitsArray value) {
        this.a2SuppPlanUnits = value;
    }
    
    public Long getA2NotifyMethod() {
        return a2NotifyMethod;
    }

    public void setA2NotifyMethod(Long value) {
        this.a2NotifyMethod = value;
    }
    
    public String getA2PromoCd() {
        return a2PromoCd;
    }

    public void setA2PromoCd(String value) {
        this.a2PromoCd = value;
    }
    
    public String getA2Password() {
        return a2Password;
    }

    public void setA2Password(String value) {
        this.a2Password = value;
    }
    
    public String getA2SecretQuestion() {
        return a2SecretQuestion;
    }

    public void setA2SecretQuestion(String value) {
        this.a2SecretQuestion = value;
    }
    
    public String getA2SecretQuestionAnswer() {
        return a2SecretQuestionAnswer;
    }

    public void setA2SecretQuestionAnswer(String value) {
        this.a2SecretQuestionAnswer = value;
    }
    
    public String getA2FirstName() {
        return a2FirstName;
    }

    public void setA2FirstName(String value) {
        this.a2FirstName = value;
    }
    
    public String getA2Mi() {
        return a2Mi;
    }

    public void setA2Mi(String value) {
        this.a2Mi = value;
    }
    
    public String getA2LastName() {
        return a2LastName;
    }

    public void setA2LastName(String value) {
        this.a2LastName = value;
    }
    
    public String getA2CompanyName() {
        return a2CompanyName;
    }

    public void setA2CompanyName(String value) {
        this.a2CompanyName = value;
    }
    
    public String getA2Address1() {
        return a2Address1;
    }

    public void setA2Address1(String value) {
        this.a2Address1 = value;
    }
    
    public String getA2Address2() {
        return a2Address2;
    }

    public void setA2Address2(String value) {
        this.a2Address2 = value;
    }
    
    public String getA2City() {
        return a2City;
    }

    public void setA2City(String value) {
        this.a2City = value;
    }
    
    public String getA2Locality() {
        return a2Locality;
    }

    public void setA2Locality(String value) {
        this.a2Locality = value;
    }
    
    public String getA2StateProv() {
        return a2StateProv;
    }

    public void setA2StateProv(String value) {
        this.a2StateProv = value;
    }
    
    public String getA2Country() {
        return a2Country;
    }

    public void setA2Country(String value) {
        this.a2Country = value;
    }
    
    public String getA2PostalCd() {
        return a2PostalCd;
    }

    public void setA2PostalCd(String value) {
        this.a2PostalCd = value;
    }
    
    public String getA2Phone() {
        return a2Phone;
    }

    public void setA2Phone(String value) {
        this.a2Phone = value;
    }
    
    public String getA2PhoneExt() {
        return a2PhoneExt;
    }

    public void setA2PhoneExt(String value) {
        this.a2PhoneExt = value;
    }
    
    public String getA2CellPhone() {
        return a2CellPhone;
    }

    public void setA2CellPhone(String value) {
        this.a2CellPhone = value;
    }
    
    public String getA2WorkPhone() {
        return a2WorkPhone;
    }

    public void setA2WorkPhone(String value) {
        this.a2WorkPhone = value;
    }
    
    public String getA2WorkPhoneExt() {
        return a2WorkPhoneExt;
    }

    public void setA2WorkPhoneExt(String value) {
        this.a2WorkPhoneExt = value;
    }
    
    public String getA2Email() {
        return a2Email;
    }

    public void setA2Email(String value) {
        this.a2Email = value;
    }
    
    public String getA2Birthdate() {
        return a2Birthdate;
    }

    public void setA2Birthdate(String value) {
        this.a2Birthdate = value;
    }
    
    public String getA2BillFirstName() {
        return a2BillFirstName;
    }

    public void setA2BillFirstName(String value) {
        this.a2BillFirstName = value;
    }
    
    public String getA2BillMi() {
        return a2BillMi;
    }

    public void setA2BillMi(String value) {
        this.a2BillMi = value;
    }
    
    public String getA2BillLastName() {
        return a2BillLastName;
    }

    public void setA2BillLastName(String value) {
        this.a2BillLastName = value;
    }
    
    public String getA2BillCompanyName() {
        return a2BillCompanyName;
    }

    public void setA2BillCompanyName(String value) {
        this.a2BillCompanyName = value;
    }
    
    public String getA2BillAddress1() {
        return a2BillAddress1;
    }

    public void setA2BillAddress1(String value) {
        this.a2BillAddress1 = value;
    }
    
    public String getA2BillAddress2() {
        return a2BillAddress2;
    }

    public void setA2BillAddress2(String value) {
        this.a2BillAddress2 = value;
    }
    
    public String getA2BillCity() {
        return a2BillCity;
    }

    public void setA2BillCity(String value) {
        this.a2BillCity = value;
    }
    
    public String getA2BillLocality() {
        return a2BillLocality;
    }

    public void setA2BillLocality(String value) {
        this.a2BillLocality = value;
    }
    
    public String getA2BillStateProv() {
        return a2BillStateProv;
    }

    public void setA2BillStateProv(String value) {
        this.a2BillStateProv = value;
    }
    
    public String getA2BillCountry() {
        return a2BillCountry;
    }

    public void setA2BillCountry(String value) {
        this.a2BillCountry = value;
    }
    
    public String getA2BillPostalCd() {
        return a2BillPostalCd;
    }

    public void setA2BillPostalCd(String value) {
        this.a2BillPostalCd = value;
    }
    
    public String getA2BillPhone() {
        return a2BillPhone;
    }

    public void setA2BillPhone(String value) {
        this.a2BillPhone = value;
    }
    
    public String getA2BillPhoneExt() {
        return a2BillPhoneExt;
    }

    public void setA2BillPhoneExt(String value) {
        this.a2BillPhoneExt = value;
    }
    
    public String getA2BillCellPhone() {
        return a2BillCellPhone;
    }

    public void setA2BillCellPhone(String value) {
        this.a2BillCellPhone = value;
    }
    
    public String getA2BillWorkPhone() {
        return a2BillWorkPhone;
    }

    public void setA2BillWorkPhone(String value) {
        this.a2BillWorkPhone = value;
    }
    
    public String getA2BillWorkPhoneExt() {
        return a2BillWorkPhoneExt;
    }

    public void setA2BillWorkPhoneExt(String value) {
        this.a2BillWorkPhoneExt = value;
    }
    
    public String getA2BillEmail() {
        return a2BillEmail;
    }

    public void setA2BillEmail(String value) {
        this.a2BillEmail = value;
    }
    
    public Long getA2PayMethod() {
        return a2PayMethod;
    }

    public void setA2PayMethod(Long value) {
        this.a2PayMethod = value;
    }
    
    public String getA2CcNumber() {
        return a2CcNumber;
    }

    public void setA2CcNumber(String value) {
        this.a2CcNumber = value;
    }
    
    public Long getA2CcExpireMm() {
        return a2CcExpireMm;
    }

    public void setA2CcExpireMm(Long value) {
        this.a2CcExpireMm = value;
    }
    
    public Long getA2CcExpireYyyy() {
        return a2CcExpireYyyy;
    }

    public void setA2CcExpireYyyy(Long value) {
        this.a2CcExpireYyyy = value;
    }
    
    public String getA2BankAcctNo() {
        return a2BankAcctNo;
    }

    public void setA2BankAcctNo(String value) {
        this.a2BankAcctNo = value;
    }
    
    public String getA2BankRoutingNo() {
        return a2BankRoutingNo;
    }

    public void setA2BankRoutingNo(String value) {
        this.a2BankRoutingNo = value;
    }
    
    public Long getA2RespLevelCd() {
        return a2RespLevelCd;
    }

    public void setA2RespLevelCd(Long value) {
        this.a2RespLevelCd = value;
    }
    
    public A2FunctionalAcctGroupsArray getA2FunctionalAcctGroups() {
        return a2FunctionalAcctGroups;
    }

    public void setA2FunctionalAcctGroups(A2FunctionalAcctGroupsArray value) {
        this.a2FunctionalAcctGroups = value;
    }
    
    public A2CollectionsAcctGroupsArray getA2CollectionsAcctGroups() {
        return a2CollectionsAcctGroups;
    }

    public void setA2CollectionsAcctGroups(A2CollectionsAcctGroupsArray value) {
        this.a2CollectionsAcctGroups = value;
    }
    
    public A2SuppFieldNamesArray getA2SuppFieldNames() {
        return a2SuppFieldNames;
    }

    public void setA2SuppFieldNames(A2SuppFieldNamesArray value) {
        this.a2SuppFieldNames = value;
    }
    
    public A2SuppFieldValuesArray getA2SuppFieldValues() {
        return a2SuppFieldValues;
    }

    public void setA2SuppFieldValues(A2SuppFieldValuesArray value) {
        this.a2SuppFieldValues = value;
    }
    
    public Long getA2TestAcctInd() {
        return a2TestAcctInd;
    }

    public void setA2TestAcctInd(Long value) {
        this.a2TestAcctInd = value;
    }
    
    public Long getA2StatusUntilAltStart() {
        return a2StatusUntilAltStart;
    }

    public void setA2StatusUntilAltStart(Long value) {
        this.a2StatusUntilAltStart = value;
    }
    
    public Double getA2BalanceForward() {
        return a2BalanceForward;
    }

    public void setA2BalanceForward(Double value) {
        this.a2BalanceForward = value;
    }
    
    public Long getA2AltBillDay() {
        return a2AltBillDay;
    }

    public void setA2AltBillDay(Long value) {
        this.a2AltBillDay = value;
    }
    
    public String getA2DoFullInvoicing() {
        return a2DoFullInvoicing;
    }

    public void setA2DoFullInvoicing(String value) {
        this.a2DoFullInvoicing = value;
    }
    
    public String getA2DoProratedInvoicing() {
        return a2DoProratedInvoicing;
    }

    public void setA2DoProratedInvoicing(String value) {
        this.a2DoProratedInvoicing = value;
    }
    
    public Long getA2MasterPlanAltRateSchedNo() {
        return a2MasterPlanAltRateSchedNo;
    }

    public void setA2MasterPlanAltRateSchedNo(Long value) {
        this.a2MasterPlanAltRateSchedNo = value;
    }
    
    public A2SuppPlanAltRateSchedNoArray getA2SuppPlanAltRateSchedNo() {
        return a2SuppPlanAltRateSchedNo;
    }

    public void setA2SuppPlanAltRateSchedNo(A2SuppPlanAltRateSchedNoArray value) {
        this.a2SuppPlanAltRateSchedNo = value;
    }
    
    public String getA2CurrencyCd() {
        return a2CurrencyCd;
    }

    public void setA2CurrencyCd(String value) {
        this.a2CurrencyCd = value;
    }
    
    public String getA2Cvv() {
        return a2Cvv;
    }

    public void setA2Cvv(String value) {
        this.a2Cvv = value;
    }
    
    public String getA2TaxpayerId() {
        return a2TaxpayerId;
    }

    public void setA2TaxpayerId(String value) {
        this.a2TaxpayerId = value;
    }
    
    public String getA2BillAgreementId() {
        return a2BillAgreementId;
    }

    public void setA2BillAgreementId(String value) {
        this.a2BillAgreementId = value;
    }
    
    public String getA2RetroactiveStartDate() {
        return a2RetroactiveStartDate;
    }

    public void setA2RetroactiveStartDate(String value) {
        this.a2RetroactiveStartDate = value;
    }
    
    public A2CouponCodesArray getA2CouponCodes() {
        return a2CouponCodes;
    }

    public void setA2CouponCodes(A2CouponCodesArray value) {
        this.a2CouponCodes = value;
    }
    
    public A2NewAcctCustomRatesArray getA2NewAcctCustomRates() {
        return a2NewAcctCustomRates;
    }

    public void setA2NewAcctCustomRates(A2NewAcctCustomRatesArray value) {
        this.a2NewAcctCustomRates = value;
    }
    
    public Long getA2AltMsgTemplateNo() {
        return a2AltMsgTemplateNo;
    }

    public void setA2AltMsgTemplateNo(Long value) {
        this.a2AltMsgTemplateNo = value;
    }
    
    public Long getA2SeqFuncGroupNo() {
        return a2SeqFuncGroupNo;
    }

    public void setA2SeqFuncGroupNo(Long value) {
        this.a2SeqFuncGroupNo = value;
    }
    
    public A2NewAcctPlanContractsArray getA2NewAcctPlanContracts() {
        return a2NewAcctPlanContracts;
    }

    public void setA2NewAcctPlanContracts(A2NewAcctPlanContractsArray value) {
        this.a2NewAcctPlanContracts = value;
    }
    
    public String getA2Address3() {
        return a2Address3;
    }

    public void setA2Address3(String value) {
        this.a2Address3 = value;
    }
    
    public String getA2BillAddress3() {
        return a2BillAddress3;
    }

    public void setA2BillAddress3(String value) {
        this.a2BillAddress3 = value;
    }
    
    public A2UsageAccumulationConfigArray getA2UsageAccumulationConfig() {
        return a2UsageAccumulationConfig;
    }

    public void setA2UsageAccumulationConfig(A2UsageAccumulationConfigArray value) {
        this.a2UsageAccumulationConfig = value;
    }
    
    public A2EnableUsagePoolingPlanNoArray getA2EnableUsagePoolingPlanNo() {
        return a2EnableUsagePoolingPlanNo;
    }

    public void setA2EnableUsagePoolingPlanNo(A2EnableUsagePoolingPlanNoArray value) {
        this.a2EnableUsagePoolingPlanNo = value;
    }
    
    public A2ClientFuncAcctGroupIdsArray getA2ClientFuncAcctGroupIds() {
        return a2ClientFuncAcctGroupIds;
    }

    public void setA2ClientFuncAcctGroupIds(A2ClientFuncAcctGroupIdsArray value) {
        this.a2ClientFuncAcctGroupIds = value;
    }
    
    public A2ClientCollAcctGroupIdsArray getA2ClientCollAcctGroupIds() {
        return a2ClientCollAcctGroupIds;
    }

    public void setA2ClientCollAcctGroupIds(A2ClientCollAcctGroupIdsArray value) {
        this.a2ClientCollAcctGroupIds = value;
    }
    
    public String getA2TrackData1() {
        return a2TrackData1;
    }

    public void setA2TrackData1(String value) {
        this.a2TrackData1 = value;
    }
    
    public String getA2TrackData2() {
        return a2TrackData2;
    }

    public void setA2TrackData2(String value) {
        this.a2TrackData2 = value;
    }
    
    public Long getA2TaxExemptionLevel() {
        return a2TaxExemptionLevel;
    }

    public void setA2TaxExemptionLevel(Long value) {
        this.a2TaxExemptionLevel = value;
    }
    
    public Long getA2CnAltMsgTemplateNo() {
        return a2CnAltMsgTemplateNo;
    }

    public void setA2CnAltMsgTemplateNo(Long value) {
        this.a2CnAltMsgTemplateNo = value;
    }
    
    public String getA3AltStartDate() {
        return a3AltStartDate;
    }

    public void setA3AltStartDate(String value) {
        this.a3AltStartDate = value;
    }
    
    public String getA3ClientAcctId() {
        return a3ClientAcctId;
    }

    public void setA3ClientAcctId(String value) {
        this.a3ClientAcctId = value;
    }
    
    public String getA3Userid() {
        return a3Userid;
    }

    public void setA3Userid(String value) {
        this.a3Userid = value;
    }
    
    public Long getA3StatusCd() {
        return a3StatusCd;
    }

    public void setA3StatusCd(Long value) {
        this.a3StatusCd = value;
    }
    
    public Long getA3MasterPlanNo() {
        return a3MasterPlanNo;
    }

    public void setA3MasterPlanNo(Long value) {
        this.a3MasterPlanNo = value;
    }
    
    public Long getA3MasterPlanUnits() {
        return a3MasterPlanUnits;
    }

    public void setA3MasterPlanUnits(Long value) {
        this.a3MasterPlanUnits = value;
    }
    
    public A3SuppPlansArray getA3SuppPlans() {
        return a3SuppPlans;
    }

    public void setA3SuppPlans(A3SuppPlansArray value) {
        this.a3SuppPlans = value;
    }
    
    public A3SuppPlanUnitsArray getA3SuppPlanUnits() {
        return a3SuppPlanUnits;
    }

    public void setA3SuppPlanUnits(A3SuppPlanUnitsArray value) {
        this.a3SuppPlanUnits = value;
    }
    
    public Long getA3NotifyMethod() {
        return a3NotifyMethod;
    }

    public void setA3NotifyMethod(Long value) {
        this.a3NotifyMethod = value;
    }
    
    public String getA3PromoCd() {
        return a3PromoCd;
    }

    public void setA3PromoCd(String value) {
        this.a3PromoCd = value;
    }
    
    public String getA3Password() {
        return a3Password;
    }

    public void setA3Password(String value) {
        this.a3Password = value;
    }
    
    public String getA3SecretQuestion() {
        return a3SecretQuestion;
    }

    public void setA3SecretQuestion(String value) {
        this.a3SecretQuestion = value;
    }
    
    public String getA3SecretQuestionAnswer() {
        return a3SecretQuestionAnswer;
    }

    public void setA3SecretQuestionAnswer(String value) {
        this.a3SecretQuestionAnswer = value;
    }
    
    public String getA3FirstName() {
        return a3FirstName;
    }

    public void setA3FirstName(String value) {
        this.a3FirstName = value;
    }
    
    public String getA3Mi() {
        return a3Mi;
    }

    public void setA3Mi(String value) {
        this.a3Mi = value;
    }
    
    public String getA3LastName() {
        return a3LastName;
    }

    public void setA3LastName(String value) {
        this.a3LastName = value;
    }
    
    public String getA3CompanyName() {
        return a3CompanyName;
    }

    public void setA3CompanyName(String value) {
        this.a3CompanyName = value;
    }
    
    public String getA3Address1() {
        return a3Address1;
    }

    public void setA3Address1(String value) {
        this.a3Address1 = value;
    }
    
    public String getA3Address2() {
        return a3Address2;
    }

    public void setA3Address2(String value) {
        this.a3Address2 = value;
    }
    
    public String getA3City() {
        return a3City;
    }

    public void setA3City(String value) {
        this.a3City = value;
    }
    
    public String getA3Locality() {
        return a3Locality;
    }

    public void setA3Locality(String value) {
        this.a3Locality = value;
    }
    
    public String getA3StateProv() {
        return a3StateProv;
    }

    public void setA3StateProv(String value) {
        this.a3StateProv = value;
    }
    
    public String getA3Country() {
        return a3Country;
    }

    public void setA3Country(String value) {
        this.a3Country = value;
    }
    
    public String getA3PostalCd() {
        return a3PostalCd;
    }

    public void setA3PostalCd(String value) {
        this.a3PostalCd = value;
    }
    
    public String getA3Phone() {
        return a3Phone;
    }

    public void setA3Phone(String value) {
        this.a3Phone = value;
    }
    
    public String getA3PhoneExt() {
        return a3PhoneExt;
    }

    public void setA3PhoneExt(String value) {
        this.a3PhoneExt = value;
    }
    
    public String getA3CellPhone() {
        return a3CellPhone;
    }

    public void setA3CellPhone(String value) {
        this.a3CellPhone = value;
    }
    
    public String getA3WorkPhone() {
        return a3WorkPhone;
    }

    public void setA3WorkPhone(String value) {
        this.a3WorkPhone = value;
    }
    
    public String getA3WorkPhoneExt() {
        return a3WorkPhoneExt;
    }

    public void setA3WorkPhoneExt(String value) {
        this.a3WorkPhoneExt = value;
    }
    
    public String getA3Email() {
        return a3Email;
    }

    public void setA3Email(String value) {
        this.a3Email = value;
    }
    
    public String getA3Birthdate() {
        return a3Birthdate;
    }

    public void setA3Birthdate(String value) {
        this.a3Birthdate = value;
    }
    
    public String getA3BillFirstName() {
        return a3BillFirstName;
    }

    public void setA3BillFirstName(String value) {
        this.a3BillFirstName = value;
    }
    
    public String getA3BillMi() {
        return a3BillMi;
    }

    public void setA3BillMi(String value) {
        this.a3BillMi = value;
    }
    
    public String getA3BillLastName() {
        return a3BillLastName;
    }

    public void setA3BillLastName(String value) {
        this.a3BillLastName = value;
    }
    
    public String getA3BillCompanyName() {
        return a3BillCompanyName;
    }

    public void setA3BillCompanyName(String value) {
        this.a3BillCompanyName = value;
    }
    
    public String getA3BillAddress1() {
        return a3BillAddress1;
    }

    public void setA3BillAddress1(String value) {
        this.a3BillAddress1 = value;
    }
    
    public String getA3BillAddress2() {
        return a3BillAddress2;
    }

    public void setA3BillAddress2(String value) {
        this.a3BillAddress2 = value;
    }
    
    public String getA3BillCity() {
        return a3BillCity;
    }

    public void setA3BillCity(String value) {
        this.a3BillCity = value;
    }
    
    public String getA3BillLocality() {
        return a3BillLocality;
    }

    public void setA3BillLocality(String value) {
        this.a3BillLocality = value;
    }
    
    public String getA3BillStateProv() {
        return a3BillStateProv;
    }

    public void setA3BillStateProv(String value) {
        this.a3BillStateProv = value;
    }
    
    public String getA3BillCountry() {
        return a3BillCountry;
    }

    public void setA3BillCountry(String value) {
        this.a3BillCountry = value;
    }
    
    public String getA3BillPostalCd() {
        return a3BillPostalCd;
    }

    public void setA3BillPostalCd(String value) {
        this.a3BillPostalCd = value;
    }
    
    public String getA3BillPhone() {
        return a3BillPhone;
    }

    public void setA3BillPhone(String value) {
        this.a3BillPhone = value;
    }
    
    public String getA3BillPhoneExt() {
        return a3BillPhoneExt;
    }

    public void setA3BillPhoneExt(String value) {
        this.a3BillPhoneExt = value;
    }
    
    public String getA3BillCellPhone() {
        return a3BillCellPhone;
    }

    public void setA3BillCellPhone(String value) {
        this.a3BillCellPhone = value;
    }
    
    public String getA3BillWorkPhone() {
        return a3BillWorkPhone;
    }

    public void setA3BillWorkPhone(String value) {
        this.a3BillWorkPhone = value;
    }
    
    public String getA3BillWorkPhoneExt() {
        return a3BillWorkPhoneExt;
    }

    public void setA3BillWorkPhoneExt(String value) {
        this.a3BillWorkPhoneExt = value;
    }
    
    public String getA3BillEmail() {
        return a3BillEmail;
    }

    public void setA3BillEmail(String value) {
        this.a3BillEmail = value;
    }
    
    public Long getA3PayMethod() {
        return a3PayMethod;
    }

    public void setA3PayMethod(Long value) {
        this.a3PayMethod = value;
    }
    
    public String getA3CcNumber() {
        return a3CcNumber;
    }

    public void setA3CcNumber(String value) {
        this.a3CcNumber = value;
    }
    
    public Long getA3CcExpireMm() {
        return a3CcExpireMm;
    }

    public void setA3CcExpireMm(Long value) {
        this.a3CcExpireMm = value;
    }
    
    public Long getA3CcExpireYyyy() {
        return a3CcExpireYyyy;
    }

    public void setA3CcExpireYyyy(Long value) {
        this.a3CcExpireYyyy = value;
    }
    
    public String getA3BankAcctNo() {
        return a3BankAcctNo;
    }

    public void setA3BankAcctNo(String value) {
        this.a3BankAcctNo = value;
    }
    
    public String getA3BankRoutingNo() {
        return a3BankRoutingNo;
    }

    public void setA3BankRoutingNo(String value) {
        this.a3BankRoutingNo = value;
    }
    
    public Long getA3RespLevelCd() {
        return a3RespLevelCd;
    }

    public void setA3RespLevelCd(Long value) {
        this.a3RespLevelCd = value;
    }
    
    public A3FunctionalAcctGroupsArray getA3FunctionalAcctGroups() {
        return a3FunctionalAcctGroups;
    }

    public void setA3FunctionalAcctGroups(A3FunctionalAcctGroupsArray value) {
        this.a3FunctionalAcctGroups = value;
    }
    
    public A3CollectionsAcctGroupsArray getA3CollectionsAcctGroups() {
        return a3CollectionsAcctGroups;
    }

    public void setA3CollectionsAcctGroups(A3CollectionsAcctGroupsArray value) {
        this.a3CollectionsAcctGroups = value;
    }
    
    public A3SuppFieldNamesArray getA3SuppFieldNames() {
        return a3SuppFieldNames;
    }

    public void setA3SuppFieldNames(A3SuppFieldNamesArray value) {
        this.a3SuppFieldNames = value;
    }
    
    public A3SuppFieldValuesArray getA3SuppFieldValues() {
        return a3SuppFieldValues;
    }

    public void setA3SuppFieldValues(A3SuppFieldValuesArray value) {
        this.a3SuppFieldValues = value;
    }
    
    public Long getA3TestAcctInd() {
        return a3TestAcctInd;
    }

    public void setA3TestAcctInd(Long value) {
        this.a3TestAcctInd = value;
    }
    
    public Long getA3StatusUntilAltStart() {
        return a3StatusUntilAltStart;
    }

    public void setA3StatusUntilAltStart(Long value) {
        this.a3StatusUntilAltStart = value;
    }
    
    public Double getA3BalanceForward() {
        return a3BalanceForward;
    }

    public void setA3BalanceForward(Double value) {
        this.a3BalanceForward = value;
    }
    
    public Long getA3AltBillDay() {
        return a3AltBillDay;
    }

    public void setA3AltBillDay(Long value) {
        this.a3AltBillDay = value;
    }
    
    public String getA3DoFullInvoicing() {
        return a3DoFullInvoicing;
    }

    public void setA3DoFullInvoicing(String value) {
        this.a3DoFullInvoicing = value;
    }
    
    public String getA3DoProratedInvoicing() {
        return a3DoProratedInvoicing;
    }

    public void setA3DoProratedInvoicing(String value) {
        this.a3DoProratedInvoicing = value;
    }
    
    public Long getA3MasterPlanAltRateSchedNo() {
        return a3MasterPlanAltRateSchedNo;
    }

    public void setA3MasterPlanAltRateSchedNo(Long value) {
        this.a3MasterPlanAltRateSchedNo = value;
    }
    
    public A3SuppPlanAltRateSchedNoArray getA3SuppPlanAltRateSchedNo() {
        return a3SuppPlanAltRateSchedNo;
    }

    public void setA3SuppPlanAltRateSchedNo(A3SuppPlanAltRateSchedNoArray value) {
        this.a3SuppPlanAltRateSchedNo = value;
    }
    
    public String getA3CurrencyCd() {
        return a3CurrencyCd;
    }

    public void setA3CurrencyCd(String value) {
        this.a3CurrencyCd = value;
    }
    
    public String getA3Cvv() {
        return a3Cvv;
    }

    public void setA3Cvv(String value) {
        this.a3Cvv = value;
    }
    
    public String getA3TaxpayerId() {
        return a3TaxpayerId;
    }

    public void setA3TaxpayerId(String value) {
        this.a3TaxpayerId = value;
    }
    
    public String getA3BillAgreementId() {
        return a3BillAgreementId;
    }

    public void setA3BillAgreementId(String value) {
        this.a3BillAgreementId = value;
    }
    
    public String getA3RetroactiveStartDate() {
        return a3RetroactiveStartDate;
    }

    public void setA3RetroactiveStartDate(String value) {
        this.a3RetroactiveStartDate = value;
    }
    
    public A3CouponCodesArray getA3CouponCodes() {
        return a3CouponCodes;
    }

    public void setA3CouponCodes(A3CouponCodesArray value) {
        this.a3CouponCodes = value;
    }
    
    public A3NewAcctCustomRatesArray getA3NewAcctCustomRates() {
        return a3NewAcctCustomRates;
    }

    public void setA3NewAcctCustomRates(A3NewAcctCustomRatesArray value) {
        this.a3NewAcctCustomRates = value;
    }
    
    public Long getA3AltMsgTemplateNo() {
        return a3AltMsgTemplateNo;
    }

    public void setA3AltMsgTemplateNo(Long value) {
        this.a3AltMsgTemplateNo = value;
    }
    
    public Long getA3SeqFuncGroupNo() {
        return a3SeqFuncGroupNo;
    }

    public void setA3SeqFuncGroupNo(Long value) {
        this.a3SeqFuncGroupNo = value;
    }
    
    public A3NewAcctPlanContractsArray getA3NewAcctPlanContracts() {
        return a3NewAcctPlanContracts;
    }

    public void setA3NewAcctPlanContracts(A3NewAcctPlanContractsArray value) {
        this.a3NewAcctPlanContracts = value;
    }
    
    public String getA3Address3() {
        return a3Address3;
    }

    public void setA3Address3(String value) {
        this.a3Address3 = value;
    }
    
    public String getA3BillAddress3() {
        return a3BillAddress3;
    }

    public void setA3BillAddress3(String value) {
        this.a3BillAddress3 = value;
    }
    
    public A3UsageAccumulationConfigArray getA3UsageAccumulationConfig() {
        return a3UsageAccumulationConfig;
    }

    public void setA3UsageAccumulationConfig(A3UsageAccumulationConfigArray value) {
        this.a3UsageAccumulationConfig = value;
    }
    
    public A3EnableUsagePoolingPlanNoArray getA3EnableUsagePoolingPlanNo() {
        return a3EnableUsagePoolingPlanNo;
    }

    public void setA3EnableUsagePoolingPlanNo(A3EnableUsagePoolingPlanNoArray value) {
        this.a3EnableUsagePoolingPlanNo = value;
    }
    
    public A3ClientFuncAcctGroupIdsArray getA3ClientFuncAcctGroupIds() {
        return a3ClientFuncAcctGroupIds;
    }

    public void setA3ClientFuncAcctGroupIds(A3ClientFuncAcctGroupIdsArray value) {
        this.a3ClientFuncAcctGroupIds = value;
    }
    
    public A3ClientCollAcctGroupIdsArray getA3ClientCollAcctGroupIds() {
        return a3ClientCollAcctGroupIds;
    }

    public void setA3ClientCollAcctGroupIds(A3ClientCollAcctGroupIdsArray value) {
        this.a3ClientCollAcctGroupIds = value;
    }
    
    public String getA3TrackData1() {
        return a3TrackData1;
    }

    public void setA3TrackData1(String value) {
        this.a3TrackData1 = value;
    }
    
    public String getA3TrackData2() {
        return a3TrackData2;
    }

    public void setA3TrackData2(String value) {
        this.a3TrackData2 = value;
    }
    
    public Long getA3TaxExemptionLevel() {
        return a3TaxExemptionLevel;
    }

    public void setA3TaxExemptionLevel(Long value) {
        this.a3TaxExemptionLevel = value;
    }
    
    public Long getA3CnAltMsgTemplateNo() {
        return a3CnAltMsgTemplateNo;
    }

    public void setA3CnAltMsgTemplateNo(Long value) {
        this.a3CnAltMsgTemplateNo = value;
    }
    
    public String getA4AltStartDate() {
        return a4AltStartDate;
    }

    public void setA4AltStartDate(String value) {
        this.a4AltStartDate = value;
    }
    
    public String getA4ClientAcctId() {
        return a4ClientAcctId;
    }

    public void setA4ClientAcctId(String value) {
        this.a4ClientAcctId = value;
    }
    
    public String getA4Userid() {
        return a4Userid;
    }

    public void setA4Userid(String value) {
        this.a4Userid = value;
    }
    
    public Long getA4StatusCd() {
        return a4StatusCd;
    }

    public void setA4StatusCd(Long value) {
        this.a4StatusCd = value;
    }
    
    public Long getA4MasterPlanNo() {
        return a4MasterPlanNo;
    }

    public void setA4MasterPlanNo(Long value) {
        this.a4MasterPlanNo = value;
    }
    
    public Long getA4MasterPlanUnits() {
        return a4MasterPlanUnits;
    }

    public void setA4MasterPlanUnits(Long value) {
        this.a4MasterPlanUnits = value;
    }
    
    public A4SuppPlansArray getA4SuppPlans() {
        return a4SuppPlans;
    }

    public void setA4SuppPlans(A4SuppPlansArray value) {
        this.a4SuppPlans = value;
    }
    
    public A4SuppPlanUnitsArray getA4SuppPlanUnits() {
        return a4SuppPlanUnits;
    }

    public void setA4SuppPlanUnits(A4SuppPlanUnitsArray value) {
        this.a4SuppPlanUnits = value;
    }
    
    public Long getA4NotifyMethod() {
        return a4NotifyMethod;
    }

    public void setA4NotifyMethod(Long value) {
        this.a4NotifyMethod = value;
    }
    
    public String getA4PromoCd() {
        return a4PromoCd;
    }

    public void setA4PromoCd(String value) {
        this.a4PromoCd = value;
    }
    
    public String getA4Password() {
        return a4Password;
    }

    public void setA4Password(String value) {
        this.a4Password = value;
    }
    
    public String getA4SecretQuestion() {
        return a4SecretQuestion;
    }

    public void setA4SecretQuestion(String value) {
        this.a4SecretQuestion = value;
    }
    
    public String getA4SecretQuestionAnswer() {
        return a4SecretQuestionAnswer;
    }

    public void setA4SecretQuestionAnswer(String value) {
        this.a4SecretQuestionAnswer = value;
    }
    
    public String getA4FirstName() {
        return a4FirstName;
    }

    public void setA4FirstName(String value) {
        this.a4FirstName = value;
    }
    
    public String getA4Mi() {
        return a4Mi;
    }

    public void setA4Mi(String value) {
        this.a4Mi = value;
    }
    
    public String getA4LastName() {
        return a4LastName;
    }

    public void setA4LastName(String value) {
        this.a4LastName = value;
    }
    
    public String getA4CompanyName() {
        return a4CompanyName;
    }

    public void setA4CompanyName(String value) {
        this.a4CompanyName = value;
    }
    
    public String getA4Address1() {
        return a4Address1;
    }

    public void setA4Address1(String value) {
        this.a4Address1 = value;
    }
    
    public String getA4Address2() {
        return a4Address2;
    }

    public void setA4Address2(String value) {
        this.a4Address2 = value;
    }
    
    public String getA4City() {
        return a4City;
    }

    public void setA4City(String value) {
        this.a4City = value;
    }
    
    public String getA4Locality() {
        return a4Locality;
    }

    public void setA4Locality(String value) {
        this.a4Locality = value;
    }
    
    public String getA4StateProv() {
        return a4StateProv;
    }

    public void setA4StateProv(String value) {
        this.a4StateProv = value;
    }
    
    public String getA4Country() {
        return a4Country;
    }

    public void setA4Country(String value) {
        this.a4Country = value;
    }
    
    public String getA4PostalCd() {
        return a4PostalCd;
    }

    public void setA4PostalCd(String value) {
        this.a4PostalCd = value;
    }
    
    public String getA4Phone() {
        return a4Phone;
    }

    public void setA4Phone(String value) {
        this.a4Phone = value;
    }
    
    public String getA4PhoneExt() {
        return a4PhoneExt;
    }

    public void setA4PhoneExt(String value) {
        this.a4PhoneExt = value;
    }
    
    public String getA4CellPhone() {
        return a4CellPhone;
    }

    public void setA4CellPhone(String value) {
        this.a4CellPhone = value;
    }
    
    public String getA4WorkPhone() {
        return a4WorkPhone;
    }

    public void setA4WorkPhone(String value) {
        this.a4WorkPhone = value;
    }
    
    public String getA4WorkPhoneExt() {
        return a4WorkPhoneExt;
    }

    public void setA4WorkPhoneExt(String value) {
        this.a4WorkPhoneExt = value;
    }
    
    public String getA4Email() {
        return a4Email;
    }

    public void setA4Email(String value) {
        this.a4Email = value;
    }
    
    public String getA4Birthdate() {
        return a4Birthdate;
    }

    public void setA4Birthdate(String value) {
        this.a4Birthdate = value;
    }
    
    public String getA4BillFirstName() {
        return a4BillFirstName;
    }

    public void setA4BillFirstName(String value) {
        this.a4BillFirstName = value;
    }
    
    public String getA4BillMi() {
        return a4BillMi;
    }

    public void setA4BillMi(String value) {
        this.a4BillMi = value;
    }
    
    public String getA4BillLastName() {
        return a4BillLastName;
    }

    public void setA4BillLastName(String value) {
        this.a4BillLastName = value;
    }
    
    public String getA4BillCompanyName() {
        return a4BillCompanyName;
    }

    public void setA4BillCompanyName(String value) {
        this.a4BillCompanyName = value;
    }
    
    public String getA4BillAddress1() {
        return a4BillAddress1;
    }

    public void setA4BillAddress1(String value) {
        this.a4BillAddress1 = value;
    }
    
    public String getA4BillAddress2() {
        return a4BillAddress2;
    }

    public void setA4BillAddress2(String value) {
        this.a4BillAddress2 = value;
    }
    
    public String getA4BillCity() {
        return a4BillCity;
    }

    public void setA4BillCity(String value) {
        this.a4BillCity = value;
    }
    
    public String getA4BillLocality() {
        return a4BillLocality;
    }

    public void setA4BillLocality(String value) {
        this.a4BillLocality = value;
    }
    
    public String getA4BillStateProv() {
        return a4BillStateProv;
    }

    public void setA4BillStateProv(String value) {
        this.a4BillStateProv = value;
    }
    
    public String getA4BillCountry() {
        return a4BillCountry;
    }

    public void setA4BillCountry(String value) {
        this.a4BillCountry = value;
    }
    
    public String getA4BillPostalCd() {
        return a4BillPostalCd;
    }

    public void setA4BillPostalCd(String value) {
        this.a4BillPostalCd = value;
    }
    
    public String getA4BillPhone() {
        return a4BillPhone;
    }

    public void setA4BillPhone(String value) {
        this.a4BillPhone = value;
    }
    
    public String getA4BillPhoneExt() {
        return a4BillPhoneExt;
    }

    public void setA4BillPhoneExt(String value) {
        this.a4BillPhoneExt = value;
    }
    
    public String getA4BillCellPhone() {
        return a4BillCellPhone;
    }

    public void setA4BillCellPhone(String value) {
        this.a4BillCellPhone = value;
    }
    
    public String getA4BillWorkPhone() {
        return a4BillWorkPhone;
    }

    public void setA4BillWorkPhone(String value) {
        this.a4BillWorkPhone = value;
    }
    
    public String getA4BillWorkPhoneExt() {
        return a4BillWorkPhoneExt;
    }

    public void setA4BillWorkPhoneExt(String value) {
        this.a4BillWorkPhoneExt = value;
    }
    
    public String getA4BillEmail() {
        return a4BillEmail;
    }

    public void setA4BillEmail(String value) {
        this.a4BillEmail = value;
    }
    
    public Long getA4PayMethod() {
        return a4PayMethod;
    }

    public void setA4PayMethod(Long value) {
        this.a4PayMethod = value;
    }
    
    public String getA4CcNumber() {
        return a4CcNumber;
    }

    public void setA4CcNumber(String value) {
        this.a4CcNumber = value;
    }
    
    public Long getA4CcExpireMm() {
        return a4CcExpireMm;
    }

    public void setA4CcExpireMm(Long value) {
        this.a4CcExpireMm = value;
    }
    
    public Long getA4CcExpireYyyy() {
        return a4CcExpireYyyy;
    }

    public void setA4CcExpireYyyy(Long value) {
        this.a4CcExpireYyyy = value;
    }
    
    public String getA4BankAcctNo() {
        return a4BankAcctNo;
    }

    public void setA4BankAcctNo(String value) {
        this.a4BankAcctNo = value;
    }
    
    public String getA4BankRoutingNo() {
        return a4BankRoutingNo;
    }

    public void setA4BankRoutingNo(String value) {
        this.a4BankRoutingNo = value;
    }
    
    public Long getA4RespLevelCd() {
        return a4RespLevelCd;
    }

    public void setA4RespLevelCd(Long value) {
        this.a4RespLevelCd = value;
    }
    
    public A4FunctionalAcctGroupsArray getA4FunctionalAcctGroups() {
        return a4FunctionalAcctGroups;
    }

    public void setA4FunctionalAcctGroups(A4FunctionalAcctGroupsArray value) {
        this.a4FunctionalAcctGroups = value;
    }
    
    public A4CollectionsAcctGroupsArray getA4CollectionsAcctGroups() {
        return a4CollectionsAcctGroups;
    }

    public void setA4CollectionsAcctGroups(A4CollectionsAcctGroupsArray value) {
        this.a4CollectionsAcctGroups = value;
    }
    
    public A4SuppFieldNamesArray getA4SuppFieldNames() {
        return a4SuppFieldNames;
    }

    public void setA4SuppFieldNames(A4SuppFieldNamesArray value) {
        this.a4SuppFieldNames = value;
    }
    
    public A4SuppFieldValuesArray getA4SuppFieldValues() {
        return a4SuppFieldValues;
    }

    public void setA4SuppFieldValues(A4SuppFieldValuesArray value) {
        this.a4SuppFieldValues = value;
    }
    
    public Long getA4TestAcctInd() {
        return a4TestAcctInd;
    }

    public void setA4TestAcctInd(Long value) {
        this.a4TestAcctInd = value;
    }
    
    public Long getA4StatusUntilAltStart() {
        return a4StatusUntilAltStart;
    }

    public void setA4StatusUntilAltStart(Long value) {
        this.a4StatusUntilAltStart = value;
    }
    
    public Double getA4BalanceForward() {
        return a4BalanceForward;
    }

    public void setA4BalanceForward(Double value) {
        this.a4BalanceForward = value;
    }
    
    public Long getA4AltBillDay() {
        return a4AltBillDay;
    }

    public void setA4AltBillDay(Long value) {
        this.a4AltBillDay = value;
    }
    
    public String getA4DoFullInvoicing() {
        return a4DoFullInvoicing;
    }

    public void setA4DoFullInvoicing(String value) {
        this.a4DoFullInvoicing = value;
    }
    
    public String getA4DoProratedInvoicing() {
        return a4DoProratedInvoicing;
    }

    public void setA4DoProratedInvoicing(String value) {
        this.a4DoProratedInvoicing = value;
    }
    
    public Long getA4MasterPlanAltRateSchedNo() {
        return a4MasterPlanAltRateSchedNo;
    }

    public void setA4MasterPlanAltRateSchedNo(Long value) {
        this.a4MasterPlanAltRateSchedNo = value;
    }
    
    public A4SuppPlanAltRateSchedNoArray getA4SuppPlanAltRateSchedNo() {
        return a4SuppPlanAltRateSchedNo;
    }

    public void setA4SuppPlanAltRateSchedNo(A4SuppPlanAltRateSchedNoArray value) {
        this.a4SuppPlanAltRateSchedNo = value;
    }
    
    public String getA4CurrencyCd() {
        return a4CurrencyCd;
    }

    public void setA4CurrencyCd(String value) {
        this.a4CurrencyCd = value;
    }
    
    public String getA4Cvv() {
        return a4Cvv;
    }

    public void setA4Cvv(String value) {
        this.a4Cvv = value;
    }
    
    public String getA4TaxpayerId() {
        return a4TaxpayerId;
    }

    public void setA4TaxpayerId(String value) {
        this.a4TaxpayerId = value;
    }
    
    public String getA4BillAgreementId() {
        return a4BillAgreementId;
    }

    public void setA4BillAgreementId(String value) {
        this.a4BillAgreementId = value;
    }
    
    public String getA4RetroactiveStartDate() {
        return a4RetroactiveStartDate;
    }

    public void setA4RetroactiveStartDate(String value) {
        this.a4RetroactiveStartDate = value;
    }
    
    public A4CouponCodesArray getA4CouponCodes() {
        return a4CouponCodes;
    }

    public void setA4CouponCodes(A4CouponCodesArray value) {
        this.a4CouponCodes = value;
    }
    
    public A4NewAcctCustomRatesArray getA4NewAcctCustomRates() {
        return a4NewAcctCustomRates;
    }

    public void setA4NewAcctCustomRates(A4NewAcctCustomRatesArray value) {
        this.a4NewAcctCustomRates = value;
    }
    
    public Long getA4AltMsgTemplateNo() {
        return a4AltMsgTemplateNo;
    }

    public void setA4AltMsgTemplateNo(Long value) {
        this.a4AltMsgTemplateNo = value;
    }
    
    public Long getA4SeqFuncGroupNo() {
        return a4SeqFuncGroupNo;
    }

    public void setA4SeqFuncGroupNo(Long value) {
        this.a4SeqFuncGroupNo = value;
    }
    
    public A4NewAcctPlanContractsArray getA4NewAcctPlanContracts() {
        return a4NewAcctPlanContracts;
    }

    public void setA4NewAcctPlanContracts(A4NewAcctPlanContractsArray value) {
        this.a4NewAcctPlanContracts = value;
    }
    
    public String getA4Address3() {
        return a4Address3;
    }

    public void setA4Address3(String value) {
        this.a4Address3 = value;
    }
    
    public String getA4BillAddress3() {
        return a4BillAddress3;
    }

    public void setA4BillAddress3(String value) {
        this.a4BillAddress3 = value;
    }
    
    public A4UsageAccumulationConfigArray getA4UsageAccumulationConfig() {
        return a4UsageAccumulationConfig;
    }

    public void setA4UsageAccumulationConfig(A4UsageAccumulationConfigArray value) {
        this.a4UsageAccumulationConfig = value;
    }
    
    public A4EnableUsagePoolingPlanNoArray getA4EnableUsagePoolingPlanNo() {
        return a4EnableUsagePoolingPlanNo;
    }

    public void setA4EnableUsagePoolingPlanNo(A4EnableUsagePoolingPlanNoArray value) {
        this.a4EnableUsagePoolingPlanNo = value;
    }
    
    public A4ClientFuncAcctGroupIdsArray getA4ClientFuncAcctGroupIds() {
        return a4ClientFuncAcctGroupIds;
    }

    public void setA4ClientFuncAcctGroupIds(A4ClientFuncAcctGroupIdsArray value) {
        this.a4ClientFuncAcctGroupIds = value;
    }
    
    public A4ClientCollAcctGroupIdsArray getA4ClientCollAcctGroupIds() {
        return a4ClientCollAcctGroupIds;
    }

    public void setA4ClientCollAcctGroupIds(A4ClientCollAcctGroupIdsArray value) {
        this.a4ClientCollAcctGroupIds = value;
    }
    
    public String getA4TrackData1() {
        return a4TrackData1;
    }

    public void setA4TrackData1(String value) {
        this.a4TrackData1 = value;
    }
    
    public String getA4TrackData2() {
        return a4TrackData2;
    }

    public void setA4TrackData2(String value) {
        this.a4TrackData2 = value;
    }
    
    public Long getA4TaxExemptionLevel() {
        return a4TaxExemptionLevel;
    }

    public void setA4TaxExemptionLevel(Long value) {
        this.a4TaxExemptionLevel = value;
    }
    
    public Long getA4CnAltMsgTemplateNo() {
        return a4CnAltMsgTemplateNo;
    }

    public void setA4CnAltMsgTemplateNo(Long value) {
        this.a4CnAltMsgTemplateNo = value;
    }
    
    public String getA5AltStartDate() {
        return a5AltStartDate;
    }

    public void setA5AltStartDate(String value) {
        this.a5AltStartDate = value;
    }
    
    public String getA5ClientAcctId() {
        return a5ClientAcctId;
    }

    public void setA5ClientAcctId(String value) {
        this.a5ClientAcctId = value;
    }
    
    public String getA5Userid() {
        return a5Userid;
    }

    public void setA5Userid(String value) {
        this.a5Userid = value;
    }
    
    public Long getA5StatusCd() {
        return a5StatusCd;
    }

    public void setA5StatusCd(Long value) {
        this.a5StatusCd = value;
    }
    
    public Long getA5MasterPlanNo() {
        return a5MasterPlanNo;
    }

    public void setA5MasterPlanNo(Long value) {
        this.a5MasterPlanNo = value;
    }
    
    public Long getA5MasterPlanUnits() {
        return a5MasterPlanUnits;
    }

    public void setA5MasterPlanUnits(Long value) {
        this.a5MasterPlanUnits = value;
    }
    
    public A5SuppPlansArray getA5SuppPlans() {
        return a5SuppPlans;
    }

    public void setA5SuppPlans(A5SuppPlansArray value) {
        this.a5SuppPlans = value;
    }
    
    public A5SuppPlanUnitsArray getA5SuppPlanUnits() {
        return a5SuppPlanUnits;
    }

    public void setA5SuppPlanUnits(A5SuppPlanUnitsArray value) {
        this.a5SuppPlanUnits = value;
    }
    
    public Long getA5NotifyMethod() {
        return a5NotifyMethod;
    }

    public void setA5NotifyMethod(Long value) {
        this.a5NotifyMethod = value;
    }
    
    public String getA5PromoCd() {
        return a5PromoCd;
    }

    public void setA5PromoCd(String value) {
        this.a5PromoCd = value;
    }
    
    public String getA5Password() {
        return a5Password;
    }

    public void setA5Password(String value) {
        this.a5Password = value;
    }
    
    public String getA5SecretQuestion() {
        return a5SecretQuestion;
    }

    public void setA5SecretQuestion(String value) {
        this.a5SecretQuestion = value;
    }
    
    public String getA5SecretQuestionAnswer() {
        return a5SecretQuestionAnswer;
    }

    public void setA5SecretQuestionAnswer(String value) {
        this.a5SecretQuestionAnswer = value;
    }
    
    public String getA5FirstName() {
        return a5FirstName;
    }

    public void setA5FirstName(String value) {
        this.a5FirstName = value;
    }
    
    public String getA5Mi() {
        return a5Mi;
    }

    public void setA5Mi(String value) {
        this.a5Mi = value;
    }
    
    public String getA5LastName() {
        return a5LastName;
    }

    public void setA5LastName(String value) {
        this.a5LastName = value;
    }
    
    public String getA5CompanyName() {
        return a5CompanyName;
    }

    public void setA5CompanyName(String value) {
        this.a5CompanyName = value;
    }
    
    public String getA5Address1() {
        return a5Address1;
    }

    public void setA5Address1(String value) {
        this.a5Address1 = value;
    }
    
    public String getA5Address2() {
        return a5Address2;
    }

    public void setA5Address2(String value) {
        this.a5Address2 = value;
    }
    
    public String getA5City() {
        return a5City;
    }

    public void setA5City(String value) {
        this.a5City = value;
    }
    
    public String getA5Locality() {
        return a5Locality;
    }

    public void setA5Locality(String value) {
        this.a5Locality = value;
    }
    
    public String getA5StateProv() {
        return a5StateProv;
    }

    public void setA5StateProv(String value) {
        this.a5StateProv = value;
    }
    
    public String getA5Country() {
        return a5Country;
    }

    public void setA5Country(String value) {
        this.a5Country = value;
    }
    
    public String getA5PostalCd() {
        return a5PostalCd;
    }

    public void setA5PostalCd(String value) {
        this.a5PostalCd = value;
    }
    
    public String getA5Phone() {
        return a5Phone;
    }

    public void setA5Phone(String value) {
        this.a5Phone = value;
    }
    
    public String getA5PhoneExt() {
        return a5PhoneExt;
    }

    public void setA5PhoneExt(String value) {
        this.a5PhoneExt = value;
    }
    
    public String getA5CellPhone() {
        return a5CellPhone;
    }

    public void setA5CellPhone(String value) {
        this.a5CellPhone = value;
    }
    
    public String getA5WorkPhone() {
        return a5WorkPhone;
    }

    public void setA5WorkPhone(String value) {
        this.a5WorkPhone = value;
    }
    
    public String getA5WorkPhoneExt() {
        return a5WorkPhoneExt;
    }

    public void setA5WorkPhoneExt(String value) {
        this.a5WorkPhoneExt = value;
    }
    
    public String getA5Email() {
        return a5Email;
    }

    public void setA5Email(String value) {
        this.a5Email = value;
    }
    
    public String getA5Birthdate() {
        return a5Birthdate;
    }

    public void setA5Birthdate(String value) {
        this.a5Birthdate = value;
    }
    
    public String getA5BillFirstName() {
        return a5BillFirstName;
    }

    public void setA5BillFirstName(String value) {
        this.a5BillFirstName = value;
    }
    
    public String getA5BillMi() {
        return a5BillMi;
    }

    public void setA5BillMi(String value) {
        this.a5BillMi = value;
    }
    
    public String getA5BillLastName() {
        return a5BillLastName;
    }

    public void setA5BillLastName(String value) {
        this.a5BillLastName = value;
    }
    
    public String getA5BillCompanyName() {
        return a5BillCompanyName;
    }

    public void setA5BillCompanyName(String value) {
        this.a5BillCompanyName = value;
    }
    
    public String getA5BillAddress1() {
        return a5BillAddress1;
    }

    public void setA5BillAddress1(String value) {
        this.a5BillAddress1 = value;
    }
    
    public String getA5BillAddress2() {
        return a5BillAddress2;
    }

    public void setA5BillAddress2(String value) {
        this.a5BillAddress2 = value;
    }
    
    public String getA5BillCity() {
        return a5BillCity;
    }

    public void setA5BillCity(String value) {
        this.a5BillCity = value;
    }
    
    public String getA5BillLocality() {
        return a5BillLocality;
    }

    public void setA5BillLocality(String value) {
        this.a5BillLocality = value;
    }
    
    public String getA5BillStateProv() {
        return a5BillStateProv;
    }

    public void setA5BillStateProv(String value) {
        this.a5BillStateProv = value;
    }
    
    public String getA5BillCountry() {
        return a5BillCountry;
    }

    public void setA5BillCountry(String value) {
        this.a5BillCountry = value;
    }
    
    public String getA5BillPostalCd() {
        return a5BillPostalCd;
    }

    public void setA5BillPostalCd(String value) {
        this.a5BillPostalCd = value;
    }
    
    public String getA5BillPhone() {
        return a5BillPhone;
    }

    public void setA5BillPhone(String value) {
        this.a5BillPhone = value;
    }
    
    public String getA5BillPhoneExt() {
        return a5BillPhoneExt;
    }

    public void setA5BillPhoneExt(String value) {
        this.a5BillPhoneExt = value;
    }
    
    public String getA5BillCellPhone() {
        return a5BillCellPhone;
    }

    public void setA5BillCellPhone(String value) {
        this.a5BillCellPhone = value;
    }
    
    public String getA5BillWorkPhone() {
        return a5BillWorkPhone;
    }

    public void setA5BillWorkPhone(String value) {
        this.a5BillWorkPhone = value;
    }
    
    public String getA5BillWorkPhoneExt() {
        return a5BillWorkPhoneExt;
    }

    public void setA5BillWorkPhoneExt(String value) {
        this.a5BillWorkPhoneExt = value;
    }
    
    public String getA5BillEmail() {
        return a5BillEmail;
    }

    public void setA5BillEmail(String value) {
        this.a5BillEmail = value;
    }
    
    public Long getA5PayMethod() {
        return a5PayMethod;
    }

    public void setA5PayMethod(Long value) {
        this.a5PayMethod = value;
    }
    
    public String getA5CcNumber() {
        return a5CcNumber;
    }

    public void setA5CcNumber(String value) {
        this.a5CcNumber = value;
    }
    
    public Long getA5CcExpireMm() {
        return a5CcExpireMm;
    }

    public void setA5CcExpireMm(Long value) {
        this.a5CcExpireMm = value;
    }
    
    public Long getA5CcExpireYyyy() {
        return a5CcExpireYyyy;
    }

    public void setA5CcExpireYyyy(Long value) {
        this.a5CcExpireYyyy = value;
    }
    
    public String getA5BankAcctNo() {
        return a5BankAcctNo;
    }

    public void setA5BankAcctNo(String value) {
        this.a5BankAcctNo = value;
    }
    
    public String getA5BankRoutingNo() {
        return a5BankRoutingNo;
    }

    public void setA5BankRoutingNo(String value) {
        this.a5BankRoutingNo = value;
    }
    
    public Long getA5RespLevelCd() {
        return a5RespLevelCd;
    }

    public void setA5RespLevelCd(Long value) {
        this.a5RespLevelCd = value;
    }
    
    public A5FunctionalAcctGroupsArray getA5FunctionalAcctGroups() {
        return a5FunctionalAcctGroups;
    }

    public void setA5FunctionalAcctGroups(A5FunctionalAcctGroupsArray value) {
        this.a5FunctionalAcctGroups = value;
    }
    
    public A5CollectionsAcctGroupsArray getA5CollectionsAcctGroups() {
        return a5CollectionsAcctGroups;
    }

    public void setA5CollectionsAcctGroups(A5CollectionsAcctGroupsArray value) {
        this.a5CollectionsAcctGroups = value;
    }
    
    public A5SuppFieldNamesArray getA5SuppFieldNames() {
        return a5SuppFieldNames;
    }

    public void setA5SuppFieldNames(A5SuppFieldNamesArray value) {
        this.a5SuppFieldNames = value;
    }
    
    public A5SuppFieldValuesArray getA5SuppFieldValues() {
        return a5SuppFieldValues;
    }

    public void setA5SuppFieldValues(A5SuppFieldValuesArray value) {
        this.a5SuppFieldValues = value;
    }
    
    public Long getA5TestAcctInd() {
        return a5TestAcctInd;
    }

    public void setA5TestAcctInd(Long value) {
        this.a5TestAcctInd = value;
    }
    
    public Long getA5StatusUntilAltStart() {
        return a5StatusUntilAltStart;
    }

    public void setA5StatusUntilAltStart(Long value) {
        this.a5StatusUntilAltStart = value;
    }
    
    public Double getA5BalanceForward() {
        return a5BalanceForward;
    }

    public void setA5BalanceForward(Double value) {
        this.a5BalanceForward = value;
    }
    
    public Long getA5AltBillDay() {
        return a5AltBillDay;
    }

    public void setA5AltBillDay(Long value) {
        this.a5AltBillDay = value;
    }
    
    public String getA5DoFullInvoicing() {
        return a5DoFullInvoicing;
    }

    public void setA5DoFullInvoicing(String value) {
        this.a5DoFullInvoicing = value;
    }
    
    public String getA5DoProratedInvoicing() {
        return a5DoProratedInvoicing;
    }

    public void setA5DoProratedInvoicing(String value) {
        this.a5DoProratedInvoicing = value;
    }
    
    public Long getA5MasterPlanAltRateSchedNo() {
        return a5MasterPlanAltRateSchedNo;
    }

    public void setA5MasterPlanAltRateSchedNo(Long value) {
        this.a5MasterPlanAltRateSchedNo = value;
    }
    
    public A5SuppPlanAltRateSchedNoArray getA5SuppPlanAltRateSchedNo() {
        return a5SuppPlanAltRateSchedNo;
    }

    public void setA5SuppPlanAltRateSchedNo(A5SuppPlanAltRateSchedNoArray value) {
        this.a5SuppPlanAltRateSchedNo = value;
    }
    
    public String getA5CurrencyCd() {
        return a5CurrencyCd;
    }

    public void setA5CurrencyCd(String value) {
        this.a5CurrencyCd = value;
    }
    
    public String getA5Cvv() {
        return a5Cvv;
    }

    public void setA5Cvv(String value) {
        this.a5Cvv = value;
    }
    
    public String getA5TaxpayerId() {
        return a5TaxpayerId;
    }

    public void setA5TaxpayerId(String value) {
        this.a5TaxpayerId = value;
    }
    
    public String getA5BillAgreementId() {
        return a5BillAgreementId;
    }

    public void setA5BillAgreementId(String value) {
        this.a5BillAgreementId = value;
    }
    
    public String getA5RetroactiveStartDate() {
        return a5RetroactiveStartDate;
    }

    public void setA5RetroactiveStartDate(String value) {
        this.a5RetroactiveStartDate = value;
    }
    
    public A5CouponCodesArray getA5CouponCodes() {
        return a5CouponCodes;
    }

    public void setA5CouponCodes(A5CouponCodesArray value) {
        this.a5CouponCodes = value;
    }
    
    public A5NewAcctCustomRatesArray getA5NewAcctCustomRates() {
        return a5NewAcctCustomRates;
    }

    public void setA5NewAcctCustomRates(A5NewAcctCustomRatesArray value) {
        this.a5NewAcctCustomRates = value;
    }
    
    public Long getA5AltMsgTemplateNo() {
        return a5AltMsgTemplateNo;
    }

    public void setA5AltMsgTemplateNo(Long value) {
        this.a5AltMsgTemplateNo = value;
    }
    
    public Long getA5SeqFuncGroupNo() {
        return a5SeqFuncGroupNo;
    }

    public void setA5SeqFuncGroupNo(Long value) {
        this.a5SeqFuncGroupNo = value;
    }
    
    public A5NewAcctPlanContractsArray getA5NewAcctPlanContracts() {
        return a5NewAcctPlanContracts;
    }

    public void setA5NewAcctPlanContracts(A5NewAcctPlanContractsArray value) {
        this.a5NewAcctPlanContracts = value;
    }
    
    public String getA5Address3() {
        return a5Address3;
    }

    public void setA5Address3(String value) {
        this.a5Address3 = value;
    }
    
    public String getA5BillAddress3() {
        return a5BillAddress3;
    }

    public void setA5BillAddress3(String value) {
        this.a5BillAddress3 = value;
    }
    
    public A5UsageAccumulationConfigArray getA5UsageAccumulationConfig() {
        return a5UsageAccumulationConfig;
    }

    public void setA5UsageAccumulationConfig(A5UsageAccumulationConfigArray value) {
        this.a5UsageAccumulationConfig = value;
    }
    
    public A5EnableUsagePoolingPlanNoArray getA5EnableUsagePoolingPlanNo() {
        return a5EnableUsagePoolingPlanNo;
    }

    public void setA5EnableUsagePoolingPlanNo(A5EnableUsagePoolingPlanNoArray value) {
        this.a5EnableUsagePoolingPlanNo = value;
    }
    
    public A5ClientFuncAcctGroupIdsArray getA5ClientFuncAcctGroupIds() {
        return a5ClientFuncAcctGroupIds;
    }

    public void setA5ClientFuncAcctGroupIds(A5ClientFuncAcctGroupIdsArray value) {
        this.a5ClientFuncAcctGroupIds = value;
    }
    
    public A5ClientCollAcctGroupIdsArray getA5ClientCollAcctGroupIds() {
        return a5ClientCollAcctGroupIds;
    }

    public void setA5ClientCollAcctGroupIds(A5ClientCollAcctGroupIdsArray value) {
        this.a5ClientCollAcctGroupIds = value;
    }
    
    public String getA5TrackData1() {
        return a5TrackData1;
    }

    public void setA5TrackData1(String value) {
        this.a5TrackData1 = value;
    }
    
    public String getA5TrackData2() {
        return a5TrackData2;
    }

    public void setA5TrackData2(String value) {
        this.a5TrackData2 = value;
    }
    
    public Long getA5TaxExemptionLevel() {
        return a5TaxExemptionLevel;
    }

    public void setA5TaxExemptionLevel(Long value) {
        this.a5TaxExemptionLevel = value;
    }
    
    public Long getA5CnAltMsgTemplateNo() {
        return a5CnAltMsgTemplateNo;
    }

    public void setA5CnAltMsgTemplateNo(Long value) {
        this.a5CnAltMsgTemplateNo = value;
    }
    
    
}
