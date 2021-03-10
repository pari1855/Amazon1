package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassSO {

	    @BeforeMethod(onlyForGroups = {"P1"})
	    public void bmeth1()
	    {
	        System.out.println("Before Method1 called");
	    }

	    @BeforeMethod(onlyForGroups = {"P2"})
	    public void bmeth2()
	    {
	        System.out.println("Before Method2 called");
	    }

	    @BeforeMethod(onlyForGroups = {"P3"})
	    public void bmeth3()
	    {
	        System.out.println("Before Method3 called");
	    }

	    @AfterMethod(onlyForGroups = {"P1"})
	    public void ameth1()
	    {
	        System.out.println("After Method1 called");
	    }

	    @AfterMethod(onlyForGroups = {"P2"})
	    public void ameth2()
	    {
	        System.out.println("After Method2 called");
	    }

	    @AfterMethod(onlyForGroups = {"P3"})
	    public void ameth3()
	    {
	        System.out.println("After Method3 called");
	    }

}
