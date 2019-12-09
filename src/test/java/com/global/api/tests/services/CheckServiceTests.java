package com.global.api.tests.services;

import com.global.api.entities.Address;
import com.global.api.entities.Transaction;
import com.global.api.entities.exceptions.ApiException;
import com.global.api.paymentMethods.eCheck;
import com.global.api.serviceConfigs.GatewayConfig;
import com.global.api.services.CheckService;
import com.global.api.tests.testdata.TestChecks;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CheckServiceTests {
    private CheckService service;
    private eCheck check;
    private Address address;

    public CheckServiceTests() throws ApiException {
        GatewayConfig config = new GatewayConfig();
        config.setSecretApiKey("skapi_cert_MTyMAQBiHVEAewvIzXVFcmUd2UcyBge_eCpaASUp0A");
        config.setServiceUrl("https://cert.api2.heartlandportico.com");

        service = new CheckService(config);

        check = TestChecks.certification();

        address = new Address();
        address.setStreetAddress1("123 Main St.");
        address.setCity("Downtown");
        address.setState("NJ");
        address.setPostalCode("12345");        
    }

    @Test
    public void checkServiceSale() throws ApiException {
        Transaction response = service.charge(new BigDecimal(10))
                .withCurrency("USD")
                .withPaymentMethod(check)
                .withAddress(address)
                .execute();
        assertNotNull(response);
        assertEquals("00", response.getResponseCode());
    }

    @Test
    public void CheckServiceVoid() throws ApiException {
        Transaction response = service.charge(new BigDecimal(11))
                .withCurrency("USD")
                .withPaymentMethod(check)
                .withAddress(address)
                .execute();
        assertNotNull(response);
        assertEquals("00", response.getResponseCode());

        Transaction voidResponse = service.voidTransaction(response.getTransactionId()).execute();
        assertNotNull(voidResponse);
        assertEquals("00", voidResponse.getResponseCode());
    }
}
