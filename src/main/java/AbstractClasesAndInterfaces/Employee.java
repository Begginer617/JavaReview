package AbstractClasesAndInterfaces;


// Cannot have constructors, consist abstract methods. Can have fields, and they will always be public final statc

// wartosc static w interfejsie bedzie zawsze taka sama dla kazdego obiektu klasy implementujacej interfejs.

// final mowi o tym ze nie mozna tego zmienic

// kazde pole w interfejsie jest public final static

public interface Employee {


    int maxVacation = 26;

    default void takeVacation(int days) {

    }

    default void takeSickLeave() {

    }
    default  void quitJob(){
        System.out.println("Nara!");
    }

    static void fireEmployee(Employee[]employees){
        for (Employee employee:employees){
            employee.quitJob();
        }
    }

}
