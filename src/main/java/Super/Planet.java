package Super;

import java.security.PublicKey;

public class Planet extends AstronomicalObject {
    private int numberOfMoons;
    private int mass;
    private float rotationPeriodDays;
    private boolean hasRings;


        // twrzymy obiekt typu Planet i korzystamy z konstruktora nadrzednego w innej klasie
    public Planet(String name){
        super(name);
    }

    public Planet(String name,int orbitalPeriodDays, float radius, boolean hasRings ){
        super(name, orbitalPeriodDays, radius );
        this.hasRings = hasRings;


        Public Planet(int mass){

        }

    }

}