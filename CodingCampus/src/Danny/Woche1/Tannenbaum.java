package Danny.Woche1;

public class Tannenbaum {
    public static void main(String[] args) {
//Krone_

        int kroneHoehe = 5;
        int spitzeWert = 1;
        int abstandRand = kroneHoehe;
        int y = 0;

        for (int k = 0; k <= kroneHoehe; k++) {
            printStar(abstandRand, " ");
            y = 0;
            printStar(spitzeWert, "X");
            System.out.println();
            spitzeWert += 2;
            abstandRand--;
        }

//Kugeln
        int s = y;
        int m = 2;

        for (int f = 0; f < y; f++) {
            if (s % m != 0) {
                System.out.print("*");
                s--;
            } else {
                System.out.print(" ");
                s--;
            }
        }
        System.out.println();
//Stamm

        int stammH = (kroneHoehe / 2 + 1);
        int stammB = (y / 3);
        int einrue = ((y - stammB) / 2);

        for (int h = 0; h < stammH; h++) {
            for (s = 0; s < einrue; s++) {
                System.out.print(" ");
            }
            for (int v = 0; v < stammB; v++) {
                System.out.print("X");
            }
            {
                System.out.println();
            }
        }
    }

    public static void printStar(int pices, String charater) {

        for (int x = 0; x < pices; x++) {
            System.out.print(charater);
        }

    }
}


//Christbaumständer














