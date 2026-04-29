package hu.nye.progkorny;

public class App {
    public static void main(String[] args) {
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        PostgresSQLDatabase postgresSQLDatabase = new PostgresSQLDatabase();
        Service service = new Service(mySQLDatabase);
        service.saveSomething("adat");
    }
}
