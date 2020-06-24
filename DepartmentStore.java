package Seller;

public class DepartmentStore {
    private int id;
    @MaxLen( name = "nameStore")
    private String nameStore;
    private int idStore;

    @Override
    public String toString() {
        return "DepartmentStore{" +
                "id=" + id +
                ", nameStore='" + nameStore + '\'' +
                ", idStore=" + idStore +
                '}';
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStore() {
        return nameStore;
    }

    public int getIdStore() {
        return idStore;
    }

    public int getId() {
        return id;
    }
}
