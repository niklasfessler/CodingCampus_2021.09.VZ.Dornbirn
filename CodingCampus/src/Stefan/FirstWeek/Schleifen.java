package Stefan.FirstWeek;

public class Schleifen {

    public static void main(String[] args) {
//        for (int a = 5, b = 2;b <= 10; b++){
//            System.out.println(a*b);
//        }

//        for (int m = 0; m < 5; m++) {
//            for (int l = 0; l < m; l++) {
//                System.out.print("X");
//            }
//            System.out.println("X");
//        }


        for (int m = 0; m < 6; m++) {
            for (int l = 0; l < m; l++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int j = 4; j > 0; j--) {
            for (int r = 0; r < j; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}