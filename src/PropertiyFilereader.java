import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiyFilereader 
{
	static WebDriver driver;
	public static void main(String[] args) throws Throwable  
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Aravind Ganga\\workspace\\BeForYourself\\ObjectRepo\\config.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String value = properties.getProperty("browser");
		String value2 = properties.getProperty("url");

		System.out.println(value);
		System.out.println(value2);
		
		if(value.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(value.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(value.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		

		
	}

}
