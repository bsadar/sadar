package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class) 
@CucumberOptions(features="Feature",glue={"loginTest"})
public class Testrun {
	

	
}
//,glue={"loginTest"}