package com.aria.sdk.classes;

import java.util.Map;

/**
 * AriaBillingComplete
 * Web Service class
 * @copyright Aria Systems, Inc
 * @author (Automatic generated) Aria
 */
public interface AriaBillingComplete {
    /********************************** METHODS ***********************************************/
    /**
    * getClientPlansAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param plan_no - Type: Long
    * @param acct_no - Type: Long
    * @param promo_code - Type: java.lang.String
    * @param parent_plan_no - Type: Long
    * @param supp_field_names - Type: com.aria.common.shared.SuppFieldNamesArray
    * @param supp_field_values - Type: com.aria.common.shared.SuppFieldValuesArray
    * @param include_all_rate_schedules - Type: java.lang.String
    * @param include_plan_hierarchy - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_client_plans - Type: ArrayList&#60;AllClientPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getClientPlansAll(Long client_no, java.lang.String auth_key, Long plan_no, Long acct_no, java.lang.String promo_code, Long parent_plan_no, com.aria.common.shared.SuppFieldNamesArray supp_field_names, com.aria.common.shared.SuppFieldValuesArray supp_field_values, java.lang.String include_all_rate_schedules, java.lang.String include_plan_hierarchy);

    abstract Map<String,Object> getClientPlansAll(Map<String,Object> map);

    /**
    * setProvEngine
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param on_off_indicator - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setProvEngine(Long client_no, java.lang.String auth_key, java.lang.String on_off_indicator);

    abstract Map<String,Object> setProvEngine(Map<String,Object> map);

    /**
    * getAufStatus
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param file_name - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   status_cd - Type: javax.xml.ws.Holder<br>
    *   load_date_time - Type: javax.xml.ws.Holder<br>
    *   recs_received - Type: javax.xml.ws.Holder<br>
    *   recs_loaded - Type: javax.xml.ws.Holder<br>
    *   recs_failed - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAufStatus(Long client_no, java.lang.String auth_key, java.lang.String file_name);

    abstract Map<String,Object> getAufStatus(Map<String,Object> map);

    /**
    * getCountryFromIp
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param ip_address - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   country_code - Type: javax.xml.ws.Holder<br>
    *   country_name - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getCountryFromIp(Long client_no, java.lang.String auth_key, java.lang.String ip_address);

    abstract Map<String,Object> getCountryFromIp(Map<String,Object> map);

    /**
    * getClientItems
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_currency_cd - Type: java.lang.String
    * @param return_no_cost_items - Type: java.lang.String
    * @param filter_item_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   client_items - Type: ArrayList&#60;ClientItemsReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientItems(Long client_no, java.lang.String auth_key, java.lang.String filter_currency_cd, java.lang.String return_no_cost_items, Long filter_item_no);

    abstract Map<String,Object> getClientItems(Map<String,Object> map);

    /**
    * getClientItemsAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_currency_cd - Type: java.lang.String
    * @param return_no_cost_items - Type: java.lang.String
    * @param filter_item_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   all_client_items - Type: ArrayList&#60;AllClientItemsReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientItemsAll(Long client_no, java.lang.String auth_key, java.lang.String filter_currency_cd, java.lang.String return_no_cost_items, Long filter_item_no);

    abstract Map<String,Object> getClientItemsAll(Map<String,Object> map);

    /**
    * getClientItemPrices
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_item_no - Type: Long
    * @param filter_currency_cd - Type: java.lang.String
    * @param return_no_cost_items - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   all_item_prices - Type: ArrayList&#60;AllItemPricesReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientItemPrices(Long client_no, java.lang.String auth_key, Long filter_item_no, java.lang.String filter_currency_cd, java.lang.String return_no_cost_items);

    abstract Map<String,Object> getClientItemPrices(Map<String,Object> map);

    /**
    * getClientItemSuppFields
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_item_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   all_item_supp_fields - Type: ArrayList&#60;AllItemSuppFieldsReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientItemSuppFields(Long client_no, java.lang.String auth_key, Long filter_item_no);

    abstract Map<String,Object> getClientItemSuppFields(Map<String,Object> map);

    /**
    * getClientItemClasses
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_item_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   all_item_classes - Type: ArrayList&#60;AllItemClassesReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientItemClasses(Long client_no, java.lang.String auth_key, Long filter_item_no);

    abstract Map<String,Object> getClientItemClasses(Map<String,Object> map);

    /**
    * getWebReplacementVals
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param web_vals_in - Type: com.aria.common.shared.WebValsInArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   web_vals_out - Type: ArrayList&#60;WebValsOutReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getWebReplacementVals(Long client_no, java.lang.String auth_key, com.aria.common.shared.WebValsInArray web_vals_in);

    abstract Map<String,Object> getWebReplacementVals(Map<String,Object> map);

    /**
    * getClientPlansBasic
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param plan_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   plans_basic - Type: ArrayList&#60;PlansBasicReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientPlansBasic(Long client_no, java.lang.String auth_key, Long plan_no);

    abstract Map<String,Object> getClientPlansBasic(Map<String,Object> map);

    /**
    * getClientPlanServices
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param plan_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   plan_services - Type: ArrayList&#60;PlanServicesReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientPlanServices(Long client_no, java.lang.String auth_key, Long plan_no);

    abstract Map<String,Object> getClientPlanServices(Map<String,Object> map);

    /**
    * getClientPlanServiceRates
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param plan_no - Type: Long
    * @param service_no - Type: Long
    * @param alt_rate_schedule_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   plan_service_rates - Type: ArrayList&#60;PlanServiceRatesReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientPlanServiceRates(Long client_no, java.lang.String auth_key, Long plan_no, Long service_no, Long alt_rate_schedule_no);

    abstract Map<String,Object> getClientPlanServiceRates(Map<String,Object> map);

    /**
    * getClientCountries
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   client_country - Type: ArrayList&#60;ClientCountryReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientCountries(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getClientCountries(Map<String,Object> map);

    /**
    * subscribeEventClass
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param class_no - Type: Long
    * @param do_write - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   events - Type: ArrayList&#60;EventsReturnElement&#62;<br>
    */
    abstract Map<String,Object> subscribeEventClass(Long client_no, java.lang.String auth_key, Long class_no, java.lang.String do_write);

    abstract Map<String,Object> subscribeEventClass(Map<String,Object> map);

    /**
    * unsubscribeEventClass
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param class_no - Type: Long
    * @param do_write - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   events - Type: ArrayList&#60;EventsReturnElement&#62;<br>
    */
    abstract Map<String,Object> unsubscribeEventClass(Long client_no, java.lang.String auth_key, Long class_no, java.lang.String do_write);

    abstract Map<String,Object> unsubscribeEventClass(Map<String,Object> map);

    /**
    * subscribeEvent
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param event_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> subscribeEvent(Long client_no, java.lang.String auth_key, Long event_id);

    abstract Map<String,Object> subscribeEvent(Map<String,Object> map);

    /**
    * unsubscribeEvent
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param event_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> unsubscribeEvent(Long client_no, java.lang.String auth_key, Long event_id);

    abstract Map<String,Object> unsubscribeEvent(Map<String,Object> map);

    /**
    * subscribeEvents
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param event_list - Type: com.aria.common.shared.EventListArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> subscribeEvents(Long client_no, java.lang.String auth_key, com.aria.common.shared.EventListArray event_list);

    abstract Map<String,Object> subscribeEvents(Map<String,Object> map);

    /**
    * unsubscribeEvents
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param event_list - Type: com.aria.common.shared.EventListArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> unsubscribeEvents(Long client_no, java.lang.String auth_key, com.aria.common.shared.EventListArray event_list);

    abstract Map<String,Object> unsubscribeEvents(Map<String,Object> map);

    /**
    * clientHasEventClass
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param class_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   response - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> clientHasEventClass(Long client_no, java.lang.String auth_key, Long class_no);

    abstract Map<String,Object> clientHasEventClass(Map<String,Object> map);

    /**
    * genRandomString
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param rand_type - Type: java.lang.String
    * @param rand_length - Type: Long
    * @param rand_case - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   random_string - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> genRandomString(Long client_no, java.lang.String auth_key, java.lang.String rand_type, Long rand_length, java.lang.String rand_case);

    abstract Map<String,Object> genRandomString(Map<String,Object> map);

    /**
    * getRateSchedulesForPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param plan_no - Type: Long
    * @param currency_cd - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   rate_sched - Type: ArrayList&#60;RateSchedReturnElement&#62;<br>
    */
    abstract Map<String,Object> getRateSchedulesForPlan(Long client_no, java.lang.String auth_key, Long plan_no, java.lang.String currency_cd);

    abstract Map<String,Object> getRateSchedulesForPlan(Map<String,Object> map);

    /**
    * getCurrentSystemVersion
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   version - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getCurrentSystemVersion(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getCurrentSystemVersion(Map<String,Object> map);

    /**
    * getAllClientReceiptIds
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param start_date_range - Type: java.lang.String
    * @param end_date_range - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   client_receipt - Type: ArrayList&#60;ClientReceiptReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAllClientReceiptIds(Long client_no, java.lang.String auth_key, java.lang.String start_date_range, java.lang.String end_date_range);

    abstract Map<String,Object> getAllClientReceiptIds(Map<String,Object> map);

    /**
    * getClientItemsBasic
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_currency_cd - Type: java.lang.String
    * @param return_no_cost_items - Type: java.lang.String
    * @param filter_item_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   items_basic - Type: ArrayList&#60;ItemsBasicReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientItemsBasic(Long client_no, java.lang.String auth_key, java.lang.String filter_currency_cd, java.lang.String return_no_cost_items, Long filter_item_no);

    abstract Map<String,Object> getClientItemsBasic(Map<String,Object> map);

    /**
    * getRegUssParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   out_reg_uss_params - Type: ArrayList&#60;OutRegUssParamsReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getRegUssParams(Long client_no, java.lang.String auth_key, java.lang.String session_id);

    abstract Map<String,Object> getRegUssParams(Map<String,Object> map);

    /**
    * setRegUssParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @param in_reg_uss_params - Type: com.aria.common.shared.InRegUssParamsArray
    * @param override_timeout_minutes - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setRegUssParams(Long client_no, java.lang.String auth_key, java.lang.String session_id, com.aria.common.shared.InRegUssParamsArray in_reg_uss_params, Long override_timeout_minutes);

    abstract Map<String,Object> setRegUssParams(Map<String,Object> map);

    /**
    * deleteRegUssParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @param param_names - Type: com.aria.common.shared.ParamNamesArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> deleteRegUssParams(Long client_no, java.lang.String auth_key, java.lang.String session_id, com.aria.common.shared.ParamNamesArray param_names);

    abstract Map<String,Object> deleteRegUssParams(Map<String,Object> map);

    /**
    * replaceRegUssParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @param in_reg_uss_params - Type: com.aria.common.shared.InRegUssParamsArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> replaceRegUssParams(Long client_no, java.lang.String auth_key, java.lang.String session_id, com.aria.common.shared.InRegUssParamsArray in_reg_uss_params);

    abstract Map<String,Object> replaceRegUssParams(Map<String,Object> map);

    /**
    * clearRegUssParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> clearRegUssParams(Long client_no, java.lang.String auth_key, java.lang.String session_id);

    abstract Map<String,Object> clearRegUssParams(Map<String,Object> map);

    /**
    * getRegUssConfigParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param set_name - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   out_reg_uss_config_params - Type: ArrayList&#60;OutRegUssConfigParamsReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getRegUssConfigParams(Long client_no, java.lang.String auth_key, java.lang.String set_name);

    abstract Map<String,Object> getRegUssConfigParams(Map<String,Object> map);

    /**
    * setRegUssConfigParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param set_name - Type: java.lang.String
    * @param in_reg_uss_config_params - Type: com.aria.common.shared.InRegUssConfigParamsArray
    * @param set_description - Type: java.lang.String
    * @param set_type_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setRegUssConfigParams(Long client_no, java.lang.String auth_key, java.lang.String set_name, com.aria.common.shared.InRegUssConfigParamsArray in_reg_uss_config_params, java.lang.String set_description, Long set_type_no);

    abstract Map<String,Object> setRegUssConfigParams(Map<String,Object> map);

    /**
    * deleteRegUssConfigParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param set_name - Type: java.lang.String
    * @param param_names - Type: com.aria.common.shared.ParamNamesArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> deleteRegUssConfigParams(Long client_no, java.lang.String auth_key, java.lang.String set_name, com.aria.common.shared.ParamNamesArray param_names);

    abstract Map<String,Object> deleteRegUssConfigParams(Map<String,Object> map);

    /**
    * replaceRegUssConfigParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param set_name - Type: java.lang.String
    * @param in_reg_uss_config_params - Type: com.aria.common.shared.InRegUssConfigParamsArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> replaceRegUssConfigParams(Long client_no, java.lang.String auth_key, java.lang.String set_name, com.aria.common.shared.InRegUssConfigParamsArray in_reg_uss_config_params);

    abstract Map<String,Object> replaceRegUssConfigParams(Map<String,Object> map);

    /**
    * clearRegUssConfigParams
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param set_name - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> clearRegUssConfigParams(Long client_no, java.lang.String auth_key, java.lang.String set_name);

    abstract Map<String,Object> clearRegUssConfigParams(Map<String,Object> map);

    /**
    * updateInventoryItemStock
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param inventory_item_stock - Type: com.aria.common.shared.InventoryItemStockArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   new_inventory_item_stock - Type: ArrayList&#60;NewInventoryItemStockReturnElement&#62;<br>
    */
    abstract Map<String,Object> updateInventoryItemStock(Long client_no, java.lang.String auth_key, com.aria.common.shared.InventoryItemStockArray inventory_item_stock);

    abstract Map<String,Object> updateInventoryItemStock(Map<String,Object> map);

