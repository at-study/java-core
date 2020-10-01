package lections.lesson4;

public class SqlApplication {

    public static void main(String[] args) {
        SqlConnection connection = new SqlConnection();

        connection.connect();
        connection.updateClient();
        connection.updateUser();
        connection.disconnect();

        connection.connect()
                .updateUser()
                .updateClient()
                .disconnect();
    }

}
