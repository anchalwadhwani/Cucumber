//package com.cucumberFramework.testRunner;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import cucumber.api.CucumberOptions;
//import cucumber.runtime.model.CucumberFeature;
//import io.cucumber.testng.TestNGCucumberRunner;
//
//@CucumberOptions(features = "classpath:features/home.feature", glue = { "com/cucumberFramework/stepdefinitions" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
//		"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" },
//		monochrome = true, dryRun = false)
//public class TestRunnerTest {
//  
//	private TestNGCucumberRunner testNGCucumberRunner;
//	   
//	@BeforeClass(alwaysRun = true)
//	public void setUpClass() {
//		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	}
//
//	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
//	public void feature(CucumberFeature cucumberFeature) {
//		testNGCucumberRunner.runScenario(null);
////		testNGCucumberRunner.runCucumber(cucumberFeature.getGherkinFeature());
//	}
//
//	@DataProvider
//	public Object[][] features() {
//		return testNGCucumberRunner.provideScenarios();
//	}
//
//	@AfterClass(alwaysRun = true)
//	public void testDownClass() {
//		testNGCucumberRunner.finish();
//	}
////	@Test
////  public void f() {
////  }
//}
