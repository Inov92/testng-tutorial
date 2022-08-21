package com.testng.tutorial.tests;

import org.testng.annotations.Test;

public class ParallelTests extends AbstractTestContextTests {

    @Test
    public void firstVerification() {
        log.info("First verification was in thread: " + Thread.currentThread().getName());
    }

    @Test
    public void secondVerification() {
        log.info("Second verification was in thread: " + Thread.currentThread().getName());
    }

    @Test
    public void thirdVerification() {
        log.info("Third verification was in thread: " + Thread.currentThread().getName());
    }

    @Test
    public void forthVerification() {
        log.info("Forth verification was in thread: " + Thread.currentThread().getName());
    }
}
