
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

}
