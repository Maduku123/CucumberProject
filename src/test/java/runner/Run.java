package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\cashp\\eclipse-workspace\\CucumberProject\\src\\main\\java\\features",
glue="steps_definitions",monochrome=true,plugin= {"pretty","html:target/html/testReport","json:target/json/testReport"})
public class Run {

}
