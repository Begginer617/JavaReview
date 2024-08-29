package JavaMethods;

public class Car {
    String colour = "red";
    Boolean isBeltOn = true;
    Boolean IsBeltOff = false;
    private Object komunikatPasyNiezapmiete;

    void breaking() {
        System.out.println("Car is breaking");
    }

    void driving() {
        System.out.println("Car is breaking");
    }

    boolean changeColour(String wantedColour) {
        if (wantedColour == "Black")
            return true;
        else return false;
    }

    boolean isColourRed(String wantedColour) {
        if (wantedColour.equals("Red"))
            return true;
        else return false;
    }


    }


