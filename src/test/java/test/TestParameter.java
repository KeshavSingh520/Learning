package test;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	
	
	
	@Parameters({"browser","app"})
	@Test(groups = {"parameter"})
	public void getParameter(String strBrowser,String strApp) {
		System.out.println("From parameter: "+strBrowser+" "+strApp);
	}
	
	@Test(groups = {"xml"})
	public void getParameter(ITestContext context) {
		System.out.println("From xml: "+context.getCurrentXmlTest().getParameter("browser"));
		System.out.println(context.getCurrentXmlTest().getIncludedGroups().toString());
		
	}

}
