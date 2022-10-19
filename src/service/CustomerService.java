package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CustomerService {

    Collection<Customer> customers = new ArrayList<Customer>();
    public void addCustomer(String email, String firstName, String lastName) {
        Customer newCustomer = new Customer(firstName, lastName, email);
        customers.add(newCustomer);
    }
    public Customer getCustomer(String customerEmail) {
        Customer foundCustomer = null;
        for (Customer customer : customers) {
            if (Objects.equals(customer.email, customerEmail)) {
                foundCustomer = customer;
            }
        }
        return foundCustomer;

    }



    public Collection<Customer> getAllCustomers() {
        return customers;
    }


}




