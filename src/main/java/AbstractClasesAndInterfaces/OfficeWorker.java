package AbstractClasesAndInterfaces;

public class OfficeWorker extends User implements Employee {

    public OfficeWorker(String password, String name) {
        super(password, name);
    }


    @Override
    public void takeVacation(int days) {
        System.out.println("Message to manager with holidays approval has been sent" + "Length of holiday period is equal to" + " " + days + "days");
    }

    @Override
    public void takeSickLeave() {
        System.out.println("Request for sick leave has been sent by employee");

    }

    @Override
    void sendMessage(String message) {

    }
}
