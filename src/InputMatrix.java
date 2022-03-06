import java.util.Scanner;

public class InputMatrix {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE, min_index = -1;

        int[][] daftar_jarak = new int[3][4];

        System.out.println("Input Data jarak");
        System.out.println("__________________");
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {

                try {
                    Scanner inputJarak = new Scanner(System.in);
                    System.out.println("Input baris ke " + baris + " Kolom ke " + kolom + "= ");
                    int jarak = inputJarak.nextInt();
                    daftar_jarak[baris][kolom] = jarak;
                    System.out.println("   ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
