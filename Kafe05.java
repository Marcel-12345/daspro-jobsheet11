public class Kafe05{
public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
    System.out.println("Selamat datang, " + namaPelanggan + "!");
    if (isMember) {
    System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    if (kodePromo.equalsIgnoreCase("diskon50")){
        System.out.println("Selamat! Kode promo yang anda masukkan mendapatkan diskon tambahan 50%!");
    } else if (kodePromo.equalsIgnoreCase("diskon30")){
        System.out.println("Selamat! Kode promo yang anda masukkan mendapatkan diskon tambahan 30%!");
    }
    System.out.println("==== MENU RESTO KAFE ====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte Rp - 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("=========================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
public static void main(String[] args){
    Menu("Andi", true, "diskon50");
    }
}