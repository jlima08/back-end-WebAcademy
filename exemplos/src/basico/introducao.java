package basico;

import java.util.ArrayList;
import java.util.List;

public class introducao{
    public static void main(String[] args) {
        //tipos de dados
        int x = 0;
        double y = 8.8;
        float z = 8.5f;
        boolean status = true;
        double soma = x + y;
        char letra = 'J';
        System.out.println("a soma deles é: " + soma);
        String nome = "Jon";
        String n1 = "8.8";
        double resultado = Double.parseDouble(n1) + y; //converter string para double
        System.out.println(resultado);
        int soma_inteiro = (int)soma; //converter a soma double para int
        System.out.println(soma_inteiro);
        System.out.println((int) letra);

        String resultado_final = (status) ? "aprovado" : "reprovado";
        System.out.println(resultado_final); 
        //vetores

        // int [] vetor = new int [10];
        // for(int i = 0; i < vetor.length; i++)
        //     vetor[i] = i + x;
            
        // for(int item : vetor)
        // System.out.println(item);

        //vetores dinamicos
        List<Integer> vetor_dinamico = new ArrayList<>();
        for(int i = 0; i < 8; i++)
            vetor_dinamico.add(i + x);

         System.out.println(vetor_dinamico.get(0));

        vetor_dinamico.remove(0);// remove pelo indice
        vetor_dinamico.remove(Integer.valueOf(2));//remove pelo conteudo

        for(int item : vetor_dinamico)
             System.out.println(item);
    }
    
}
