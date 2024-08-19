package com.thetestingacademy.ex_27062024.jaksonapi.deser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thetestingacademy.ex_27062024.gson.serialization.Booking;
import org.testng.annotations.Test;

public class Lab296 {

    @Test
    public void DeSer() throws JsonProcessingException {

        String jsonString = "{\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Booking booking = new Booking();
        System.out.println("Before assigning value "+booking);
        booking = objectMapper.readValue(jsonString, Booking.class);
        System.out.println("After assigning value "+booking);
        System.out.println(booking.getFirstname());




    }

}
