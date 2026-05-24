
import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList();
        notas.add(7.2);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.5);
        
        double soma = 0.0;

        for (Double nota : notas){
            soma+= nota;  
        }

        double media = soma / notas.size();

        if(media >= 7){
            System.out.printf("Media da turma: %.2f\n", media);
            System.out.println("Media da turma maior igual a 7!");
        } else {
            System.out.println("Media abaixo do esperado.");
        }
        
    }
}
