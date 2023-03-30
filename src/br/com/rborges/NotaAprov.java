package br.com.rborges;

import java.util.Scanner;

/**
 * @author Rebeca
 */
 public class NotaAprov {
     public static void main(String args[]) {
         Scanner s = new Scanner (System.in);

        System.out.println (" Digite sua 1ªnota: ");
        int nota1 = s.nextInt();

        System.out.println (" Digite sua 2ª nota: ");
        int nota2= s.nextInt();

        System.out.println (" Digite sua 3ª nota: ");
        int nota3= s.nextInt();

         System.out.println (" Digite sua 4ª nota: ");
         int nota4= s.nextInt();


        String notaSt = getNota((nota1 + nota2 + nota3 + nota4)/4);
        System.out.println(notaSt);

     }
        public static String getNota (int nota) {
            if (nota >= 0 && nota <= 4) {
                return "voce está reprovado";

            } else if (nota >= 5 && nota <= 7) {
                return "Voce está de recuperação";

            } else if (nota >= 7 && nota <= 10) {
                return "voce está aprovado !!!";
            } else{
                return "Nota invalida. Digite um valor entre 0 e 10";
            }
        }
    }