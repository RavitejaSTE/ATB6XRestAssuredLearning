package com.thetestingacademy.ex_27062024.jaksonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thetestingacademy.ex_27062024.gson.serialization.Booking;
import com.thetestingacademy.ex_27062024.gson.serialization.BookingDates;
import org.testng.annotations.Test;

public class Lab295 {

    @Test
    public void SeraJackson() throws JsonProcessingException {
        Booking booking = new Booking();
        System.out.println("Before assigning value "+booking);
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(-1);
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println("After assigning value "+booking);

        ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
           System.out.println(jsonString);

    }

}
