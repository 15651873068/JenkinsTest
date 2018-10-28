package test1_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ Test1_2codeTest.class })
public class AllTests {
	public static Test suite(){
		TestSuite suite=new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(Test1_2code.class));
		return (Test) suite;
	}

}
