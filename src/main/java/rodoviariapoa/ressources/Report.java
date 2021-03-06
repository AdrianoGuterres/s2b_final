package rodoviariapoa.ressources;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	private static final String DEFAULT_DESCRIPTION = "Students to Business TEST SUITE";
	private static final String DEFAULT_PATH = "./reports/report_%s.html";
	private static ExtentReports extentReport;
	private static ExtentTest logger;
	
	public static void create(String title, String description) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(String.format(DEFAULT_PATH, LocalDateTime.now().getNano()));
		
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Results Report");
		htmlReporter.config().setReportName("Automated Test Cycle");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(htmlReporter);
		extentReport.setSystemInfo("OS : ",             System.getProperty("os.name"));
		extentReport.setSystemInfo("OS Version : ",     System.getProperty("os.version"));
		extentReport.setSystemInfo("OS Architecture :", System.getProperty("os.arch"));
		extentReport.setSystemInfo("Java Version : ",   System.getProperty("java.version"));
		try {extentReport.setSystemInfo("IP Address : ",     InetAddress.getLocalHost().getHostAddress());} catch (UnknownHostException e) {}
		
		
	}

	public static void startTest(String testDescription) {
		if(extentReport == null) {
			create(DEFAULT_DESCRIPTION, testDescription);
		}
		
		logger = extentReport.createTest(testDescription);
	}

	public static void log(Status logStatus, String message, String imagePath) {		
		try {
			if(logger == null) {
				startTest(DEFAULT_DESCRIPTION);
			}
			
			logger.log(logStatus, message, MediaEntityBuilder.createScreenCaptureFromPath(imagePath).build());
		} catch (IOException ex) {
			logger.log(logStatus, message + " (Screenshot fail)");
		}
	}

	public static void log(Status logStatus, String message) {		
		if(logger == null) {
			startTest(DEFAULT_DESCRIPTION);
		}
		
		logger.log(logStatus, message);
	}
	
	public static void close() {
		if(extentReport != null) {
			extentReport.flush();
		} else {
			startTest("O TestCase passou!");
			log(Status.INFO, "O teste encerrou.");
			close();
		}
	}
}