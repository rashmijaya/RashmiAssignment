package com.QAAssignmnet.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.QAAssignment.genericLib.BaseClass;
import com.QAAssignment.pageFactory.AssignmentPage;
@Listeners(com.QAAssignment.genericLib.ListenerIMP.class)
public class AlertTextTest extends BaseClass {

	@Test
	public void test() {
		
		AssignmentPage ap=new AssignmentPage(driver);
		String altMsg = ap.getOccurance("h", "helloworld hello");
		Assert.assertTrue(altMsg.contains("2"));
	}
}
