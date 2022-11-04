package br.com.alura.telefonica.kafka.boost.newcustomerservice.framework.helper;

import br.com.alura.telefonica.kafka.boost.newcustomerservice.domain.Customer;

public class CustomerMessageBuilder {
    public static String buildMessage(Customer customer) {
        String message = customer.getName().concat(",")
                .concat(customer.getEmail()).concat(",")
                .concat(customer.getPhone()).concat(",")
                .concat(customer.getStreet()).concat(",")
                .concat(customer.getCity());
        return message;
    }
}
