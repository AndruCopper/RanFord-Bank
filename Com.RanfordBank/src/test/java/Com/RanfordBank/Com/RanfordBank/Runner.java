package Com.RanfordBank.Com.RanfordBank;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\SELENIUM\\New Batch\\Com.RanfordBank\\features\\app.feature",glue= {"StepDefination"})
public class Runner {

}
