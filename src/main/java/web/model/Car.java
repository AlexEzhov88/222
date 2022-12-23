package web.model;


public class Car {
    private String user;
    private String model;
    private int id;

    public Car() {}

    public Car(int id, String man, String mod) {
        this.id = id;
        user = man;
        model = mod;
    }

    public void setUser(String man) { user = man; }
    public void setModel(String mod) { model = mod; }
    public void setId(int i) { id = i; }

    public String getUser() { return user; }
    public String getModel() { return model; }
    public int getId() { return id; }

    public String toString() { return getUser() + " " + getModel(); }
}
