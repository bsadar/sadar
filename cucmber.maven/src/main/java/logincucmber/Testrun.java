package logincucmber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="Feature",glue={"scripting"})

public class Testrun {

}
//,glue={"scripting"}