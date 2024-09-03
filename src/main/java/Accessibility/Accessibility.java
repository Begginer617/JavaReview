package Accessibility;

<<<<<<< HEAD
import org.junit.jupiter.api.Test;
=======
import org.junit.Test;
>>>>>>> e8e2e58fb02184f55dba35d20dd9956b01f29346

public class Accessibility {
    int liczba1 = 5;
    int liczba2 = 10;

    int liczba3;
    int sumaLiczb = liczba1 + liczba2;

    @Test
    public void wypiszLiczbe() {
        liczba1 = 22;
        liczba3 = 12;
        int liczbaWMetodzie = 1;
        System.out.println( "Zmienna liczba1 jest rowna: " + liczba1 );

        for (int i = 0; i < 10; i++) {
            System.out.println( "zmienna liczba1 jest rowna: " + liczba1 + "wartosc i to: " + i );
            int lokalnaSSuma = liczba1 +i;

        if (i>5){
            String komunnikat = "i jest wieksze lub rowne 5";
            System.out.println(komunnikat);
        }
        }
    }


}


