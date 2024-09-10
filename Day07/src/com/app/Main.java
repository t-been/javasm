package com.app;

import com.db.CRUD;
import com.db.Customer;

public class Main {
    public static void main(String[] args) {
        CRUD customerCrud = null;
        Customer customer = new Customer("id01", "pwd01", "james");
        customerCrud.insert(customer);
    }
}
