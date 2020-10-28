package lections.lesson10.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {

    private static final Properties PROPERTIES;

    public static final String URL;
    public static final Integer PORT;
    public static final Boolean IS_REMOTE;
    public static final String PROTOCOL;

    static {
        PROPERTIES = new Properties();
        loadProperties(PROPERTIES);
        URL = getProperty("url");
        PORT = getIntegerProperty("port");
        IS_REMOTE = getBooleanProperty("is_remote");
        PROTOCOL = getProperty("protocol");
    }

    private static void loadProperties(Properties properties) {
        try {
            properties.load(new FileReader("src\\main\\java\\lections\\lesson10\\application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    private static Integer getIntegerProperty(String key) {
        return Integer.parseInt(getProperty(key));
    }

    private static Boolean getBooleanProperty(String key) {
        return Boolean.parseBoolean(getProperty(key));
    }

}
