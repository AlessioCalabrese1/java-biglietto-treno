package org.generation.trains;

import java.util.Scanner;

public class CostCalaculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire il numero di km da percorrere: ");
        double km = in.nextDouble();
        System.out.println("Inserire l'età del passeggero: ");
        int age = in.nextInt();

        double cost = 0.21;
        double tot = 0;
        if(age >= 12 && age < 18){
            tot = cost;
            for (int i = 1; i < (int)km; i++) {
                tot += cost + 0.01;
            }
            tot = tot - ((cost * km) * 20)/100;
        }else if(age > 65){
            tot = cost;
            for (int i = 1; i < (int)km; i++) {
                tot += cost + 0.01;
            }
            tot = tot - ((cost * km) * 40)/100;
        }else if(age < 12){
            System.out.println("I mionori di 12 anni viaggiano gratis!");
            return;
        }else{
            tot = cost;
            for (int i = 1; i < km; i++) {
                tot += cost + 0.01;
            }
        }

        System.out.printf("Il prezzo risultante per %.2f km è: %.2f$ %n!", km, tot);
    }
}
