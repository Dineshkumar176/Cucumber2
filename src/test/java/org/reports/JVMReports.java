package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void generateJvmReports(String json) {
		File file = new File(System.getProperty("user.dir")+"\\target");
		Configuration con = new Configuration(file, "sample");
		con.addClassifications("Browser", "ChromeBrowser");
		con.addClassifications("platform", "windows");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, con);
		builder.generateReports();

	}

}
