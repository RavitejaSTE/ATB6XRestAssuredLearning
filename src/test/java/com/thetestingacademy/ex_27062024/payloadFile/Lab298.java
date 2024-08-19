package com.thetestingacademy.ex_27062024.payloadFile;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

public class Lab298 {

    RequestSpecification rs = RestAssured.given();
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void testPOSTRequest(){

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";


        File file = new File("src/test/resources/postRequest.json");

        rs.baseUri(BASE_URL);
        rs.basePath(BASE_PATH);
        rs.contentType(ContentType.JSON).log().all();
        rs.body(file);

        response = rs.when().log().all().post();
        String responseString = response.asString();
        System.out.println(responseString);

        validatableResponse=response.then();
        validatableResponse.statusCode(500);




    }



}
