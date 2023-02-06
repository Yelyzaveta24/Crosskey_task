package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatorCustomerTest {

    @Test
    void createCustomer() {
        CreatorCustomer creatorCustomer = new CreatorCustomer();
        Customer customer = creatorCustomer.createCustomer("Juha,1000,5,2".split(","));
        Customer expectedCustomer = new Customer();
        expectedCustomer.fullName = "Juha";
        expectedCustomer.interest = 0.05;
        expectedCustomer.years = 2.0;
        expectedCustomer.totalCost = 1000;
        expectedCustomer.payMonth = 70.9524572992296;
        assertEquals(customer.fullName, expectedCustomer.fullName);
        assertEquals(customer.totalCost, expectedCustomer.totalCost);
        assertEquals(customer.interest, expectedCustomer.interest);
        assertEquals(customer.years, expectedCustomer.years);
        assertEquals(customer.payMonth, expectedCustomer.payMonth);
    }
}