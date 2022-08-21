package com.testng.tutorial.data;

import org.testng.annotations.DataProvider;

public class HttpCodeTestDataProvider {

    @DataProvider(name = "Success codes", parallel = true)
    public static Object[][] successCodes() {
        return new Object[][]{
                {200, "OK"},
                {201, "Created"},
                {202, "Accepted"},
                {203, "Non-Authoritative Information"},
                {204, "No Content"},
                {205, "Reset Content"},
                {206, "Partial Content"},
                {207, "Multi-Status"}
        };
    }

}
