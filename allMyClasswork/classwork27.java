package allMyClasswork;
public class classwork27 {
    private String name;
    private String surname;
    private String patronic;
    private int[]marks;
    public classwork27(String name, String surname,String patronic){
        this.name = name;
        this.surname = surname;
        this.patronic = patronic;
    }public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return this.name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getname(String surname){
        return this.surname;
    }
    public void setPatronic(String patronic){
        this.patronic = patronic;
    }
    public String getPatronic(String patronic){
        return this.patronic;
    }
    public void setMathMarks(int x){
     this.marks[0] = x;
    }
    public int getMathMarks(){
        return this.marks[1];
    }
    public void setMathInfMarks(int y){
        this.marks[1] = y;
    }
    public int getMathInfMarks(){
        return this.marks[1];
    }
    public void setAlgMarks(int z){
        this.marks[1] = z;
    }
    public int getAlgMArks(){
        return this.marks[1];
    }
}
