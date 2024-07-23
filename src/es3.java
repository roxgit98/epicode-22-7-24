public class es3 {
    public static void main(String[] args) {
        System.out.println(perimetro(20, 22.5));
        System.out.println(pariDispari(5));
        System.out.println(area(3.4, 5.7, 7.9));

    }

    public static double perimetro(double l1, double l2) {
        return (l1 * 2) + (l2 * 2);
    }

    public static int pariDispari(int input) {
        return input % 2 == 0 ? 0 : 1;
    }

    public static double area(double l1, double l2, double l3) {
        double semiPerimetro = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - l1) * (semiPerimetro - l2) * (semiPerimetro - l3));
    }
}
