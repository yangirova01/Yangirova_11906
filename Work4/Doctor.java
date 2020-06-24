package Work4;

@StoreInFile(name = "Doctor.txt")
public class Doctor {
    private String name;
    private String surname;
    private String patronymic;
    private int id;
    private int specializationId;

    public Doctor(){
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int idSpecialization) {
        this.specializationId = idSpecialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", id=" + id +
                ", specializationId=" + specializationId +
                '}';
    }
}
