package AbstractClasesAndInterfaces;

public class Professor extends User implements Employee {

    Professor(String username, String password) {
        super(username, password);

    }

    void giveNotes() {
        System.out.println("Give Marks");
    }

    void cancelClass() {
        System.out.println("Lesson canceled");
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending text message to students");
        System.out.println(message);
    }

    public void takeSickLeave() {
        System.out.println("Sick leave confirmation has been sent by Professor ");
    }

    public void takeVacation(int days) {
        System.out.println("Holiday leave approval has been sent. " + "Length of holiday leave" + days + "days");
    }



}





