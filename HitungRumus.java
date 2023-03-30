public class HitungRumus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String jawab;
        do {
            System.out.print("Inputkan Nilai A: ");
            double a = input.nextDouble();

            System.out.print("Inputkan Nilai B: ");
            double b = input.nextDouble();

            System.out.print("Inputkan Nilai C: ");
            double c = input.nextDouble();

            double d = Math.pow(b, 2) - 4 * a * c; // hitung nilai diskriminannya

            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Akar persamaan: x1 = " + x1 + ", x2 = " + x2);

            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("Akar persamaan: x1 = x2 = " + x);

            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-d) / (2 * a);
                System.out.println("Akar persamaan: x1 = " + realPart + " + " + imaginaryPart + "i, x2 = " + realPart
                        + " - " + imaginaryPart + "i");
            }

            System.out.print("\n Input data lagi [Y/N]? ");
            jawab = input.next();
            input.nextLine(); // Clear newline yang msih ada
        } while (jawab.equalsIgnoreCase("Y"));
    }

}
