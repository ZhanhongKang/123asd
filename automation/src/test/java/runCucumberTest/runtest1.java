package runCucumberTest;

import static org.junit.Assert.*;





import org.junit.Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/CucumberFeature"},
		glue = {"stepCucumberStep"})

public class runtest1 {



}
