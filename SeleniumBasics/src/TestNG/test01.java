package TestNG;

import org.testng.Assert;
//import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import retryfailedTc.RetryAnalyzer;

public class test01 {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
