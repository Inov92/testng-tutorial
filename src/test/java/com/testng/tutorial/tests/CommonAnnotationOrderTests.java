package com.testng.tutorial.tests;

import org.testng.annotations.*;

import static org.testng.Assert.fail;

public class CommonAnnotationOrderTests extends AbstractTestContextTests {

    @BeforeSuite
    public void initEnvironment() {
        log.info("@BeforeSuite: The annotated method will be run before all tests in this suite have run.");
    }

    @BeforeTest
    public void initTestFramework() {
        log.info("@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the @Test is run.");
    }

    @BeforeClass
    public void initTestData() {
        log.info("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
    }

    @BeforeMethod
    public void initPreconditions() {
        log.info("@BeforeMethod: The annotated method will be run before each test method.");
    }

    @Test
    public void checkCallOrder() {
        log.info("First test method is called");
    }

    @Test
    public void verifyAlwaysFailedAssertion() {
        fail("Test should always fail");
    }

    @AfterMethod
    public void postActions() {
        log.info("@AfterMethod: The annotated method will be run after each test method.");
    }

    @AfterClass
    public void clearTestData() {
        log.info("@AfterClass: The annotated method will be run after all the test methods in the current class have been run.");
    }

    @AfterTest
    public void generateReport() {
        log.info("@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the @Test have run.");
    }

    @AfterSuite
    public void tearDown() {
        log.info("@AfterSuite: The annotated method will be run after all tests in this suite have run.");
    }
}
