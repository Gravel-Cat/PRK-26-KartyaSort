package hu.nye.progkorny;

public class PostgresSQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving data to PostgresSQL: "+data);
    }
}
