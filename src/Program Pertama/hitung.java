
/**
 *
 * @NAMA : ISTIGHFARIN BAHTIAR AMRY
 * @NIM : 155150401111129
 * @KELAS: SI-H
 */
public class hitung {

    private static int hasil;
    private static double hasilbagi;

    public static void penjumlahan(int a, int b) {

        hasil = a + b;
        System.out.println("Maka Hasil Penjumlahan :" + hasil);
    }

    public static void pengurangan(int a, int b) {
        hasil = a - b;
        System.out.println("Maka Hasil pengurangan :" + hasil);
    }

    public void perkalian(int a, int b) {
        hasil = a * b;
        System.out.println("Maka Hasil Perkaliannya:" + hasil);
    }

    public void pembagian(double a, double b) {
        hasilbagi = a / b;
        System.out.println("Maka Hasil Pembagiannya:" + hasilbagi);
    }

    public int penyederhanaan(int pembilang, int penyebut) {
        int x = 1, y = 1;
        int atas = pembilang, bawah = penyebut;
        while (atas != bawah) {
            if (atas > bawah) {
                while ((pembilang % x) != 0) {
                    x++;
                }
                atas = pembilang / x;
                x++;
            } else {
                while ((penyebut % y) != 0) {
                    y++;
                }
                bawah = penyebut / y;
                y++;
            }
        }
        return (atas);

    }
}
