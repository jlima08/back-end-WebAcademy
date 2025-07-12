package orientacao_objeto;

import java.util.ArrayList;
import java.util.List;

public class areas {
    public static void main(String[] args) {
        quadrado q1 = new quadrado(5.5);
        retangulo r1 = new retangulo(3,4);
        // System.out.println(q1.calcularArea());
        // System.out.println(r1.calcularArea());

        List<quadrilatero> figuras = new ArrayList<>();
        figuras.add(q1);
        figuras.add(r1);
        double areas = 0;

        for(quadrilatero figura:figuras )
            areas += figura.calcularArea();
        System.out.println(areas);


        
    }
    
}
