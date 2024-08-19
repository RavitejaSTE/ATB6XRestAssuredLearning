package com.thetestingacademy.ex_22062024_CRUD.POST;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab272 {

    RequestSpecification rs = RestAssured.given();
    Response response;
    ValidatableResponse validatableResponse;

    @Description("TC#1 - Verify that create booking is working with valid payload")
    @Test
    public void testNonBDDStylePOSTPositive(){
        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        Faker faker = new Faker();
        String firstName = faker.name().firstName();

        String payload = "{\n" +
                "    \"firstname\" : \""+firstName+"\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        rs.baseUri(BASE_URL);
        rs.basePath(BASE_PATH);
        rs.contentType(ContentType.JSON).log().all();
        rs.body(payload);

        response = rs.when().log().all().post();
        String responseString = response.toString();
        System.out.println(responseString);

        validatableResponse=response.then().log().all().statusCode(200);
    }

    @Test
    public void testNonBDDStylePostNegative(){
        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payLoad ="{}";

        rs.baseUri(BASE_URL);
        rs.basePath(BASE_PATH);
        rs.contentType(ContentType.JSON).log().all();
        rs.body(payLoad);

       //rs.baseUri(BASE_URL).basePath(BASE_PATH).contentType(ContentType.JSON).log().all().body(payLoad);

        response=rs.when().log().all().post();
        String responseString=response.toString();
        System.out.println(responseString);

        validatableResponse=response.then();
        validatableResponse.statusCode(500);

        //validatableResponse=response.then().log().all().statusCode(500);

    }
}