    /**
    * getClientCurrencies
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   client_currency - Type: ArrayList&#60;ClientCurrencyReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientCurrencies(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getClientCurrencies(Map<String,Object> map);

    /**
    * getClientItemImages
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param item_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   item_images - Type: ArrayList&#60;ItemImagesReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getClientItemImages(Long client_no, java.lang.String auth_key, Long item_no);

    abstract Map<String,Object> getClientItemImages(Map<String,Object> map);

    /**
    * getTopLevelItemClass
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   top_item_class - Type: ArrayList&#60;TopItemClassReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getTopLevelItemClass(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getTopLevelItemClass(Map<String,Object> map);

    /**
    * getParentForItemClass
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_class_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   parent_item_class - Type: ArrayList&#60;ParentItemClassReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getParentForItemClass(Long client_no, java.lang.String auth_key, Long filter_class_no);

    abstract Map<String,Object> getParentForItemClass(Map<String,Object> map);

    /**
    * getChildForItemClass
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_class_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   child_item_class - Type: ArrayList&#60;ChildItemClassReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getChildForItemClass(Long client_no, java.lang.String auth_key, Long filter_class_no);

    abstract Map<String,Object> getChildForItemClass(Map<String,Object> map);

    /**
    * getItemsByClass
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param filter_class_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   class_items - Type: ArrayList&#60;ClassItemsReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getItemsByClass(Long client_no, java.lang.String auth_key, Long filter_class_no);

    abstract Map<String,Object> getItemsByClass(Map<String,Object> map);

    /**
    * getMasterPlansBySuppField
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param field_val - Type: java.lang.String
    * @param field_no - Type: Long
    * @param field_name - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   master_plans_by_supp_field - Type: ArrayList&#60;MasterPlansBySuppFieldReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getMasterPlansBySuppField(Long client_no, java.lang.String auth_key, java.lang.String field_val, Long field_no, java.lang.String field_name);

    abstract Map<String,Object> getMasterPlansBySuppField(Map<String,Object> map);

    /**
    * getSuppPlansBySuppField
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param field_val - Type: java.lang.String
    * @param field_no - Type: Long
    * @param field_name - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   supp_plans_by_supp_field - Type: ArrayList&#60;SuppPlansBySuppFieldReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getSuppPlansBySuppField(Long client_no, java.lang.String auth_key, java.lang.String field_val, Long field_no, java.lang.String field_name);

    abstract Map<String,Object> getSuppPlansBySuppField(Map<String,Object> map);

    /**
    * getItemsBySuppField
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param field_val - Type: java.lang.String
    * @param field_no - Type: Long
    * @param field_name - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   items_by_supp_field - Type: ArrayList&#60;ItemsBySuppFieldReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getItemsBySuppField(Long client_no, java.lang.String auth_key, java.lang.String field_val, Long field_no, java.lang.String field_name);

    abstract Map<String,Object> getItemsBySuppField(Map<String,Object> map);

    /**
    * getEmailTemplates
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   templates_by_client - Type: ArrayList&#60;TemplatesByClientReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getEmailTemplates(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getEmailTemplates(Map<String,Object> map);

    /**
    * getVirtualDatetime
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   virtual_date - Type: javax.xml.ws.Holder<br>
    *   virtual_time - Type: javax.xml.ws.Holder<br>
    *   system_date - Type: javax.xml.ws.Holder<br>
    *   system_time - Type: javax.xml.ws.Holder<br>
    *   current_offset_hours - Type: javax.xml.ws.Holder<br>
    *   is_batch_running - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getVirtualDatetime(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getVirtualDatetime(Map<String,Object> map);

    /**
    * advanceVirtualDatetime
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param offset_hours - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   virtual_date - Type: javax.xml.ws.Holder<br>
    *   virtual_time - Type: javax.xml.ws.Holder<br>
    *   system_date - Type: javax.xml.ws.Holder<br>
    *   system_time - Type: javax.xml.ws.Holder<br>
    *   current_offset_hours - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> advanceVirtualDatetime(Long client_no, java.lang.String auth_key, Long offset_hours);

    abstract Map<String,Object> advanceVirtualDatetime(Map<String,Object> map);

    /**
    * getDailyBatchStatus
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param batch_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   status - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getDailyBatchStatus(Long client_no, java.lang.String auth_key, java.lang.String batch_date);

    abstract Map<String,Object> getDailyBatchStatus(Map<String,Object> map);

    /**
    * setExternalObjectId
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param destination_id - Type: Long
    * @param source_type_id - Type: Long
    * @param object_id - Type: Long
    * @param external_id - Type: java.lang.String
    * @param action_directive - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setExternalObjectId(Long client_no, java.lang.String auth_key, Long destination_id, Long source_type_id, Long object_id, java.lang.String external_id, Long action_directive);

    abstract Map<String,Object> setExternalObjectId(Map<String,Object> map);

    /**
    * getCouponDetails
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param coupon_cd - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   coupons - Type: ArrayList&#60;CouponsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getCouponDetails(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String coupon_cd);

    abstract Map<String,Object> getCouponDetails(Map<String,Object> map);

    /**
    * deleteAcctCoupon
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param coupon_cd - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> deleteAcctCoupon(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String coupon_cd);

    abstract Map<String,Object> deleteAcctCoupon(Map<String,Object> map);

    /**
    * updateAcctContact
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param first_name - Type: java.lang.String
    * @param last_name - Type: java.lang.String
    * @param mi - Type: java.lang.String
    * @param company_name - Type: java.lang.String
    * @param address1 - Type: java.lang.String
    * @param address2 - Type: java.lang.String
    * @param city - Type: java.lang.String
    * @param locality - Type: java.lang.String
    * @param state_prov - Type: java.lang.String
    * @param country - Type: java.lang.String
    * @param postal_code - Type: java.lang.String
    * @param intl_phone - Type: java.lang.String
    * @param alt_email - Type: java.lang.String
    * @param birthdate - Type: java.lang.String
    * @param address3 - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updateAcctContact(Long client_no, java.lang.String auth_key, Long account_no, java.lang.String first_name, java.lang.String last_name, java.lang.String mi, java.lang.String company_name, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String locality, java.lang.String state_prov, java.lang.String country, java.lang.String postal_code, java.lang.String intl_phone, java.lang.String alt_email, java.lang.String birthdate, java.lang.String address3);

    abstract Map<String,Object> updateAcctContact(Map<String,Object> map);

    /**
    * updateAcctCredentials
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param password - Type: java.lang.String
    * @param secret_question_answer - Type: java.lang.String
    * @param secret_question - Type: java.lang.String
    * @param pin - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updateAcctCredentials(Long client_no, java.lang.String auth_key, Long account_no, java.lang.String password, java.lang.String secret_question_answer, java.lang.String secret_question, java.lang.String pin);

    abstract Map<String,Object> updateAcctCredentials(Map<String,Object> map);

    /**
    * updateAcctStatus
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param status_cd - Type: Long
    * @param queue_days - Type: Long
    * @param queue_date - Type: java.lang.String
    * @param force_bill_date_reset - Type: Long
    * @param comments - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param alt_do_dunning - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updateAcctStatus(Long client_no, java.lang.String auth_key, Long account_no, Long status_cd, Long queue_days, java.lang.String queue_date, Long force_bill_date_reset, java.lang.String comments, java.lang.String client_receipt_id, java.lang.String alt_do_dunning);

    abstract Map<String,Object> updateAcctStatus(Map<String,Object> map);

    /**
    * updateAcctSuppFields
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param field_name - Type: java.lang.String
    * @param value_text - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updateAcctSuppFields(Long client_no, java.lang.String auth_key, Long account_no, java.lang.String field_name, java.lang.String value_text);

    abstract Map<String,Object> updateAcctSuppFields(Map<String,Object> map);

    /**
    * updateAcctBillingContact
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param first_name - Type: java.lang.String
    * @param last_name - Type: java.lang.String
    * @param middle_initial - Type: java.lang.String
    * @param company_name - Type: java.lang.String
    * @param address1 - Type: java.lang.String
    * @param address2 - Type: java.lang.String
    * @param city - Type: java.lang.String
    * @param locality - Type: java.lang.String
    * @param state - Type: java.lang.String
    * @param country - Type: java.lang.String
    * @param zip - Type: java.lang.String
    * @param intl_phone - Type: java.lang.String
    * @param email - Type: java.lang.String
    * @param do_collect - Type: java.lang.String
    * @param change_status_after_coll - Type: java.lang.String
    * @param reset_dates_after_status - Type: java.lang.String
    * @param address3 - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updateAcctBillingContact(Long client_no, java.lang.String auth_key, Long account_no, java.lang.String first_name, java.lang.String last_name, java.lang.String middle_initial, java.lang.String company_name, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String locality, java.lang.String state, java.lang.String country, java.lang.String zip, java.lang.String intl_phone, java.lang.String email, java.lang.String do_collect, java.lang.String change_status_after_coll, java.lang.String reset_dates_after_status, java.lang.String address3);

    abstract Map<String,Object> updateAcctBillingContact(Map<String,Object> map);

    /**
    * updateAcctNotifyMethod
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param notify_method - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updateAcctNotifyMethod(Long client_no, java.lang.String auth_key, Long account_no, Long notify_method);

    abstract Map<String,Object> updateAcctNotifyMethod(Map<String,Object> map);

    /**
    * getAcctNotifyMethod
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   notify_method - Type: javax.xml.ws.Holder<br>
    *   notify_method_name - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctNotifyMethod(Long client_no, java.lang.String auth_key, Long account_no);

    abstract Map<String,Object> getAcctNotifyMethod(Map<String,Object> map);

    /**
    * setPayMethodBankDraft
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param do_collect - Type: java.lang.String
    * @param change_status_after_coll - Type: java.lang.String
    * @param reset_dates_after_status - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setPayMethodBankDraft(Long client_no, java.lang.String auth_key, Long account_no, java.lang.String bank_routing_num, java.lang.String bank_acct_num, java.lang.String do_collect, java.lang.String change_status_after_coll, java.lang.String reset_dates_after_status);

    abstract Map<String,Object> setPayMethodBankDraft(Map<String,Object> map);

    /**
    * setPayMethodCc
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param do_collect - Type: java.lang.String
    * @param change_status_after_coll - Type: java.lang.String
    * @param reset_dates_after_status - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setPayMethodCc(Long client_no, java.lang.String auth_key, Long account_no, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String cc_number, java.lang.String do_collect, java.lang.String change_status_after_coll, java.lang.String reset_dates_after_status);

    abstract Map<String,Object> setPayMethodCc(Map<String,Object> map);

    /**
    * setPayMethodNetTerms
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param pay_method - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setPayMethodNetTerms(Long client_no, java.lang.String auth_key, Long account_no, Long pay_method);

    abstract Map<String,Object> setPayMethodNetTerms(Map<String,Object> map);

    /**
    * setPaymentResponsibility
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param resp_level_cd - Type: Long
    * @param senior_account_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setPaymentResponsibility(Long client_no, java.lang.String auth_key, Long account_no, Long resp_level_cd, Long senior_account_no);

    abstract Map<String,Object> setPaymentResponsibility(Map<String,Object> map);

    /**
    * setServicePlanImmediately
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param plan_no - Type: Long
    * @param client_receipt_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setServicePlanImmediately(Long client_no, java.lang.String auth_key, Long account_no, Long plan_no, java.lang.String client_receipt_id);

    abstract Map<String,Object> setServicePlanImmediately(Map<String,Object> map);

    /**
    * toggleTestAccount
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param test_acct_ind - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> toggleTestAccount(Long client_no, java.lang.String auth_key, Long account_no, Long test_acct_ind);

    abstract Map<String,Object> toggleTestAccount(Map<String,Object> map);

    /**
    * validatePaymentInformation
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param CVV - Type: Long
    * @param seq_no - Type: Long
    * @param inTrackingNumber - Type: java.lang.String
    * @param inAuthValue - Type: java.lang.String
    * @param alt_pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bill_company_name - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_middle_initial - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_zip - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_extension - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_extension - Type: java.lang.String
    * @param currency_cd - Type: java.lang.String
    * @param acct_group_no - Type: Long
    * @param bill_address3 - Type: java.lang.String
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> validatePaymentInformation(Long client_no, java.lang.String auth_key, Long account_no, Long CVV, Long seq_no, java.lang.String inTrackingNumber, java.lang.String inAuthValue, Long alt_pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bill_company_name, java.lang.String bill_first_name, java.lang.String bill_middle_initial, java.lang.String bill_last_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_zip, java.lang.String bill_country, java.lang.String bill_email, java.lang.String bill_phone, java.lang.String bill_phone_extension, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_extension, java.lang.String currency_cd, Long acct_group_no, java.lang.String bill_address3, java.lang.String alt_client_acct_group_id, java.lang.String track_data1, java.lang.String track_data2);

    abstract Map<String,Object> validatePaymentInformation(Map<String,Object> map);

    /**
    * banAcct
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param userid - Type: java.lang.String
    * @param days_to_restore - Type: Long
    * @param date_to_restore - Type: java.lang.String
    * @param reason_cd - Type: Long
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> banAcct(Long client_no, java.lang.String auth_key, Long account_no, java.lang.String userid, Long days_to_restore, java.lang.String date_to_restore, Long reason_cd, java.lang.String comments);

    abstract Map<String,Object> banAcct(Map<String,Object> map);

    /**
    * getAcctTransHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param transaction_type - Type: Long
    * @param start_date - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @param record_limit - Type: Long
    * @param filter_statement_no - Type: Long
    * @param include_void_transactions - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   history - Type: ArrayList&#60;HistoryReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctTransHistory(Long client_no, java.lang.String auth_key, Long account_no, Long transaction_type, java.lang.String start_date, java.lang.String end_date, Long record_limit, Long filter_statement_no, java.lang.String include_void_transactions);

    abstract Map<String,Object> getAcctTransHistory(Map<String,Object> map);

    /**
    * updatePaymentMethod
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_number - Type: Long
    * @param first_name - Type: java.lang.String
    * @param last_name - Type: java.lang.String
    * @param middle_initial - Type: java.lang.String
    * @param company_name - Type: java.lang.String
    * @param address1 - Type: java.lang.String
    * @param address2 - Type: java.lang.String
    * @param city - Type: java.lang.String
    * @param locality - Type: java.lang.String
    * @param state - Type: java.lang.String
    * @param country - Type: java.lang.String
    * @param zip - Type: java.lang.String
    * @param intl_phone - Type: java.lang.String
    * @param phone_npa - Type: java.lang.String
    * @param phone_nxx - Type: java.lang.String
    * @param phone_suffix - Type: java.lang.String
    * @param phone_extension - Type: java.lang.String
    * @param email - Type: java.lang.String
    * @param pay_method - Type: java.lang.String
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param do_collect - Type: java.lang.String
    * @param change_status_after_coll - Type: java.lang.String
    * @param reset_dates_after_status - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   seq_no - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updatePaymentMethod(Long client_no, java.lang.String auth_key, Long account_number, java.lang.String first_name, java.lang.String last_name, java.lang.String middle_initial, java.lang.String company_name, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String locality, java.lang.String state, java.lang.String country, java.lang.String zip, java.lang.String intl_phone, java.lang.String phone_npa, java.lang.String phone_nxx, java.lang.String phone_suffix, java.lang.String phone_extension, java.lang.String email, java.lang.String pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_routing_num, java.lang.String bank_acct_num, java.lang.String do_collect, java.lang.String change_status_after_coll, java.lang.String reset_dates_after_status, java.lang.String client_receipt_id);

    abstract Map<String,Object> updatePaymentMethod(Map<String,Object> map);

    /**
    * authorizeElectronicPayment
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_number - Type: Long
    * @param amount - Type: java.lang.Double
    * @param payment_source - Type: Long
    * @param CVV - Type: java.lang.String
    * @param bill_seq - Type: Long
    * @param inTrackingNumber - Type: java.lang.String
    * @param inAuthValue - Type: java.lang.String
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> authorizeElectronicPayment(Long client_no, java.lang.String auth_key, Long account_number, java.lang.Double amount, Long payment_source, java.lang.String CVV, Long bill_seq, java.lang.String inTrackingNumber, java.lang.String inAuthValue, java.lang.String alt_client_acct_group_id, java.lang.String track_data1, java.lang.String track_data2);

    abstract Map<String,Object> authorizeElectronicPayment(Map<String,Object> map);

    /**
    * getQueuedServicePlans
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_number - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   queued_plans - Type: ArrayList&#60;QueuedPlansReturnElement&#62;<br>
    *   current_rate_schedule_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getQueuedServicePlans(Long client_no, java.lang.String auth_key, Long account_number);

    abstract Map<String,Object> getQueuedServicePlans(Map<String,Object> map);

    /**
    * cancelQueuedServicePlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_number - Type: Long
    * @param plan_no_to_remove - Type: com.aria.common.shared.PlanNoToRemoveArray
    * @param remove_all_queued_plan_no - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelQueuedServicePlan(Long client_no, java.lang.String auth_key, Long account_number, com.aria.common.shared.PlanNoToRemoveArray plan_no_to_remove, java.lang.String remove_all_queued_plan_no);

    abstract Map<String,Object> cancelQueuedServicePlan(Map<String,Object> map);

    /**
    * getAcctStatusHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_number - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   stat_hist - Type: ArrayList&#60;StatHistReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctStatusHistory(Long client_no, java.lang.String auth_key, Long account_number);

    abstract Map<String,Object> getAcctStatusHistory(Map<String,Object> map);

    /**
    * getAcctPlanHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_number - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   plan_hist - Type: ArrayList&#60;PlanHistReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctPlanHistory(Long client_no, java.lang.String auth_key, Long account_number);

    abstract Map<String,Object> getAcctPlanHistory(Map<String,Object> map);

    /**
    * getAcctSuppPlanHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param plan_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   supp_plan_hist - Type: ArrayList&#60;SuppPlanHistReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctSuppPlanHistory(Long client_no, java.lang.String auth_key, Long acct_no, Long plan_no);

    abstract Map<String,Object> getAcctSuppPlanHistory(Map<String,Object> map);

    /**
    * getAvailablePlans
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   plans - Type: ArrayList&#60;PlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAvailablePlans(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAvailablePlans(Map<String,Object> map);

    /**
    * getAvailablePlansAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_plans - Type: ArrayList&#60;AllPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAvailablePlansAll(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAvailablePlansAll(Map<String,Object> map);

    /**
    * getPlansByPromoCode
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param promo_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   plans - Type: ArrayList&#60;PlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getPlansByPromoCode(Long client_no, java.lang.String auth_key, java.lang.String promo_code);

    abstract Map<String,Object> getPlansByPromoCode(Map<String,Object> map);

    /**
    * getPlansByPromoCodeAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param promo_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_plans - Type: ArrayList&#60;AllPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getPlansByPromoCodeAll(Long client_no, java.lang.String auth_key, java.lang.String promo_code);

    abstract Map<String,Object> getPlansByPromoCodeAll(Map<String,Object> map);

    /**
    * getAcctDetailsAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   first_name - Type: javax.xml.ws.Holder<br>
    *   mi - Type: javax.xml.ws.Holder<br>
    *   last_name - Type: javax.xml.ws.Holder<br>
    *   userid - Type: javax.xml.ws.Holder<br>
    *   birthdate - Type: javax.xml.ws.Holder<br>
    *   job_title - Type: javax.xml.ws.Holder<br>
    *   salutation - Type: javax.xml.ws.Holder<br>
    *   senior_acct_no - Type: javax.xml.ws.Holder<br>
    *   client_acct_id - Type: javax.xml.ws.Holder<br>
    *   resp_level_cd - Type: javax.xml.ws.Holder<br>
    *   is_test_acct - Type: javax.xml.ws.Holder<br>
    *   alt_email - Type: javax.xml.ws.Holder<br>
    *   address1 - Type: javax.xml.ws.Holder<br>
    *   address2 - Type: javax.xml.ws.Holder<br>
    *   city - Type: javax.xml.ws.Holder<br>
    *   state_prov - Type: javax.xml.ws.Holder<br>
    *   locality - Type: javax.xml.ws.Holder<br>
    *   postal_code - Type: javax.xml.ws.Holder<br>
    *   country - Type: javax.xml.ws.Holder<br>
    *   company_name - Type: javax.xml.ws.Holder<br>
    *   cell_phone_npa - Type: javax.xml.ws.Holder<br>
    *   cell_phone_nxx - Type: javax.xml.ws.Holder<br>
    *   cell_phone_suffix - Type: javax.xml.ws.Holder<br>
    *   fax_phone - Type: javax.xml.ws.Holder<br>
    *   intl_cell_phone - Type: javax.xml.ws.Holder<br>
    *   intl_phone - Type: javax.xml.ws.Holder<br>
    *   phone_extension - Type: javax.xml.ws.Holder<br>
    *   phone_npa - Type: javax.xml.ws.Holder<br>
    *   phone_nxx - Type: javax.xml.ws.Holder<br>
    *   phone_suffix - Type: javax.xml.ws.Holder<br>
    *   work_phone - Type: javax.xml.ws.Holder<br>
    *   work_phone_extension - Type: javax.xml.ws.Holder<br>
    *   work_phone_npa - Type: javax.xml.ws.Holder<br>
    *   work_phone_nxx - Type: javax.xml.ws.Holder<br>
    *   work_phone_suffix - Type: javax.xml.ws.Holder<br>
    *   bill_day - Type: javax.xml.ws.Holder<br>
    *   created - Type: javax.xml.ws.Holder<br>
    *   date_to_expire - Type: javax.xml.ws.Holder<br>
    *   date_to_suspend - Type: javax.xml.ws.Holder<br>
    *   last_arrears_bill_thru_date - Type: javax.xml.ws.Holder<br>
    *   last_bill_date - Type: javax.xml.ws.Holder<br>
    *   last_bill_thru_date - Type: javax.xml.ws.Holder<br>
    *   next_bill_date - Type: javax.xml.ws.Holder<br>
    *   plan_date - Type: javax.xml.ws.Holder<br>
    *   status_date - Type: javax.xml.ws.Holder<br>
    *   status_degrade_date - Type: javax.xml.ws.Holder<br>
    *   status_cd - Type: javax.xml.ws.Holder<br>
    *   status_label - Type: javax.xml.ws.Holder<br>
    *   plan_no - Type: javax.xml.ws.Holder<br>
    *   plan_name - Type: javax.xml.ws.Holder<br>
    *   plan_units - Type: javax.xml.ws.Holder<br>
    *   notify_method - Type: javax.xml.ws.Holder<br>
    *   notify_method_name - Type: javax.xml.ws.Holder<br>
    *   PASSWORD - Type: javax.xml.ws.Holder<br>
    *   pin - Type: javax.xml.ws.Holder<br>
    *   secret_question - Type: javax.xml.ws.Holder<br>
    *   secret_question_answer - Type: javax.xml.ws.Holder<br>
    *   pay_method - Type: javax.xml.ws.Holder<br>
    *   pay_method_name - Type: javax.xml.ws.Holder<br>
    *   currency_cd - Type: javax.xml.ws.Holder<br>
    *   tax_id - Type: javax.xml.ws.Holder<br>
    *   billing_email - Type: javax.xml.ws.Holder<br>
    *   billing_first_name - Type: javax.xml.ws.Holder<br>
    *   billing_middle_initial - Type: javax.xml.ws.Holder<br>
    *   billing_last_name - Type: javax.xml.ws.Holder<br>
    *   billing_address1 - Type: javax.xml.ws.Holder<br>
    *   billing_address2 - Type: javax.xml.ws.Holder<br>
    *   billing_city - Type: javax.xml.ws.Holder<br>
    *   billing_state - Type: javax.xml.ws.Holder<br>
    *   billing_locality - Type: javax.xml.ws.Holder<br>
    *   billing_zip - Type: javax.xml.ws.Holder<br>
    *   billing_country - Type: javax.xml.ws.Holder<br>
    *   cc_suffix - Type: javax.xml.ws.Holder<br>
    *   cc_expire_mm - Type: javax.xml.ws.Holder<br>
    *   cc_expire_yyyy - Type: javax.xml.ws.Holder<br>
    *   cc_id - Type: javax.xml.ws.Holder<br>
    *   bank_acct_suffix - Type: javax.xml.ws.Holder<br>
    *   bank_routing_no - Type: javax.xml.ws.Holder<br>
    *   billing_cell_phone - Type: javax.xml.ws.Holder<br>
    *   billing_cell_phone_npa - Type: javax.xml.ws.Holder<br>
    *   billing_cell_phone_nxx - Type: javax.xml.ws.Holder<br>
    *   billing_cell_phone_suffix - Type: javax.xml.ws.Holder<br>
    *   billing_company_name - Type: javax.xml.ws.Holder<br>
    *   billing_intl_phone - Type: javax.xml.ws.Holder<br>
    *   billing_phone_extension - Type: javax.xml.ws.Holder<br>
    *   billing_phone_npa - Type: javax.xml.ws.Holder<br>
    *   billing_phone_nxx - Type: javax.xml.ws.Holder<br>
    *   billing_phone_suffix - Type: javax.xml.ws.Holder<br>
    *   billing_work_phone - Type: javax.xml.ws.Holder<br>
    *   billing_work_phone_extension - Type: javax.xml.ws.Holder<br>
    *   billing_work_phone_npa - Type: javax.xml.ws.Holder<br>
    *   billing_work_phone_nxx - Type: javax.xml.ws.Holder<br>
    *   billing_work_phone_suffix - Type: javax.xml.ws.Holder<br>
    *   balance - Type: javax.xml.ws.Holder<br>
    *   acct_create_client_receipt_id - Type: javax.xml.ws.Holder<br>
    *   plan_client_receipt_id - Type: javax.xml.ws.Holder<br>
    *   status_client_receipt_id - Type: javax.xml.ws.Holder<br>
    *   taxpayer_id - Type: javax.xml.ws.Holder<br>
    *   alt_msg_template_no - Type: javax.xml.ws.Holder<br>
    *   seq_func_group_no - Type: javax.xml.ws.Holder<br>
    *   promo_cd - Type: javax.xml.ws.Holder<br>
    *   address3 - Type: javax.xml.ws.Holder<br>
    *   billing_address3 - Type: javax.xml.ws.Holder<br>
    *   address_verification_code - Type: javax.xml.ws.Holder<br>
    *   address_match_score - Type: javax.xml.ws.Holder<br>
    *   billing_address_verification_code - Type: javax.xml.ws.Holder<br>
    *   billing_address_match_score - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctDetailsAll(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctDetailsAll(Map<String,Object> map);

    /**
    * getChildAccts
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param parent_acct_no - Type: Long
    * @param do_multi_level - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   child_accts - Type: ArrayList&#60;ChildAcctsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getChildAccts(Long client_no, java.lang.String auth_key, Long parent_acct_no, java.lang.String do_multi_level);

    abstract Map<String,Object> getChildAccts(Map<String,Object> map);

    /**
    * getFamilyTransHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param parent_acct_no - Type: Long
    * @param do_multi_level - Type: java.lang.String
    * @param trans_type - Type: Long
    * @param start_date - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @param record_limit - Type: Long
    * @param include_void_transactions - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   fam_trans - Type: ArrayList&#60;FamTransReturnElement&#62;<br>
    */
    abstract Map<String,Object> getFamilyTransHistory(Long client_no, java.lang.String auth_key, Long parent_acct_no, java.lang.String do_multi_level, Long trans_type, java.lang.String start_date, java.lang.String end_date, Long record_limit, java.lang.String include_void_transactions);

