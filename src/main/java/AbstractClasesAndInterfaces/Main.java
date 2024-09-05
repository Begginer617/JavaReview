package AbstractClasesAndInterfaces;

public class Main {


    public static void main(String[] args) {
        Student student = new Student("student", "test1234");
        student.login("student", "test1234");


        // obiekt z interfejsu. brak dostepu do metod
//        Employee employee = new Professor("profesorD", "dhaslo1234");

        // obiekt z klasy. dostep dop metod
//        Professor employee1 = new Professor("profesorDas", "dhaslo12345");

        Professor professor = new Professor("professor", "test123");
        professor.quitJob();
//        System.out.println(employee1.maxVacation);

    }


}

