package hu.nye.progkorny;

public class Service {
    private Database database;

    public Service(Database database) {
        this.database = database;
    }

    public void saveSomething(String data) {
        database.save(data);
    }
}
