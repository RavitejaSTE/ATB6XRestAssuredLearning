package com.thetestingacademy.ex_25062024;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Lab286 {

    @Test
    public void testDemo1(){
        // Randomd User or Password

        Faker faker = new Faker();
        String username = faker.name().username();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        System.out.println(username);
        System.out.println(phoneNumber);
        System.out.println(firstName);
        System.out.println(lastName);

    }

}
