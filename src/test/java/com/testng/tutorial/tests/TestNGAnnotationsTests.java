package com.testng.tutorial.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotationsTests {
    private static final Logger log = LogManager.getLogger(TestNGAnnotationsTests.class);

    @BeforeSuite
    public void initEnvironment() {
        log.info("Before suite");
    }

    @Test
    public void checkCallOrder() {
        log.info("First test method");
    }
}
