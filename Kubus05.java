import java.util.Scanner;
public class Kubus05{
    public static int hitungVolume(int s){
        int volume = s*s*s;
        return volume;
    }
    public static int hilungLuasPermukaan(int s){
        int luasPermukaan = 6*s*s;
        return luasPermukaan;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int s, vol, lp;
        System.out.print("Masukkan panjang sisi kubus (cm): ");
        s = input.nextInt();
        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah (cm^3) " + vol);
        lp = hilungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah (cm^2) " + lp);
    }
}