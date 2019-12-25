package allMyClasswork;
public class Student {
        String name;
        boolean sex;
        String birtdate;
        String education;
        String rang;

    public Student() {
    }
    public static void main(String[] args) {
        Student oleg=new Student();
        oleg.name= "P.O.B";
       // oleg.sex= "Муж";
        oleg.birtdate="30.01.2001";
        oleg.education="среднее";
        //oleg.rang=300;
    }
    public class User {
        protected String fio;
        protected String login;
        protected String password;
        User (String fio,String login,String password){
        this.fio = fio;
        this.login = login;
        this.password = password;
        }
        public void setFio(String fio){
           this.fio = fio;
        }
        public String getFio(String fio){
            return this.fio;
        }
        public void setLogin(String login){
            this.login = login;
        }
      //  public String getLogin(String login)
    }
    }

