package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //Junit Runner  (Junit support a custom class test execution it supported with Runwith annotaion that comes from Junit)
                            //as a parapeter Cucumber.class

//providing test parameter, specify reports that we want to generate , location of steps defs, features files
@CucumberOptions(
        features = "src/test/resources/features" ,             //path from content root of features files
        glue = "com/vytrack/step_definitions",        //path from SOurce root after Java root of step_definitions
        dryRun= false,
        tags = "@smoke_test",
//        tags = "@scenario_1",
//        tags = "" ,         // all test will run
//        tags = "@wip"

        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)

public class TestRunner {


}
