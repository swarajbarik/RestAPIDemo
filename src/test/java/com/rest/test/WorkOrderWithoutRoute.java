package com.rest.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class WorkOrderWithoutRoute {
	TestHelper testHelper = new TestHelper();

	@Then("^Create a work order without route (.*)$")
	public void createWorkOrder(String workOrderName) throws Throwable {
		Reporter.addStepLog("Creating work order.");
		// System.out.println("Creating work order.");


		Reporter.addStepLog("Creating WorkOrder with out route defination id.");
		Reporter.addStepLog("Create Work Order Request with out routeDefinitionId: " );
		Response res1 = testHelper.getRequet("", "");
		Reporter.addStepLog("Work Order Response Code : " + res1.getStatusCode());
		Assert.assertEquals(200, res1.getStatusCode());
		Reporter.addStepLog("Work Order Response : " + res1.asString());
		Reporter.addStepLog("Work Order Created with id : ");
		Reporter.addStepLog("Process Order id : ");
	}

	@And("^Clockon each operation and complete$")
	public void clockOnOperations() throws Throwable {
		Reporter.addStepLog("Total No Of lotIdetifiers = " );

	}

	@Then("^Get work order to verify the status$")
	public void getWorkOrder() {
		Reporter.addStepLog("Get Work Order");
	}

	@Then("^Validate process order created in SOADB$")
	public void getProcessOrder() {
		Reporter.addStepLog("Get Process Order");
	}
}
