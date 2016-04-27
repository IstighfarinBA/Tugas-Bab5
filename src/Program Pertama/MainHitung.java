
import java.util.Scanner;

public class MainHitung {

    /**
     * @NAMA : ISTIGHFARIN BAHTIAR AMRY
     * @NIM : 155150401111129
     * @KELAS: SI-H
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MainHitung a = new MainHitung();
        int pilihan, pertama, kedua;
        hitung objek = new hitung();//deklarasi objek dengan nama objek
        System.out.println("\t====PROGRAM CALCULATOR====");
        System.out.println("\t==========================");

        do {
            System.out.println("");
            System.out.println("Menu :");
            System.out.println("\t1.Penjumlahan");
            System.out.println("\t2.Pengurangan");
            System.out.println("\t3.Perkalian");
            System.out.println("\t4.Pembagian");
            System.out.println("\t5.Penyederhanaan Pecahan");
            System.out.println("\t0.EXIT");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    case1();
                    break;

                case 2:
                    case2();
                    break;

                case 3:
                    a.case3();
                    break;

                case 4:
                    a.case4();
                    break;

                case 5:
                    a.case5();
                    break;
                default:
                    System.out.println("Inputan Anda Tidak Valid,Silahkan Pilih Ulang Menu");break;
                case 0:
                    System.out.println("\t ====THANK  YOU====");
                    System.out.println("\t===PROGRAM CLOSED===");
            }

        } while (pilihan != 0);

    }

    public static void case1() {
        Scanner in = new Scanner(System.in);
        System.out.println("\t===PROGRAM PENJUMLAHAN===");
        System.out.println("");
        System.out.print("Masukkan Angka Pertama :");
        int pertama = in.nextInt();
        System.out.print("Masukkan Angka Kedua   :");
        int kedua = in.nextInt();
        //pemanggilan method static penjumlahan dengan nama class
        hitung.penjumlahan(pertama, kedua);

    }

    public static void case2() {
        Scanner in = new Scanner(System.in);
        System.out.println("\t===PROGRAM PENGURANGAN===");
        System.out.println("");
        System.out.print("Masukkan Angka Pertama :");
        int pertama = in.nextInt();
        System.out.print("Masukkan Angka Kedua   :");
        int kedua = in.nextInt();
        //pemanggilan method static penjumlahan dengan nama class
        hitung.pengurangan(pertama, kedua);
    }

    public void case3() {
        Scanner in = new Scanner(System.in);
        hitung objek = new hitung();
        System.out.println("\t===PROGRAM PERKALIAN===");
        System.out.println("");
        System.out.print("Masukkan Angka Pertama :");
        int pertama = in.nextInt();
        System.out.print("Masukkan Angka Kedua   :");
        int kedua = in.nextInt();
        //pemanggilan method perkalian non-static dengan objek
        objek.perkalian(pertama, kedua);

    }

    public void case4() {
        Scanner in = new Scanner(System.in);
        hitung objek = new hitung();
        System.out.println("\t===PROGRAM PEMBAGIAN===");
        System.out.println("");
        System.out.print("Masukkan Angka Pertama :");
        double pertamax = in.nextInt();
        System.out.print("Masukkan Angka Kedua   :");
        double keduax = in.nextInt();
        //pemanggilan method pembagian non-static dengan objek
        objek.pembagian(pertamax, keduax);

    }

    public void case5() {
        Scanner masukan = new Scanner(System.in);
        hitung objek = new hitung();
        System.out.println("\t===PROGRAM PENYEDERHANAAN PECAHAN===");
        System.out.println();
        System.out.print("Masukkan Pembilang = ");
        int atas = masukan.nextInt();
        System.out.print("Masukkan  Penyebut = ");
        int bawah = masukan.nextInt();
        System.out.println("Pecahan sebelum disederhanakan =" + atas + "/" + bawah);
        int pembagi = objek.penyederhanaan(atas, bawah);
        int atasAkhir = atas / pembagi;
        int bawahAkhir = bawah / pembagi;
        System.out.println("Pecahan setelah disederhanakan =" + atasAkhir + "/" + bawahAkhir);
    }
}
