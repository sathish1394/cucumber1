package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generatejvmreport(String name){
		File f= new File("C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\JVMreport");
		Configuration c= new Configuration(f, "Adactin application");
		c.addClassifications("phone", "motorola");
		c.addClassifications("os", "antroid");
		c.addClassifications("ram", "8gb");
		List<String> l = new ArrayList<>();
		l.add(name);
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports(); 
	}
	public static void main(String[] args) {
		generatejvmreport("C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\jsonreport\\adcatin.json");
	}

}
