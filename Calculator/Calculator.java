import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    AkarKuadrat(scanner);
                    break;
                case 2:
                    Pangkat(scanner);
                    break;
                case 3:
                    Logaritma(scanner);
                    break;
                case 4:
                    Faktorial(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void AkarKuadrat(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        double hasil = Math.sqrt(angka);
        System.out.println("Hasil akar kuadrat dari " + angka + " adalah " + hasil);
    }

    private static void Pangkat(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double angka2 = scanner.nextDouble();
        double hasil = Math.pow(angka1, angka2);
        System.out.println(angka1 + " pangkat " + angka2 + " adalah " + hasil);
    }

    private static void Logaritma(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        double hasil = Math.log(angka);
        System.out.println("Logaritma natural dari " + angka + " adalah " + hasil);
    }

    private static void Faktorial(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        long hasil = 1;

        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + angka + " adalah " + hasil);
    }
}

