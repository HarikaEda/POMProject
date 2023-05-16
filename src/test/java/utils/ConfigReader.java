package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
//configreader clasını projenin yapılandırma bilgilerini yazmak için oluşturduk.
    //Maven projesi tarafından kullanılır.yapılandırma bilgilerinin okunması için kullanır..
    // Amaç yapılandırma bilgilerinin merkezi bir yerde olamsıdır..
    //config.properties dosyasında projede tekrar kullanılan verileri saklamak için oluşturulan properties dosyasıdır..
    //oldukça yaygın bir yöntemdir...

    public static Properties properties;

    static {
        String filePath = "config.properties";
        try {
            FileInputStream fis = new FileInputStream(filePath);

            properties = new Properties();
            properties.load(fis);

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}


