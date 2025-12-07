package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configReader {
	private static Properties properties;
	public static Properties initProp() {
		properties = new Properties();
		try {
			InputStream fis = null;
			try {
				fis = configReader.class.getClassLoader().getResourceAsStream("config.properties");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (fis != null) {
			properties.load(fis);
			}
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
