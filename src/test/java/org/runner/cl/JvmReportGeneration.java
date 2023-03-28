package org.runner.cl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGeneration {

	public static void generateJvmReport(String jsonPath) {

		// 1.Target Location
		File f = new File("C:\\Users\\Amirtha\\eclipse-workspace\\Cucumber12PmOff\\Reports\\JvmReport");
		// or  -File f = new File(System.getProperty("user.dir")+"\\Reports\\JvmReport");
		
		// 2.Use configuration class for adding details
		Configuration con = new Configuration(f, "FACEBOOK");
		con.addClassifications("Automation Tool ", "Selenium");
		con.addClassifications("IDE", "Eclipse-Oxygen");
		con.addClassifications("Platform", "Windows-11");
		con.addClassifications("Prg Lan", "Java");

		// 3.Add json path to list
		List<String> li = new ArrayList<>();
		li.add(jsonPath);

		// 4.Use Report builder class
		ReportBuilder rep = new ReportBuilder(li, con);
		rep.generateReports();

	}
}
