<<<<<<< HEAD
public class TugasCafe05{
    public static void input(){

        String[] menu = {"Kopi", "Teh", "Es degan", "Roti bakar", "Gorengan"};
        int[][] hasil = {{20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}};

        System.out.println("Hasil penjualan (dari hari 1-7):");
        for (int i = 0; i < hasil.length; i++){
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < hasil[i].length; j++){
            System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void menuTertinggi(){
        String[] menu = {"Kopi", "Teh", "Es degan", "Roti bakar", "Gorengan"};
        int[][] hasil = {{20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}};

        int tertinggi = 0, total = 0, x = 0;
        for (int i = 0; i < hasil.length; i++){
            total = 0;
            for (int j = 0; j < hasil[i].length; j++){
                total = total += hasil[i][j];
            }
            if (total > tertinggi){
                tertinggi = total;
                x = i;
            }
        }
        System.out.println("Menu yang memiliki penjualan tertinggi adalah " + menu[x]);
    }
    public static void menuRata2(){
        String[] menu = {"Kopi", "Teh", "Es degan", "Roti bakar", "Gorengan"};
        int[][] hasil = {{20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}};

        System.out.println("Rata-rata penjualan setiap menu:");
        int total = 0;
        double rata2 = 0;
        for (int i = 0; i < hasil.length; i++){
            total = 0;
            rata2 = 0;
            for (int j = 0; j < hasil[i].length; j++){
                total = total += hasil[i][j];
            }
            rata2 = total / hasil[i].length;
            System.out.println(menu[i] + ": " + rata2);
        }
    }
    public static void main(String[] args){
        input();
        menuTertinggi();
        menuRata2();
    }
=======
public class TugasCafe05{
    public static void input(){

        String[] menu = {"Kopi", "Teh", "Es degan", "Roti bakar", "Gorengan"};
        int[][] hasil = {{20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}};

        System.out.println("Hasil penjualan (dari hari 1-7):");
        for (int i = 0; i < hasil.length; i++){
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < hasil[i].length; j++){
            System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void menuTertinggi(){
        String[] menu = {"Kopi", "Teh", "Es degan", "Roti bakar", "Gorengan"};
        int[][] hasil = {{20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}};

        int tertinggi = 0, total = 0, x = 0;
        for (int i = 0; i < hasil.length; i++){
            total = 0;
            for (int j = 0; j < hasil[i].length; j++){
                total = total += hasil[i][j];
            }
            if (total > tertinggi){
                tertinggi = total;
                x = i;
            }
        }
        System.out.println("Menu yang memiliki penjualan tertinggi adalah " + menu[x]);
    }
    public static void menuRata2(){
        String[] menu = {"Kopi", "Teh", "Es degan", "Roti bakar", "Gorengan"};
        int[][] hasil = {{20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}};

        System.out.println("Rata-rata penjualan setiap menu:");
        int total = 0;
        double rata2 = 0;
        for (int i = 0; i < hasil.length; i++){
            total = 0;
            rata2 = 0;
            for (int j = 0; j < hasil[i].length; j++){
                total = total += hasil[i][j];
            }
            rata2 = total / hasil[i].length;
            System.out.println(menu[i] + ": " + rata2);
        }
    }
    public static void main(String[] args){
        input();
        menuTertinggi();
        menuRata2();
    }
>>>>>>> 2ae537b729ada1380b7da5960c64b707b1063d35
}