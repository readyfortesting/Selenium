package utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
// This class will only be used for getting the data from configuration.properties file
    public static Properties properties;

    static {
            //path of the config file
        String path="src/configuration.properties";

        try {
                //Opening the file
            FileInputStream file=new FileInputStream(path);
                //Loading the file
            properties=new Properties();
            properties.load(file);
             //Closing the file
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

  // This method accepts the key and returns the value
    public static String getProperty(String key){

        return properties.getProperty(key);
    }
}

/*
    //Test if it works ?
@Test
    public void test1(){
    System.out.println(getProperty("HMCUrl")); // https://www.hotelmycamp.com/
    System.out.println(getProperty("TechproUrl")); // https://www.techproeducation.com
}

 */

