package com.dattu.Project.Automations;

import java.io.IOException;

import org.testng.annotations.Test;

public class Fbdropdowntest extends DriverUtility{

	@Test
	public void test() throws IOException {
		getdriver().get(Pojo.getconfigFile().getPropertyValue("FacebookUrl"));
		Actionengine.dropdownbyId(Pojo.getorFile().getPropertyValue("id"), "5");
	}
}
