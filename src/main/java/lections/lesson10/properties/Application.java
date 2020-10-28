package lections.lesson10.properties;

public class Application {

    private static final String string;

    static {
        string = "ABC";
    }


    public static void main(String[] args) {
        System.out.println(string);

        String url = Property.URL;
        Integer port = Property.PORT;
        Boolean isRemote = Property.IS_REMOTE;
        String protocol = Property.PROTOCOL;

        System.out.printf("%s://%s:%d, %b", protocol, url, port, isRemote);

    }

}
