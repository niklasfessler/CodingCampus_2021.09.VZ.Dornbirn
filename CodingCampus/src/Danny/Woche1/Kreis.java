package Danny.Woche1;

public class Kreis {
    public static void main(String[] args) {
//System.out.println(Math.toRadians(360));
//
//        System.out.println(Math.cos(Math.toRadians(90)));
//        Math.cos()

        int radius = 50;
        double winkelA = 45;
        double cosA = (Math.cos(Math.toRadians(radius)));
        double sinA = (Math.sin(Math.toRadians(radius)));

        double xKor = (radius + cosA);
        double yKor = (radius + sinA);

        {
            System.out.println(xKor);
            System.out.println(yKor);
        }
    }
}