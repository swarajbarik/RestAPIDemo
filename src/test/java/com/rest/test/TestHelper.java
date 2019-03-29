package com.rest.test;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestHelper {

	public static String auth_key_docker;
	public String basePath;

	public static String getReportConfigPath() {
		String reportConfigPath = "extent-config.xml";
		return reportConfigPath;
	}

	public String updateBasePath(String applicationPort, String updatedPath) {
		return basePath = "" + ":" + applicationPort + "/" + updatedPath;
	}

	/**
	 * This method used to make a get call
	 * 
	 * @param applicationPort
	 * @param updatedPath
	 * @return response
	 */
	public Response getRequet(String applicationPort, String updatedPath) {
		basePath = "https://reqres.in/api/users?page=2";
		Response response = given().contentType(ContentType.JSON)//.header("Authorization", auth_key_docker)
				.relaxedHTTPSValidation().get(basePath);
		return response;
	}

	/**
	 * This method is used to make a post call.
	 * 
	 * @param applicationPort
	 * @param body
	 * @param updatedPath
	 * @return response
	 */
	public Response postRequet(String applicationPort, String body, String updatedPath) {
		basePath = updateBasePath(applicationPort, updatedPath);
		System.out.println(basePath);
		Response response = given().contentType(ContentType.JSON).header("Authorization", auth_key_docker)
				.relaxedHTTPSValidation().body(body).post(basePath);
		return response;
	}

	/**
	 * This method is used make a put call.
	 * 
	 * @param applicationPort
	 * @param body
	 * @param updatedPath
	 * @return response
	 */
	public Response putRequet(String applicationPort, String body, String updatedPath) {
		basePath = updateBasePath(applicationPort, updatedPath);
		System.out.println(basePath);
		Response response = given().contentType(ContentType.JSON).header("Authorization", auth_key_docker)
				.relaxedHTTPSValidation().body(body).put(basePath);
		return response;
	}

}
