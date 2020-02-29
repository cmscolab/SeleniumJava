package advanced;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendedReports {


	public static void main(String[] args) {

		
		ExtentReports report = new ExtentReports("./reports/report.html", false);
		ExtentTest test = report.startTest("Create Lead");
		test.assignAuthor("Chandana");
		test.assignCategory("trial");
		test.log(LogStatus.PASS, "Enter of username  - successful" + test.addScreenCapture("./../screenshots/crystal.jpeg"));
		test.log(LogStatus.PASS, "Enter of password - successful");
		report.endTest(test);
		report.flush();
	}

}