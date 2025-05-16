

import java.util.Scanner;

public class PboPrakt {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int sisi;
            double Jari;
            System.out.println("--- Menghitung Volume Dan Luas Kubus, Balok, Silinder, dan Bola ---");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Silinder");
            System.out.println("4. Bola");
            int BangunRuang, Rumus;
            BangunRuang = input.nextInt();
            switch (BangunRuang) {
                case (1):
                    System.out.println("================================");
                    System.out.println("--- Pilih Yang Mau Dihitung ---");
                    System.out.println("1. Volume");
                    System.out.println("2. Luas");
                    System.out.println("Pilih Salah Satu... ");
                    System.out.println("================================");
                    Rumus = input.nextInt();
                    System.out.println("Masukkan Sisi: ");
                    sisi = input.nextInt();
                    Calculation Kubus = new Calculation(sisi);

                    switch (Rumus) {
                        case 1 -> System.out.println(Kubus.calVolumeKubus() + "cm");

                        case 2 -> System.out.println(Kubus.calLuasKubus() + "cm");

                        default -> System.out.println("Literasi Blough");

                    }

                    break;

                case 2:
                    System.out.println("===============================");
                    System.out.println("--- Pilih Yang Mau Dihitung ---");
                    System.out.println("1. Volume");
                    System.out.println("2. Luas");
                    System.out.println("Pilih Salah Satu... ");
                    System.out.println("================================");
                    Rumus = input.nextInt();
                    System.out.println("Masukkan Panjang: ");
                    double Panjang = input.nextInt();
                    System.out.println("Masukkan Tinggi: ");
                    double Tinggi = input.nextInt();
                    System.out.println("Masukkan Lebar: ");
                    double Lebar = input.nextInt();
                    System.out.println("====================");
                    Calculation Balok = new Calculation(Panjang, Tinggi, Lebar);

                    switch (Rumus) {
                        case 1 -> System.out.println(Balok.calVolumeBalok() + "cm");

                        case 2 -> System.out.println(Balok.calLuasBalok() + "cm");

                        default -> System.out.println("Literasi Blough");
                    }

                    break;

                case 3:
                    System.out.println("===============================");
                    System.out.println("--- Pilih Yang Mau Dihitung ---");
                    System.out.println("1. Volume");
                    System.out.println("2. Luas");
                    System.out.println("Pilih Salah Satu... ");
                    System.out.println("===============================");
                    Rumus = input.nextInt();
                    System.out.println("Masukkan Jari-Jari: ");
                    Jari = input.nextInt();
                    System.out.println("Masukkan Tinggi: ");
                    double TinggiLagi = input.nextInt();
                    Calculation Silinder = new Calculation(Jari, TinggiLagi);

                    switch (Rumus) {
                        case 1 -> System.out.println(Silinder.calVolumeSilinder() + "cm");

                        case 2 -> System.out.println(Silinder.calLuasSilinder() + "cm");

                        default -> System.out.println("Literasi Blough");
                    }

                    break;

                case 4:
                    System.out.println("===============================");
                    System.out.println("--- Pilih Yang Mau Dihitung ---");
                    System.out.println("1. Volume");
                    System.out.println("2. Luas");
                    System.out.println("Pilih Salah Satu... ");
                    System.out.println("===============================");
                    Rumus = input.nextInt();
                    System.out.println("Masukkan Jari-Jari: ");
                    Jari = input.nextInt();
                    Calculation Bola = new Calculation(Jari);

                    switch (Rumus) {
                        case 1 -> System.out.println(Bola.calVolumeBola() + "cm");

                        case 2 -> System.out.println(Bola.calLuasBola() + "cm");

                        default -> System.out.println("Literasi Blough");
                    }

                default:
                    System.out.println("Literasi Blough");
                    break;
            }
        }

    }

}