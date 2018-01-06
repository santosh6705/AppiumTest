package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(dryRun=false,monochrome=false,features={"Features"},format= {"pretty","html:reports"})
//dryrun only execute the implementation without run method.
//Monochrome will give report in redable format
public class Runner {
	


}
