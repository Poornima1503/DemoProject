package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {
    private Properties prop;
    private final String propertyFilePath = "C:\\Users\\poorn\\IdeaProjects\\DemoProject\\src\\test\\java\\utilities\\Config.properties";

    public ConfigFileReader() {
        InputStream rdr;
        try {
            rdr = new FileInputStream(propertyFilePath);
            prop = new Properties();
            try {
                prop.load(rdr);
                rdr.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDriverPath() {
        String DriverPath;
        try {
            DriverPath = prop.getProperty("DriverPath");
            return DriverPath;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("driver path not found in the properties file");
        }
    }
    public String getApplicationURL(String appURL) throws Exception {
        String ApplicationURl;
        try{
            ApplicationURl=prop.getProperty(appURL);
            return ApplicationURl;
        }catch (Exception e) {
            e.printStackTrace();
            throw new Exception("URL not found in config.properties file");
        }
        }


}
