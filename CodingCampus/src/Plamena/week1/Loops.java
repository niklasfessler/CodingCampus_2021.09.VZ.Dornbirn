package Plamena.week1;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {


        //pi nicht gemacht

 /*     float a = 4;
        float n = 1;
        float pi;

        for (int count = 0; count <= 499999; count++){
            pi = a/n;
            if (count%2 == 0){
                n = n + 2;
            } else{
                n = -(n-2);
            }
            pi = pi+pi;
        }
        return pi;
        System.out.println(pi);*/



    //Calculater

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int i = scanner1.nextInt();

        for (int counter = 1; counter < 11; counter++) {
            int result = i * counter;
            System.out.println(i + "*" + counter + " = " + result);
        }

    //Square

        for (int m = 1; m < 101; m++){
            System.out.print(" x ");
           if (m%10 == 0){
               System.out.println();
           }else {
               continue;
           }
        }

        //Viereck


        for (int m = 0; m < 5; m++){
            for ( int n = 0; n < 4; n++){
                System.out.print("X");
            }
            System.out.println();
        }


//Arrow#1

        for (int y = 0; y < 10; y++) {
            if (y < 6) {
                for (int x = 0; x < y; x++) {
                    System.out.print("*");
                }
            } else {
                for (int x = 10 - y; x >= 1; x--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        //Arrow#2
        int height = 11;
        int upperHalf = height / 2;
        int lowerHalf = height - upperHalf;

        for (int o = 0; o <= upperHalf; o++) {
            for (int j = 0; j <= o; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (int k = 0; k <= lowerHalf; k++){
                for (int j = lowerHalf-k; j >= 0; j--) {
                    System.out.print("*");

                }
            System.out.println();
        }







//Circle

        double r = 5;


        for (double l = -r; l <= r; l++) {
            for (double j = -r; j <= r; j++) {
                if (Math.sqrt((Math.pow(l, 2.0))+ Math.pow(j, 2.0)) <= (r+0.5) ) {
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        //empty Circle


        double r1 = 5;


        for (double u = -r1; u <= r1; u++) {
            for (double j = -r; j <= r; j++) {
                if (Math.sqrt((Math.pow(u, 2.0))+ Math.pow(j, 2.0)) <= (r1+0.5) && Math.sqrt((Math.pow(u, 2.0))+ Math.pow(j, 2.0)) >= (r1-0.5)) {
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


        //Square

        int width = 4;

        for (int v = 0; v<=width-1;v++){
            for ( int j = 0; j <= width-1; j++){
                if ( v == 0 || v == width-1 || j ==0 || j == width-1){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }
}










