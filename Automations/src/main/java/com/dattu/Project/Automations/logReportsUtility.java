package com.dattu.Project.Automations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logReportsUtility {
private static Logger log;

public static void logMsg(Object msg)
{
	PropertyConfigurator.configure("C:\\Users\\dattu\\git\\repository2\\mahesh\\Automations\\src\\main\\java\\com\\dattu\\Project\\Automations\\obejectRepository\\log4j.properties");
log=Logger.getLogger("MylogReport");
log.info(msg);

}

}
