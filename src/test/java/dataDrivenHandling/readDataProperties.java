package dataDrivenHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readDataProperties {
    static Properties prop;


    public static String readProperties(String NeededData) throws IOException {
        // prepare to read from properties file
        FileReader file = new FileReader("./src//test//resources//config.properties");
        prop = new Properties();
        prop.load(file);
        return prop.getProperty(NeededData);
    }

}
