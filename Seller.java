package Seller;

public class Seller {
    private int id;
    @MaxLen(name ="surname")
    private String surname;
    @MaxLen(name = "pathronymic")
    private String pathronymic;
    @MaxLen(name = "name")
    private String name;
    private int idStore;

    public Seller(String surname,String pathronymic,String name) {
        this.pathronymic = pathronymic;
        this.surname = surname;
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPathronymic(String pathronymic) {
        this.pathronymic = pathronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public String getPathronymic() {
        return pathronymic;
    }

    public String getName() {
        return name;
    }

    public Seller(int id, int idStore) {
        this.idStore = idStore;
        this.id = id;
    }

    public int getIdStore() {
        return idStore;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", pathronymic='" + pathronymic + '\'' +
                ", name='" + name + '\'' +
                ", idStore=" + idStore +
                '}';
    }
}
