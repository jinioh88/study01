package examples;


import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class ProperticesMain {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream propStream = classLoader.getResourceAsStream("servlet.properties");

        Properties prop = new Properties();
        prop.load(propStream);

        Set<String> keys = prop.stringPropertyNames();
        for(String key:keys){
            System.out.println(key+":"+prop.getProperty(key));
        }
    }
}
