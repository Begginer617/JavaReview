package Super;

public class AstronomicalObject {

    private int orbitalPeriodDays;
    private float radius;
    private String name;


    public AstronomicalObject(String name) {
        this.name = name;
    }

    public AstronomicalObject(String name,int orbitalPeriodDays, float radius ) {
        this.name = name;
        this.orbitalPeriodDays = orbitalPeriodDays;
        this.radius = radius;

    }

}
