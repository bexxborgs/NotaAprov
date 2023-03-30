package br.com.rborges;

import java.util.Scanner;

/**
 * @author Rebeca
 */
 public class NotaAprov {
     public static void main(String args[]) {
         Scanner s = new Scanner (System.in);

        System.out.println (" Digite sua nota: ");
        int nota = s.nextInt();
        String notaSt = getNota(nota);
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