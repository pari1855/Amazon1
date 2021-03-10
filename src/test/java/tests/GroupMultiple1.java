package tests;

import org.testng.annotations.Test;

public class GroupMultiple1 extends BaseClassSO{

	    @Test(groups = {"P1"})
	    public void tCase6()
	    {
	        System.out.println("Inside testcase 6");
	    }

	    @Test(groups = {"P2"})
	    public void tCase7()
	    {
	        System.out.println("Inside testcase 7");
	    }

	    @Test(groups = {"P3"})
	    public void tCase8()
	    {
	        System.out.println("Inside testcase 8");
	    }

}
