package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/register.html"}, //reporting purpose
			monochrome=false,  //console output colour
			tags = "@registerScenario", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= "stepdefinition") //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();	
	    }

	
}