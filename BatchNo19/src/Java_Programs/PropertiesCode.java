package Java_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\workspace\\BatchNo19\\Property.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String x = prop.getProperty("kahani");
		System.out.println(x);
	}

}
