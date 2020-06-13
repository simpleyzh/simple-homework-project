package app.web;

import app.customersite.api.CustomeAjaxWebService;
import app.customersite.api.CustomerAJAXView;
import app.customersite.api.SearchCustomerAJAXResponse;
import app.customersite.api.UpdateCustomerAJAXRequest;

public class CustomerAJAXWebServiceImpl implements CustomeAjaxWebService {
    @Override
    public CustomerAJAXView getCustomer(String id) {
        return null;
    }

    @Override
    public SearchCustomerAJAXResponse searchCustomer(String name) {
        return null;
    }

    @Override
    public CustomerAJAXView updateCustomer(UpdateCustomerAJAXRequest request) {
        return null;
    }
}
