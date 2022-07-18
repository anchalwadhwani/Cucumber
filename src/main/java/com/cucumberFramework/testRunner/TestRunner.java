package com.cucumberFramework.testRunner;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberFramework.testBase.TestBase;

//import org.junit.runner.RunuWith;

//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = "src/test/resources/features/home.feature", glue = { "src/main/java/com/cucumberFramework/stepdefinitions" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" },
		monochrome = true)
public class TestRunner extends TestBase {
	WebDriver driver;
	String browser = "chrome";
		@Before()
		public void openbrowser() {
			
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
//			//WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
			System.out.println("Opening browser");
		selectBrowser(browser);
		}
	


//@CucumberOptions(features = "classpath:features/home.feature", glue = { "com/cucumberFramework/stepdefinitions" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
//		"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" },
//		monochrome = true, dryRun = false)
//public class TestRunner {
	
//	private TestNGCucumberRunner testNGCucumberRunner;
//	   
//	@BeforeClass(alwaysRun = true)
//	public void setUpClass() {
//		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	}

//	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
//	public void feature(CucumberFeatureWrapper cucumberFeature) {
//		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//	}

//	@DataProvider
//	public Object[][] features() {
//		return testNGCucumberRunner.provideFeatures();
//	}
//
//	@AfterClass(alwaysRun = true)
//	public void testDownClass() {
//		testNGCucumberRunner.finish();
//	}

}
