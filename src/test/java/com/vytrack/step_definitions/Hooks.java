package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        System.out.println("Scenario name : " + scenario.getName());
        System.out.println("Empty hook before");    // setup WebDriver, connect to DB
    }

    @Before("@scenario_1")
    public void specialSetUp(){
        System.out.println("Special hook before\n");  //   \n -> new Line
    }

    @After("@scenario_1")
    public void specialTearDown(){
        System.out.println("Special hook after\n");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
        System.out.println("Empty hook after");   // close WebDriver, close connection to DB , everything after scenario
    }

}
