
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().programBaslat();
    }

    public void programBaslat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum gününüzü girin (örneğin, 25): ");
        int gun = scanner.nextInt();

        System.out.print("Doğum ayınızı girin (örneğin, 8): ");
        int ay = scanner.nextInt();

        if (gun > 31 || ay > 12) {
            System.out.println("Hatalı giriş! Gün 31'den büyük veya ay 12'den büyük olamaz.");
        } else {
            String burc = bulBurc(gun, ay);
            System.out.println("Burcunuz: " + burc);
        }

        scanner.close();
    }

    public String bulBurc(int gun, int ay) {
        String burc = "";

        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            burc = "Koç";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            burc = "Boğa";
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 21)) {
            burc = "İkizler";
        } else if ((ay == 6 && gun >= 22) || (ay == 7 && gun <= 22)) {
            burc = "Yengeç";
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            burc = "Aslan";
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            burc = "Başak";
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            burc = "Terazi";
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            burc = "Akrep";
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            burc = "Yay";
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 20)) {
            burc = "Oğlak";
        } else if ((ay == 1 && gun >= 21) || (ay == 2 && gun <= 18)) {
            burc = "Kova";
        } else if ((ay == 2 && gun >= 19) || (ay == 3 && gun <= 20)) {
            burc = "Balık";
        } else {
            burc = "Geçersiz tarih!";
        }

        return burc;
    }
}