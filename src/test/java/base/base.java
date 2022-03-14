package base;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Properties;

	public class base  {
	   public static Properties properties;
	   public static String propertyFilePath= "config//Configuration.properties";
	   
	   public String configFileReader(String configpropname){
		String value=null;
		BufferedReader reader;
		try {
			reader= new BufferedReader(new FileReader(propertyFilePath));
			properties =new Properties();
			try {
				properties.load(reader);
				value=properties.getProperty(configpropname);
				reader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at"+propertyFilePath);
		}
	    return value;	
	  }
	}



