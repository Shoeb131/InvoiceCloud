package net.invoiceCloud.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.invoiceCloud.hooks.ApplicationHooks;

public class ElementUtil {
	public static ElementUtil eu = new ElementUtil();
	private Logger log = LogManager.getLogger(ElementUtil.class.getName());

	public String getData(String key) {
		log.info("Getting date from the Config properties file");
		return ApplicationHooks.prop.getProperty(key);
	}


}