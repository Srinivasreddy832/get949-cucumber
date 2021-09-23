package runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FrontAcc.feature", glue="stepDefination", monochrome=true, dryRun=false,plugin= {"pretty","html:target/tsl949.html","json:target/JsonReport/report.json"})
public class FrontAccrunner {

}
