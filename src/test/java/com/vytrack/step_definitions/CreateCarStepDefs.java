package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefs {

    @Then("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {

        System.out.println("user navigates to %s tab and %s module, string, string2");

    }


    @Then("user click on create car button")
    public void user_click_on_create_car_button() {
        System.out.println("user clicks on create car button");

    }
    @Then("user enter vehicles information:")
    public void user_enter_vehicles_information(List<Map<String, String>> dataTable) {

        dataTable.forEach(p-> System.out.println(p)); //p -> predicate     ==> print every single value of map

//      how can we read the exact values within data tables based on key, values

        System.out.println("Driver: " + dataTable.get(0).get("Driver"));   //get(0) -> first row

        System.out.println("Location: " + dataTable.get(0).get("Location"));


    }
}
