package AbstractClasesAndInterfaces;

public class Student extends User{
    Student (String username, String password){
        super(username, password);
        this.username= username;
        this.password=password;
    }
    void checkNotes(){
        System.out.println("Checking marks");
    }

    void skipClass(){
        System.out.println("School skipping");
    }

}
