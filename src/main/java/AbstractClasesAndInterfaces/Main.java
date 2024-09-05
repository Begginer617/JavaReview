package AbstractClasesAndInterfaces;

public class Main {


    public static void main(String[] args) {
        Student student = new Student("student", "test1234");
//        student.login("student", "test1234");


        // obiekt z interfejsu. brak dostepu do metod
//        Employee employee = new Professor("profesorD", "dhaslo1234");

        // obiekt z klasy. dostep dop metod
//        Professor employee1 = new Professor("profesorDas", "dhaslo12345");

        Professor professor1 = new Professor("professor", "test123");
        Professor professor2 = new Professor("professor", "test123");
        Professor professor3 = new Professor("professor", "test123");

//        System.out.println(employee1.maxVacation);


        Employee [] employees = {professor1,professor2,professor3};
        Employee.fireEmployee(employees);
    }


}
}


