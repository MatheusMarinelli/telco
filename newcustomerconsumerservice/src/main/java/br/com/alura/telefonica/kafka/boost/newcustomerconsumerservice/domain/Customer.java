package br.com.alura.telefonica.kafka.boost.newcustomerconsumerservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private String email;
    private String phone;
    private String street;
    private String city;
}
