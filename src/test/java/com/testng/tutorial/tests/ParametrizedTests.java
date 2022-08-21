package com.testng.tutorial.tests;

import com.testng.tutorial.data.HttpCodeTestDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTests extends AbstractTestContextTests {

    @DataProvider(name = "httpCodeProvider")
    public Object[][] httpCodes() {
        return new Object[][]{
                {100, "Informational responses"},
                {200, "Successful responses"},
                {300, "Redirection messages"},
                {400, "Client error responses"},
                {500, "Server error responses"}
        };
    }

    @Test(dataProvider = "httpCodeProvider")
    public void innerDataProviderUsage(int httpCode, String description) {
        log.info(String.format("%d: %s", httpCode, description));
    }

    @Test(dataProvider = "Success codes", dataProviderClass = HttpCodeTestDataProvider.class)
    public void externalDataProviderUsage(int httpCode, String description) {
        log.info(String.format("%d: %s", httpCode, description));
    }

    @Parameters({"code", "description"})
    @Test
    public void xmlParameterTests(@Optional("200") int httpCode, @Optional("OK") String description) {
        log.info(String.format("%d: %s", httpCode, description));
    }
}
