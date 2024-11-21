import java.util.Scanner;
public class HitungTotalHarga05{
    public static double hitungTotalHarga(int pilihanMenu, int banyakItem){
        
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double totalHarga = 0;
        String lagi = "n";
        do {
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        double subTotalHarga = hitungTotalHarga (pilihanMenu, banyakItem);
        totalHarga = totalHarga += subTotalHarga;
        System.out.print("Ada tambahan lagi? (y/n): "); 
        lagi = sc.next();
        } while (lagi.equalsIgnoreCase("y"));
        System.out.print("\nMasukkan Kode Promo: ");
        String kodePromo = sc.next();
        double diskon = 0;
        if (kodePromo.equalsIgnoreCase("diskon50")){
            diskon = 0.5;
        } else if (kodePromo.equalsIgnoreCase("diskon30")){
            diskon = 0.3;
        }
        totalHarga = (int) (totalHarga * (1 - diskon));
        System.out.println("Total harga untuk pesanan Anda: Rp. " + totalHarga);
    }
}