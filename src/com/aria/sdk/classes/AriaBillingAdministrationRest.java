package com.aria.sdk.classes;

import java.util.Map;

import javax.ws.rs.core.MultivaluedMap;

import com.aria.common.rest.admin.RestUtilities;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * AriaBillingAdministrationRest
 * Web Service class
 * @copyright Aria Systems, Inc
 */
public class AriaBillingAdministrationRest extends BaseAriaBilling implements AriaBillingAdministration {
    /************** CONSTRUCTOR ************************/
    public AriaBillingAdministrationRest(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {
        super(baseAriaBillingDTO);
    }
    /*************** END - CONSTRUCTOR ****************/

    /********************************** METHODS IMPLEMENTATION ***********************************************/

    public Map<String,Object> getPromoPlanSets(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_promo_plan_sets"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "promo_plan_set";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPromoPlanSets(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getPromoPlanSets(client_no, auth_key);
    }

    public Map<String,Object> getPromoPlanSetDetails(Long client_no, String auth_key, Long promo_plan_set_no, String client_plan_type_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"promo_plan_set_no",getValue("Long", promo_plan_set_no));
        addParameters(parameters,"client_plan_type_id",getValue("String", client_plan_type_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_promo_plan_set_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[7];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "promo_plan_set_no";
        returnValues[3] = "promo_plan_set_name";
        returnValues[4] = "promo_plan_set_desc";
        returnValues[5] = "client_plan_type_id";
        returnValues[6] = "plan";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPromoPlanSetDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long promo_plan_set_no = (Long) map.get("promo_plan_set_no");
                String client_plan_type_id = (String) map.get("client_plan_type_id");
                
        return getPromoPlanSetDetails(client_no, auth_key, promo_plan_set_no, client_plan_type_id);
    }

    public Map<String,Object> createPromoPlanSet(Long client_no, String auth_key, String promo_plan_set_name, String promo_plan_set_desc, String client_plan_type_id, String plan_no, String client_plan_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"promo_plan_set_name",getValue("String", promo_plan_set_name));
        addParameters(parameters,"promo_plan_set_desc",getValue("String", promo_plan_set_desc));
        addParameters(parameters,"client_plan_type_id",getValue("String", client_plan_type_id));
        addParameters(parameters,"plan_no",getValue("String", plan_no));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_promo_plan_set"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "promo_plan_set_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createPromoPlanSet(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_plan_set_name = (String) map.get("promo_plan_set_name");
                String promo_plan_set_desc = (String) map.get("promo_plan_set_desc");
                String client_plan_type_id = (String) map.get("client_plan_type_id");
                String plan_no = (String) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return createPromoPlanSet(client_no, auth_key, promo_plan_set_name, promo_plan_set_desc, client_plan_type_id, plan_no, client_plan_id);
    }

    public Map<String,Object> updatePromoPlanSet(Long client_no, String auth_key, Long promo_plan_set_no, String promo_plan_set_name, String promo_plan_set_desc, String client_plan_type_id, String plan_no, String client_plan_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"promo_plan_set_no",getValue("Long", promo_plan_set_no));
        addParameters(parameters,"promo_plan_set_name",getValue("String", promo_plan_set_name));
        addParameters(parameters,"promo_plan_set_desc",getValue("String", promo_plan_set_desc));
        addParameters(parameters,"client_plan_type_id",getValue("String", client_plan_type_id));
        addParameters(parameters,"plan_no",getValue("String", plan_no));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_promo_plan_set"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "promo_plan_set_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updatePromoPlanSet(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long promo_plan_set_no = (Long) map.get("promo_plan_set_no");
                String promo_plan_set_name = (String) map.get("promo_plan_set_name");
                String promo_plan_set_desc = (String) map.get("promo_plan_set_desc");
                String client_plan_type_id = (String) map.get("client_plan_type_id");
                String plan_no = (String) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return updatePromoPlanSet(client_no, auth_key, promo_plan_set_no, promo_plan_set_name, promo_plan_set_desc, client_plan_type_id, plan_no, client_plan_id);
    }

    public Map<String,Object> listPromoSets(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("list_promo_sets"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_groups";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> listPromoSets(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return listPromoSets(client_no, auth_key);
    }

    public Map<String,Object> getCompanyProfile(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_company_profile"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[32];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "client_name";
        returnValues[3] = "domain";
        returnValues[4] = "address1";
        returnValues[5] = "address2";
        returnValues[6] = "city";
        returnValues[7] = "locality";
        returnValues[8] = "state_prov";
        returnValues[9] = "country";
        returnValues[10] = "postal_code";
        returnValues[11] = "phone";
        returnValues[12] = "contact";
        returnValues[13] = "contact_address1";
        returnValues[14] = "contact_address2";
        returnValues[15] = "contact_city";
        returnValues[16] = "contact_state";
        returnValues[17] = "contact_zip";
        returnValues[18] = "contact_phone";
        returnValues[19] = "contact_email";
        returnValues[20] = "billing_contact";
        returnValues[21] = "billing_address1";
        returnValues[22] = "billing_address2";
        returnValues[23] = "billing_city";
        returnValues[24] = "billing_state";
        returnValues[25] = "billing_zip";
        returnValues[26] = "billing_phone";
        returnValues[27] = "billing_email";
        returnValues[28] = "contact_country";
        returnValues[29] = "contact_locality";
        returnValues[30] = "billing_country";
        returnValues[31] = "billing_locality";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCompanyProfile(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getCompanyProfile(client_no, auth_key);
    }

    public Map<String,Object> setCompanyProfile(Long client_no, String auth_key, String domain, String address1, String address2, String city, String locality, String state_prov, String country, String postal_code, String phone, String contact, String contact_address1, String contact_address2, String contact_city, String contact_state, String contact_zip, String contact_phone, String contact_email, String billing_contact, String billing_address1, String billing_address2, String billing_city, String billing_state, String billing_zip, String billing_phone, String billing_email, String contact_country, String contact_locality, String billing_country, String billing_locality){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"domain",getValue("String", domain));
        addParameters(parameters,"address1",getValue("String", address1));
        addParameters(parameters,"address2",getValue("String", address2));
        addParameters(parameters,"city",getValue("String", city));
        addParameters(parameters,"locality",getValue("String", locality));
        addParameters(parameters,"state_prov",getValue("String", state_prov));
        addParameters(parameters,"country",getValue("String", country));
        addParameters(parameters,"postal_code",getValue("String", postal_code));
        addParameters(parameters,"phone",getValue("String", phone));
        addParameters(parameters,"contact",getValue("String", contact));
        addParameters(parameters,"contact_address1",getValue("String", contact_address1));
        addParameters(parameters,"contact_address2",getValue("String", contact_address2));
        addParameters(parameters,"contact_city",getValue("String", contact_city));
        addParameters(parameters,"contact_state",getValue("String", contact_state));
        addParameters(parameters,"contact_zip",getValue("String", contact_zip));
        addParameters(parameters,"contact_phone",getValue("String", contact_phone));
        addParameters(parameters,"contact_email",getValue("String", contact_email));
        addParameters(parameters,"billing_contact",getValue("String", billing_contact));
        addParameters(parameters,"billing_address1",getValue("String", billing_address1));
        addParameters(parameters,"billing_address2",getValue("String", billing_address2));
        addParameters(parameters,"billing_city",getValue("String", billing_city));
        addParameters(parameters,"billing_state",getValue("String", billing_state));
        addParameters(parameters,"billing_zip",getValue("String", billing_zip));
        addParameters(parameters,"billing_phone",getValue("String", billing_phone));
        addParameters(parameters,"billing_email",getValue("String", billing_email));
        addParameters(parameters,"contact_country",getValue("String", contact_country));
        addParameters(parameters,"contact_locality",getValue("String", contact_locality));
        addParameters(parameters,"billing_country",getValue("String", billing_country));
        addParameters(parameters,"billing_locality",getValue("String", billing_locality));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("set_company_profile"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[32];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "client_name";
        returnValues[3] = "domain";
        returnValues[4] = "address1";
        returnValues[5] = "address2";
        returnValues[6] = "city";
        returnValues[7] = "locality";
        returnValues[8] = "state_prov";
        returnValues[9] = "country";
        returnValues[10] = "postal_code";
        returnValues[11] = "phone";
        returnValues[12] = "contact";
        returnValues[13] = "contact_address1";
        returnValues[14] = "contact_address2";
        returnValues[15] = "contact_city";
        returnValues[16] = "contact_state";
        returnValues[17] = "contact_zip";
        returnValues[18] = "contact_phone";
        returnValues[19] = "contact_email";
        returnValues[20] = "billing_contact";
        returnValues[21] = "billing_address1";
        returnValues[22] = "billing_address2";
        returnValues[23] = "billing_city";
        returnValues[24] = "billing_state";
        returnValues[25] = "billing_zip";
        returnValues[26] = "billing_phone";
        returnValues[27] = "billing_email";
        returnValues[28] = "contact_country";
        returnValues[29] = "contact_locality";
        returnValues[30] = "billing_country";
        returnValues[31] = "billing_locality";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> setCompanyProfile(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String domain = (String) map.get("domain");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state_prov = (String) map.get("state_prov");
                String country = (String) map.get("country");
                String postal_code = (String) map.get("postal_code");
                String phone = (String) map.get("phone");
                String contact = (String) map.get("contact");
                String contact_address1 = (String) map.get("contact_address1");
                String contact_address2 = (String) map.get("contact_address2");
                String contact_city = (String) map.get("contact_city");
                String contact_state = (String) map.get("contact_state");
                String contact_zip = (String) map.get("contact_zip");
                String contact_phone = (String) map.get("contact_phone");
                String contact_email = (String) map.get("contact_email");
                String billing_contact = (String) map.get("billing_contact");
                String billing_address1 = (String) map.get("billing_address1");
                String billing_address2 = (String) map.get("billing_address2");
                String billing_city = (String) map.get("billing_city");
                String billing_state = (String) map.get("billing_state");
                String billing_zip = (String) map.get("billing_zip");
                String billing_phone = (String) map.get("billing_phone");
                String billing_email = (String) map.get("billing_email");
                String contact_country = (String) map.get("contact_country");
                String contact_locality = (String) map.get("contact_locality");
                String billing_country = (String) map.get("billing_country");
                String billing_locality = (String) map.get("billing_locality");
                
        return setCompanyProfile(client_no, auth_key, domain, address1, address2, city, locality, state_prov, country, postal_code, phone, contact, contact_address1, contact_address2, contact_city, contact_state, contact_zip, contact_phone, contact_email, billing_contact, billing_address1, billing_address2, billing_city, billing_state, billing_zip, billing_phone, billing_email, contact_country, contact_locality, billing_country, billing_locality);
    }

    public Map<String,Object> getInventoryItems(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_inventory_items"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "inventory_items";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInventoryItems(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getInventoryItems(client_no, auth_key);
    }

    public Map<String,Object> getInventoryItemDetails(Long client_no, String auth_key, Long item_no, String client_item_id, String currency_cd){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"item_no",getValue("Long", item_no));
        addParameters(parameters,"client_item_id",getValue("String", client_item_id));
        addParameters(parameters,"currency_cd",getValue("String", currency_cd));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_inventory_item_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[23];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "item_no";
        returnValues[3] = "client_item_id";
        returnValues[4] = "item_type";
        returnValues[5] = "item_name";
        returnValues[6] = "item_desc";
        returnValues[7] = "active_ind";
        returnValues[8] = "service_no";
        returnValues[9] = "client_service_id";
        returnValues[10] = "invoice_advancement_months";
        returnValues[11] = "plan_no";
        returnValues[12] = "client_plan_id";
        returnValues[13] = "client_sku";
        returnValues[14] = "pricing";
        returnValues[15] = "modify_price_ind";
        returnValues[16] = "subunit_qty";
        returnValues[17] = "subunit_label";
        returnValues[18] = "days_to_expiry";
        returnValues[19] = "resources";
        returnValues[20] = "stock_level";
        returnValues[21] = "image";
        returnValues[22] = "supplemental_obj_fields";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInventoryItemDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long item_no = (Long) map.get("item_no");
                String client_item_id = (String) map.get("client_item_id");
                String currency_cd = (String) map.get("currency_cd");
                
        return getInventoryItemDetails(client_no, auth_key, item_no, client_item_id, currency_cd);
    }

    public Map<String,Object> createInventoryItem(Long client_no, String auth_key, Long item_type, String item_name, String item_desc, com.aria.common.shared.admin.ServiceArray service, String client_sku, String currency_cd, String item_price, String client_item_id, Long active_ind, Long invoice_advancement_months, Long plan_no, String client_plan_id, Long tax_inclusive_ind, String modify_price_ind, Long subunit_qty, String subunit_label, Long days_to_expiry, String resource_type_no, String resource_units, Long stock_level_track, Double stock_level_adjust, com.aria.common.shared.admin.ImageArray image, com.aria.common.shared.admin.ParentClassArray parent_class, com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"item_type",getValue("Long", item_type));
        addParameters(parameters,"item_name",getValue("String", item_name));
        addParameters(parameters,"item_desc",getValue("String", item_desc));
        RestUtilities.addParameterValuesFromArray(parameters,service);
        addParameters(parameters,"client_sku",getValue("String", client_sku));
        addParameters(parameters,"currency_cd",getValue("String", currency_cd));
        addParameters(parameters,"item_price",getValue("String", item_price));
        addParameters(parameters,"client_item_id",getValue("String", client_item_id));
        addParameters(parameters,"active_ind",getValue("Long", active_ind));
        addParameters(parameters,"invoice_advancement_months",getValue("Long", invoice_advancement_months));
        addParameters(parameters,"plan_no",getValue("Long", plan_no));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        addParameters(parameters,"tax_inclusive_ind",getValue("Long", tax_inclusive_ind));
        addParameters(parameters,"modify_price_ind",getValue("String", modify_price_ind));
        addParameters(parameters,"subunit_qty",getValue("Long", subunit_qty));
        addParameters(parameters,"subunit_label",getValue("String", subunit_label));
        addParameters(parameters,"days_to_expiry",getValue("Long", days_to_expiry));
        addParameters(parameters,"resource_type_no",getValue("String", resource_type_no));
        addParameters(parameters,"resource_units",getValue("String", resource_units));
        addParameters(parameters,"stock_level_track",getValue("Long", stock_level_track));
        addParameters(parameters,"stock_level_adjust",getValue("Double", stock_level_adjust));
        RestUtilities.addParameterValuesFromArray(parameters,image);
        RestUtilities.addParameterValuesFromArray(parameters,parent_class);
        RestUtilities.addParameterValuesFromArray(parameters,supplemental_obj_field);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_inventory_item"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[4];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "item_no";
        returnValues[3] = "currency_cd";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createInventoryItem(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long item_type = (Long) map.get("item_type");
                String item_name = (String) map.get("item_name");
                String item_desc = (String) map.get("item_desc");
                com.aria.common.shared.admin.ServiceArray service = (com.aria.common.shared.admin.ServiceArray) map.get("service");
                String client_sku = (String) map.get("client_sku");
                String currency_cd = (String) map.get("currency_cd");
                String item_price = (String) map.get("item_price");
                String client_item_id = (String) map.get("client_item_id");
                Long active_ind = (Long) map.get("active_ind");
                Long invoice_advancement_months = (Long) map.get("invoice_advancement_months");
                Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                Long tax_inclusive_ind = (Long) map.get("tax_inclusive_ind");
                String modify_price_ind = (String) map.get("modify_price_ind");
                Long subunit_qty = (Long) map.get("subunit_qty");
                String subunit_label = (String) map.get("subunit_label");
                Long days_to_expiry = (Long) map.get("days_to_expiry");
                String resource_type_no = (String) map.get("resource_type_no");
                String resource_units = (String) map.get("resource_units");
                Long stock_level_track = (Long) map.get("stock_level_track");
                Double stock_level_adjust = (Double) map.get("stock_level_adjust");
                com.aria.common.shared.admin.ImageArray image = (com.aria.common.shared.admin.ImageArray) map.get("image");
                com.aria.common.shared.admin.ParentClassArray parent_class = (com.aria.common.shared.admin.ParentClassArray) map.get("parent_class");
                com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field = (com.aria.common.shared.admin.SupplementalObjFieldArray) map.get("supplemental_obj_field");
                
        return createInventoryItem(client_no, auth_key, item_type, item_name, item_desc, service, client_sku, currency_cd, item_price, client_item_id, active_ind, invoice_advancement_months, plan_no, client_plan_id, tax_inclusive_ind, modify_price_ind, subunit_qty, subunit_label, days_to_expiry, resource_type_no, resource_units, stock_level_track, stock_level_adjust, image, parent_class, supplemental_obj_field);
    }

    public Map<String,Object> updateInventoryItem(Long client_no, String auth_key, String item_no, String item_name, String item_desc, String client_item_id, Long service_no, String client_service_id, String currency_cd, String item_price, Long active_ind, Long invoice_advancement_months, Long plan_no, String client_plan_id, String modify_price_ind, Long subunit_qty, String subunit_label, Long days_to_expiry, String resource_type_no, String resource_units, Long stock_level_track, Double stock_level_adjust, com.aria.common.shared.admin.ImageArray image, com.aria.common.shared.admin.ParentClassArray parent_class, com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"item_no",getValue("String", item_no));
        addParameters(parameters,"item_name",getValue("String", item_name));
        addParameters(parameters,"item_desc",getValue("String", item_desc));
        addParameters(parameters,"client_item_id",getValue("String", client_item_id));
        addParameters(parameters,"service_no",getValue("Long", service_no));
        addParameters(parameters,"client_service_id",getValue("String", client_service_id));
        addParameters(parameters,"currency_cd",getValue("String", currency_cd));
        addParameters(parameters,"item_price",getValue("String", item_price));
        addParameters(parameters,"active_ind",getValue("Long", active_ind));
        addParameters(parameters,"invoice_advancement_months",getValue("Long", invoice_advancement_months));
        addParameters(parameters,"plan_no",getValue("Long", plan_no));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        addParameters(parameters,"modify_price_ind",getValue("String", modify_price_ind));
        addParameters(parameters,"subunit_qty",getValue("Long", subunit_qty));
        addParameters(parameters,"subunit_label",getValue("String", subunit_label));
        addParameters(parameters,"days_to_expiry",getValue("Long", days_to_expiry));
        addParameters(parameters,"resource_type_no",getValue("String", resource_type_no));
        addParameters(parameters,"resource_units",getValue("String", resource_units));
        addParameters(parameters,"stock_level_track",getValue("Long", stock_level_track));
        addParameters(parameters,"stock_level_adjust",getValue("Double", stock_level_adjust));
        RestUtilities.addParameterValuesFromArray(parameters,image);
        RestUtilities.addParameterValuesFromArray(parameters,parent_class);
        RestUtilities.addParameterValuesFromArray(parameters,supplemental_obj_field);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_inventory_item"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[4];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "item_no";
        returnValues[3] = "currency_cd";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateInventoryItem(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String item_no = (String) map.get("item_no");
                String item_name = (String) map.get("item_name");
                String item_desc = (String) map.get("item_desc");
                String client_item_id = (String) map.get("client_item_id");
                Long service_no = (Long) map.get("service_no");
                String client_service_id = (String) map.get("client_service_id");
                String currency_cd = (String) map.get("currency_cd");
                String item_price = (String) map.get("item_price");
                Long active_ind = (Long) map.get("active_ind");
                Long invoice_advancement_months = (Long) map.get("invoice_advancement_months");
                Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                String modify_price_ind = (String) map.get("modify_price_ind");
                Long subunit_qty = (Long) map.get("subunit_qty");
                String subunit_label = (String) map.get("subunit_label");
                Long days_to_expiry = (Long) map.get("days_to_expiry");
                String resource_type_no = (String) map.get("resource_type_no");
                String resource_units = (String) map.get("resource_units");
                Long stock_level_track = (Long) map.get("stock_level_track");
                Double stock_level_adjust = (Double) map.get("stock_level_adjust");
                com.aria.common.shared.admin.ImageArray image = (com.aria.common.shared.admin.ImageArray) map.get("image");
                com.aria.common.shared.admin.ParentClassArray parent_class = (com.aria.common.shared.admin.ParentClassArray) map.get("parent_class");
                com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field = (com.aria.common.shared.admin.SupplementalObjFieldArray) map.get("supplemental_obj_field");
                
        return updateInventoryItem(client_no, auth_key, item_no, item_name, item_desc, client_item_id, service_no, client_service_id, currency_cd, item_price, active_ind, invoice_advancement_months, plan_no, client_plan_id, modify_price_ind, subunit_qty, subunit_label, days_to_expiry, resource_type_no, resource_units, stock_level_track, stock_level_adjust, image, parent_class, supplemental_obj_field);
    }

    public Map<String,Object> createItemClass(Long client_no, String auth_key, String class_name, String class_desc, Long active_ind, String client_inventory_class_id, com.aria.common.shared.admin.ParentClassArray parent_class){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"class_name",getValue("String", class_name));
        addParameters(parameters,"class_desc",getValue("String", class_desc));
        addParameters(parameters,"active_ind",getValue("Long", active_ind));
        addParameters(parameters,"client_inventory_class_id",getValue("String", client_inventory_class_id));
        RestUtilities.addParameterValuesFromArray(parameters,parent_class);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_item_class"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "class_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createItemClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String class_name = (String) map.get("class_name");
                String class_desc = (String) map.get("class_desc");
                Long active_ind = (Long) map.get("active_ind");
                String client_inventory_class_id = (String) map.get("client_inventory_class_id");
                com.aria.common.shared.admin.ParentClassArray parent_class = (com.aria.common.shared.admin.ParentClassArray) map.get("parent_class");
                
        return createItemClass(client_no, auth_key, class_name, class_desc, active_ind, client_inventory_class_id, parent_class);
    }

    public Map<String,Object> editItemClass(Long client_no, String auth_key, String class_no, String class_name, String client_inventory_class_id, String class_desc, Long active_ind, com.aria.common.shared.admin.ParentClassArray parent_class){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"class_no",getValue("String", class_no));
        addParameters(parameters,"class_name",getValue("String", class_name));
        addParameters(parameters,"client_inventory_class_id",getValue("String", client_inventory_class_id));
        addParameters(parameters,"class_desc",getValue("String", class_desc));
        addParameters(parameters,"active_ind",getValue("Long", active_ind));
        RestUtilities.addParameterValuesFromArray(parameters,parent_class);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("edit_item_class"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "class_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> editItemClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String class_no = (String) map.get("class_no");
                String class_name = (String) map.get("class_name");
                String client_inventory_class_id = (String) map.get("client_inventory_class_id");
                String class_desc = (String) map.get("class_desc");
                Long active_ind = (Long) map.get("active_ind");
                com.aria.common.shared.admin.ParentClassArray parent_class = (com.aria.common.shared.admin.ParentClassArray) map.get("parent_class");
                
        return editItemClass(client_no, auth_key, class_no, class_name, client_inventory_class_id, class_desc, active_ind, parent_class);
    }

    public Map<String,Object> getServiceTypes(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_service_types"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "service_types";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getServiceTypes(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getServiceTypes(client_no, auth_key);
    }

    public Map<String,Object> getServices(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_services"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "services";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getServices(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getServices(client_no, auth_key);
    }

    public Map<String,Object> getServiceDetails(Long client_no, String auth_key, Long service_no, String client_service_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"service_no",getValue("Long", service_no));
        addParameters(parameters,"client_service_id",getValue("String", client_service_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_service_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[11];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "service_no";
        returnValues[3] = "client_service_id";
        returnValues[4] = "service_name";
        returnValues[5] = "service_type";
        returnValues[6] = "gl_cd";
        returnValues[7] = "taxable_ind";
        returnValues[8] = "tax_group";
        returnValues[9] = "client_tax_group_id";
        returnValues[10] = "usage_type";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getServiceDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long service_no = (Long) map.get("service_no");
                String client_service_id = (String) map.get("client_service_id");
                
        return getServiceDetails(client_no, auth_key, service_no, client_service_id);
    }

    public Map<String,Object> getPlanServiceDetails(Long client_no, String auth_key, Long service_no, String client_service_id, Long plan_no, String client_plan_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"service_no",getValue("Long", service_no));
        addParameters(parameters,"client_service_id",getValue("String", client_service_id));
        addParameters(parameters,"plan_no",getValue("Long", plan_no));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_plan_service_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[20];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_no";
        returnValues[3] = "client_plan_id";
        returnValues[4] = "currency_cd";
        returnValues[5] = "service_no";
        returnValues[6] = "service_name";
        returnValues[7] = "service_type";
        returnValues[8] = "client_service_id";
        returnValues[9] = "taxable_ind";
        returnValues[10] = "tax_group";
        returnValues[11] = "client_tax_group_id";
        returnValues[12] = "gl_cd";
        returnValues[13] = "usage_type";
        returnValues[14] = "rate_type";
        returnValues[15] = "rate_schedules";
        returnValues[16] = "parent_plans";
        returnValues[17] = "parent_plan_ids";
        returnValues[18] = "exclusion_plans";
        returnValues[19] = "supplemental_obj_fields";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlanServiceDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long service_no = (Long) map.get("service_no");
                String client_service_id = (String) map.get("client_service_id");
                Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getPlanServiceDetails(client_no, auth_key, service_no, client_service_id, plan_no, client_plan_id);
    }

    public Map<String,Object> createService(Long client_no, String auth_key, String service_name, String service_type, String gl_cd, String taxable_ind, String tax_group, String usage_type, String client_service_id, com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"service_name",getValue("String", service_name));
        addParameters(parameters,"service_type",getValue("String", service_type));
        addParameters(parameters,"gl_cd",getValue("String", gl_cd));
        addParameters(parameters,"taxable_ind",getValue("String", taxable_ind));
        addParameters(parameters,"tax_group",getValue("String", tax_group));
        addParameters(parameters,"usage_type",getValue("String", usage_type));
        addParameters(parameters,"client_service_id",getValue("String", client_service_id));
        RestUtilities.addParameterValuesFromArray(parameters,supplemental_obj_field);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_service"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "service_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createService(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String service_name = (String) map.get("service_name");
                String service_type = (String) map.get("service_type");
                String gl_cd = (String) map.get("gl_cd");
                String taxable_ind = (String) map.get("taxable_ind");
                String tax_group = (String) map.get("tax_group");
                String usage_type = (String) map.get("usage_type");
                String client_service_id = (String) map.get("client_service_id");
                com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field = (com.aria.common.shared.admin.SupplementalObjFieldArray) map.get("supplemental_obj_field");
                
        return createService(client_no, auth_key, service_name, service_type, gl_cd, taxable_ind, tax_group, usage_type, client_service_id, supplemental_obj_field);
    }

    public Map<String,Object> updateService(Long client_no, String auth_key, Long service_no, String service_name, String service_type, String client_service_id, String gl_cd, String taxable_ind, String tax_group, String usage_type){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"service_no",getValue("Long", service_no));
        addParameters(parameters,"service_name",getValue("String", service_name));
        addParameters(parameters,"service_type",getValue("String", service_type));
        addParameters(parameters,"client_service_id",getValue("String", client_service_id));
        addParameters(parameters,"gl_cd",getValue("String", gl_cd));
        addParameters(parameters,"taxable_ind",getValue("String", taxable_ind));
        addParameters(parameters,"tax_group",getValue("String", tax_group));
        addParameters(parameters,"usage_type",getValue("String", usage_type));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_service"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "service_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateService(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long service_no = (Long) map.get("service_no");
                String service_name = (String) map.get("service_name");
                String service_type = (String) map.get("service_type");
                String client_service_id = (String) map.get("client_service_id");
                String gl_cd = (String) map.get("gl_cd");
                String taxable_ind = (String) map.get("taxable_ind");
                String tax_group = (String) map.get("tax_group");
                String usage_type = (String) map.get("usage_type");
                
        return updateService(client_no, auth_key, service_no, service_name, service_type, client_service_id, gl_cd, taxable_ind, tax_group, usage_type);
    }

    public Map<String,Object> getSuppFields(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_supp_fields"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "supp_fields";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppFields(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getSuppFields(client_no, auth_key);
    }

    public Map<String,Object> getSuppFieldDetails(Long client_no, String auth_key, String field_name){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"field_name",getValue("String", field_name));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_supp_field_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[13];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "field_name";
        returnValues[3] = "field_desc";
        returnValues[4] = "field_order";
        returnValues[5] = "required_ind";
        returnValues[6] = "hidden_ind";
        returnValues[7] = "presentation_mode";
        returnValues[8] = "min_no_sel";
        returnValues[9] = "max_no_sel";
        returnValues[10] = "additional_html";
        returnValues[11] = "extra_validation_methods";
        returnValues[12] = "field_options";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppFieldDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String field_name = (String) map.get("field_name");
                
        return getSuppFieldDetails(client_no, auth_key, field_name);
    }

    public Map<String,Object> createSuppField(Long client_no, String auth_key, String field_name, Long field_order, String presentation_mode, String field_desc, Long required_ind, Long hidden_ind, Long sel_ind, Long min_no_sel, Long max_no_sel, String display_text, String option_value, Long option_value_order){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"field_name",getValue("String", field_name));
        addParameters(parameters,"field_order",getValue("Long", field_order));
        addParameters(parameters,"presentation_mode",getValue("String", presentation_mode));
        addParameters(parameters,"field_desc",getValue("String", field_desc));
        addParameters(parameters,"required_ind",getValue("Long", required_ind));
        addParameters(parameters,"hidden_ind",getValue("Long", hidden_ind));
        addParameters(parameters,"sel_ind",getValue("Long", sel_ind));
        addParameters(parameters,"min_no_sel",getValue("Long", min_no_sel));
        addParameters(parameters,"max_no_sel",getValue("Long", max_no_sel));
        addParameters(parameters,"display_text",getValue("String", display_text));
        addParameters(parameters,"option_value",getValue("String", option_value));
        addParameters(parameters,"option_value_order",getValue("Long", option_value_order));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_supp_field"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "field_name";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createSuppField(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String field_name = (String) map.get("field_name");
                Long field_order = (Long) map.get("field_order");
                String presentation_mode = (String) map.get("presentation_mode");
                String field_desc = (String) map.get("field_desc");
                Long required_ind = (Long) map.get("required_ind");
                Long hidden_ind = (Long) map.get("hidden_ind");
                Long sel_ind = (Long) map.get("sel_ind");
                Long min_no_sel = (Long) map.get("min_no_sel");
                Long max_no_sel = (Long) map.get("max_no_sel");
                String display_text = (String) map.get("display_text");
                String option_value = (String) map.get("option_value");
                Long option_value_order = (Long) map.get("option_value_order");
                
        return createSuppField(client_no, auth_key, field_name, field_order, presentation_mode, field_desc, required_ind, hidden_ind, sel_ind, min_no_sel, max_no_sel, display_text, option_value, option_value_order);
    }

    public Map<String,Object> updateSuppField(Long client_no, String auth_key, String field_name, String field_desc, Long field_order, Long required_ind, Long hidden_ind, Long sel_ind, String presentation_mode, Long min_no_sel, Long max_no_sel, String display_text, String option_value, Long option_value_order){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"field_name",getValue("String", field_name));
        addParameters(parameters,"field_desc",getValue("String", field_desc));
        addParameters(parameters,"field_order",getValue("Long", field_order));
        addParameters(parameters,"required_ind",getValue("Long", required_ind));
        addParameters(parameters,"hidden_ind",getValue("Long", hidden_ind));
        addParameters(parameters,"sel_ind",getValue("Long", sel_ind));
        addParameters(parameters,"presentation_mode",getValue("String", presentation_mode));
        addParameters(parameters,"min_no_sel",getValue("Long", min_no_sel));
        addParameters(parameters,"max_no_sel",getValue("Long", max_no_sel));
        addParameters(parameters,"display_text",getValue("String", display_text));
        addParameters(parameters,"option_value",getValue("String", option_value));
        addParameters(parameters,"option_value_order",getValue("Long", option_value_order));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_supp_field"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "field_name";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateSuppField(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String field_name = (String) map.get("field_name");
                String field_desc = (String) map.get("field_desc");
                Long field_order = (Long) map.get("field_order");
                Long required_ind = (Long) map.get("required_ind");
                Long hidden_ind = (Long) map.get("hidden_ind");
                Long sel_ind = (Long) map.get("sel_ind");
                String presentation_mode = (String) map.get("presentation_mode");
                Long min_no_sel = (Long) map.get("min_no_sel");
                Long max_no_sel = (Long) map.get("max_no_sel");
                String display_text = (String) map.get("display_text");
                String option_value = (String) map.get("option_value");
                Long option_value_order = (Long) map.get("option_value_order");
                
        return updateSuppField(client_no, auth_key, field_name, field_desc, field_order, required_ind, hidden_ind, sel_ind, presentation_mode, min_no_sel, max_no_sel, display_text, option_value, option_value_order);
    }

