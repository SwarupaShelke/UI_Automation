package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	private static Properties properties;
	public static Properties initProp() {
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("E:\\eclipse-workspace\\PayFuture\\com.soucedemo.ui\\src\\test\\resources\\config.properties");
			properties.load(fis);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	public static String getProperty(String key) {
		if(properties == null) {
			initProp();
		}
		return properties.getProperty(key);
	}
}