    abstract Map<String,Object> getFamilyTransHistory(Map<String,Object> map);

    /**
    * updateExistingBillingInfo
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param seq_no - Type: Long
    * @param address1 - Type: java.lang.String
    * @param address2 - Type: java.lang.String
    * @param city - Type: java.lang.String
    * @param state - Type: java.lang.String
    * @param zip - Type: java.lang.String
    * @param country - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param phone_npa - Type: Long
    * @param phone_nxx - Type: Long
    * @param phone_suffix - Type: java.lang.String
    * @param phone_ext - Type: java.lang.String
    * @param phone_country_cd - Type: java.lang.String
    * @param intl_phone - Type: java.lang.String
    * @param email - Type: java.lang.String
    * @param locality - Type: java.lang.String
    * @param cell_phone_npa - Type: Long
    * @param cell_phone_nxx - Type: Long
    * @param cell_phone_suffix - Type: java.lang.String
    * @param work_phone_npa - Type: Long
    * @param work_phone_nxx - Type: Long
    * @param work_phone_suffix - Type: java.lang.String
    * @param work_phone_ext - Type: java.lang.String
    * @param do_collect - Type: java.lang.String
    * @param change_status_after_coll - Type: java.lang.String
    * @param reset_dates_after_status - Type: java.lang.String
    * @param address3 - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> updateExistingBillingInfo(Long client_no, java.lang.String auth_key, Long acct_no, Long seq_no, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String country, Long cc_expire_mm, Long cc_expire_yyyy, Long phone_npa, Long phone_nxx, java.lang.String phone_suffix, java.lang.String phone_ext, java.lang.String phone_country_cd, java.lang.String intl_phone, java.lang.String email, java.lang.String locality, Long cell_phone_npa, Long cell_phone_nxx, java.lang.String cell_phone_suffix, Long work_phone_npa, Long work_phone_nxx, java.lang.String work_phone_suffix, java.lang.String work_phone_ext, java.lang.String do_collect, java.lang.String change_status_after_coll, java.lang.String reset_dates_after_status, java.lang.String address3);

    abstract Map<String,Object> updateExistingBillingInfo(Map<String,Object> map);

    /**
    * sendAcctEmail
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param user_id - Type: java.lang.String
    * @param template_class - Type: java.lang.String
    * @param template_no - Type: Long
    * @param client_receipt_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> sendAcctEmail(Long client_no, java.lang.String auth_key, java.lang.String user_id, java.lang.String template_class, Long template_no, java.lang.String client_receipt_id);

    abstract Map<String,Object> sendAcctEmail(Map<String,Object> map);

    /**
    * useridExists
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param user_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> useridExists(Long client_no, java.lang.String auth_key, java.lang.String user_id);

    abstract Map<String,Object> useridExists(Map<String,Object> map);

    /**
    * useridIsAvailable
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param user_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> useridIsAvailable(Long client_no, java.lang.String auth_key, java.lang.String user_id);

    abstract Map<String,Object> useridIsAvailable(Map<String,Object> map);

    /**
    * getStandingUsage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   su - Type: ArrayList&#60;SuReturnElement&#62;<br>
    */
    abstract Map<String,Object> getStandingUsage(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getStandingUsage(Map<String,Object> map);

    /**
    * recordStandingUsage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param usage_type - Type: Long
    * @param usage_units - Type: java.lang.Double
    * @param next_usage_date - Type: java.lang.String
    * @param alt_desc - Type: java.lang.String
    * @param plan_no - Type: Long
    * @param first_usage_date - Type: java.lang.String
    * @param recurring_ind - Type: java.lang.String
    * @param usage_type_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> recordStandingUsage(Long client_no, java.lang.String auth_key, Long acct_no, Long usage_type, java.lang.Double usage_units, java.lang.String next_usage_date, java.lang.String alt_desc, Long plan_no, java.lang.String first_usage_date, java.lang.String recurring_ind, java.lang.String usage_type_code);

    abstract Map<String,Object> recordStandingUsage(Map<String,Object> map);

    /**
    * disableStandingUsage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param standing_usage_rec_no - Type: Long
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> disableStandingUsage(Long client_no, java.lang.String auth_key, Long acct_no, Long standing_usage_rec_no, java.lang.String comments);

    abstract Map<String,Object> disableStandingUsage(Map<String,Object> map);

    /**
    * disableStandingUsageByPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param plan_no - Type: Long
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> disableStandingUsageByPlan(Long client_no, java.lang.String auth_key, Long acct_no, Long plan_no, java.lang.String comments);

    abstract Map<String,Object> disableStandingUsageByPlan(Map<String,Object> map);

    /**
    * disableAllStandingUsage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> disableAllStandingUsage(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String comments);

    abstract Map<String,Object> disableAllStandingUsage(Map<String,Object> map);

    /**
    * getAcctPlans
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_plans - Type: ArrayList&#60;AcctPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctPlans(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctPlans(Map<String,Object> map);

    /**
    * getAcctPlansAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_acct_plans - Type: ArrayList&#60;AllAcctPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctPlansAll(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctPlansAll(Map<String,Object> map);

    /**
    * getAcctSuppFields
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   supp_fields - Type: ArrayList&#60;SuppFieldsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctSuppFields(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctSuppFields(Map<String,Object> map);

    /**
    * getSuppFieldValues
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param field_name - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   supp_field_values - Type: ArrayList&#60;SuppFieldValuesReturnElement&#62;<br>
    */
    abstract Map<String,Object> getSuppFieldValues(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String field_name);

    abstract Map<String,Object> getSuppFieldValues(Map<String,Object> map);

    /**
    * getSuppPlansByPromoCode
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param promo_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   plans - Type: ArrayList&#60;PlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getSuppPlansByPromoCode(Long client_no, java.lang.String auth_key, java.lang.String promo_code);

    abstract Map<String,Object> getSuppPlansByPromoCode(Map<String,Object> map);

    /**
    * getSuppPlansByPromoCodeAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param promo_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_plans - Type: ArrayList&#60;AllPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getSuppPlansByPromoCodeAll(Long client_no, java.lang.String auth_key, java.lang.String promo_code);

    abstract Map<String,Object> getSuppPlansByPromoCodeAll(Map<String,Object> map);

    /**
    * assignSuppPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param supp_plan_no - Type: Long
    * @param alt_rate_schedule_no - Type: Long
    * @param num_plan_units - Type: Long
    * @param coupon_code - Type: java.lang.String
    * @param assignment_directive - Type: Long
    * @param comments - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param contract_type_no - Type: Long
    * @param contract_alt_recur_fee - Type: java.lang.Double
    * @param contract_length_months - Type: Long
    * @param contract_cancel_fee - Type: java.lang.Double
    * @param contract_comments - Type: java.lang.String
    * @param contract_start_date - Type: java.lang.String
    * @param offset_months - Type: Long
    * @param auto_offset_months_option - Type: Long
    * @param alt_proration_start_date - Type: java.lang.String
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param new_acct_custom_rates - Type: com.aria.common.shared.NewAcctCustomRatesArray
    * @param effective_date - Type: java.lang.String
    * @param offset_interval - Type: Long
    * @param contract_end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proration_result_amount - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   supp_plan_line_items - Type: ArrayList&#60;SuppPlanLineItemsReturnElement&#62;<br>
    *   total_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   total_tax_charges - Type: javax.xml.ws.Holder<br>
    *   total_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   total_credit - Type: javax.xml.ws.Holder<br>
    *   total_tax_credit - Type: javax.xml.ws.Holder<br>
    *   total_credit_before_tax - Type: javax.xml.ws.Holder<br>
    *   total - Type: javax.xml.ws.Holder<br>
    *   expectd_activation_fee - Type: javax.xml.ws.Holder<br>
    *   expectd_mthly_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   expectd_annu_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> assignSuppPlan(Long client_no, java.lang.String auth_key, Long acct_no, Long supp_plan_no, Long alt_rate_schedule_no, Long num_plan_units, java.lang.String coupon_code, Long assignment_directive, java.lang.String comments, java.lang.String do_write, java.lang.String client_receipt_id, Long contract_type_no, java.lang.Double contract_alt_recur_fee, Long contract_length_months, java.lang.Double contract_cancel_fee, java.lang.String contract_comments, java.lang.String contract_start_date, Long offset_months, Long auto_offset_months_option, java.lang.String alt_proration_start_date, java.lang.String alt_client_acct_group_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, java.lang.String effective_date, Long offset_interval, java.lang.String contract_end_date);

    abstract Map<String,Object> assignSuppPlan(Map<String,Object> map);

    /**
    * cancelSuppPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param supp_plan_no - Type: Long
    * @param assignment_directive - Type: Long
    * @param comments - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param alt_proration_start_date - Type: java.lang.String
    * @param effective_date - Type: java.lang.String
    * @param offset_interval - Type: Long
    * @param invoice_unbilled_usage - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proration_result_amount - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   supp_plan_line_items - Type: ArrayList&#60;SuppPlanLineItemsReturnElement&#62;<br>
    *   total_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   total_tax_charges - Type: javax.xml.ws.Holder<br>
    *   total_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   total_credit - Type: javax.xml.ws.Holder<br>
    *   total_tax_credit - Type: javax.xml.ws.Holder<br>
    *   total_credit_before_tax - Type: javax.xml.ws.Holder<br>
    *   total - Type: javax.xml.ws.Holder<br>
    *   proration_credit_result_amount - Type: javax.xml.ws.Holder<br>
    *   proration_credit_amount - Type: javax.xml.ws.Holder<br>
    *   proration_tax_amount - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> cancelSuppPlan(Long client_no, java.lang.String auth_key, Long acct_no, Long supp_plan_no, Long assignment_directive, java.lang.String comments, java.lang.String do_write, java.lang.String client_receipt_id, java.lang.String alt_proration_start_date, java.lang.String effective_date, Long offset_interval, java.lang.String invoice_unbilled_usage);

    abstract Map<String,Object> cancelSuppPlan(Map<String,Object> map);

    /**
    * modifySuppPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param supp_plan_no - Type: Long
    * @param alt_rate_schedule_no - Type: Long
    * @param num_plan_units - Type: Long
    * @param coupon_code - Type: java.lang.String
    * @param assignment_directive - Type: Long
    * @param comments - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param new_acct_custom_rates - Type: com.aria.common.shared.NewAcctCustomRatesArray
    * @param effective_date - Type: java.lang.String
    * @param offset_interval - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proration_result_amount - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   supp_plan_line_items - Type: ArrayList&#60;SuppPlanLineItemsReturnElement&#62;<br>
    *   total_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   total_tax_charges - Type: javax.xml.ws.Holder<br>
    *   total_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   total_credit - Type: javax.xml.ws.Holder<br>
    *   total_tax_credit - Type: javax.xml.ws.Holder<br>
    *   total_credit_before_tax - Type: javax.xml.ws.Holder<br>
    *   total - Type: javax.xml.ws.Holder<br>
    *   proration_credit_result_amount - Type: javax.xml.ws.Holder<br>
    *   proration_credit_amount - Type: javax.xml.ws.Holder<br>
    *   proration_tax_amount - Type: javax.xml.ws.Holder<br>
    *   expectd_activation_fee - Type: javax.xml.ws.Holder<br>
    *   expectd_mthly_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   expectd_annu_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> modifySuppPlan(Long client_no, java.lang.String auth_key, Long acct_no, Long supp_plan_no, Long alt_rate_schedule_no, Long num_plan_units, java.lang.String coupon_code, Long assignment_directive, java.lang.String comments, java.lang.String do_write, java.lang.String client_receipt_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, java.lang.String effective_date, Long offset_interval);

    abstract Map<String,Object> modifySuppPlan(Map<String,Object> map);

    /**
    * replaceSuppPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param existing_supp_plan_no - Type: Long
    * @param new_supp_plan_no - Type: Long
    * @param alt_rate_schedule_no - Type: Long
    * @param num_plan_units - Type: Long
    * @param coupon_code - Type: java.lang.String
    * @param assignment_directive - Type: Long
    * @param comments - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param offset_months - Type: Long
    * @param auto_offset_months_option - Type: Long
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param new_acct_custom_rates - Type: com.aria.common.shared.NewAcctCustomRatesArray
    * @param effective_date - Type: java.lang.String
    * @param offset_interval - Type: Long
    * @param invoice_unbilled_usage - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proration_result_amount - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   supp_plan_line_items - Type: ArrayList&#60;SuppPlanLineItemsReturnElement&#62;<br>
    *   total_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   total_tax_charges - Type: javax.xml.ws.Holder<br>
    *   total_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   total_credit - Type: javax.xml.ws.Holder<br>
    *   total_tax_credit - Type: javax.xml.ws.Holder<br>
    *   total_credit_before_tax - Type: javax.xml.ws.Holder<br>
    *   total - Type: javax.xml.ws.Holder<br>
    *   proration_credit_result_amount - Type: javax.xml.ws.Holder<br>
    *   proration_credit_amount - Type: javax.xml.ws.Holder<br>
    *   proration_tax_amount - Type: javax.xml.ws.Holder<br>
    *   expectd_activation_fee - Type: javax.xml.ws.Holder<br>
    *   expectd_mthly_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   expectd_annu_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> replaceSuppPlan(Long client_no, java.lang.String auth_key, Long acct_no, Long existing_supp_plan_no, Long new_supp_plan_no, Long alt_rate_schedule_no, Long num_plan_units, java.lang.String coupon_code, Long assignment_directive, java.lang.String comments, java.lang.String do_write, java.lang.String client_receipt_id, Long offset_months, Long auto_offset_months_option, java.lang.String alt_client_acct_group_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, java.lang.String effective_date, Long offset_interval, java.lang.String invoice_unbilled_usage);

    abstract Map<String,Object> replaceSuppPlan(Map<String,Object> map);

    /**
    * getAvailChildPlansForPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param in_plan_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   plans - Type: ArrayList&#60;PlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAvailChildPlansForPlan(Long client_no, java.lang.String auth_key, Long in_plan_no);

    abstract Map<String,Object> getAvailChildPlansForPlan(Map<String,Object> map);

    /**
    * getAvailChildPlansForPlanAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param in_plan_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_plans - Type: ArrayList&#60;AllPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAvailChildPlansForPlanAll(Long client_no, java.lang.String auth_key, Long in_plan_no);

    abstract Map<String,Object> getAvailChildPlansForPlanAll(Map<String,Object> map);

    /**
    * getAvailChildPlansForAcct
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   plans - Type: ArrayList&#60;PlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAvailChildPlansForAcct(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAvailChildPlansForAcct(Map<String,Object> map);

    /**
    * getAvailChildPlansForAcctAll
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_plans - Type: ArrayList&#60;AllPlansReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAvailChildPlansForAcctAll(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAvailChildPlansForAcctAll(Map<String,Object> map);

    /**
    * getAcctGroupsByClient
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_groups - Type: ArrayList&#60;AcctGroupsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctGroupsByClient(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getAcctGroupsByClient(Map<String,Object> map);

    /**
    * getAcctGroupsByAcct
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param user_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_groups - Type: ArrayList&#60;AcctGroupsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctGroupsByAcct(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String user_id);

    abstract Map<String,Object> getAcctGroupsByAcct(Map<String,Object> map);

    /**
    * assignFunctionalAcctGroup
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param group_no - Type: Long
    * @param client_acct_group_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> assignFunctionalAcctGroup(Long client_no, java.lang.String auth_key, Long acct_no, Long group_no, java.lang.String client_acct_group_id);

    abstract Map<String,Object> assignFunctionalAcctGroup(Map<String,Object> map);

    /**
    * assignCollectionsAcctGroup
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param group_no - Type: Long
    * @param client_acct_group_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> assignCollectionsAcctGroup(Long client_no, java.lang.String auth_key, Long acct_no, Long group_no, java.lang.String client_acct_group_id);

    abstract Map<String,Object> assignCollectionsAcctGroup(Map<String,Object> map);

    /**
    * removeAcctFromGroup
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param group_no - Type: Long
    * @param client_acct_group_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> removeAcctFromGroup(Long client_no, java.lang.String auth_key, Long acct_no, Long group_no, java.lang.String client_acct_group_id);

    abstract Map<String,Object> removeAcctFromGroup(Map<String,Object> map);

    /**
    * createAcctComplete
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param master_plan_no - Type: Long
    * @param alt_start_date - Type: java.lang.String
    * @param client_acct_id - Type: java.lang.String
    * @param userid - Type: java.lang.String
    * @param status_cd - Type: Long
    * @param master_plan_units - Type: Long
    * @param supp_plans - Type: com.aria.common.shared.SuppPlansArray
    * @param supp_plan_units - Type: com.aria.common.shared.SuppPlanUnitsArray
    * @param notify_method - Type: Long
    * @param promo_cd - Type: java.lang.String
    * @param password - Type: java.lang.String
    * @param secret_question - Type: java.lang.String
    * @param secret_question_answer - Type: java.lang.String
    * @param first_name - Type: java.lang.String
    * @param mi - Type: java.lang.String
    * @param last_name - Type: java.lang.String
    * @param company_name - Type: java.lang.String
    * @param address1 - Type: java.lang.String
    * @param address2 - Type: java.lang.String
    * @param city - Type: java.lang.String
    * @param locality - Type: java.lang.String
    * @param state_prov - Type: java.lang.String
    * @param country - Type: java.lang.String
    * @param postal_cd - Type: java.lang.String
    * @param phone - Type: java.lang.String
    * @param phone_ext - Type: java.lang.String
    * @param cell_phone - Type: java.lang.String
    * @param work_phone - Type: java.lang.String
    * @param work_phone_ext - Type: java.lang.String
    * @param email - Type: java.lang.String
    * @param birthdate - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_mi - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_company_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_postal_cd - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_ext - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_ext - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_acct_no - Type: java.lang.String
    * @param bank_routing_no - Type: java.lang.String
    * @param resp_level_cd - Type: Long
    * @param senior_acct_no - Type: Long
    * @param functional_acct_groups - Type: com.aria.common.shared.FunctionalAcctGroupsArray
    * @param collections_acct_groups - Type: com.aria.common.shared.CollectionsAcctGroupsArray
    * @param supp_field_names - Type: com.aria.common.shared.SuppFieldNamesArray
    * @param supp_field_values - Type: com.aria.common.shared.SuppFieldValuesArray
    * @param test_acct_ind - Type: Long
    * @param status_until_alt_start - Type: Long
    * @param balance_forward - Type: java.lang.Double
    * @param alt_bill_day - Type: Long
    * @param do_full_invoicing - Type: java.lang.String
    * @param do_prorated_invoicing - Type: java.lang.String
    * @param master_plan_alt_rate_sched_no - Type: Long
    * @param supp_plan_alt_rate_sched_no - Type: com.aria.common.shared.SuppPlanAltRateSchedNoArray
    * @param client_receipt_id - Type: java.lang.String
    * @param currency_cd - Type: java.lang.String
    * @param cvv - Type: java.lang.String
    * @param taxpayer_id - Type: java.lang.String
    * @param bill_agreement_id - Type: java.lang.String
    * @param retroactive_start_date - Type: java.lang.String
    * @param coupon_codes - Type: com.aria.common.shared.CouponCodesArray
    * @param new_acct_custom_rates - Type: com.aria.common.shared.NewAcctCustomRatesArray
    * @param alt_msg_template_no - Type: Long
    * @param seq_func_group_no - Type: Long
    * @param new_acct_plan_contracts - Type: com.aria.common.shared.NewAcctPlanContractsArray
    * @param address3 - Type: java.lang.String
    * @param bill_address3 - Type: java.lang.String
    * @param usage_accumulation_config - Type: com.aria.common.shared.UsageAccumulationConfigArray
    * @param enable_usage_pooling_plan_no - Type: com.aria.common.shared.EnableUsagePoolingPlanNoArray
    * @param client_func_acct_group_ids - Type: com.aria.common.shared.ClientFuncAcctGroupIdsArray
    * @param client_coll_acct_group_ids - Type: com.aria.common.shared.ClientCollAcctGroupIdsArray
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param tax_exemption_level - Type: Long
    * @param cn_alt_msg_template_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_no - Type: javax.xml.ws.Holder<br>
    *   out_userid - Type: javax.xml.ws.Holder<br>
    *   invoicing_error_code - Type: javax.xml.ws.Holder<br>
    *   invoicing_error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   out_new_acct_plan_contracts - Type: ArrayList&#60;OutNewAcctPlanContractsReturnElement&#62;<br>
    *   invoice_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   invoice_tax_charges - Type: javax.xml.ws.Holder<br>
    *   invoice_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   invoice_credit_amount - Type: javax.xml.ws.Holder<br>
    *   invoice_total_amount - Type: javax.xml.ws.Holder<br>
    *   new_acct_invoice_line_items - Type: ArrayList&#60;NewAcctInvoiceLineItemsReturnElement&#62;<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> createAcctComplete(Long client_no, java.lang.String auth_key, Long master_plan_no, java.lang.String alt_start_date, java.lang.String client_acct_id, java.lang.String userid, Long status_cd, Long master_plan_units, com.aria.common.shared.SuppPlansArray supp_plans, com.aria.common.shared.SuppPlanUnitsArray supp_plan_units, Long notify_method, java.lang.String promo_cd, java.lang.String password, java.lang.String secret_question, java.lang.String secret_question_answer, java.lang.String first_name, java.lang.String mi, java.lang.String last_name, java.lang.String company_name, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String locality, java.lang.String state_prov, java.lang.String country, java.lang.String postal_cd, java.lang.String phone, java.lang.String phone_ext, java.lang.String cell_phone, java.lang.String work_phone, java.lang.String work_phone_ext, java.lang.String email, java.lang.String birthdate, java.lang.String bill_first_name, java.lang.String bill_mi, java.lang.String bill_last_name, java.lang.String bill_company_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_country, java.lang.String bill_postal_cd, java.lang.String bill_phone, java.lang.String bill_phone_ext, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_ext, java.lang.String bill_email, Long pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_acct_no, java.lang.String bank_routing_no, Long resp_level_cd, Long senior_acct_no, com.aria.common.shared.FunctionalAcctGroupsArray functional_acct_groups, com.aria.common.shared.CollectionsAcctGroupsArray collections_acct_groups, com.aria.common.shared.SuppFieldNamesArray supp_field_names, com.aria.common.shared.SuppFieldValuesArray supp_field_values, Long test_acct_ind, Long status_until_alt_start, java.lang.Double balance_forward, Long alt_bill_day, java.lang.String do_full_invoicing, java.lang.String do_prorated_invoicing, Long master_plan_alt_rate_sched_no, com.aria.common.shared.SuppPlanAltRateSchedNoArray supp_plan_alt_rate_sched_no, java.lang.String client_receipt_id, java.lang.String currency_cd, java.lang.String cvv, java.lang.String taxpayer_id, java.lang.String bill_agreement_id, java.lang.String retroactive_start_date, com.aria.common.shared.CouponCodesArray coupon_codes, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, Long alt_msg_template_no, Long seq_func_group_no, com.aria.common.shared.NewAcctPlanContractsArray new_acct_plan_contracts, java.lang.String address3, java.lang.String bill_address3, com.aria.common.shared.UsageAccumulationConfigArray usage_accumulation_config, com.aria.common.shared.EnableUsagePoolingPlanNoArray enable_usage_pooling_plan_no, com.aria.common.shared.ClientFuncAcctGroupIdsArray client_func_acct_group_ids, com.aria.common.shared.ClientCollAcctGroupIdsArray client_coll_acct_group_ids, java.lang.String track_data1, java.lang.String track_data2, java.lang.String do_write, Long tax_exemption_level, Long cn_alt_msg_template_no);

    abstract Map<String,Object> createAcctComplete(Map<String,Object> map);

    /**
    * applyCouponToAcct
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param coupon_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   user_success_msg - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> applyCouponToAcct(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String coupon_code);

    abstract Map<String,Object> applyCouponToAcct(Map<String,Object> map);

    /**
    * createAdvancedServiceCredit
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param amount - Type: java.lang.Double
    * @param reason_code - Type: Long
    * @param comments - Type: java.lang.String
    * @param eligible_plan_no - Type: Long
    * @param eligible_service_no - Type: Long
    * @param alt_service_no_to_apply - Type: Long
    * @param frequency_no - Type: Long
    * @param frequency_interval_months - Type: Long
    * @param initial_credit_date - Type: java.lang.String
    * @param percent_amount - Type: java.lang.Double
    * @param percent_eval_plan_no - Type: Long
    * @param percent_eval_service_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> createAdvancedServiceCredit(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.Double amount, Long reason_code, java.lang.String comments, Long eligible_plan_no, Long eligible_service_no, Long alt_service_no_to_apply, Long frequency_no, Long frequency_interval_months, java.lang.String initial_credit_date, java.lang.Double percent_amount, Long percent_eval_plan_no, Long percent_eval_service_no);

    abstract Map<String,Object> createAdvancedServiceCredit(Map<String,Object> map);

    /**
    * getAcctNoFromUserId
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param user_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctNoFromUserId(Long client_no, java.lang.String auth_key, java.lang.String user_id);

    abstract Map<String,Object> getAcctNoFromUserId(Map<String,Object> map);

    /**
    * getUserIdFromAcctNo
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   user_id - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getUserIdFromAcctNo(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getUserIdFromAcctNo(Map<String,Object> map);

    /**
    * getAcctPlanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param plan_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_plan_contract - Type: ArrayList&#60;AcctPlanContractReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctPlanContract(Long client_no, java.lang.String auth_key, Long acct_no, Long plan_no);

    abstract Map<String,Object> getAcctPlanContract(Map<String,Object> map);

    /**
    * createAcctPlanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param plan_no - Type: Long
    * @param type_no - Type: Long
    * @param alt_recur_fee - Type: java.lang.Double
    * @param length_months - Type: Long
    * @param cancel_fee - Type: java.lang.Double
    * @param create_comments - Type: java.lang.String
    * @param start_date - Type: java.lang.String
    * @param do_auto_discard - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   contract_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> createAcctPlanContract(Long client_no, java.lang.String auth_key, Long acct_no, Long plan_no, Long type_no, java.lang.Double alt_recur_fee, Long length_months, java.lang.Double cancel_fee, java.lang.String create_comments, java.lang.String start_date, java.lang.String do_auto_discard, java.lang.String end_date);

    abstract Map<String,Object> createAcctPlanContract(Map<String,Object> map);

    /**
    * modifyAcctPlanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param contract_no - Type: Long
    * @param type_no - Type: Long
    * @param alt_recur_fee - Type: java.lang.Double
    * @param length_months - Type: Long
    * @param cancel_fee - Type: java.lang.Double
    * @param start_date - Type: java.lang.String
    * @param update_comments - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> modifyAcctPlanContract(Long client_no, java.lang.String auth_key, Long acct_no, Long contract_no, Long type_no, java.lang.Double alt_recur_fee, Long length_months, java.lang.Double cancel_fee, java.lang.String start_date, java.lang.String update_comments, java.lang.String end_date);

    abstract Map<String,Object> modifyAcctPlanContract(Map<String,Object> map);

    /**
    * cancelAcctPlanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param contract_no - Type: Long
    * @param update_comments - Type: java.lang.String
    * @param close_status - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelAcctPlanContract(Long client_no, java.lang.String auth_key, Long acct_no, Long contract_no, java.lang.String update_comments, Long close_status);

    abstract Map<String,Object> cancelAcctPlanContract(Map<String,Object> map);

    /**
    * getUsageHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param specified_usage_type_no - Type: Long
    * @param date_range_start - Type: java.lang.String
    * @param date_range_end - Type: java.lang.String
    * @param specified_usage_type_code - Type: java.lang.String
    * @param usage_qualifier_1 - Type: com.aria.common.shared.UsageQualifier1Array
    * @param usage_qualifier_2 - Type: com.aria.common.shared.UsageQualifier2Array
    * @param usage_qualifier_3 - Type: com.aria.common.shared.UsageQualifier3Array
    * @param usage_qualifier_4 - Type: com.aria.common.shared.UsageQualifier4Array
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   usage_history_records - Type: ArrayList&#60;UsageHistoryRecordsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getUsageHistory(Long client_no, java.lang.String auth_key, Long acct_no, Long specified_usage_type_no, java.lang.String date_range_start, java.lang.String date_range_end, java.lang.String specified_usage_type_code, com.aria.common.shared.UsageQualifier1Array usage_qualifier_1, com.aria.common.shared.UsageQualifier2Array usage_qualifier_2, com.aria.common.shared.UsageQualifier3Array usage_qualifier_3, com.aria.common.shared.UsageQualifier4Array usage_qualifier_4);

    abstract Map<String,Object> getUsageHistory(Map<String,Object> map);

    /**
    * getAcctMessage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param message_id - Type: Long
    * @param acct_no - Type: Long
    * @param do_encoding - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   message_body - Type: javax.xml.ws.Holder<br>
    *   mime_type - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctMessage(Long client_no, java.lang.String auth_key, Long message_id, Long acct_no, java.lang.String do_encoding);

    abstract Map<String,Object> getAcctMessage(Map<String,Object> map);

    /**
    * getAcctMessageSize
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param message_id - Type: Long
    * @param acct_no - Type: Long
    * @param do_encoding - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   num_chars - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctMessageSize(Long client_no, java.lang.String auth_key, Long message_id, Long acct_no, java.lang.String do_encoding);

    abstract Map<String,Object> getAcctMessageSize(Map<String,Object> map);

    /**
    * updateMasterPlan
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param master_plan_no - Type: Long
    * @param alt_rate_schedule_no - Type: Long
    * @param num_plan_units - Type: Long
    * @param assignment_directive - Type: Long
    * @param do_write - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param force_currency_change - Type: java.lang.String
    * @param auto_cancel_supp_plans - Type: java.lang.String
    * @param offset_months - Type: Long
    * @param alt_proration_start_date - Type: java.lang.String
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param new_acct_custom_rates - Type: com.aria.common.shared.NewAcctCustomRatesArray
    * @param effective_date - Type: java.lang.String
    * @param offset_interval - Type: Long
    * @param invoice_unbilled_usage - Type: java.lang.String
    * @param coupon_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proration_result_amount - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   statement_error_code - Type: javax.xml.ws.Holder<br>
    *   statement_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   cancelled_supp_plans - Type: ArrayList&#60;CancelledSuppPlansReturnElement&#62;<br>
    *   expectd_activation_fee - Type: javax.xml.ws.Holder<br>
    *   expectd_mthly_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   expectd_annu_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   upd_acct_invoice_line_items - Type: ArrayList&#60;UpdAcctInvoiceLineItemsReturnElement&#62;<br>
    *   total_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   total_tax_charges - Type: javax.xml.ws.Holder<br>
    *   total_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   total_credit - Type: javax.xml.ws.Holder<br>
    *   total_tax_credit - Type: javax.xml.ws.Holder<br>
    *   total_credit_before_tax - Type: javax.xml.ws.Holder<br>
    *   total - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> updateMasterPlan(Long client_no, java.lang.String auth_key, Long acct_no, Long master_plan_no, Long alt_rate_schedule_no, Long num_plan_units, Long assignment_directive, java.lang.String do_write, java.lang.String client_receipt_id, java.lang.String force_currency_change, java.lang.String auto_cancel_supp_plans, Long offset_months, java.lang.String alt_proration_start_date, java.lang.String alt_client_acct_group_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, java.lang.String effective_date, Long offset_interval, java.lang.String invoice_unbilled_usage, java.lang.String coupon_code);

    abstract Map<String,Object> updateMasterPlan(Map<String,Object> map);

    /**
    * updateAcctComplete
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param first_name - Type: java.lang.String
    * @param last_name - Type: java.lang.String
    * @param middle_initial - Type: java.lang.String
    * @param company_name - Type: java.lang.String
    * @param address1 - Type: java.lang.String
    * @param address2 - Type: java.lang.String
    * @param city - Type: java.lang.String
    * @param locality - Type: java.lang.String
    * @param state_prov - Type: java.lang.String
    * @param country - Type: java.lang.String
    * @param postal_cd - Type: java.lang.String
    * @param phone - Type: java.lang.String
    * @param phone_ext - Type: java.lang.String
    * @param cell_phone - Type: java.lang.String
    * @param work_phone - Type: java.lang.String
    * @param work_phone_ext - Type: java.lang.String
    * @param email - Type: java.lang.String
    * @param birthdate - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_middle_initial - Type: java.lang.String
    * @param bill_company_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_postal_cd - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_ext - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_ext - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param master_plan_no - Type: Long
    * @param master_plan_alt_rate_sched_no - Type: Long
    * @param master_plan_units - Type: Long
    * @param master_plan_assign_directive - Type: Long
    * @param update_acct_supp_field - Type: com.aria.common.shared.UpdateAcctSuppFieldArray
    * @param update_acct_func_group - Type: com.aria.common.shared.UpdateAcctFuncGroupArray
    * @param update_acct_coll_group - Type: com.aria.common.shared.UpdateAcctCollGroupArray
    * @param status_cd - Type: Long
    * @param notify_method - Type: Long
    * @param password - Type: java.lang.String
    * @param secret_question - Type: java.lang.String
    * @param secret_question_answer - Type: java.lang.String
    * @param pin - Type: java.lang.String
    * @param test_acct_ind - Type: Long
    * @param resp_level_cd - Type: Long
    * @param senior_acct_no - Type: Long
    * @param client_acct_id - Type: java.lang.String
    * @param do_collect - Type: java.lang.String
    * @param change_status_after_coll - Type: java.lang.String
    * @param reset_dates_after_status - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param alt_do_dunning - Type: java.lang.String
    * @param force_currency_change - Type: java.lang.String
    * @param cvv - Type: java.lang.String
    * @param taxpayer_id - Type: java.lang.String
    * @param bill_agreement_id - Type: java.lang.String
    * @param auto_cancel_supp_plans - Type: java.lang.String
    * @param offset_months - Type: Long
    * @param alt_proration_start_date - Type: java.lang.String
    * @param alt_msg_template_no - Type: Long
    * @param seq_func_group_no - Type: Long
    * @param address3 - Type: java.lang.String
    * @param bill_address3 - Type: java.lang.String
    * @param usage_accumulation_config - Type: com.aria.common.shared.UsageAccumulationConfigArray
    * @param enable_usage_pooling_plan_no - Type: com.aria.common.shared.EnableUsagePoolingPlanNoArray
    * @param disable_usage_pooling_plan_no - Type: com.aria.common.shared.DisableUsagePoolingPlanNoArray
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @param offset_interval - Type: Long
    * @param tax_exemption_level - Type: Long
    * @param cn_alt_msg_template_no - Type: Long
    * @param promo_cd - Type: java.lang.String
    * @param invoice_unbilled_usage - Type: java.lang.String
    * @param coupon_code - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proration_result_amount - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   parent_child_sync_error_code - Type: javax.xml.ws.Holder<br>
    *   parent_child_sync_error_msg - Type: javax.xml.ws.Holder<br>
    *   master_plan_error_code - Type: javax.xml.ws.Holder<br>
    *   master_plan_error_msg - Type: javax.xml.ws.Holder<br>
    *   master_plan_coll_error_code - Type: javax.xml.ws.Holder<br>
    *   master_plan_coll_error_msg - Type: javax.xml.ws.Holder<br>
    *   master_plan_stmt_error_code - Type: javax.xml.ws.Holder<br>
    *   master_plan_stmt_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   cancelled_supp_plans - Type: ArrayList&#60;CancelledSuppPlansReturnElement&#62;<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> updateAcctComplete(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String first_name, java.lang.String last_name, java.lang.String middle_initial, java.lang.String company_name, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String locality, java.lang.String state_prov, java.lang.String country, java.lang.String postal_cd, java.lang.String phone, java.lang.String phone_ext, java.lang.String cell_phone, java.lang.String work_phone, java.lang.String work_phone_ext, java.lang.String email, java.lang.String birthdate, java.lang.String bill_first_name, java.lang.String bill_last_name, java.lang.String bill_middle_initial, java.lang.String bill_company_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_country, java.lang.String bill_postal_cd, java.lang.String bill_phone, java.lang.String bill_phone_ext, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_ext, java.lang.String bill_email, Long pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_routing_num, java.lang.String bank_acct_num, Long master_plan_no, Long master_plan_alt_rate_sched_no, Long master_plan_units, Long master_plan_assign_directive, com.aria.common.shared.UpdateAcctSuppFieldArray update_acct_supp_field, com.aria.common.shared.UpdateAcctFuncGroupArray update_acct_func_group, com.aria.common.shared.UpdateAcctCollGroupArray update_acct_coll_group, Long status_cd, Long notify_method, java.lang.String password, java.lang.String secret_question, java.lang.String secret_question_answer, java.lang.String pin, Long test_acct_ind, Long resp_level_cd, Long senior_acct_no, java.lang.String client_acct_id, java.lang.String do_collect, java.lang.String change_status_after_coll, java.lang.String reset_dates_after_status, java.lang.String client_receipt_id, java.lang.String alt_do_dunning, java.lang.String force_currency_change, java.lang.String cvv, java.lang.String taxpayer_id, java.lang.String bill_agreement_id, java.lang.String auto_cancel_supp_plans, Long offset_months, java.lang.String alt_proration_start_date, Long alt_msg_template_no, Long seq_func_group_no, java.lang.String address3, java.lang.String bill_address3, com.aria.common.shared.UsageAccumulationConfigArray usage_accumulation_config, com.aria.common.shared.EnableUsagePoolingPlanNoArray enable_usage_pooling_plan_no, com.aria.common.shared.DisableUsagePoolingPlanNoArray disable_usage_pooling_plan_no, java.lang.String alt_client_acct_group_id, java.lang.String track_data1, java.lang.String track_data2, Long offset_interval, Long tax_exemption_level, Long cn_alt_msg_template_no, java.lang.String promo_cd, java.lang.String invoice_unbilled_usage, java.lang.String coupon_code);

    abstract Map<String,Object> updateAcctComplete(Map<String,Object> map);

    /**
    * getAllAcctReceiptIds
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param start_date_range - Type: java.lang.String
    * @param end_date_range - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_receipt - Type: ArrayList&#60;AcctReceiptReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAllAcctReceiptIds(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String start_date_range, java.lang.String end_date_range);

    abstract Map<String,Object> getAllAcctReceiptIds(Map<String,Object> map);

    /**
    * sendArcThresholdEmail
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param resource_threshold_level - Type: Long
    * @param resource_balance - Type: Long
    * @param resource_name - Type: java.lang.String
    * @param resource_units_label - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> sendArcThresholdEmail(Long client_no, java.lang.String auth_key, Long acct_no, Long resource_threshold_level, Long resource_balance, java.lang.String resource_name, java.lang.String resource_units_label);

    abstract Map<String,Object> sendArcThresholdEmail(Map<String,Object> map);

    /**
    * setAcctTaxExemptStatus
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param exemption_level - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setAcctTaxExemptStatus(Long client_no, java.lang.String auth_key, Long acct_no, Long exemption_level);

    abstract Map<String,Object> setAcctTaxExemptStatus(Map<String,Object> map);

    /**
    * getAcctTaxExemptStatus
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   exemption_level - Type: javax.xml.ws.Holder<br>
    *   exemption_level_desc - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctTaxExemptStatus(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctTaxExemptStatus(Map<String,Object> map);

    /**
    * closeAcctInstallation
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param install_complete_ind - Type: java.lang.String
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> closeAcctInstallation(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String install_complete_ind, java.lang.String comments);

    abstract Map<String,Object> closeAcctInstallation(Map<String,Object> map);

    /**
    * getUnappliedServiceCredits
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   unapplied_service_credits - Type: ArrayList&#60;UnappliedServiceCreditsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getUnappliedServiceCredits(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getUnappliedServiceCredits(Map<String,Object> map);

    /**
    * getRecurringCreditInfo
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param filter_credit_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   recurring_credit_info - Type: ArrayList&#60;RecurringCreditInfoReturnElement&#62;<br>
    */
    abstract Map<String,Object> getRecurringCreditInfo(Long client_no, java.lang.String auth_key, Long acct_no, Long filter_credit_no);

    abstract Map<String,Object> getRecurringCreditInfo(Map<String,Object> map);

    /**
    * getPendingInvoiceNo
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getPendingInvoiceNo(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getPendingInvoiceNo(Map<String,Object> map);

    /**
    * removePayMethod
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> removePayMethod(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> removePayMethod(Map<String,Object> map);

    /**
    * assignCustomAcctRates
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param plan_no - Type: Long
    * @param service_no - Type: Long
    * @param custom_acct_rates - Type: com.aria.common.shared.CustomAcctRatesArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> assignCustomAcctRates(Long client_no, java.lang.String auth_key, Long acct_no, Long plan_no, Long service_no, com.aria.common.shared.CustomAcctRatesArray custom_acct_rates);

    abstract Map<String,Object> assignCustomAcctRates(Map<String,Object> map);

    /**
    * getAcctsWithExistingPayMethod
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param pay_method - Type: Long
    * @param form_payment_acct_id - Type: java.lang.String
    * @param bank_routing_num - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   accts_with_pay_method - Type: ArrayList&#60;AcctsWithPayMethodReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctsWithExistingPayMethod(Long client_no, java.lang.String auth_key, Long pay_method, java.lang.String form_payment_acct_id, java.lang.String bank_routing_num);

    abstract Map<String,Object> getAcctsWithExistingPayMethod(Map<String,Object> map);

    /**
    * adjustBillingDates
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param action_directive - Type: Long
    * @param adjustment_days - Type: Long
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> adjustBillingDates(Long client_no, java.lang.String auth_key, Long acct_no, Long action_directive, Long adjustment_days, java.lang.String comments);

    abstract Map<String,Object> adjustBillingDates(Map<String,Object> map);

    /**
    * writeAcctComment
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param comment - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> writeAcctComment(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String comment);

    abstract Map<String,Object> writeAcctComment(Map<String,Object> map);

    /**
    * getAcctComments
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param date_range_start - Type: java.lang.String
    * @param date_range_end - Type: java.lang.String
    * @param do_url_encoding - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_comments - Type: ArrayList&#60;AcctCommentsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctComments(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String date_range_start, java.lang.String date_range_end, java.lang.String do_url_encoding);

    abstract Map<String,Object> getAcctComments(Map<String,Object> map);

    /**
    * modifyAcctSuppFields
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param acct_supp_fields - Type: com.aria.common.shared.AcctSuppFieldsArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> modifyAcctSuppFields(Long client_no, java.lang.String auth_key, Long acct_no, com.aria.common.shared.AcctSuppFieldsArray acct_supp_fields);

    abstract Map<String,Object> modifyAcctSuppFields(Map<String,Object> map);

    /**
    * removeCustomAcctRates
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param plan_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> removeCustomAcctRates(Long client_no, java.lang.String auth_key, Long acct_no, Long plan_no);

    abstract Map<String,Object> removeCustomAcctRates(Map<String,Object> map);

    /**
    * getAcctStatementHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param user_id - Type: java.lang.String
    * @param start_date - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   statement_history - Type: ArrayList&#60;StatementHistoryReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctStatementHistory(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String user_id, java.lang.String start_date, java.lang.String end_date);

    abstract Map<String,Object> getAcctStatementHistory(Map<String,Object> map);

    /**
    * getAcctInvoiceHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param user_id - Type: java.lang.String
    * @param start_bill_date - Type: java.lang.String
    * @param end_bill_date - Type: java.lang.String
    * @param include_voided - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_history - Type: ArrayList&#60;InvoiceHistoryReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctInvoiceHistory(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String user_id, java.lang.String start_bill_date, java.lang.String end_bill_date, java.lang.String include_voided);

    abstract Map<String,Object> getAcctInvoiceHistory(Map<String,Object> map);

    /**
    * getStatementContent
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param statement_no - Type: Long
    * @param do_encoding - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   statement_content - Type: javax.xml.ws.Holder<br>
    *   mime_type - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getStatementContent(Long client_no, java.lang.String auth_key, Long acct_no, Long statement_no, java.lang.String do_encoding);

    abstract Map<String,Object> getStatementContent(Map<String,Object> map);

    /**
    * getStatementContentSize
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param statement_no - Type: Long
    * @param do_encoding - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   num_chars - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getStatementContentSize(Long client_no, java.lang.String auth_key, Long acct_no, Long statement_no, java.lang.String do_encoding);

    abstract Map<String,Object> getStatementContentSize(Map<String,Object> map);

    /**
    * getAcctHasOrderedSku
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param sku - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   ordered_ind - Type: javax.xml.ws.Holder<br>
    *   billed_ind - Type: javax.xml.ws.Holder<br>
    *   paid_ind - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctHasOrderedSku(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String sku);

    abstract Map<String,Object> getAcctHasOrderedSku(Map<String,Object> map);

    /**
    * getUseridHasOrderedSku
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param user_id - Type: java.lang.String
    * @param sku - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_no - Type: javax.xml.ws.Holder<br>
    *   ordered_ind - Type: javax.xml.ws.Holder<br>
    *   billed_ind - Type: javax.xml.ws.Holder<br>
    *   paid_ind - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getUseridHasOrderedSku(Long client_no, java.lang.String auth_key, java.lang.String user_id, java.lang.String sku);

    abstract Map<String,Object> getUseridHasOrderedSku(Map<String,Object> map);

    /**
    * assignSuppPlanMulti
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param supp_plans_to_assign - Type: com.aria.common.shared.SuppPlansToAssignArray
    * @param assignment_directive - Type: Long
    * @param do_write - Type: java.lang.String
    * @param comments - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param alt_proration_start_date - Type: java.lang.String
    * @param coupon_codes - Type: com.aria.common.shared.CouponCodesArray
    * @param effective_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   proration_result_amount - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   multi_sp_invoice_line_items - Type: ArrayList&#60;MultiSpInvoiceLineItemsReturnElement&#62;<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   statement_error_code - Type: javax.xml.ws.Holder<br>
    *   statement_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   total_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   total_tax_charges - Type: javax.xml.ws.Holder<br>
    *   total_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   total_credit - Type: javax.xml.ws.Holder<br>
    *   total_tax_credit - Type: javax.xml.ws.Holder<br>
    *   total_credit_before_tax - Type: javax.xml.ws.Holder<br>
    *   total - Type: javax.xml.ws.Holder<br>
    *   expectd_activation_fee - Type: javax.xml.ws.Holder<br>
    *   expectd_mthly_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   expectd_annu_recurring_cost - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> assignSuppPlanMulti(Long client_no, java.lang.String auth_key, Long acct_no, com.aria.common.shared.SuppPlansToAssignArray supp_plans_to_assign, Long assignment_directive, java.lang.String do_write, java.lang.String comments, java.lang.String client_receipt_id, java.lang.String alt_proration_start_date, com.aria.common.shared.CouponCodesArray coupon_codes, java.lang.String effective_date);

    abstract Map<String,Object> assignSuppPlanMulti(Map<String,Object> map);

    /**
    * getAcctPaymentMethods
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param filter_seq_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   acct_pay_methods - Type: ArrayList&#60;AcctPayMethodsReturnElement&#62;<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctPaymentMethods(Long client_no, java.lang.String auth_key, Long acct_no, Long filter_seq_no);

    abstract Map<String,Object> getAcctPaymentMethods(Map<String,Object> map);

    /**
    * genStatement
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param send_email - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   statement_no - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> genStatement(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String send_email);

    abstract Map<String,Object> genStatement(Map<String,Object> map);

    /**
    * cancelUnconsumedCredit
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param coupon_cd - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelUnconsumedCredit(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String coupon_cd);

    abstract Map<String,Object> cancelUnconsumedCredit(Map<String,Object> map);

    /**
    * cancelUnappliedSvceCredits
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param credit_ids - Type: com.aria.common.shared.CreditIdsArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelUnappliedSvceCredits(Long client_no, java.lang.String auth_key, Long acct_no, com.aria.common.shared.CreditIdsArray credit_ids);

    abstract Map<String,Object> cancelUnappliedSvceCredits(Map<String,Object> map);

    /**
    * getAcctBalance
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   currency_cd - Type: javax.xml.ws.Holder<br>
    *   balance - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctBalance(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctBalance(Map<String,Object> map);

    /**
    * getUnbilledUsageSummary
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   currency_cd - Type: javax.xml.ws.Holder<br>
    *   currency_name - Type: javax.xml.ws.Holder<br>
    *   acct_mtd_threshold_amount - Type: javax.xml.ws.Holder<br>
    *   acct_ptd_threshold_amount - Type: javax.xml.ws.Holder<br>
    *   client_mtd_threshold_amount - Type: javax.xml.ws.Holder<br>
    *   client_ptd_threshold_amount - Type: javax.xml.ws.Holder<br>
    *   mtd_balance_amount - Type: javax.xml.ws.Holder<br>
    *   ptd_balance_amount - Type: javax.xml.ws.Holder<br>
    *   acct_mtd_delta_sign - Type: javax.xml.ws.Holder<br>
    *   acct_mtd_delta_amount - Type: javax.xml.ws.Holder<br>
    *   acct_ptd_delta_sign - Type: javax.xml.ws.Holder<br>
    *   acct_ptd_delta_amount - Type: javax.xml.ws.Holder<br>
    *   client_mtd_delta_sign - Type: javax.xml.ws.Holder<br>
    *   client_mtd_delta_amount - Type: javax.xml.ws.Holder<br>
    *   client_ptd_delta_sign - Type: javax.xml.ws.Holder<br>
    *   client_ptd_delta_amount - Type: javax.xml.ws.Holder<br>
    *   unapp_svc_credit_bal_amount - Type: javax.xml.ws.Holder<br>
    *   unapp_svc_credit_delta_sign - Type: javax.xml.ws.Holder<br>
    *   unapp_svc_credit_delta_amount - Type: javax.xml.ws.Holder<br>
    *   unbilled_usage_recs - Type: ArrayList&#60;UnbilledUsageRecsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getUnbilledUsageSummary(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getUnbilledUsageSummary(Map<String,Object> map);

    /**
    * setAcctUsgMtdThreshold
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param amount - Type: java.lang.Double
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setAcctUsgMtdThreshold(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.Double amount);

    abstract Map<String,Object> setAcctUsgMtdThreshold(Map<String,Object> map);

    /**
    * setAcctUsgPtdThreshold
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param amount - Type: java.lang.Double
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setAcctUsgPtdThreshold(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.Double amount);

    abstract Map<String,Object> setAcctUsgPtdThreshold(Map<String,Object> map);

    /**
    * setClientUsgMtdThreshold
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param amount - Type: java.lang.Double
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setClientUsgMtdThreshold(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.Double amount);

    abstract Map<String,Object> setClientUsgMtdThreshold(Map<String,Object> map);

    /**
    * setClientUsgPtdThreshold
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param amount - Type: java.lang.Double
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setClientUsgPtdThreshold(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.Double amount);

    abstract Map<String,Object> setClientUsgPtdThreshold(Map<String,Object> map);

    /**
    * resetUsgMtdBal
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> resetUsgMtdBal(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> resetUsgMtdBal(Map<String,Object> map);

    /**
    * resetUsgPtdBal
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> resetUsgPtdBal(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> resetUsgPtdBal(Map<String,Object> map);

    /**
    * getAcctMultiplanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param contract_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   type_no - Type: javax.xml.ws.Holder<br>
    *   length_months - Type: javax.xml.ws.Holder<br>
    *   create_comments - Type: javax.xml.ws.Holder<br>
    *   update_comments - Type: javax.xml.ws.Holder<br>
    *   create_date - Type: javax.xml.ws.Holder<br>
    *   update_date - Type: javax.xml.ws.Holder<br>
    *   start_date - Type: javax.xml.ws.Holder<br>
    *   end_date - Type: javax.xml.ws.Holder<br>
    *   status_code - Type: javax.xml.ws.Holder<br>
    *   plan_no - Type: ArrayList&#60;PlanNoReturnElement&#62;<br>
    *   plan_name - Type: ArrayList&#60;PlanNameReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctMultiplanContract(Long client_no, java.lang.String auth_key, Long acct_no, Long contract_no);

    abstract Map<String,Object> getAcctMultiplanContract(Map<String,Object> map);

    /**
    * createAcctMultiplanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param plan_no - Type: com.aria.common.shared.PlanNoArray
    * @param type_no - Type: Long
    * @param length_months - Type: Long
    * @param create_comments - Type: java.lang.String
    * @param start_date - Type: java.lang.String
    * @param do_auto_discard - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   contract_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> createAcctMultiplanContract(Long client_no, java.lang.String auth_key, Long acct_no, com.aria.common.shared.PlanNoArray plan_no, Long type_no, Long length_months, java.lang.String create_comments, java.lang.String start_date, java.lang.String do_auto_discard, java.lang.String end_date);

    abstract Map<String,Object> createAcctMultiplanContract(Map<String,Object> map);

    /**
    * modifyAcctMultiplanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param contract_no - Type: Long
    * @param type_no - Type: Long
    * @param length_months - Type: Long
    * @param start_date - Type: java.lang.String
    * @param update_comments - Type: java.lang.String
    * @param modify_directive - Type: Long
    * @param plans_input - Type: com.aria.common.shared.PlansInputArray
    * @param end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> modifyAcctMultiplanContract(Long client_no, java.lang.String auth_key, Long acct_no, Long contract_no, Long type_no, Long length_months, java.lang.String start_date, java.lang.String update_comments, Long modify_directive, com.aria.common.shared.PlansInputArray plans_input, java.lang.String end_date);

    abstract Map<String,Object> modifyAcctMultiplanContract(Map<String,Object> map);

    /**
    * cancelAcctMultiplanContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param contract_no - Type: Long
    * @param update_comments - Type: java.lang.String
    * @param close_status - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelAcctMultiplanContract(Long client_no, java.lang.String auth_key, Long acct_no, Long contract_no, java.lang.String update_comments, Long close_status);

    abstract Map<String,Object> cancelAcctMultiplanContract(Map<String,Object> map);

    /**
    * getAcctUniversalContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   type_no - Type: javax.xml.ws.Holder<br>
    *   length_months - Type: javax.xml.ws.Holder<br>
    *   create_comments - Type: javax.xml.ws.Holder<br>
    *   update_comments - Type: javax.xml.ws.Holder<br>
    *   create_date - Type: javax.xml.ws.Holder<br>
    *   update_date - Type: javax.xml.ws.Holder<br>
    *   start_date - Type: javax.xml.ws.Holder<br>
    *   end_date - Type: javax.xml.ws.Holder<br>
    *   status_code - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctUniversalContract(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctUniversalContract(Map<String,Object> map);

    /**
    * createAcctUniversalContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param type_no - Type: Long
    * @param length_months - Type: Long
    * @param create_comments - Type: java.lang.String
    * @param start_date - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   contract_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> createAcctUniversalContract(Long client_no, java.lang.String auth_key, Long acct_no, Long type_no, Long length_months, java.lang.String create_comments, java.lang.String start_date, java.lang.String end_date);

    abstract Map<String,Object> createAcctUniversalContract(Map<String,Object> map);

    /**
    * modifyAcctUniversalContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param contract_no - Type: Long
    * @param type_no - Type: Long
    * @param length_months - Type: Long
    * @param start_date - Type: java.lang.String
    * @param update_comments - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> modifyAcctUniversalContract(Long client_no, java.lang.String auth_key, Long acct_no, Long contract_no, Long type_no, Long length_months, java.lang.String start_date, java.lang.String update_comments, java.lang.String end_date);

    abstract Map<String,Object> modifyAcctUniversalContract(Map<String,Object> map);

    /**
    * cancelAcctUniversalContract
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param update_comments - Type: java.lang.String
    * @param close_status - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelAcctUniversalContract(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String update_comments, Long close_status);

    abstract Map<String,Object> cancelAcctUniversalContract(Map<String,Object> map);

    /**
    * getAllAcctActiveContracts
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_acct_active_contracts - Type: ArrayList&#60;AllAcctActiveContractsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAllAcctActiveContracts(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAllAcctActiveContracts(Map<String,Object> map);

    /**
    * getAcctHierarchyDetails
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param hierarchy_filter - Type: Long
    * @param include_current_acct - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_hierarchy_details - Type: ArrayList&#60;AcctHierarchyDetailsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctHierarchyDetails(Long client_no, java.lang.String auth_key, Long acct_no, Long hierarchy_filter, Long include_current_acct);

    abstract Map<String,Object> getAcctHierarchyDetails(Map<String,Object> map);

    /**
    * getAllAcctContracts
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param filter_status_code - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   all_acct_contracts - Type: ArrayList&#60;AllAcctContractsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAllAcctContracts(Long client_no, java.lang.String auth_key, Long acct_no, Long filter_status_code);

    abstract Map<String,Object> getAllAcctContracts(Map<String,Object> map);

    /**
    * setAcctNotifyOverride
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param template_class - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param acct_user_id - Type: java.lang.String
    * @param client_acct_id - Type: java.lang.String
    * @param override_template_no - Type: Long
    * @param behavioral_option - Type: Long
    * @param override_template_option - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setAcctNotifyOverride(Long client_no, java.lang.String auth_key, java.lang.String template_class, Long acct_no, java.lang.String acct_user_id, java.lang.String client_acct_id, Long override_template_no, Long behavioral_option, Long override_template_option);

    abstract Map<String,Object> setAcctNotifyOverride(Map<String,Object> map);

    /**
    * setAcctNotifyTmpltGrp
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param notification_template_group_id - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param acct_user_id - Type: java.lang.String
    * @param client_acct_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setAcctNotifyTmpltGrp(Long client_no, java.lang.String auth_key, java.lang.String notification_template_group_id, Long acct_no, java.lang.String acct_user_id, java.lang.String client_acct_id);

    abstract Map<String,Object> setAcctNotifyTmpltGrp(Map<String,Object> map);

    /**
    * getAcctNotificationDetails
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param acct_user_id - Type: java.lang.String
    * @param client_acct_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_notification_details - Type: ArrayList&#60;AcctNotificationDetailsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctNotificationDetails(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String acct_user_id, java.lang.String client_acct_id);

    abstract Map<String,Object> getAcctNotificationDetails(Map<String,Object> map);

    /**
    * getAcctCredits
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param limit_records - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_credits - Type: ArrayList&#60;AcctCreditsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctCredits(Long client_no, java.lang.String auth_key, Long acct_no, Long limit_records);

    abstract Map<String,Object> getAcctCredits(Map<String,Object> map);

    /**
    * getAcctCreditDetails
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param credit_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   created_by - Type: javax.xml.ws.Holder<br>
    *   created_date - Type: javax.xml.ws.Holder<br>
    *   amount - Type: javax.xml.ws.Holder<br>
    *   credit_type - Type: javax.xml.ws.Holder<br>
    *   applied_amount - Type: javax.xml.ws.Holder<br>
    *   unapplied_amount - Type: javax.xml.ws.Holder<br>
    *   reason_code - Type: javax.xml.ws.Holder<br>
    *   reason_text - Type: javax.xml.ws.Holder<br>
    *   comments - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctCreditDetails(Long client_no, java.lang.String auth_key, Long acct_no, Long credit_no);

    abstract Map<String,Object> getAcctCreditDetails(Map<String,Object> map);

    /**
    * getCreditReasonCodes
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   credit_reason_codes - Type: ArrayList&#60;CreditReasonCodesReturnElement&#62;<br>
    */
    abstract Map<String,Object> getCreditReasonCodes(Long client_no, java.lang.String auth_key);

    abstract Map<String,Object> getCreditReasonCodes(Map<String,Object> map);

    /**
    * savePaypalBillAgreement
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param token - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> savePaypalBillAgreement(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String token);

    abstract Map<String,Object> savePaypalBillAgreement(Map<String,Object> map);

    /**
    * initPaypalBillAgreement
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   return_url - Type: javax.xml.ws.Holder<br>
    *   token - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> initPaypalBillAgreement(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> initPaypalBillAgreement(Map<String,Object> map);

    /**
    * getAcctServiceOutageCredit
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param outage_start_date - Type: java.lang.String
    * @param outage_end_date - Type: java.lang.String
    * @param outage_start_time - Type: java.lang.String
    * @param outage_end_time - Type: java.lang.String
    * @param plans_to_get_outage - Type: com.aria.common.shared.PlansToGetOutageArray
    * @param adjust_percent - Type: java.lang.Double
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   acct_no - Type: javax.xml.ws.Holder<br>
    *   service_outage_line_items - Type: ArrayList&#60;ServiceOutageLineItemsReturnElement&#62;<br>
    *   total_outage_credit - Type: javax.xml.ws.Holder<br>
    *   adjusted_outage_credit - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctServiceOutageCredit(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String outage_start_date, java.lang.String outage_end_date, java.lang.String outage_start_time, java.lang.String outage_end_time, com.aria.common.shared.PlansToGetOutageArray plans_to_get_outage, java.lang.Double adjust_percent);

    abstract Map<String,Object> getAcctServiceOutageCredit(Map<String,Object> map);

    /**
    * getInvNoFromBalXfer
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param transaction_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   acct_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getInvNoFromBalXfer(Long client_no, java.lang.String auth_key, Long transaction_id);

    abstract Map<String,Object> getInvNoFromBalXfer(Map<String,Object> map);

    /**
    * voidTransaction
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param transaction_id - Type: Long
    * @param reason_code - Type: Long
    * @param comments - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   new_transaction_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> voidTransaction(Long client_no, java.lang.String auth_key, Long account_no, Long transaction_id, Long reason_code, java.lang.String comments, java.lang.String client_receipt_id);

    abstract Map<String,Object> voidTransaction(Map<String,Object> map);

    /**
    * reinstateTransaction
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param transaction_id - Type: Long
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   new_transaction_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> reinstateTransaction(Long client_no, java.lang.String auth_key, Long account_no, Long transaction_id, java.lang.String comments);

    abstract Map<String,Object> reinstateTransaction(Map<String,Object> map);

    /**
    * transferAccountBalance
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param source_account_no - Type: Long
    * @param target_account_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   balance_transferred - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> transferAccountBalance(Long client_no, java.lang.String auth_key, Long source_account_no, Long target_account_no);

    abstract Map<String,Object> transferAccountBalance(Map<String,Object> map);

    /**
    * createOrder
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param bill_immediately - Type: Long
    * @param order_line_items - Type: com.aria.common.shared.OrderLineItemsArray
    * @param bill_seq - Type: Long
    * @param client_order_id - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param alt_pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param bill_company_name - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_middle_initial - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_zip - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_extension - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_extension - Type: java.lang.String
    * @param cvv - Type: java.lang.String
    * @param bill_address3 - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param coupon_cd - Type: java.lang.String
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @param alt_inv_template_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   order_no - Type: javax.xml.ws.Holder<br>
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   statement_error_cd - Type: javax.xml.ws.Holder<br>
    *   statement_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   total_charges_before_tax - Type: javax.xml.ws.Holder<br>
    *   total_tax_charges - Type: javax.xml.ws.Holder<br>
    *   total_charges_after_tax - Type: javax.xml.ws.Holder<br>
    *   total_credit - Type: javax.xml.ws.Holder<br>
    *   cart_invoice_line_items - Type: ArrayList&#60;CartInvoiceLineItemsReturnElement&#62;<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> createOrder(Long client_no, java.lang.String auth_key, Long account_no, Long bill_immediately, com.aria.common.shared.OrderLineItemsArray order_line_items, Long bill_seq, java.lang.String client_order_id, java.lang.String client_receipt_id, Long alt_pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_routing_num, java.lang.String bank_acct_num, java.lang.String bill_company_name, java.lang.String bill_first_name, java.lang.String bill_middle_initial, java.lang.String bill_last_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_zip, java.lang.String bill_country, java.lang.String bill_email, java.lang.String bill_phone, java.lang.String bill_phone_extension, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_extension, java.lang.String cvv, java.lang.String bill_address3, java.lang.String do_write, java.lang.String coupon_cd, java.lang.String alt_client_acct_group_id, java.lang.String track_data1, java.lang.String track_data2, Long alt_inv_template_no);

    abstract Map<String,Object> createOrder(Map<String,Object> map);

    /**
    * settleAccountBalance
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param alt_pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param bill_company_name - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_middle_initial - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_zip - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_extension - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_extension - Type: java.lang.String
    * @param cvv - Type: java.lang.String
    * @param bill_address3 - Type: java.lang.String
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @param force_balance_scope - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> settleAccountBalance(Long client_no, java.lang.String auth_key, Long account_no, Long alt_pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_routing_num, java.lang.String bank_acct_num, java.lang.String bill_company_name, java.lang.String bill_first_name, java.lang.String bill_middle_initial, java.lang.String bill_last_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_zip, java.lang.String bill_country, java.lang.String bill_email, java.lang.String bill_phone, java.lang.String bill_phone_extension, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_extension, java.lang.String cvv, java.lang.String bill_address3, java.lang.String alt_client_acct_group_id, java.lang.String track_data1, java.lang.String track_data2, java.lang.String force_balance_scope);

    abstract Map<String,Object> settleAccountBalance(Map<String,Object> map);

    /**
    * collectFromAccount
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param amount_to_collect - Type: java.lang.Double
    * @param bill_seq - Type: Long
    * @param client_receipt_id - Type: java.lang.String
    * @param specific_charge_transaction_id - Type: com.aria.common.shared.SpecificChargeTransactionIdArray
    * @param alt_pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param bill_company_name - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_middle_initial - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_zip - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_extension - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_extension - Type: java.lang.String
    * @param cvv - Type: java.lang.String
    * @param bill_address3 - Type: java.lang.String
    * @param alt_client_acct_group_id - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @param payment_application_method - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> collectFromAccount(Long client_no, java.lang.String auth_key, Long account_no, java.lang.Double amount_to_collect, Long bill_seq, java.lang.String client_receipt_id, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id, Long alt_pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_routing_num, java.lang.String bank_acct_num, java.lang.String bill_company_name, java.lang.String bill_first_name, java.lang.String bill_middle_initial, java.lang.String bill_last_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_zip, java.lang.String bill_country, java.lang.String bill_email, java.lang.String bill_phone, java.lang.String bill_phone_extension, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_extension, java.lang.String cvv, java.lang.String bill_address3, java.lang.String alt_client_acct_group_id, java.lang.String track_data1, java.lang.String track_data2, Long payment_application_method);

    abstract Map<String,Object> collectFromAccount(Map<String,Object> map);

    /**
    * recordExternalPayment
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param payment_amount - Type: java.lang.Double
    * @param reference_code - Type: java.lang.String
    * @param comments - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param specific_charge_transaction_id - Type: com.aria.common.shared.SpecificChargeTransactionIdArray
    * @param external_destination_id - Type: Long
    * @param external_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> recordExternalPayment(Long client_no, java.lang.String auth_key, Long account_no, java.lang.Double payment_amount, java.lang.String reference_code, java.lang.String comments, java.lang.String client_receipt_id, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id, Long external_destination_id, java.lang.String external_id);

    abstract Map<String,Object> recordExternalPayment(Map<String,Object> map);

    /**
    * recordOutGoingPayment
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param payment_amount - Type: java.lang.Double
    * @param reference_code - Type: java.lang.String
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> recordOutGoingPayment(Long client_no, java.lang.String auth_key, Long account_no, java.lang.Double payment_amount, java.lang.String reference_code, java.lang.String comments);

    abstract Map<String,Object> recordOutGoingPayment(Map<String,Object> map);

    /**
    * applyServiceCredit
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param credit_amount - Type: java.lang.Double
    * @param credit_reason_code - Type: Long
    * @param comments - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   credit_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> applyServiceCredit(Long client_no, java.lang.String auth_key, Long account_no, java.lang.Double credit_amount, Long credit_reason_code, java.lang.String comments);

    abstract Map<String,Object> applyServiceCredit(Map<String,Object> map);

    /**
    * applyCashCredit
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param credit_amount - Type: java.lang.Double
    * @param credit_reason_code - Type: Long
    * @param comments - Type: java.lang.String
    * @param specific_charge_transaction_id - Type: com.aria.common.shared.SpecificChargeTransactionIdArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> applyCashCredit(Long client_no, java.lang.String auth_key, Long account_no, java.lang.Double credit_amount, Long credit_reason_code, java.lang.String comments, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id);

    abstract Map<String,Object> applyCashCredit(Map<String,Object> map);

    /**
    * recordStandingOrder
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param billing_interval_units - Type: Long
    * @param times_to_bill - Type: Long
    * @param billing_interval_type - Type: java.lang.String
    * @param first_bill_date - Type: java.lang.String
    * @param standing_order - Type: com.aria.common.shared.StandingOrderArray
    * @param client_order_id - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   standing_order_no - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> recordStandingOrder(Long client_no, java.lang.String auth_key, Long account_no, Long billing_interval_units, Long times_to_bill, java.lang.String billing_interval_type, java.lang.String first_bill_date, com.aria.common.shared.StandingOrderArray standing_order, java.lang.String client_order_id, java.lang.String client_receipt_id);

    abstract Map<String,Object> recordStandingOrder(Map<String,Object> map);

    /**
    * cancelStandingOrder
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param standing_order_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelStandingOrder(Long client_no, java.lang.String auth_key, Long standing_order_no);

    abstract Map<String,Object> cancelStandingOrder(Map<String,Object> map);

    /**
    * movePayment
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param account_no - Type: Long
    * @param payment_id - Type: Long
    * @param specific_charge_transaction_id - Type: com.aria.common.shared.SpecificChargeTransactionIdArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> movePayment(Long client_no, java.lang.String auth_key, Long account_no, Long payment_id, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id);

    abstract Map<String,Object> movePayment(Map<String,Object> map);

    /**
    * bulkRecordUsage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param usage_records - Type: com.aria.common.shared.UsageRecordsArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   error_records - Type: ArrayList&#60;ErrorRecordsReturnElement&#62;<br>
    */
    abstract Map<String,Object> bulkRecordUsage(Long client_no, java.lang.String auth_key, com.aria.common.shared.UsageRecordsArray usage_records);

    abstract Map<String,Object> bulkRecordUsage(Map<String,Object> map);

    /**
    * recordUsage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param usage_units - Type: java.lang.Double
    * @param acct_no - Type: Long
    * @param userid - Type: java.lang.String
    * @param usage_type - Type: Long
    * @param usage_date - Type: java.lang.String
    * @param billable_units - Type: java.lang.Double
    * @param amt - Type: java.lang.Double
    * @param rate - Type: java.lang.Double
    * @param telco_from - Type: java.lang.String
    * @param telco_to - Type: java.lang.String
    * @param comments - Type: java.lang.String
    * @param exclude_from_billing - Type: java.lang.String
    * @param exclusion_comments - Type: java.lang.String
    * @param qualifier_1 - Type: java.lang.String
    * @param qualifier_2 - Type: java.lang.String
    * @param qualifier_3 - Type: java.lang.String
    * @param qualifier_4 - Type: java.lang.String
    * @param parent_usage_rec_no - Type: Long
    * @param usage_type_code - Type: java.lang.String
    * @param client_record_id - Type: java.lang.String
    * @param caller_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   usage_rec_no - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> recordUsage(Long client_no, java.lang.String auth_key, java.lang.Double usage_units, Long acct_no, java.lang.String userid, Long usage_type, java.lang.String usage_date, java.lang.Double billable_units, java.lang.Double amt, java.lang.Double rate, java.lang.String telco_from, java.lang.String telco_to, java.lang.String comments, java.lang.String exclude_from_billing, java.lang.String exclusion_comments, java.lang.String qualifier_1, java.lang.String qualifier_2, java.lang.String qualifier_3, java.lang.String qualifier_4, Long parent_usage_rec_no, java.lang.String usage_type_code, java.lang.String client_record_id, java.lang.String caller_id);

    abstract Map<String,Object> recordUsage(Map<String,Object> map);

    /**
    * getOrder
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param my_order_no - Type: Long
    * @param my_client_order_id - Type: java.lang.String
    * @param limit_records - Type: Long
    * @param details_flag - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   order - Type: ArrayList&#60;OrderReturnElement&#62;<br>
    */
    abstract Map<String,Object> getOrder(Long client_no, java.lang.String auth_key, Long acct_no, Long my_order_no, java.lang.String my_client_order_id, Long limit_records, Long details_flag);

    abstract Map<String,Object> getOrder(Map<String,Object> map);

    /**
    * getStandingOrder
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param my_standing_order - Type: Long
    * @param my_client_order_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   so - Type: ArrayList&#60;SoReturnElement&#62;<br>
    */
    abstract Map<String,Object> getStandingOrder(Long client_no, java.lang.String auth_key, Long acct_no, Long my_standing_order, java.lang.String my_client_order_id);

    abstract Map<String,Object> getStandingOrder(Map<String,Object> map);

    /**
    * getStandingOrderItems
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param standing_order_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   so_items - Type: ArrayList&#60;SoItemsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getStandingOrderItems(Long client_no, java.lang.String auth_key, Long standing_order_no);

    abstract Map<String,Object> getStandingOrderItems(Map<String,Object> map);

    /**
    * getStandingOrderHist
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param standing_order_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   order - Type: ArrayList&#60;OrderReturnElement&#62;<br>
    */
    abstract Map<String,Object> getStandingOrderHist(Long client_no, java.lang.String auth_key, Long standing_order_no);

    abstract Map<String,Object> getStandingOrderHist(Map<String,Object> map);

    /**
    * preCalcInvoice
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param log_id - Type: java.lang.String
    * @param first_name - Type: java.lang.String
    * @param mi - Type: java.lang.String
    * @param last_name - Type: java.lang.String
    * @param address1 - Type: java.lang.String
    * @param address2 - Type: java.lang.String
    * @param city - Type: java.lang.String
    * @param state_prov_code - Type: java.lang.String
    * @param zip_code - Type: java.lang.String
    * @param country_code - Type: java.lang.String
    * @param currency_code - Type: java.lang.String
    * @param pre_calc_plan - Type: com.aria.common.shared.PreCalcPlanArray
    * @param pre_calc_sku - Type: com.aria.common.shared.PreCalcSkuArray
    * @param tax_exempt_cd - Type: Long
    * @param address3 - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   inv_calc_out - Type: ArrayList&#60;InvCalcOutReturnElement&#62;<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> preCalcInvoice(Long client_no, java.lang.String auth_key, java.lang.String log_id, java.lang.String first_name, java.lang.String mi, java.lang.String last_name, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String state_prov_code, java.lang.String zip_code, java.lang.String country_code, java.lang.String currency_code, com.aria.common.shared.PreCalcPlanArray pre_calc_plan, com.aria.common.shared.PreCalcSkuArray pre_calc_sku, Long tax_exempt_cd, java.lang.String address3);

    abstract Map<String,Object> preCalcInvoice(Map<String,Object> map);

    /**
    * getOrderItems
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param order_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   order_items - Type: ArrayList&#60;OrderItemsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getOrderItems(Long client_no, java.lang.String auth_key, Long order_no);

    abstract Map<String,Object> getOrderItems(Map<String,Object> map);

    /**
    * genInvoice
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param force_pending - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param alt_bill_day - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> genInvoice(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String force_pending, java.lang.String client_receipt_id, Long alt_bill_day);

    abstract Map<String,Object> genInvoice(Map<String,Object> map);

    /**
    * getAcctPreviewStatement
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   out_statement - Type: javax.xml.ws.Holder<br>
    *   mime_type - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAcctPreviewStatement(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getAcctPreviewStatement(Map<String,Object> map);

    /**
    * getStatementForInvoice
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param invoice_no - Type: Long
    * @param do_encoding - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   out_statement - Type: javax.xml.ws.Holder<br>
    *   mime_type - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getStatementForInvoice(Long client_no, java.lang.String auth_key, Long acct_no, Long invoice_no, java.lang.String do_encoding);

    abstract Map<String,Object> getStatementForInvoice(Map<String,Object> map);

    /**
    * getStatementForInvSize
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param invoice_no - Type: Long
    * @param do_encoding - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   num_chars - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getStatementForInvSize(Long client_no, java.lang.String auth_key, Long acct_no, Long invoice_no, java.lang.String do_encoding);

    abstract Map<String,Object> getStatementForInvSize(Map<String,Object> map);

    /**
    * getInvoiceDetails
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param src_transaction_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_line_items - Type: ArrayList&#60;InvoiceLineItemsReturnElement&#62;<br>
    *   is_pending_ind - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getInvoiceDetails(Long client_no, java.lang.String auth_key, Long acct_no, Long src_transaction_id);

    abstract Map<String,Object> getInvoiceDetails(Map<String,Object> map);

    /**
    * getPaymentsOnInvoice
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param src_transaction_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_payments - Type: ArrayList&#60;InvoicePaymentsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getPaymentsOnInvoice(Long client_no, java.lang.String auth_key, Long acct_no, Long src_transaction_id);

    abstract Map<String,Object> getPaymentsOnInvoice(Map<String,Object> map);

    /**
    * getPaymentApplications
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param src_transaction_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   payment_applications - Type: ArrayList&#60;PaymentApplicationsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getPaymentApplications(Long client_no, java.lang.String auth_key, Long acct_no, Long src_transaction_id);

    abstract Map<String,Object> getPaymentApplications(Map<String,Object> map);

    /**
    * getAllActionsByReceiptId
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param client_receipt_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   receipt_action - Type: ArrayList&#60;ReceiptActionReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAllActionsByReceiptId(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String client_receipt_id);

    abstract Map<String,Object> getAllActionsByReceiptId(Map<String,Object> map);

    /**
    * managePendingInvoice
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param invoice_no - Type: Long
    * @param acct_no - Type: Long
    * @param action_directive - Type: Long
    * @param bill_seq - Type: Long
    * @param alt_pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param bill_company_name - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_middle_initial - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_zip - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_extension - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_extension - Type: java.lang.String
    * @param cvv - Type: java.lang.String
    * @param alt_collect_on_approve - Type: java.lang.String
    * @param alt_send_statement_on_approve - Type: java.lang.String
    * @param cancel_orders_on_discard - Type: java.lang.String
    * @param bill_address3 - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   new_invoice_no - Type: javax.xml.ws.Holder<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   statement_error_code - Type: javax.xml.ws.Holder<br>
    *   statement_error_msg - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> managePendingInvoice(Long client_no, java.lang.String auth_key, Long invoice_no, Long acct_no, Long action_directive, Long bill_seq, Long alt_pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_routing_num, java.lang.String bank_acct_num, java.lang.String bill_company_name, java.lang.String bill_first_name, java.lang.String bill_middle_initial, java.lang.String bill_last_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_zip, java.lang.String bill_country, java.lang.String bill_email, java.lang.String bill_phone, java.lang.String bill_phone_extension, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_extension, java.lang.String cvv, java.lang.String alt_collect_on_approve, java.lang.String alt_send_statement_on_approve, java.lang.String cancel_orders_on_discard, java.lang.String bill_address3, java.lang.String track_data1, java.lang.String track_data2);

    abstract Map<String,Object> managePendingInvoice(Map<String,Object> map);

    /**
    * cancelOrder
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param order_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> cancelOrder(Long client_no, java.lang.String auth_key, Long acct_no, Long order_no);

    abstract Map<String,Object> cancelOrder(Map<String,Object> map);

    /**
    * getRefundDetails
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param include_voided - Type: java.lang.String
    * @param aria_event_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   refund_details - Type: ArrayList&#60;RefundDetailsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getRefundDetails(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String include_voided, Long aria_event_no);

    abstract Map<String,Object> getRefundDetails(Map<String,Object> map);

    /**
    * createOrderWithPlans
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param order_line_items - Type: com.aria.common.shared.OrderLineItemsArray
    * @param cart_supp_plans - Type: com.aria.common.shared.CartSuppPlansArray
    * @param client_order_id - Type: java.lang.String
    * @param coupon_code - Type: java.lang.String
    * @param comments - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param client_receipt_id - Type: java.lang.String
    * @param bill_seq - Type: Long
    * @param alt_pay_method - Type: Long
    * @param cc_number - Type: java.lang.String
    * @param cc_expire_mm - Type: Long
    * @param cc_expire_yyyy - Type: Long
    * @param bank_routing_num - Type: java.lang.String
    * @param bank_acct_num - Type: java.lang.String
    * @param bill_company_name - Type: java.lang.String
    * @param bill_first_name - Type: java.lang.String
    * @param bill_middle_initial - Type: java.lang.String
    * @param bill_last_name - Type: java.lang.String
    * @param bill_address1 - Type: java.lang.String
    * @param bill_address2 - Type: java.lang.String
    * @param bill_city - Type: java.lang.String
    * @param bill_locality - Type: java.lang.String
    * @param bill_state_prov - Type: java.lang.String
    * @param bill_zip - Type: java.lang.String
    * @param bill_country - Type: java.lang.String
    * @param bill_email - Type: java.lang.String
    * @param bill_phone - Type: java.lang.String
    * @param bill_phone_extension - Type: java.lang.String
    * @param bill_cell_phone - Type: java.lang.String
    * @param bill_work_phone - Type: java.lang.String
    * @param bill_work_phone_extension - Type: java.lang.String
    * @param cvv - Type: java.lang.String
    * @param bill_address3 - Type: java.lang.String
    * @param track_data1 - Type: java.lang.String
    * @param track_data2 - Type: java.lang.String
    * @param alt_inv_template_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   order_no - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   cart_invoice_line_items - Type: ArrayList&#60;CartInvoiceLineItemsReturnElement&#62;<br>
    *   collection_error_code - Type: javax.xml.ws.Holder<br>
    *   collection_error_msg - Type: javax.xml.ws.Holder<br>
    *   statement_error_code - Type: javax.xml.ws.Holder<br>
    *   statement_error_msg - Type: javax.xml.ws.Holder<br>
    *   transaction_id - Type: javax.xml.ws.Holder<br>
    *   proc_cvv_response - Type: javax.xml.ws.Holder<br>
    *   proc_avs_response - Type: javax.xml.ws.Holder<br>
    *   proc_cavv_response - Type: javax.xml.ws.Holder<br>
    *   proc_status_code - Type: javax.xml.ws.Holder<br>
    *   proc_status_text - Type: javax.xml.ws.Holder<br>
    *   proc_payment_id - Type: javax.xml.ws.Holder<br>
    *   proc_auth_code - Type: javax.xml.ws.Holder<br>
    *   proc_merch_comments - Type: javax.xml.ws.Holder<br>
    *   third_party_errors - Type: ArrayList&#60;ThirdPartyErrorsReturnElement&#62;<br>
    */
    abstract Map<String,Object> createOrderWithPlans(Long client_no, java.lang.String auth_key, Long acct_no, com.aria.common.shared.OrderLineItemsArray order_line_items, com.aria.common.shared.CartSuppPlansArray cart_supp_plans, java.lang.String client_order_id, java.lang.String coupon_code, java.lang.String comments, java.lang.String do_write, java.lang.String client_receipt_id, Long bill_seq, Long alt_pay_method, java.lang.String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, java.lang.String bank_routing_num, java.lang.String bank_acct_num, java.lang.String bill_company_name, java.lang.String bill_first_name, java.lang.String bill_middle_initial, java.lang.String bill_last_name, java.lang.String bill_address1, java.lang.String bill_address2, java.lang.String bill_city, java.lang.String bill_locality, java.lang.String bill_state_prov, java.lang.String bill_zip, java.lang.String bill_country, java.lang.String bill_email, java.lang.String bill_phone, java.lang.String bill_phone_extension, java.lang.String bill_cell_phone, java.lang.String bill_work_phone, java.lang.String bill_work_phone_extension, java.lang.String cvv, java.lang.String bill_address3, java.lang.String track_data1, java.lang.String track_data2, Long alt_inv_template_no);

    abstract Map<String,Object> createOrderWithPlans(Map<String,Object> map);

    /**
    * getRefundablePayments
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   refundable_payments - Type: ArrayList&#60;RefundablePaymentsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getRefundablePayments(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getRefundablePayments(Map<String,Object> map);

    /**
    * getReversibleInvsByPayment
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param payment_transaction_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   reversible_invoices - Type: ArrayList&#60;ReversibleInvoicesReturnElement&#62;<br>
    */
    abstract Map<String,Object> getReversibleInvsByPayment(Long client_no, java.lang.String auth_key, Long acct_no, Long payment_transaction_id);

    abstract Map<String,Object> getReversibleInvsByPayment(Map<String,Object> map);

    /**
    * issueRefundToAcct
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param payment_transaction_id - Type: Long
    * @param reason_code - Type: Long
    * @param total_refund_amount - Type: java.lang.Double
    * @param refund_check_number - Type: java.lang.String
    * @param comments - Type: java.lang.String
    * @param do_write - Type: java.lang.String
    * @param auto_calc_refund - Type: java.lang.String
    * @param invoices_to_reverse - Type: com.aria.common.shared.InvoicesToReverseArray
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   applied_total_refund_amount - Type: javax.xml.ws.Holder<br>
    *   applied_total_reversal_amount - Type: javax.xml.ws.Holder<br>
    *   reversed_invoice_lines - Type: ArrayList&#60;ReversedInvoiceLinesReturnElement&#62;<br>
    */
    abstract Map<String,Object> issueRefundToAcct(Long client_no, java.lang.String auth_key, Long acct_no, Long payment_transaction_id, Long reason_code, java.lang.Double total_refund_amount, java.lang.String refund_check_number, java.lang.String comments, java.lang.String do_write, java.lang.String auto_calc_refund, com.aria.common.shared.InvoicesToReverseArray invoices_to_reverse);

    abstract Map<String,Object> issueRefundToAcct(Map<String,Object> map);

    /**
    * getWriteoffDetails
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param aria_event_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   writeoff_details - Type: ArrayList&#60;WriteoffDetailsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getWriteoffDetails(Long client_no, java.lang.String auth_key, Long acct_no, Long aria_event_no);

    abstract Map<String,Object> getWriteoffDetails(Map<String,Object> map);

    /**
    * getAriaXmlStatement
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param xml_statement_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   xml_statement_content - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> getAriaXmlStatement(Long client_no, java.lang.String auth_key, Long acct_no, Long xml_statement_no);

    abstract Map<String,Object> getAriaXmlStatement(Map<String,Object> map);

    /**
    * getAcctPaymentHistory
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param start_date - Type: java.lang.String
    * @param end_date - Type: java.lang.String
    * @param limit_records - Type: Long
    * @param details_flag - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   payment_history - Type: ArrayList&#60;PaymentHistoryReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctPaymentHistory(Long client_no, java.lang.String auth_key, Long acct_no, java.lang.String start_date, java.lang.String end_date, Long limit_records, Long details_flag);

    abstract Map<String,Object> getAcctPaymentHistory(Map<String,Object> map);

    /**
    * getPaymentApplicationDtls
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param transaction_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   payment_application_details - Type: ArrayList&#60;PaymentApplicationDetailsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getPaymentApplicationDtls(Long client_no, java.lang.String auth_key, Long acct_no, Long transaction_id);

    abstract Map<String,Object> getPaymentApplicationDtls(Map<String,Object> map);

    /**
    * getExtendedTransactionInfo
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param transaction_id - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   trans_create_user - Type: javax.xml.ws.Holder<br>
    *   trans_create_date - Type: javax.xml.ws.Holder<br>
    *   extended_transaction_qualifiers - Type: ArrayList&#60;ExtendedTransactionQualifiersReturnElement&#62;<br>
    */
    abstract Map<String,Object> getExtendedTransactionInfo(Long client_no, java.lang.String auth_key, Long acct_no, Long transaction_id);

    abstract Map<String,Object> getExtendedTransactionInfo(Map<String,Object> map);

    /**
    * discardUsage
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param usage_record_nos - Type: com.aria.common.shared.UsageRecordNosArray
    * @param client_record_ids - Type: com.aria.common.shared.ClientRecordIdsArray
    * @param exclusion_reason_cd - Type: Long
    * @param exclusion_comment - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   failed_records - Type: ArrayList&#60;FailedRecordsReturnElement&#62;<br>
    */
    abstract Map<String,Object> discardUsage(Long client_no, java.lang.String auth_key, com.aria.common.shared.UsageRecordNosArray usage_record_nos, com.aria.common.shared.ClientRecordIdsArray client_record_ids, Long exclusion_reason_cd, java.lang.String exclusion_comment);

    abstract Map<String,Object> discardUsage(Map<String,Object> map);

    /**
    * createWriteoffOrDispute
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param invoice_no - Type: Long
    * @param amount - Type: java.lang.Double
    * @param reason_code - Type: Long
    * @param comments - Type: java.lang.String
    * @param do_dispute - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   rec_no - Type: javax.xml.ws.Holder<br>
    *   created_by - Type: javax.xml.ws.Holder<br>
    *   amount - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   invoice_date - Type: javax.xml.ws.Holder<br>
    *   invoice_amt - Type: javax.xml.ws.Holder<br>
    *   dispute_creation_date - Type: javax.xml.ws.Holder<br>
    *   dispute_exp_date - Type: javax.xml.ws.Holder<br>
    *   comments - Type: javax.xml.ws.Holder<br>
    *   reason_code - Type: javax.xml.ws.Holder<br>
    *   dispute_ind - Type: javax.xml.ws.Holder<br>
    *   can_unsettle - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> createWriteoffOrDispute(Long client_no, java.lang.String auth_key, Long acct_no, Long invoice_no, java.lang.Double amount, Long reason_code, java.lang.String comments, Long do_dispute);

    abstract Map<String,Object> createWriteoffOrDispute(Map<String,Object> map);

    /**
    * getAcctWriteoffOrDisputes
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param dispute_or_writeoff_flag - Type: Long
    * @param details_flag - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   write_off_info - Type: ArrayList&#60;WriteOffInfoReturnElement&#62;<br>
    */
    abstract Map<String,Object> getAcctWriteoffOrDisputes(Long client_no, java.lang.String auth_key, Long acct_no, Long dispute_or_writeoff_flag, Long details_flag);

    abstract Map<String,Object> getAcctWriteoffOrDisputes(Map<String,Object> map);

    /**
    * getInvoicesToWriteoffOrDispute
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   invoice_details - Type: ArrayList&#60;InvoiceDetailsReturnElement&#62;<br>
    */
    abstract Map<String,Object> getInvoicesToWriteoffOrDispute(Long client_no, java.lang.String auth_key, Long acct_no);

    abstract Map<String,Object> getInvoicesToWriteoffOrDispute(Map<String,Object> map);

    /**
    * settleDisputeHold
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param acct_no - Type: Long
    * @param dispute_no - Type: Long
    * @param settlement_action - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    *   rec_no - Type: javax.xml.ws.Holder<br>
    *   created_by - Type: javax.xml.ws.Holder<br>
    *   amount - Type: javax.xml.ws.Holder<br>
    *   invoice_no - Type: javax.xml.ws.Holder<br>
    *   invoice_date - Type: javax.xml.ws.Holder<br>
    *   invoice_amt - Type: javax.xml.ws.Holder<br>
    *   dispute_creation_date - Type: javax.xml.ws.Holder<br>
    *   dispute_exp_date - Type: javax.xml.ws.Holder<br>
    *   comments - Type: javax.xml.ws.Holder<br>
    *   reason_code - Type: javax.xml.ws.Holder<br>
    *   dispute_ind - Type: javax.xml.ws.Holder<br>
    *   can_unsettle - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> settleDisputeHold(Long client_no, java.lang.String auth_key, Long acct_no, Long dispute_no, Long settlement_action);

    abstract Map<String,Object> settleDisputeHold(Map<String,Object> map);

    /**
    * setSessionAuth
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param user_id - Type: java.lang.String
    * @param password - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   session_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setSessionAuth(Long client_no, java.lang.String auth_key, java.lang.String user_id, java.lang.String password);

    abstract Map<String,Object> setSessionAuth(Map<String,Object> map);

    /**
    * setSession
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param user_id - Type: java.lang.String
    * @param acct_no - Type: Long
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   session_id - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> setSession(Long client_no, java.lang.String auth_key, java.lang.String user_id, Long acct_no);

    abstract Map<String,Object> setSession(Map<String,Object> map);

    /**
    * validateSession
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   user_id - Type: javax.xml.ws.Holder<br>
    *   account_no - Type: javax.xml.ws.Holder<br>
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> validateSession(Long client_no, java.lang.String auth_key, java.lang.String session_id);

    abstract Map<String,Object> validateSession(Map<String,Object> map);

    /**
    * keepAlive
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> keepAlive(Long client_no, java.lang.String auth_key, java.lang.String session_id);

    abstract Map<String,Object> keepAlive(Map<String,Object> map);

    /**
    * killSession
    * @param client_no - Type: Long
    * @param auth_key - Type: java.lang.String
    * @param session_id - Type: java.lang.String
    * @return A <code>Map&#60;String,Object&#62;</code>, containing the following Objects:
    *   error_code - Type: javax.xml.ws.Holder<br>
    *   error_msg - Type: javax.xml.ws.Holder<br>
    */
    abstract Map<String,Object> killSession(Long client_no, java.lang.String auth_key, java.lang.String session_id);

    abstract Map<String,Object> killSession(Map<String,Object> map);

    /********************************** END - METHODS ***********************************************/
}