    public Map<String,Object> getCoupons(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_coupons"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coupons";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCoupons(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getCoupons(client_no, auth_key);
    }

    public Map<String,Object> getCouponDetails(Long client_no, String auth_key, String coupon_cd){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"coupon_cd",getValue("String", coupon_cd));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_coupon_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[12];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coupon_cd";
        returnValues[3] = "coupon_desc";
        returnValues[4] = "coupon_msg";
        returnValues[5] = "status_ind";
        returnValues[6] = "no_of_uses";
        returnValues[7] = "start_date";
        returnValues[8] = "end_date";
        returnValues[9] = "credit_template";
        returnValues[10] = "discount_rule";
        returnValues[11] = "discount_bundle";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCouponDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String coupon_cd = (String) map.get("coupon_cd");
                
        return getCouponDetails(client_no, auth_key, coupon_cd);
    }

    public Map<String,Object> createCoupon(Long client_no, String auth_key, String coupon_cd, Long status_ind, String start_date, String end_date, String coupon_desc, String coupon_msg, Long no_of_uses, com.aria.common.shared.admin.TemplateArray template, com.aria.common.shared.admin.ExistingTemplateArray existing_template, com.aria.common.shared.admin.ExistingTemplateIdArray existing_template_id, com.aria.common.shared.admin.DiscountRuleArray discount_rule, com.aria.common.shared.admin.ExistingDiscountRuleArray existing_discount_rule, com.aria.common.shared.admin.ExistingDiscountRuleIdArray existing_discount_rule_id, com.aria.common.shared.admin.DiscountBundleArray discount_bundle, com.aria.common.shared.admin.ExistingDiscountBundleArray existing_discount_bundle, com.aria.common.shared.admin.ExistingDiscountBundleIdArray existing_discount_bundle_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"coupon_cd",getValue("String", coupon_cd));
        addParameters(parameters,"status_ind",getValue("Long", status_ind));
        addParameters(parameters,"start_date",getValue("String", start_date));
        addParameters(parameters,"end_date",getValue("String", end_date));
        addParameters(parameters,"coupon_desc",getValue("String", coupon_desc));
        addParameters(parameters,"coupon_msg",getValue("String", coupon_msg));
        addParameters(parameters,"no_of_uses",getValue("Long", no_of_uses));
        RestUtilities.addParameterValuesFromArray(parameters,template);
        RestUtilities.addParameterValuesFromArray(parameters,existing_template);
        RestUtilities.addParameterValuesFromArray(parameters,existing_template_id);
        RestUtilities.addParameterValuesFromArray(parameters,discount_rule);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_rule);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_rule_id);
        RestUtilities.addParameterValuesFromArray(parameters,discount_bundle);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_bundle);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_bundle_id);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_coupon"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coupon_cd";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createCoupon(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String coupon_cd = (String) map.get("coupon_cd");
                Long status_ind = (Long) map.get("status_ind");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                String coupon_desc = (String) map.get("coupon_desc");
                String coupon_msg = (String) map.get("coupon_msg");
                Long no_of_uses = (Long) map.get("no_of_uses");
                com.aria.common.shared.admin.TemplateArray template = (com.aria.common.shared.admin.TemplateArray) map.get("template");
                com.aria.common.shared.admin.ExistingTemplateArray existing_template = (com.aria.common.shared.admin.ExistingTemplateArray) map.get("existing_template");
                com.aria.common.shared.admin.ExistingTemplateIdArray existing_template_id = (com.aria.common.shared.admin.ExistingTemplateIdArray) map.get("existing_template_id");
                com.aria.common.shared.admin.DiscountRuleArray discount_rule = (com.aria.common.shared.admin.DiscountRuleArray) map.get("discount_rule");
                com.aria.common.shared.admin.ExistingDiscountRuleArray existing_discount_rule = (com.aria.common.shared.admin.ExistingDiscountRuleArray) map.get("existing_discount_rule");
                com.aria.common.shared.admin.ExistingDiscountRuleIdArray existing_discount_rule_id = (com.aria.common.shared.admin.ExistingDiscountRuleIdArray) map.get("existing_discount_rule_id");
                com.aria.common.shared.admin.DiscountBundleArray discount_bundle = (com.aria.common.shared.admin.DiscountBundleArray) map.get("discount_bundle");
                com.aria.common.shared.admin.ExistingDiscountBundleArray existing_discount_bundle = (com.aria.common.shared.admin.ExistingDiscountBundleArray) map.get("existing_discount_bundle");
                com.aria.common.shared.admin.ExistingDiscountBundleIdArray existing_discount_bundle_id = (com.aria.common.shared.admin.ExistingDiscountBundleIdArray) map.get("existing_discount_bundle_id");
                
        return createCoupon(client_no, auth_key, coupon_cd, status_ind, start_date, end_date, coupon_desc, coupon_msg, no_of_uses, template, existing_template, existing_template_id, discount_rule, existing_discount_rule, existing_discount_rule_id, discount_bundle, existing_discount_bundle, existing_discount_bundle_id);
    }

    public Map<String,Object> updateCoupon(Long client_no, String auth_key, String coupon_cd, Long status_ind, String start_date, String end_date, String coupon_desc, String coupon_msg, Long no_of_uses, com.aria.common.shared.admin.TemplateArray template, com.aria.common.shared.admin.ExistingTemplateArray existing_template, com.aria.common.shared.admin.ExistingTemplateIdArray existing_template_id, com.aria.common.shared.admin.DiscountRuleArray discount_rule, com.aria.common.shared.admin.ExistingDiscountRuleArray existing_discount_rule, com.aria.common.shared.admin.ExistingDiscountRuleIdArray existing_discount_rule_id, com.aria.common.shared.admin.DiscountBundleArray discount_bundle, com.aria.common.shared.admin.ExistingDiscountBundleArray existing_discount_bundle, com.aria.common.shared.admin.ExistingDiscountBundleIdArray existing_discount_bundle_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"coupon_cd",getValue("String", coupon_cd));
        addParameters(parameters,"status_ind",getValue("Long", status_ind));
        addParameters(parameters,"start_date",getValue("String", start_date));
        addParameters(parameters,"end_date",getValue("String", end_date));
        addParameters(parameters,"coupon_desc",getValue("String", coupon_desc));
        addParameters(parameters,"coupon_msg",getValue("String", coupon_msg));
        addParameters(parameters,"no_of_uses",getValue("Long", no_of_uses));
        RestUtilities.addParameterValuesFromArray(parameters,template);
        RestUtilities.addParameterValuesFromArray(parameters,existing_template);
        RestUtilities.addParameterValuesFromArray(parameters,existing_template_id);
        RestUtilities.addParameterValuesFromArray(parameters,discount_rule);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_rule);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_rule_id);
        RestUtilities.addParameterValuesFromArray(parameters,discount_bundle);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_bundle);
        RestUtilities.addParameterValuesFromArray(parameters,existing_discount_bundle_id);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_coupon"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coupon_cd";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateCoupon(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String coupon_cd = (String) map.get("coupon_cd");
                Long status_ind = (Long) map.get("status_ind");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                String coupon_desc = (String) map.get("coupon_desc");
                String coupon_msg = (String) map.get("coupon_msg");
                Long no_of_uses = (Long) map.get("no_of_uses");
                com.aria.common.shared.admin.TemplateArray template = (com.aria.common.shared.admin.TemplateArray) map.get("template");
                com.aria.common.shared.admin.ExistingTemplateArray existing_template = (com.aria.common.shared.admin.ExistingTemplateArray) map.get("existing_template");
                com.aria.common.shared.admin.ExistingTemplateIdArray existing_template_id = (com.aria.common.shared.admin.ExistingTemplateIdArray) map.get("existing_template_id");
                com.aria.common.shared.admin.DiscountRuleArray discount_rule = (com.aria.common.shared.admin.DiscountRuleArray) map.get("discount_rule");
                com.aria.common.shared.admin.ExistingDiscountRuleArray existing_discount_rule = (com.aria.common.shared.admin.ExistingDiscountRuleArray) map.get("existing_discount_rule");
                com.aria.common.shared.admin.ExistingDiscountRuleIdArray existing_discount_rule_id = (com.aria.common.shared.admin.ExistingDiscountRuleIdArray) map.get("existing_discount_rule_id");
                com.aria.common.shared.admin.DiscountBundleArray discount_bundle = (com.aria.common.shared.admin.DiscountBundleArray) map.get("discount_bundle");
                com.aria.common.shared.admin.ExistingDiscountBundleArray existing_discount_bundle = (com.aria.common.shared.admin.ExistingDiscountBundleArray) map.get("existing_discount_bundle");
                com.aria.common.shared.admin.ExistingDiscountBundleIdArray existing_discount_bundle_id = (com.aria.common.shared.admin.ExistingDiscountBundleIdArray) map.get("existing_discount_bundle_id");
                
        return updateCoupon(client_no, auth_key, coupon_cd, status_ind, start_date, end_date, coupon_desc, coupon_msg, no_of_uses, template, existing_template, existing_template_id, discount_rule, existing_discount_rule, existing_discount_rule_id, discount_bundle, existing_discount_bundle, existing_discount_bundle_id);
    }

    public Map<String,Object> deleteCoupons(Long client_no, String auth_key, com.aria.common.shared.admin.CouponNosArray coupon_nos){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        RestUtilities.addParameterValuesFromArray(parameters,coupon_nos);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("delete_coupons"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coupons";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteCoupons(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.admin.CouponNosArray coupon_nos = (com.aria.common.shared.admin.CouponNosArray) map.get("coupon_nos");
                
        return deleteCoupons(client_no, auth_key, coupon_nos);
    }

    public Map<String,Object> getRecurringCreditTemplates(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_recurring_credit_templates"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "credit_templates";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRecurringCreditTemplates(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getRecurringCreditTemplates(client_no, auth_key);
    }

    public Map<String,Object> getRecurringCreditTemplateDetails(Long client_no, String auth_key, Long credit_template_no, String client_credit_template_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"credit_template_no",getValue("Long", credit_template_no));
        addParameters(parameters,"client_credit_template_id",getValue("String", client_credit_template_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_recurring_credit_template_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[21];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "recurring_credit_template_no";
        returnValues[3] = "credit_template_name";
        returnValues[4] = "client_credit_template_id";
        returnValues[5] = "eligible_plan_no";
        returnValues[6] = "eligible_client_plan_id";
        returnValues[7] = "eligible_service_no";
        returnValues[8] = "eligible_client_service_id";
        returnValues[9] = "eligible_service_types";
        returnValues[10] = "no_of_credits";
        returnValues[11] = "time_between_credits";
        returnValues[12] = "discount_type";
        returnValues[13] = "discount_amt";
        returnValues[14] = "percentage_plan_no";
        returnValues[15] = "percentage_client_plan_id";
        returnValues[16] = "percentage_service_no";
        returnValues[17] = "percentage_client_service_id";
        returnValues[18] = "alt_service_no";
        returnValues[19] = "alt_client_service_id";
        returnValues[20] = "coupons";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRecurringCreditTemplateDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long credit_template_no = (Long) map.get("credit_template_no");
                String client_credit_template_id = (String) map.get("client_credit_template_id");
                
        return getRecurringCreditTemplateDetails(client_no, auth_key, credit_template_no, client_credit_template_id);
    }

    public Map<String,Object> createCreditTemplate(Long client_no, String auth_key, String credit_template_name, Long discount_type, Double discount_amt, Long no_of_credits, Long credit_interval_months, Long eligible_plan_no, String eligible_client_plan_id, Long eligible_service_no, String eligible_client_service_id, com.aria.common.shared.admin.EligibleServiceTypesArray eligible_service_types, Long percentage_plan_no, String percentage_client_plan_id, Long percentage_service_no, String percentage_client_service_id, Long alt_service_no, String alt_client_service_id, String client_credit_template_id, com.aria.common.shared.admin.CouponArray coupon, com.aria.common.shared.admin.ExistingCouponArray existing_coupon){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"credit_template_name",getValue("String", credit_template_name));
        addParameters(parameters,"discount_type",getValue("Long", discount_type));
        addParameters(parameters,"discount_amt",getValue("Double", discount_amt));
        addParameters(parameters,"no_of_credits",getValue("Long", no_of_credits));
        addParameters(parameters,"credit_interval_months",getValue("Long", credit_interval_months));
        addParameters(parameters,"eligible_plan_no",getValue("Long", eligible_plan_no));
        addParameters(parameters,"eligible_client_plan_id",getValue("String", eligible_client_plan_id));
        addParameters(parameters,"eligible_service_no",getValue("Long", eligible_service_no));
        addParameters(parameters,"eligible_client_service_id",getValue("String", eligible_client_service_id));
        RestUtilities.addParameterValuesFromArray(parameters,eligible_service_types);
        addParameters(parameters,"percentage_plan_no",getValue("Long", percentage_plan_no));
        addParameters(parameters,"percentage_client_plan_id",getValue("String", percentage_client_plan_id));
        addParameters(parameters,"percentage_service_no",getValue("Long", percentage_service_no));
        addParameters(parameters,"percentage_client_service_id",getValue("String", percentage_client_service_id));
        addParameters(parameters,"alt_service_no",getValue("Long", alt_service_no));
        addParameters(parameters,"alt_client_service_id",getValue("String", alt_client_service_id));
        addParameters(parameters,"client_credit_template_id",getValue("String", client_credit_template_id));
        RestUtilities.addParameterValuesFromArray(parameters,coupon);
        RestUtilities.addParameterValuesFromArray(parameters,existing_coupon);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_credit_template"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "credit_template_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createCreditTemplate(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String credit_template_name = (String) map.get("credit_template_name");
                Long discount_type = (Long) map.get("discount_type");
                Double discount_amt = (Double) map.get("discount_amt");
                Long no_of_credits = (Long) map.get("no_of_credits");
                Long credit_interval_months = (Long) map.get("credit_interval_months");
                Long eligible_plan_no = (Long) map.get("eligible_plan_no");
                String eligible_client_plan_id = (String) map.get("eligible_client_plan_id");
                Long eligible_service_no = (Long) map.get("eligible_service_no");
                String eligible_client_service_id = (String) map.get("eligible_client_service_id");
                com.aria.common.shared.admin.EligibleServiceTypesArray eligible_service_types = (com.aria.common.shared.admin.EligibleServiceTypesArray) map.get("eligible_service_types");
                Long percentage_plan_no = (Long) map.get("percentage_plan_no");
                String percentage_client_plan_id = (String) map.get("percentage_client_plan_id");
                Long percentage_service_no = (Long) map.get("percentage_service_no");
                String percentage_client_service_id = (String) map.get("percentage_client_service_id");
                Long alt_service_no = (Long) map.get("alt_service_no");
                String alt_client_service_id = (String) map.get("alt_client_service_id");
                String client_credit_template_id = (String) map.get("client_credit_template_id");
                com.aria.common.shared.admin.CouponArray coupon = (com.aria.common.shared.admin.CouponArray) map.get("coupon");
                com.aria.common.shared.admin.ExistingCouponArray existing_coupon = (com.aria.common.shared.admin.ExistingCouponArray) map.get("existing_coupon");
                
        return createCreditTemplate(client_no, auth_key, credit_template_name, discount_type, discount_amt, no_of_credits, credit_interval_months, eligible_plan_no, eligible_client_plan_id, eligible_service_no, eligible_client_service_id, eligible_service_types, percentage_plan_no, percentage_client_plan_id, percentage_service_no, percentage_client_service_id, alt_service_no, alt_client_service_id, client_credit_template_id, coupon, existing_coupon);
    }

    public Map<String,Object> updateCreditTemplate(Long client_no, String auth_key, String credit_template_no, String credit_template_name, Long discount_type, Double discount_amt, Long no_of_credits, Long credit_interval_months, String client_credit_template_id, Long eligible_plan_no, String eligible_client_plan_id, Long eligible_service_no, String eligible_client_service_id, com.aria.common.shared.admin.EligibleServiceTypesArray eligible_service_types, Long percentage_plan_no, String percentage_client_plan_id, Long percentage_service_no, String percentage_client_service_id, Long alt_service_no, String alt_client_service_id, com.aria.common.shared.admin.CouponArray coupon, com.aria.common.shared.admin.ExistingCouponArray existing_coupon){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"credit_template_no",getValue("String", credit_template_no));
        addParameters(parameters,"credit_template_name",getValue("String", credit_template_name));
        addParameters(parameters,"discount_type",getValue("Long", discount_type));
        addParameters(parameters,"discount_amt",getValue("Double", discount_amt));
        addParameters(parameters,"no_of_credits",getValue("Long", no_of_credits));
        addParameters(parameters,"credit_interval_months",getValue("Long", credit_interval_months));
        addParameters(parameters,"client_credit_template_id",getValue("String", client_credit_template_id));
        addParameters(parameters,"eligible_plan_no",getValue("Long", eligible_plan_no));
        addParameters(parameters,"eligible_client_plan_id",getValue("String", eligible_client_plan_id));
        addParameters(parameters,"eligible_service_no",getValue("Long", eligible_service_no));
        addParameters(parameters,"eligible_client_service_id",getValue("String", eligible_client_service_id));
        RestUtilities.addParameterValuesFromArray(parameters,eligible_service_types);
        addParameters(parameters,"percentage_plan_no",getValue("Long", percentage_plan_no));
        addParameters(parameters,"percentage_client_plan_id",getValue("String", percentage_client_plan_id));
        addParameters(parameters,"percentage_service_no",getValue("Long", percentage_service_no));
        addParameters(parameters,"percentage_client_service_id",getValue("String", percentage_client_service_id));
        addParameters(parameters,"alt_service_no",getValue("Long", alt_service_no));
        addParameters(parameters,"alt_client_service_id",getValue("String", alt_client_service_id));
        RestUtilities.addParameterValuesFromArray(parameters,coupon);
        RestUtilities.addParameterValuesFromArray(parameters,existing_coupon);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_credit_template"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "credit_template_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateCreditTemplate(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String credit_template_no = (String) map.get("credit_template_no");
                String credit_template_name = (String) map.get("credit_template_name");
                Long discount_type = (Long) map.get("discount_type");
                Double discount_amt = (Double) map.get("discount_amt");
                Long no_of_credits = (Long) map.get("no_of_credits");
                Long credit_interval_months = (Long) map.get("credit_interval_months");
                String client_credit_template_id = (String) map.get("client_credit_template_id");
                Long eligible_plan_no = (Long) map.get("eligible_plan_no");
                String eligible_client_plan_id = (String) map.get("eligible_client_plan_id");
                Long eligible_service_no = (Long) map.get("eligible_service_no");
                String eligible_client_service_id = (String) map.get("eligible_client_service_id");
                com.aria.common.shared.admin.EligibleServiceTypesArray eligible_service_types = (com.aria.common.shared.admin.EligibleServiceTypesArray) map.get("eligible_service_types");
                Long percentage_plan_no = (Long) map.get("percentage_plan_no");
                String percentage_client_plan_id = (String) map.get("percentage_client_plan_id");
                Long percentage_service_no = (Long) map.get("percentage_service_no");
                String percentage_client_service_id = (String) map.get("percentage_client_service_id");
                Long alt_service_no = (Long) map.get("alt_service_no");
                String alt_client_service_id = (String) map.get("alt_client_service_id");
                com.aria.common.shared.admin.CouponArray coupon = (com.aria.common.shared.admin.CouponArray) map.get("coupon");
                com.aria.common.shared.admin.ExistingCouponArray existing_coupon = (com.aria.common.shared.admin.ExistingCouponArray) map.get("existing_coupon");
                
        return updateCreditTemplate(client_no, auth_key, credit_template_no, credit_template_name, discount_type, discount_amt, no_of_credits, credit_interval_months, client_credit_template_id, eligible_plan_no, eligible_client_plan_id, eligible_service_no, eligible_client_service_id, eligible_service_types, percentage_plan_no, percentage_client_plan_id, percentage_service_no, percentage_client_service_id, alt_service_no, alt_client_service_id, coupon, existing_coupon);
    }

    public Map<String,Object> deleteTemplates(Long client_no, String auth_key, com.aria.common.shared.admin.TemplateNosArray template_nos){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        RestUtilities.addParameterValuesFromArray(parameters,template_nos);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("delete_templates"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[2];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteTemplates(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.admin.TemplateNosArray template_nos = (com.aria.common.shared.admin.TemplateNosArray) map.get("template_nos");
                
        return deleteTemplates(client_no, auth_key, template_nos);
    }

    public Map<String,Object> createDiscountRule(Long client_no, String auth_key, String label, String rule_id, String description, String ext_description, Long flat_percent_ind, Double amount, String currency, String duration_type_ind, String inline_offset_ind, Long service_code_to_use, Long scope_no, Long max_applicable_months, Long max_applications_per_acct, Long alt_service_no_2_apply, String alt_service_id_2_apply, String applicable_trans_scope, com.aria.common.shared.admin.PlanNoArray plan_no, com.aria.common.shared.admin.ClientPlanIdArray client_plan_id, com.aria.common.shared.admin.ServiceNoArray service_no, com.aria.common.shared.admin.ClientServiceIdArray client_service_id, com.aria.common.shared.admin.ItemNoArray item_no, com.aria.common.shared.admin.ClientItemIdArray client_item_id, String use_all_or_nth_subs_rule){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"label",getValue("String", label));
        addParameters(parameters,"rule_id",getValue("String", rule_id));
        addParameters(parameters,"description",getValue("String", description));
        addParameters(parameters,"ext_description",getValue("String", ext_description));
        addParameters(parameters,"flat_percent_ind",getValue("Long", flat_percent_ind));
        addParameters(parameters,"amount",getValue("Double", amount));
        addParameters(parameters,"currency",getValue("String", currency));
        addParameters(parameters,"duration_type_ind",getValue("String", duration_type_ind));
        addParameters(parameters,"inline_offset_ind",getValue("String", inline_offset_ind));
        addParameters(parameters,"service_code_to_use",getValue("Long", service_code_to_use));
        addParameters(parameters,"scope_no",getValue("Long", scope_no));
        addParameters(parameters,"max_applicable_months",getValue("Long", max_applicable_months));
        addParameters(parameters,"max_applications_per_acct",getValue("Long", max_applications_per_acct));
        addParameters(parameters,"alt_service_no_2_apply",getValue("Long", alt_service_no_2_apply));
        addParameters(parameters,"alt_service_id_2_apply",getValue("String", alt_service_id_2_apply));
        addParameters(parameters,"applicable_trans_scope",getValue("String", applicable_trans_scope));
        RestUtilities.addParameterValuesFromArray(parameters,plan_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_plan_id);
        RestUtilities.addParameterValuesFromArray(parameters,service_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_service_id);
        RestUtilities.addParameterValuesFromArray(parameters,item_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_item_id);
        addParameters(parameters,"use_all_or_nth_subs_rule",getValue("String", use_all_or_nth_subs_rule));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_discount_rule"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "rule_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createDiscountRule(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String label = (String) map.get("label");
                String rule_id = (String) map.get("rule_id");
                String description = (String) map.get("description");
                String ext_description = (String) map.get("ext_description");
                Long flat_percent_ind = (Long) map.get("flat_percent_ind");
                Double amount = (Double) map.get("amount");
                String currency = (String) map.get("currency");
                String duration_type_ind = (String) map.get("duration_type_ind");
                String inline_offset_ind = (String) map.get("inline_offset_ind");
                Long service_code_to_use = (Long) map.get("service_code_to_use");
                Long scope_no = (Long) map.get("scope_no");
                Long max_applicable_months = (Long) map.get("max_applicable_months");
                Long max_applications_per_acct = (Long) map.get("max_applications_per_acct");
                Long alt_service_no_2_apply = (Long) map.get("alt_service_no_2_apply");
                String alt_service_id_2_apply = (String) map.get("alt_service_id_2_apply");
                String applicable_trans_scope = (String) map.get("applicable_trans_scope");
                com.aria.common.shared.admin.PlanNoArray plan_no = (com.aria.common.shared.admin.PlanNoArray) map.get("plan_no");
                com.aria.common.shared.admin.ClientPlanIdArray client_plan_id = (com.aria.common.shared.admin.ClientPlanIdArray) map.get("client_plan_id");
                com.aria.common.shared.admin.ServiceNoArray service_no = (com.aria.common.shared.admin.ServiceNoArray) map.get("service_no");
                com.aria.common.shared.admin.ClientServiceIdArray client_service_id = (com.aria.common.shared.admin.ClientServiceIdArray) map.get("client_service_id");
                com.aria.common.shared.admin.ItemNoArray item_no = (com.aria.common.shared.admin.ItemNoArray) map.get("item_no");
                com.aria.common.shared.admin.ClientItemIdArray client_item_id = (com.aria.common.shared.admin.ClientItemIdArray) map.get("client_item_id");
                String use_all_or_nth_subs_rule = (String) map.get("use_all_or_nth_subs_rule");
                
        return createDiscountRule(client_no, auth_key, label, rule_id, description, ext_description, flat_percent_ind, amount, currency, duration_type_ind, inline_offset_ind, service_code_to_use, scope_no, max_applicable_months, max_applications_per_acct, alt_service_no_2_apply, alt_service_id_2_apply, applicable_trans_scope, plan_no, client_plan_id, service_no, client_service_id, item_no, client_item_id, use_all_or_nth_subs_rule);
    }

    public Map<String,Object> createDiscountBundle(Long client_no, String auth_key, String bundle_name, String bundle_id, String bundle_description, String allow_overlap_ind, com.aria.common.shared.admin.RulesArray rules, com.aria.common.shared.admin.RuleIdsArray rule_ids){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"bundle_name",getValue("String", bundle_name));
        addParameters(parameters,"bundle_id",getValue("String", bundle_id));
        addParameters(parameters,"bundle_description",getValue("String", bundle_description));
        addParameters(parameters,"allow_overlap_ind",getValue("String", allow_overlap_ind));
        RestUtilities.addParameterValuesFromArray(parameters,rules);
        RestUtilities.addParameterValuesFromArray(parameters,rule_ids);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_discount_bundle"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "rule_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createDiscountBundle(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String bundle_name = (String) map.get("bundle_name");
                String bundle_id = (String) map.get("bundle_id");
                String bundle_description = (String) map.get("bundle_description");
                String allow_overlap_ind = (String) map.get("allow_overlap_ind");
                com.aria.common.shared.admin.RulesArray rules = (com.aria.common.shared.admin.RulesArray) map.get("rules");
                com.aria.common.shared.admin.RuleIdsArray rule_ids = (com.aria.common.shared.admin.RuleIdsArray) map.get("rule_ids");
                
        return createDiscountBundle(client_no, auth_key, bundle_name, bundle_id, bundle_description, allow_overlap_ind, rules, rule_ids);
    }

    public Map<String,Object> getDiscountBundles(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_discount_bundles"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[6];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "bundle_no";
        returnValues[3] = "bundle_name";
        returnValues[4] = "bundle_id";
        returnValues[5] = "description";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getDiscountBundles(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getDiscountBundles(client_no, auth_key);
    }

    public Map<String,Object> getDiscountBundleDetails(Long client_no, String auth_key, Long bundle_no, String bundle_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"bundle_no",getValue("Long", bundle_no));
        addParameters(parameters,"bundle_id",getValue("String", bundle_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_discount_bundle_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[9];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "bundle_no";
        returnValues[3] = "bundle_name";
        returnValues[4] = "bundle_id";
        returnValues[5] = "description";
        returnValues[6] = "allow_overlap_ind";
        returnValues[7] = "rules";
        returnValues[8] = "rule_ids";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getDiscountBundleDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long bundle_no = (Long) map.get("bundle_no");
                String bundle_id = (String) map.get("bundle_id");
                
        return getDiscountBundleDetails(client_no, auth_key, bundle_no, bundle_id);
    }

    public Map<String,Object> getDiscountRules(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_discount_rules"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[9];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "discount_rules";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getDiscountRules(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getDiscountRules(client_no, auth_key);
    }

    public Map<String,Object> getDiscountRuleDetails(Long client_no, String auth_key, Long rule_no, String client_rule_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"rule_no",getValue("Long", rule_no));
        addParameters(parameters,"client_rule_id",getValue("String", client_rule_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_discount_rule_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[23];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "rule_no";
        returnValues[3] = "rule_id";
        returnValues[4] = "description";
        returnValues[5] = "ext_description";
        returnValues[6] = "flat_percent_ind";
        returnValues[7] = "amount";
        returnValues[8] = "currency";
        returnValues[9] = "duration_type_ind";
        returnValues[10] = "max_applicable_months";
        returnValues[11] = "max_applications_per_acct";
        returnValues[12] = "inline_offset_ind";
        returnValues[13] = "service_code_to_use";
        returnValues[14] = "alt_service_no_2_apply";
        returnValues[15] = "alt_service_id_2_apply";
        returnValues[16] = "scope_no";
        returnValues[17] = "plan_no";
        returnValues[18] = "client_plan_id";
        returnValues[19] = "service_no";
        returnValues[20] = "client_service_id";
        returnValues[21] = "item_no";
        returnValues[22] = "client_item_id";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getDiscountRuleDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long rule_no = (Long) map.get("rule_no");
                String client_rule_id = (String) map.get("client_rule_id");
                
        return getDiscountRuleDetails(client_no, auth_key, rule_no, client_rule_id);
    }

    public Map<String,Object> deleteRules(Long client_no, String auth_key, com.aria.common.shared.admin.RuleNosArray rule_nos){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        RestUtilities.addParameterValuesFromArray(parameters,rule_nos);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("delete_rules"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[2];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteRules(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.admin.RuleNosArray rule_nos = (com.aria.common.shared.admin.RuleNosArray) map.get("rule_nos");
                
        return deleteRules(client_no, auth_key, rule_nos);
    }

    public Map<String,Object> deleteBundles(Long client_no, String auth_key, com.aria.common.shared.admin.BundleNosArray bundle_nos){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        RestUtilities.addParameterValuesFromArray(parameters,bundle_nos);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("delete_bundles"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[2];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteBundles(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.admin.BundleNosArray bundle_nos = (com.aria.common.shared.admin.BundleNosArray) map.get("bundle_nos");
                
        return deleteBundles(client_no, auth_key, bundle_nos);
    }

    public Map<String,Object> getPlans(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_plans"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plans";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlans(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getPlans(client_no, auth_key);
    }

    public Map<String,Object> getPlanDetails(Long client_no, String auth_key, Long plan_no, String client_plan_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"plan_no",getValue("Long", plan_no));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_plan_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[38];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_no";
        returnValues[3] = "client_plan_id";
        returnValues[4] = "plan_name";
        returnValues[5] = "plan_level";
        returnValues[6] = "plan_type";
        returnValues[7] = "plan_description";
        returnValues[8] = "plan_groups";
        returnValues[9] = "plan_group_ids";
        returnValues[10] = "currency_cd";
        returnValues[11] = "billing_interval";
        returnValues[12] = "usage_billing_interval";
        returnValues[13] = "active_ind";
        returnValues[14] = "rollover_months";
        returnValues[15] = "rollover_plan_no";
        returnValues[16] = "rollover_client_plan_id";
        returnValues[17] = "allow_child_accounts";
        returnValues[18] = "dunning_plan_no";
        returnValues[19] = "dunning_client_plan_id";
        returnValues[20] = "free_trial_type";
        returnValues[21] = "free_trial_duration";
        returnValues[22] = "initial_free_months";
        returnValues[23] = "acct_status_cd";
        returnValues[24] = "rollover_status_days";
        returnValues[25] = "rollover_status_cd";
        returnValues[26] = "template_no";
        returnValues[27] = "template_id";
        returnValues[28] = "plan_cancel_min_month";
        returnValues[29] = "how_to_apply_min_fee";
        returnValues[30] = "is_deletable";
        returnValues[31] = "services";
        returnValues[32] = "resources";
        returnValues[33] = "parent_plans";
        returnValues[34] = "parent_plan_ids";
        returnValues[35] = "exclusion_plans";
        returnValues[36] = "supplemental_obj_fields";
        returnValues[37] = "surcharges";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlanDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getPlanDetails(client_no, auth_key, plan_no, client_plan_id);
    }

    public Map<String,Object> createNewPlan(Long client_no, String auth_key, String plan_name, String plan_description, String plan_type, String currency, String billing_interval, String client_plan_id, com.aria.common.shared.admin.PlanGroupArray plan_group, com.aria.common.shared.admin.PlanGroupIdArray plan_group_id, String usage_billing_interval, Long active, String rollover_months, Long rollover_plan_no, String rollover_client_plan_id, Long initial_free_months, Long acct_status_cd, Long rollover_status_days, Long rollover_status_cd, Long dunning_plan_no, String dunning_client_plan_id, Long template_no, String client_email_template_id, String apply_cancellation, Long plan_cancel_min_month, String apply_minimum_fee, String how_to_apply_minimum_fee, com.aria.common.shared.admin.ScheduleArray schedule, com.aria.common.shared.admin.ServiceArray service, com.aria.common.shared.admin.ResourceArray resource, Long arc_service_no, com.aria.common.shared.admin.ParentPlansArray parent_plans, com.aria.common.shared.admin.ParentClientPlanIdsArray parent_client_plan_ids, com.aria.common.shared.admin.ExclusionPlansArray exclusion_plans, com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field, Long template_ind, com.aria.common.shared.admin.ChildPlansArray child_plans, String notification_template_group_no, String credit_note_template_no, com.aria.common.shared.admin.SurchargeNoArray surcharge_no, com.aria.common.shared.admin.ClientSurchargeIdArray client_surcharge_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"plan_name",getValue("String", plan_name));
        addParameters(parameters,"plan_description",getValue("String", plan_description));
        addParameters(parameters,"plan_type",getValue("String", plan_type));
        addParameters(parameters,"currency",getValue("String", currency));
        addParameters(parameters,"billing_interval",getValue("String", billing_interval));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        RestUtilities.addParameterValuesFromArray(parameters,plan_group);
        RestUtilities.addParameterValuesFromArray(parameters,plan_group_id);
        addParameters(parameters,"usage_billing_interval",getValue("String", usage_billing_interval));
        addParameters(parameters,"active",getValue("Long", active));
        addParameters(parameters,"rollover_months",getValue("String", rollover_months));
        addParameters(parameters,"rollover_plan_no",getValue("Long", rollover_plan_no));
        addParameters(parameters,"rollover_client_plan_id",getValue("String", rollover_client_plan_id));
        addParameters(parameters,"initial_free_months",getValue("Long", initial_free_months));
        addParameters(parameters,"acct_status_cd",getValue("Long", acct_status_cd));
        addParameters(parameters,"rollover_status_days",getValue("Long", rollover_status_days));
        addParameters(parameters,"rollover_status_cd",getValue("Long", rollover_status_cd));
        addParameters(parameters,"dunning_plan_no",getValue("Long", dunning_plan_no));
        addParameters(parameters,"dunning_client_plan_id",getValue("String", dunning_client_plan_id));
        addParameters(parameters,"template_no",getValue("Long", template_no));
        addParameters(parameters,"client_email_template_id",getValue("String", client_email_template_id));
        addParameters(parameters,"apply_cancellation",getValue("String", apply_cancellation));
        addParameters(parameters,"plan_cancel_min_month",getValue("Long", plan_cancel_min_month));
        addParameters(parameters,"apply_minimum_fee",getValue("String", apply_minimum_fee));
        addParameters(parameters,"how_to_apply_minimum_fee",getValue("String", how_to_apply_minimum_fee));
        RestUtilities.addParameterValuesFromArray(parameters,schedule);
        RestUtilities.addParameterValuesFromArray(parameters,service);
        RestUtilities.addParameterValuesFromArray(parameters,resource);
        addParameters(parameters,"arc_service_no",getValue("Long", arc_service_no));
        RestUtilities.addParameterValuesFromArray(parameters,parent_plans);
        RestUtilities.addParameterValuesFromArray(parameters,parent_client_plan_ids);
        RestUtilities.addParameterValuesFromArray(parameters,exclusion_plans);
        RestUtilities.addParameterValuesFromArray(parameters,supplemental_obj_field);
        addParameters(parameters,"template_ind",getValue("Long", template_ind));
        RestUtilities.addParameterValuesFromArray(parameters,child_plans);
        addParameters(parameters,"notification_template_group_no",getValue("String", notification_template_group_no));
        addParameters(parameters,"credit_note_template_no",getValue("String", credit_note_template_no));
        RestUtilities.addParameterValuesFromArray(parameters,surcharge_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_surcharge_id);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_new_plan"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createNewPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String plan_name = (String) map.get("plan_name");
                String plan_description = (String) map.get("plan_description");
                String plan_type = (String) map.get("plan_type");
                String currency = (String) map.get("currency");
                String billing_interval = (String) map.get("billing_interval");
                String client_plan_id = (String) map.get("client_plan_id");
                com.aria.common.shared.admin.PlanGroupArray plan_group = (com.aria.common.shared.admin.PlanGroupArray) map.get("plan_group");
                com.aria.common.shared.admin.PlanGroupIdArray plan_group_id = (com.aria.common.shared.admin.PlanGroupIdArray) map.get("plan_group_id");
                String usage_billing_interval = (String) map.get("usage_billing_interval");
                Long active = (Long) map.get("active");
                String rollover_months = (String) map.get("rollover_months");
                Long rollover_plan_no = (Long) map.get("rollover_plan_no");
                String rollover_client_plan_id = (String) map.get("rollover_client_plan_id");
                Long initial_free_months = (Long) map.get("initial_free_months");
                Long acct_status_cd = (Long) map.get("acct_status_cd");
                Long rollover_status_days = (Long) map.get("rollover_status_days");
                Long rollover_status_cd = (Long) map.get("rollover_status_cd");
                Long dunning_plan_no = (Long) map.get("dunning_plan_no");
                String dunning_client_plan_id = (String) map.get("dunning_client_plan_id");
                Long template_no = (Long) map.get("template_no");
                String client_email_template_id = (String) map.get("client_email_template_id");
                String apply_cancellation = (String) map.get("apply_cancellation");
                Long plan_cancel_min_month = (Long) map.get("plan_cancel_min_month");
                String apply_minimum_fee = (String) map.get("apply_minimum_fee");
                String how_to_apply_minimum_fee = (String) map.get("how_to_apply_minimum_fee");
                com.aria.common.shared.admin.ScheduleArray schedule = (com.aria.common.shared.admin.ScheduleArray) map.get("schedule");
                com.aria.common.shared.admin.ServiceArray service = (com.aria.common.shared.admin.ServiceArray) map.get("service");
                com.aria.common.shared.admin.ResourceArray resource = (com.aria.common.shared.admin.ResourceArray) map.get("resource");
                Long arc_service_no = (Long) map.get("arc_service_no");
                com.aria.common.shared.admin.ParentPlansArray parent_plans = (com.aria.common.shared.admin.ParentPlansArray) map.get("parent_plans");
                com.aria.common.shared.admin.ParentClientPlanIdsArray parent_client_plan_ids = (com.aria.common.shared.admin.ParentClientPlanIdsArray) map.get("parent_client_plan_ids");
                com.aria.common.shared.admin.ExclusionPlansArray exclusion_plans = (com.aria.common.shared.admin.ExclusionPlansArray) map.get("exclusion_plans");
                com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field = (com.aria.common.shared.admin.SupplementalObjFieldArray) map.get("supplemental_obj_field");
                Long template_ind = (Long) map.get("template_ind");
                com.aria.common.shared.admin.ChildPlansArray child_plans = (com.aria.common.shared.admin.ChildPlansArray) map.get("child_plans");
                String notification_template_group_no = (String) map.get("notification_template_group_no");
                String credit_note_template_no = (String) map.get("credit_note_template_no");
                com.aria.common.shared.admin.SurchargeNoArray surcharge_no = (com.aria.common.shared.admin.SurchargeNoArray) map.get("surcharge_no");
                com.aria.common.shared.admin.ClientSurchargeIdArray client_surcharge_id = (com.aria.common.shared.admin.ClientSurchargeIdArray) map.get("client_surcharge_id");
                
        return createNewPlan(client_no, auth_key, plan_name, plan_description, plan_type, currency, billing_interval, client_plan_id, plan_group, plan_group_id, usage_billing_interval, active, rollover_months, rollover_plan_no, rollover_client_plan_id, initial_free_months, acct_status_cd, rollover_status_days, rollover_status_cd, dunning_plan_no, dunning_client_plan_id, template_no, client_email_template_id, apply_cancellation, plan_cancel_min_month, apply_minimum_fee, how_to_apply_minimum_fee, schedule, service, resource, arc_service_no, parent_plans, parent_client_plan_ids, exclusion_plans, supplemental_obj_field, template_ind, child_plans, notification_template_group_no, credit_note_template_no, surcharge_no, client_surcharge_id);
    }

    public Map<String,Object> editPlan(Long client_no, String auth_key, String plan_no, String plan_name, String client_plan_id, Long plan_type, String billing_interval, String currency, String plan_description, com.aria.common.shared.admin.PlanGroupArray plan_group, com.aria.common.shared.admin.PlanGroupIdArray plan_group_id, Long active, String usage_billing_interval, Long template_no, String client_email_template_id, String rollover_months, Long rollover_plan_no, String rollover_client_plan_id, Long dunning_plan_no, String dunning_client_plan_id, Long initial_free_months, Long acct_status_cd, Long rollover_status_days, Long rollover_status_cd, Long allow_child_accts, String apply_cancellation, Long plan_cancel_min_month, String apply_minimum_fee, Long how_to_apply_minimum_fee, com.aria.common.shared.admin.ScheduleArray schedule, com.aria.common.shared.admin.ServiceArray service, com.aria.common.shared.admin.ResourceArray resource, Long arc_service_no, com.aria.common.shared.admin.ParentPlansArray parent_plans, com.aria.common.shared.admin.ParentClientPlanIdsArray parent_client_plan_ids, com.aria.common.shared.admin.ExclusionPlansArray exclusion_plans, com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field, com.aria.common.shared.admin.ChildPlansArray child_plans, String notification_template_group_no, String credit_note_template_no, com.aria.common.shared.admin.SurchargeNoArray surcharge_no, com.aria.common.shared.admin.ClientSurchargeIdArray client_surcharge_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"plan_no",getValue("String", plan_no));
        addParameters(parameters,"plan_name",getValue("String", plan_name));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        addParameters(parameters,"plan_type",getValue("Long", plan_type));
        addParameters(parameters,"billing_interval",getValue("String", billing_interval));
        addParameters(parameters,"currency",getValue("String", currency));
        addParameters(parameters,"plan_description",getValue("String", plan_description));
        RestUtilities.addParameterValuesFromArray(parameters,plan_group);
        RestUtilities.addParameterValuesFromArray(parameters,plan_group_id);
        addParameters(parameters,"active",getValue("Long", active));
        addParameters(parameters,"usage_billing_interval",getValue("String", usage_billing_interval));
        addParameters(parameters,"template_no",getValue("Long", template_no));
        addParameters(parameters,"client_email_template_id",getValue("String", client_email_template_id));
        addParameters(parameters,"rollover_months",getValue("String", rollover_months));
        addParameters(parameters,"rollover_plan_no",getValue("Long", rollover_plan_no));
        addParameters(parameters,"rollover_client_plan_id",getValue("String", rollover_client_plan_id));
        addParameters(parameters,"dunning_plan_no",getValue("Long", dunning_plan_no));
        addParameters(parameters,"dunning_client_plan_id",getValue("String", dunning_client_plan_id));
        addParameters(parameters,"initial_free_months",getValue("Long", initial_free_months));
        addParameters(parameters,"acct_status_cd",getValue("Long", acct_status_cd));
        addParameters(parameters,"rollover_status_days",getValue("Long", rollover_status_days));
        addParameters(parameters,"rollover_status_cd",getValue("Long", rollover_status_cd));
        addParameters(parameters,"allow_child_accts",getValue("Long", allow_child_accts));
        addParameters(parameters,"apply_cancellation",getValue("String", apply_cancellation));
        addParameters(parameters,"plan_cancel_min_month",getValue("Long", plan_cancel_min_month));
        addParameters(parameters,"apply_minimum_fee",getValue("String", apply_minimum_fee));
        addParameters(parameters,"how_to_apply_minimum_fee",getValue("Long", how_to_apply_minimum_fee));
        RestUtilities.addParameterValuesFromArray(parameters,schedule);
        RestUtilities.addParameterValuesFromArray(parameters,service);
        RestUtilities.addParameterValuesFromArray(parameters,resource);
        addParameters(parameters,"arc_service_no",getValue("Long", arc_service_no));
        RestUtilities.addParameterValuesFromArray(parameters,parent_plans);
        RestUtilities.addParameterValuesFromArray(parameters,parent_client_plan_ids);
        RestUtilities.addParameterValuesFromArray(parameters,exclusion_plans);
        RestUtilities.addParameterValuesFromArray(parameters,supplemental_obj_field);
        RestUtilities.addParameterValuesFromArray(parameters,child_plans);
        addParameters(parameters,"notification_template_group_no",getValue("String", notification_template_group_no));
        addParameters(parameters,"credit_note_template_no",getValue("String", credit_note_template_no));
        RestUtilities.addParameterValuesFromArray(parameters,surcharge_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_surcharge_id);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("edit_plan"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> editPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String plan_no = (String) map.get("plan_no");
                String plan_name = (String) map.get("plan_name");
                String client_plan_id = (String) map.get("client_plan_id");
                Long plan_type = (Long) map.get("plan_type");
                String billing_interval = (String) map.get("billing_interval");
                String currency = (String) map.get("currency");
                String plan_description = (String) map.get("plan_description");
                com.aria.common.shared.admin.PlanGroupArray plan_group = (com.aria.common.shared.admin.PlanGroupArray) map.get("plan_group");
                com.aria.common.shared.admin.PlanGroupIdArray plan_group_id = (com.aria.common.shared.admin.PlanGroupIdArray) map.get("plan_group_id");
                Long active = (Long) map.get("active");
                String usage_billing_interval = (String) map.get("usage_billing_interval");
                Long template_no = (Long) map.get("template_no");
                String client_email_template_id = (String) map.get("client_email_template_id");
                String rollover_months = (String) map.get("rollover_months");
                Long rollover_plan_no = (Long) map.get("rollover_plan_no");
                String rollover_client_plan_id = (String) map.get("rollover_client_plan_id");
                Long dunning_plan_no = (Long) map.get("dunning_plan_no");
                String dunning_client_plan_id = (String) map.get("dunning_client_plan_id");
                Long initial_free_months = (Long) map.get("initial_free_months");
                Long acct_status_cd = (Long) map.get("acct_status_cd");
                Long rollover_status_days = (Long) map.get("rollover_status_days");
                Long rollover_status_cd = (Long) map.get("rollover_status_cd");
                Long allow_child_accts = (Long) map.get("allow_child_accts");
                String apply_cancellation = (String) map.get("apply_cancellation");
                Long plan_cancel_min_month = (Long) map.get("plan_cancel_min_month");
                String apply_minimum_fee = (String) map.get("apply_minimum_fee");
                Long how_to_apply_minimum_fee = (Long) map.get("how_to_apply_minimum_fee");
                com.aria.common.shared.admin.ScheduleArray schedule = (com.aria.common.shared.admin.ScheduleArray) map.get("schedule");
                com.aria.common.shared.admin.ServiceArray service = (com.aria.common.shared.admin.ServiceArray) map.get("service");
                com.aria.common.shared.admin.ResourceArray resource = (com.aria.common.shared.admin.ResourceArray) map.get("resource");
                Long arc_service_no = (Long) map.get("arc_service_no");
                com.aria.common.shared.admin.ParentPlansArray parent_plans = (com.aria.common.shared.admin.ParentPlansArray) map.get("parent_plans");
                com.aria.common.shared.admin.ParentClientPlanIdsArray parent_client_plan_ids = (com.aria.common.shared.admin.ParentClientPlanIdsArray) map.get("parent_client_plan_ids");
                com.aria.common.shared.admin.ExclusionPlansArray exclusion_plans = (com.aria.common.shared.admin.ExclusionPlansArray) map.get("exclusion_plans");
                com.aria.common.shared.admin.SupplementalObjFieldArray supplemental_obj_field = (com.aria.common.shared.admin.SupplementalObjFieldArray) map.get("supplemental_obj_field");
                com.aria.common.shared.admin.ChildPlansArray child_plans = (com.aria.common.shared.admin.ChildPlansArray) map.get("child_plans");
                String notification_template_group_no = (String) map.get("notification_template_group_no");
                String credit_note_template_no = (String) map.get("credit_note_template_no");
                com.aria.common.shared.admin.SurchargeNoArray surcharge_no = (com.aria.common.shared.admin.SurchargeNoArray) map.get("surcharge_no");
                com.aria.common.shared.admin.ClientSurchargeIdArray client_surcharge_id = (com.aria.common.shared.admin.ClientSurchargeIdArray) map.get("client_surcharge_id");
                
        return editPlan(client_no, auth_key, plan_no, plan_name, client_plan_id, plan_type, billing_interval, currency, plan_description, plan_group, plan_group_id, active, usage_billing_interval, template_no, client_email_template_id, rollover_months, rollover_plan_no, rollover_client_plan_id, dunning_plan_no, dunning_client_plan_id, initial_free_months, acct_status_cd, rollover_status_days, rollover_status_cd, allow_child_accts, apply_cancellation, plan_cancel_min_month, apply_minimum_fee, how_to_apply_minimum_fee, schedule, service, resource, arc_service_no, parent_plans, parent_client_plan_ids, exclusion_plans, supplemental_obj_field, child_plans, notification_template_group_no, credit_note_template_no, surcharge_no, client_surcharge_id);
    }

    public Map<String,Object> deletePlans(Long client_no, String auth_key, com.aria.common.shared.admin.PlanNosArray plan_nos){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        RestUtilities.addParameterValuesFromArray(parameters,plan_nos);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("delete_plans"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plans";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> deletePlans(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.admin.PlanNosArray plan_nos = (com.aria.common.shared.admin.PlanNosArray) map.get("plan_nos");
                
        return deletePlans(client_no, auth_key, plan_nos);
    }

    public Map<String,Object> copyPlan(Long client_no, String auth_key, Long plan_no, String client_plan_id, String plan_name, String new_client_plan_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"plan_no",getValue("Long", plan_no));
        addParameters(parameters,"client_plan_id",getValue("String", client_plan_id));
        addParameters(parameters,"plan_name",getValue("String", plan_name));
        addParameters(parameters,"new_client_plan_id",getValue("String", new_client_plan_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("copy_plan"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> copyPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                String plan_name = (String) map.get("plan_name");
                String new_client_plan_id = (String) map.get("new_client_plan_id");
                
        return copyPlan(client_no, auth_key, plan_no, client_plan_id, plan_name, new_client_plan_id);
    }

    public Map<String,Object> updateMasterPlan(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_master_plan"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[0];

        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateMasterPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return updateMasterPlan(client_no, auth_key);
    }

    public Map<String,Object> updateSupplementalPlan(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_supplemental_plan"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[0];

        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateSupplementalPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return updateSupplementalPlan(client_no, auth_key);
    }

    public Map<String,Object> getPromotions(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_promotions"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "promotions";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPromotions(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getPromotions(client_no, auth_key);
    }

    public Map<String,Object> getPromotionDetails(Long client_no, String auth_key, String promo_cd){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"promo_cd",getValue("String", promo_cd));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_promotion_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[10];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "client_no";
        returnValues[3] = "promo_cd";
        returnValues[4] = "promo_desc";
        returnValues[5] = "start_date";
        returnValues[6] = "exp_date";
        returnValues[7] = "max_uses";
        returnValues[8] = "plan_type_name";
        returnValues[9] = "plan_type_desc";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPromotionDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_cd = (String) map.get("promo_cd");
                
        return getPromotionDetails(client_no, auth_key, promo_cd);
    }

    public Map<String,Object> createPromotion(Long client_no, String auth_key, String promo_cd, String promo_desc, Long promo_plan_set_no, String no_of_uses, String start_date, String exp_date){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"promo_cd",getValue("String", promo_cd));
        addParameters(parameters,"promo_desc",getValue("String", promo_desc));
        addParameters(parameters,"promo_plan_set_no",getValue("Long", promo_plan_set_no));
        addParameters(parameters,"no_of_uses",getValue("String", no_of_uses));
        addParameters(parameters,"start_date",getValue("String", start_date));
        addParameters(parameters,"exp_date",getValue("String", exp_date));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_promotion"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "promo_cd";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createPromotion(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_cd = (String) map.get("promo_cd");
                String promo_desc = (String) map.get("promo_desc");
                Long promo_plan_set_no = (Long) map.get("promo_plan_set_no");
                String no_of_uses = (String) map.get("no_of_uses");
                String start_date = (String) map.get("start_date");
                String exp_date = (String) map.get("exp_date");
                
        return createPromotion(client_no, auth_key, promo_cd, promo_desc, promo_plan_set_no, no_of_uses, start_date, exp_date);
    }

    public Map<String,Object> updatePromotion(Long client_no, String auth_key, String promo_cd, String promo_desc, Long promo_plan_set_no, String no_of_uses, String start_date, String exp_date){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"promo_cd",getValue("String", promo_cd));
        addParameters(parameters,"promo_desc",getValue("String", promo_desc));
        addParameters(parameters,"promo_plan_set_no",getValue("Long", promo_plan_set_no));
        addParameters(parameters,"no_of_uses",getValue("String", no_of_uses));
        addParameters(parameters,"start_date",getValue("String", start_date));
        addParameters(parameters,"exp_date",getValue("String", exp_date));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_promotion"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "promo_cd";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updatePromotion(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_cd = (String) map.get("promo_cd");
                String promo_desc = (String) map.get("promo_desc");
                Long promo_plan_set_no = (Long) map.get("promo_plan_set_no");
                String no_of_uses = (String) map.get("no_of_uses");
                String start_date = (String) map.get("start_date");
                String exp_date = (String) map.get("exp_date");
                
        return updatePromotion(client_no, auth_key, promo_cd, promo_desc, promo_plan_set_no, no_of_uses, start_date, exp_date);
    }

    public Map<String,Object> getUsageTypes(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_usage_types"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "usage_types";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUsageTypes(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getUsageTypes(client_no, auth_key);
    }

    public Map<String,Object> getUsageTypeDetails(Long client_no, String auth_key, Long usage_type_no){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"usage_type_no",getValue("Long", usage_type_no));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_usage_type_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[9];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "usage_type_no";
        returnValues[3] = "usage_type_name";
        returnValues[4] = "usage_type_desc";
        returnValues[5] = "usage_type_cd";
        returnValues[6] = "usage_unit_type";
        returnValues[7] = "client_usage_unit_type_id";
        returnValues[8] = "is_editable";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUsageTypeDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long usage_type_no = (Long) map.get("usage_type_no");
                
        return getUsageTypeDetails(client_no, auth_key, usage_type_no);
    }

    public Map<String,Object> getUsageUnitTypes(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_usage_unit_types"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "usage_unit_types";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUsageUnitTypes(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getUsageUnitTypes(client_no, auth_key);
    }

    public Map<String,Object> createUsageType(Long client_no, String auth_key, String usage_type_name, String usage_type_desc, Long usage_unit_type_no, String usage_type_code, String usage_type_display_string){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"usage_type_name",getValue("String", usage_type_name));
        addParameters(parameters,"usage_type_desc",getValue("String", usage_type_desc));
        addParameters(parameters,"usage_unit_type_no",getValue("Long", usage_unit_type_no));
        addParameters(parameters,"usage_type_code",getValue("String", usage_type_code));
        addParameters(parameters,"usage_type_display_string",getValue("String", usage_type_display_string));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_usage_type"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "usage_type_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createUsageType(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String usage_type_name = (String) map.get("usage_type_name");
                String usage_type_desc = (String) map.get("usage_type_desc");
                Long usage_unit_type_no = (Long) map.get("usage_unit_type_no");
                String usage_type_code = (String) map.get("usage_type_code");
                String usage_type_display_string = (String) map.get("usage_type_display_string");
                
        return createUsageType(client_no, auth_key, usage_type_name, usage_type_desc, usage_unit_type_no, usage_type_code, usage_type_display_string);
    }

    public Map<String,Object> updateUsageType(Long client_no, String auth_key, Long usage_type_no, String usage_type_name, String usage_type_desc, Long usage_unit_type_no, String usage_type_code, String usage_type_display_string){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"usage_type_no",getValue("Long", usage_type_no));
        addParameters(parameters,"usage_type_name",getValue("String", usage_type_name));
        addParameters(parameters,"usage_type_desc",getValue("String", usage_type_desc));
        addParameters(parameters,"usage_unit_type_no",getValue("Long", usage_unit_type_no));
        addParameters(parameters,"usage_type_code",getValue("String", usage_type_code));
        addParameters(parameters,"usage_type_display_string",getValue("String", usage_type_display_string));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_usage_type"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "usage_type_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateUsageType(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long usage_type_no = (Long) map.get("usage_type_no");
                String usage_type_name = (String) map.get("usage_type_name");
                String usage_type_desc = (String) map.get("usage_type_desc");
                Long usage_unit_type_no = (Long) map.get("usage_unit_type_no");
                String usage_type_code = (String) map.get("usage_type_code");
                String usage_type_display_string = (String) map.get("usage_type_display_string");
                
        return updateUsageType(client_no, auth_key, usage_type_no, usage_type_name, usage_type_desc, usage_unit_type_no, usage_type_code, usage_type_display_string);
    }

    public Map<String,Object> createSuppObjField(Long client_no, String auth_key, String field_name, String description, String min_no_sel, Long max_no_sel, String datatype, String form_input_type, String use_allowed_vals_ind, String option_value, String option_value_order){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"field_name",getValue("String", field_name));
        addParameters(parameters,"description",getValue("String", description));
        addParameters(parameters,"min_no_sel",getValue("String", min_no_sel));
        addParameters(parameters,"max_no_sel",getValue("Long", max_no_sel));
        addParameters(parameters,"datatype",getValue("String", datatype));
        addParameters(parameters,"form_input_type",getValue("String", form_input_type));
        addParameters(parameters,"use_allowed_vals_ind",getValue("String", use_allowed_vals_ind));
        addParameters(parameters,"option_value",getValue("String", option_value));
        addParameters(parameters,"option_value_order",getValue("String", option_value_order));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_supp_obj_field"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "field_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createSuppObjField(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String field_name = (String) map.get("field_name");
                String description = (String) map.get("description");
                String min_no_sel = (String) map.get("min_no_sel");
                Long max_no_sel = (Long) map.get("max_no_sel");
                String datatype = (String) map.get("datatype");
                String form_input_type = (String) map.get("form_input_type");
                String use_allowed_vals_ind = (String) map.get("use_allowed_vals_ind");
                String option_value = (String) map.get("option_value");
                String option_value_order = (String) map.get("option_value_order");
                
        return createSuppObjField(client_no, auth_key, field_name, description, min_no_sel, max_no_sel, datatype, form_input_type, use_allowed_vals_ind, option_value, option_value_order);
    }

    public Map<String,Object> updateSuppObjField(Long client_no, String auth_key, Long field_no, String field_name, String description, String min_no_sel, Long max_no_sel, String datatype, String form_input_type, String use_allowed_vals_ind, String option_value, String option_value_order){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"field_no",getValue("Long", field_no));
        addParameters(parameters,"field_name",getValue("String", field_name));
        addParameters(parameters,"description",getValue("String", description));
        addParameters(parameters,"min_no_sel",getValue("String", min_no_sel));
        addParameters(parameters,"max_no_sel",getValue("Long", max_no_sel));
        addParameters(parameters,"datatype",getValue("String", datatype));
        addParameters(parameters,"form_input_type",getValue("String", form_input_type));
        addParameters(parameters,"use_allowed_vals_ind",getValue("String", use_allowed_vals_ind));
        addParameters(parameters,"option_value",getValue("String", option_value));
        addParameters(parameters,"option_value_order",getValue("String", option_value_order));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_supp_obj_field"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "field_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateSuppObjField(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long field_no = (Long) map.get("field_no");
                String field_name = (String) map.get("field_name");
                String description = (String) map.get("description");
                String min_no_sel = (String) map.get("min_no_sel");
                Long max_no_sel = (Long) map.get("max_no_sel");
                String datatype = (String) map.get("datatype");
                String form_input_type = (String) map.get("form_input_type");
                String use_allowed_vals_ind = (String) map.get("use_allowed_vals_ind");
                String option_value = (String) map.get("option_value");
                String option_value_order = (String) map.get("option_value_order");
                
        return updateSuppObjField(client_no, auth_key, field_no, field_name, description, min_no_sel, max_no_sel, datatype, form_input_type, use_allowed_vals_ind, option_value, option_value_order);
    }

    public Map<String,Object> getSuppObjFields(Long client_no, String auth_key, Long field_no){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"field_no",getValue("Long", field_no));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_supp_obj_fields"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[11];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "field_no";
        returnValues[3] = "field_name";
        returnValues[4] = "description";
        returnValues[5] = "datatype";
        returnValues[6] = "min_no_sel";
        returnValues[7] = "max_no_sel";
        returnValues[8] = "form_input_type";
        returnValues[9] = "allowed_values";
        returnValues[10] = "associated_objects";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppObjFields(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long field_no = (Long) map.get("field_no");
                
        return getSuppObjFields(client_no, auth_key, field_no);
    }

    public Map<String,Object> getPlanGroups(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_plan_groups"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_groups";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlanGroups(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getPlanGroups(client_no, auth_key);
    }

    public Map<String,Object> getPlanGroupDetails(Long client_no, String auth_key, Long group_no, String client_plan_change_group_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"group_no",getValue("Long", group_no));
        addParameters(parameters,"client_plan_change_group_id",getValue("String", client_plan_change_group_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_plan_group_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[8];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "group_no";
        returnValues[3] = "group_name";
        returnValues[4] = "group_desc";
        returnValues[5] = "client_plan_change_group_id";
        returnValues[6] = "group_usage";
        returnValues[7] = "plans";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlanGroupDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long group_no = (Long) map.get("group_no");
                String client_plan_change_group_id = (String) map.get("client_plan_change_group_id");
                
        return getPlanGroupDetails(client_no, auth_key, group_no, client_plan_change_group_id);
    }

    public Map<String,Object> createPlanGroup(Long client_no, String auth_key, String group_name, String group_desc, String group_usage, String client_plan_change_group_id, String group_plans, String group_plan_ids){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"group_name",getValue("String", group_name));
        addParameters(parameters,"group_desc",getValue("String", group_desc));
        addParameters(parameters,"group_usage",getValue("String", group_usage));
        addParameters(parameters,"client_plan_change_group_id",getValue("String", client_plan_change_group_id));
        addParameters(parameters,"group_plans",getValue("String", group_plans));
        addParameters(parameters,"group_plan_ids",getValue("String", group_plan_ids));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_plan_group"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "group_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createPlanGroup(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String group_name = (String) map.get("group_name");
                String group_desc = (String) map.get("group_desc");
                String group_usage = (String) map.get("group_usage");
                String client_plan_change_group_id = (String) map.get("client_plan_change_group_id");
                String group_plans = (String) map.get("group_plans");
                String group_plan_ids = (String) map.get("group_plan_ids");
                
        return createPlanGroup(client_no, auth_key, group_name, group_desc, group_usage, client_plan_change_group_id, group_plans, group_plan_ids);
    }

    public Map<String,Object> updatePlanGroup(Long client_no, String auth_key, Long group_no, String group_name, String group_desc, String group_usage, String client_plan_change_group_id, String group_plans, String group_plan_ids){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"group_no",getValue("Long", group_no));
        addParameters(parameters,"group_name",getValue("String", group_name));
        addParameters(parameters,"group_desc",getValue("String", group_desc));
        addParameters(parameters,"group_usage",getValue("String", group_usage));
        addParameters(parameters,"client_plan_change_group_id",getValue("String", client_plan_change_group_id));
        addParameters(parameters,"group_plans",getValue("String", group_plans));
        addParameters(parameters,"group_plan_ids",getValue("String", group_plan_ids));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("update_plan_group"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "group_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> updatePlanGroup(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long group_no = (Long) map.get("group_no");
                String group_name = (String) map.get("group_name");
                String group_desc = (String) map.get("group_desc");
                String group_usage = (String) map.get("group_usage");
                String client_plan_change_group_id = (String) map.get("client_plan_change_group_id");
                String group_plans = (String) map.get("group_plans");
                String group_plan_ids = (String) map.get("group_plan_ids");
                
        return updatePlanGroup(client_no, auth_key, group_no, group_name, group_desc, group_usage, client_plan_change_group_id, group_plans, group_plan_ids);
    }

    public Map<String,Object> deletePlanGroup(Long client_no, String auth_key, String group_list){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"group_list",getValue("String", group_list));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("delete_plan_group"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "plan_groups";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> deletePlanGroup(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String group_list = (String) map.get("group_list");
                
        return deletePlanGroup(client_no, auth_key, group_list);
    }

    public Map<String,Object> listCoa(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("list_coa"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coa_list";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> listCoa(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return listCoa(client_no, auth_key);
    }

    public Map<String,Object> addCoa(Long client_no, String auth_key, String coa_code, String coa_description){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"coa_code",getValue("String", coa_code));
        addParameters(parameters,"coa_description",getValue("String", coa_description));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("add_coa"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coa";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> addCoa(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String coa_code = (String) map.get("coa_code");
                String coa_description = (String) map.get("coa_description");
                
        return addCoa(client_no, auth_key, coa_code, coa_description);
    }

    public Map<String,Object> getCoa(Long client_no, String auth_key, Long coa_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"coa_id",getValue("Long", coa_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_coa"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coa";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCoa(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long coa_id = (Long) map.get("coa_id");
                
        return getCoa(client_no, auth_key, coa_id);
    }

    public Map<String,Object> editCoa(Long client_no, String auth_key, Long coa_id, String coa_code, String coa_description){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"coa_id",getValue("Long", coa_id));
        addParameters(parameters,"coa_code",getValue("String", coa_code));
        addParameters(parameters,"coa_description",getValue("String", coa_description));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("edit_coa"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "coa";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> editCoa(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long coa_id = (Long) map.get("coa_id");
                String coa_code = (String) map.get("coa_code");
                String coa_description = (String) map.get("coa_description");
                
        return editCoa(client_no, auth_key, coa_id, coa_code, coa_description);
    }

    public Map<String,Object> getSurcharges(Long client_no, String auth_key){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_surcharges"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "surcharges";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSurcharges(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getSurcharges(client_no, auth_key);
    }

    public Map<String,Object> getSurchargeDetails(Long client_no, String auth_key, Long surcharge_no, String client_surcharge_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"surcharge_no",getValue("Long", surcharge_no));
        addParameters(parameters,"client_surcharge_id",getValue("String", client_surcharge_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("get_surcharge_details"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[24];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "surcharge_no";
        returnValues[3] = "surcharge_name";
        returnValues[4] = "client_surcharge_id";
        returnValues[5] = "description";
        returnValues[6] = "ext_description";
        returnValues[7] = "currency_cd";
        returnValues[8] = "surcharge_type_cd";
        returnValues[9] = "inline_offset_ind";
        returnValues[10] = "apply_b4_or_after_discount_cd";
        returnValues[11] = "apply_to_zero_invoice_ind";
        returnValues[12] = "tax_group";
        returnValues[13] = "gl_cd";
        returnValues[14] = "ar_gl_cd";
        returnValues[15] = "scope_no";
        returnValues[16] = "plan_no";
        returnValues[17] = "client_plan_id";
        returnValues[18] = "service_no";
        returnValues[19] = "client_service_id";
        returnValues[20] = "item_no";
        returnValues[21] = "client_item_id";
        returnValues[22] = "plan_service";
        returnValues[23] = "surcharge_tier";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSurchargeDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long surcharge_no = (Long) map.get("surcharge_no");
                String client_surcharge_id = (String) map.get("client_surcharge_id");
                
        return getSurchargeDetails(client_no, auth_key, surcharge_no, client_surcharge_id);
    }

    public Map<String,Object> createSurcharge(Long client_no, String auth_key, String surcharge_name, String description, String ext_description, String currency_cd, String surcharge_type_cd, String inline_offset_ind, String apply_b4_or_after_discount_cd, Long scope_no, com.aria.common.shared.admin.SurchargeTierArray surcharge_tier, String client_surcharge_id, Long apply_to_zero_invoice_ind, Long tax_group, String gl_cd, String ar_gl_cd, com.aria.common.shared.admin.PlanNoArray plan_no, com.aria.common.shared.admin.ClientPlanIdArray client_plan_id, com.aria.common.shared.admin.ServiceNoArray service_no, com.aria.common.shared.admin.ClientServiceIdArray client_service_id, com.aria.common.shared.admin.ItemNoArray item_no, com.aria.common.shared.admin.ClientItemIdArray client_item_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"surcharge_name",getValue("String", surcharge_name));
        addParameters(parameters,"description",getValue("String", description));
        addParameters(parameters,"ext_description",getValue("String", ext_description));
        addParameters(parameters,"currency_cd",getValue("String", currency_cd));
        addParameters(parameters,"surcharge_type_cd",getValue("String", surcharge_type_cd));
        addParameters(parameters,"inline_offset_ind",getValue("String", inline_offset_ind));
        addParameters(parameters,"apply_b4_or_after_discount_cd",getValue("String", apply_b4_or_after_discount_cd));
        addParameters(parameters,"scope_no",getValue("Long", scope_no));
        RestUtilities.addParameterValuesFromArray(parameters,surcharge_tier);
        addParameters(parameters,"client_surcharge_id",getValue("String", client_surcharge_id));
        addParameters(parameters,"apply_to_zero_invoice_ind",getValue("Long", apply_to_zero_invoice_ind));
        addParameters(parameters,"tax_group",getValue("Long", tax_group));
        addParameters(parameters,"gl_cd",getValue("String", gl_cd));
        addParameters(parameters,"ar_gl_cd",getValue("String", ar_gl_cd));
        RestUtilities.addParameterValuesFromArray(parameters,plan_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_plan_id);
        RestUtilities.addParameterValuesFromArray(parameters,service_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_service_id);
        RestUtilities.addParameterValuesFromArray(parameters,item_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_item_id);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("create_surcharge"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "surcharge_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> createSurcharge(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String surcharge_name = (String) map.get("surcharge_name");
                String description = (String) map.get("description");
                String ext_description = (String) map.get("ext_description");
                String currency_cd = (String) map.get("currency_cd");
                String surcharge_type_cd = (String) map.get("surcharge_type_cd");
                String inline_offset_ind = (String) map.get("inline_offset_ind");
                String apply_b4_or_after_discount_cd = (String) map.get("apply_b4_or_after_discount_cd");
                Long scope_no = (Long) map.get("scope_no");
                com.aria.common.shared.admin.SurchargeTierArray surcharge_tier = (com.aria.common.shared.admin.SurchargeTierArray) map.get("surcharge_tier");
                String client_surcharge_id = (String) map.get("client_surcharge_id");
                Long apply_to_zero_invoice_ind = (Long) map.get("apply_to_zero_invoice_ind");
                Long tax_group = (Long) map.get("tax_group");
                String gl_cd = (String) map.get("gl_cd");
                String ar_gl_cd = (String) map.get("ar_gl_cd");
                com.aria.common.shared.admin.PlanNoArray plan_no = (com.aria.common.shared.admin.PlanNoArray) map.get("plan_no");
                com.aria.common.shared.admin.ClientPlanIdArray client_plan_id = (com.aria.common.shared.admin.ClientPlanIdArray) map.get("client_plan_id");
                com.aria.common.shared.admin.ServiceNoArray service_no = (com.aria.common.shared.admin.ServiceNoArray) map.get("service_no");
                com.aria.common.shared.admin.ClientServiceIdArray client_service_id = (com.aria.common.shared.admin.ClientServiceIdArray) map.get("client_service_id");
                com.aria.common.shared.admin.ItemNoArray item_no = (com.aria.common.shared.admin.ItemNoArray) map.get("item_no");
                com.aria.common.shared.admin.ClientItemIdArray client_item_id = (com.aria.common.shared.admin.ClientItemIdArray) map.get("client_item_id");
                
        return createSurcharge(client_no, auth_key, surcharge_name, description, ext_description, currency_cd, surcharge_type_cd, inline_offset_ind, apply_b4_or_after_discount_cd, scope_no, surcharge_tier, client_surcharge_id, apply_to_zero_invoice_ind, tax_group, gl_cd, ar_gl_cd, plan_no, client_plan_id, service_no, client_service_id, item_no, client_item_id);
    }

    public Map<String,Object> editSurcharge(Long client_no, String auth_key, String surcharge_no, String surcharge_name, String client_surcharge_id, String description, String ext_description, String currency_cd, Long scope_no, com.aria.common.shared.admin.SurchargeTierArray surcharge_tier, Long apply_to_zero_invoice_ind, com.aria.common.shared.admin.PlanNoArray plan_no, com.aria.common.shared.admin.ClientPlanIdArray client_plan_id, com.aria.common.shared.admin.ServiceNoArray service_no, com.aria.common.shared.admin.ClientServiceIdArray client_service_id, com.aria.common.shared.admin.ItemNoArray item_no, com.aria.common.shared.admin.ClientItemIdArray client_item_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"surcharge_no",getValue("String", surcharge_no));
        addParameters(parameters,"surcharge_name",getValue("String", surcharge_name));
        addParameters(parameters,"client_surcharge_id",getValue("String", client_surcharge_id));
        addParameters(parameters,"description",getValue("String", description));
        addParameters(parameters,"ext_description",getValue("String", ext_description));
        addParameters(parameters,"currency_cd",getValue("String", currency_cd));
        addParameters(parameters,"scope_no",getValue("Long", scope_no));
        RestUtilities.addParameterValuesFromArray(parameters,surcharge_tier);
        addParameters(parameters,"apply_to_zero_invoice_ind",getValue("Long", apply_to_zero_invoice_ind));
        RestUtilities.addParameterValuesFromArray(parameters,plan_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_plan_id);
        RestUtilities.addParameterValuesFromArray(parameters,service_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_service_id);
        RestUtilities.addParameterValuesFromArray(parameters,item_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_item_id);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("edit_surcharge"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[3];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        returnValues[2] = "surcharge_no";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> editSurcharge(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String surcharge_no = (String) map.get("surcharge_no");
                String surcharge_name = (String) map.get("surcharge_name");
                String client_surcharge_id = (String) map.get("client_surcharge_id");
                String description = (String) map.get("description");
                String ext_description = (String) map.get("ext_description");
                String currency_cd = (String) map.get("currency_cd");
                Long scope_no = (Long) map.get("scope_no");
                com.aria.common.shared.admin.SurchargeTierArray surcharge_tier = (com.aria.common.shared.admin.SurchargeTierArray) map.get("surcharge_tier");
                Long apply_to_zero_invoice_ind = (Long) map.get("apply_to_zero_invoice_ind");
                com.aria.common.shared.admin.PlanNoArray plan_no = (com.aria.common.shared.admin.PlanNoArray) map.get("plan_no");
                com.aria.common.shared.admin.ClientPlanIdArray client_plan_id = (com.aria.common.shared.admin.ClientPlanIdArray) map.get("client_plan_id");
                com.aria.common.shared.admin.ServiceNoArray service_no = (com.aria.common.shared.admin.ServiceNoArray) map.get("service_no");
                com.aria.common.shared.admin.ClientServiceIdArray client_service_id = (com.aria.common.shared.admin.ClientServiceIdArray) map.get("client_service_id");
                com.aria.common.shared.admin.ItemNoArray item_no = (com.aria.common.shared.admin.ItemNoArray) map.get("item_no");
                com.aria.common.shared.admin.ClientItemIdArray client_item_id = (com.aria.common.shared.admin.ClientItemIdArray) map.get("client_item_id");
                
        return editSurcharge(client_no, auth_key, surcharge_no, surcharge_name, client_surcharge_id, description, ext_description, currency_cd, scope_no, surcharge_tier, apply_to_zero_invoice_ind, plan_no, client_plan_id, service_no, client_service_id, item_no, client_item_id);
    }

    public Map<String,Object> deleteSurcharge(Long client_no, String auth_key, com.aria.common.shared.admin.SurchargeNoArray surcharge_no, com.aria.common.shared.admin.ClientSurchargeIdArray client_surcharge_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        RestUtilities.addParameterValuesFromArray(parameters,surcharge_no);
        RestUtilities.addParameterValuesFromArray(parameters,client_surcharge_id);
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("delete_surcharge"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[2];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteSurcharge(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.admin.SurchargeNoArray surcharge_no = (com.aria.common.shared.admin.SurchargeNoArray) map.get("surcharge_no");
                com.aria.common.shared.admin.ClientSurchargeIdArray client_surcharge_id = (com.aria.common.shared.admin.ClientSurchargeIdArray) map.get("client_surcharge_id");
                
        return deleteSurcharge(client_no, auth_key, surcharge_no, client_surcharge_id);
    }

    public Map<String,Object> validateAdminSession(Long client_no, String auth_key, String session_id){
        MultivaluedMap<String, String> parameters = new MultivaluedMapImpl();
        addParameters(parameters,"client_no",getValue("Long",client_no));
        addParameters(parameters,"auth_key",getValue("String",auth_key));
        addParameters(parameters,"session_id",getValue("String", session_id));
        
        WebResource webResource = Client.create(new DefaultClientConfig()).resource(buildUrl("validate_admin_session"));
        String ret = webResource.type("application/x-www-form-urlencoded").accept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("accept-encoding", "deflate").header("accept-encoding", "gzip").post(String.class, parameters);
        String[] returnValues = new String[2];

        returnValues[0] = "error_code";
        returnValues[1] = "error_msg";
        
        buildHashMapReturnValues(ret,returnValues);
        return getHashMapReturnValues();
    }

    public Map<String,Object> validateAdminSession(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                
        return validateAdminSession(client_no, auth_key, session_id);
    }

    /********************************** END - METHODS IMPLEMENTATION ***********************************************/
}
