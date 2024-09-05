package branching;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nomor hari (1 - 7) : ");
        int nomorhari = input.nextInt();

        String namahari = "";

        if (nomorhari == 1 ){
            namahari = "Minggu";
        } else if (nomorhari == 2) {
            namahari = "Senin";
        } else if (nomorhari == 3) {
            namahari = "Selasa";
        } else if (nomorhari == 4) {
            namahari = "Rabu";
        } else if (nomorhari == 5) {
            namahari = "Kamis";
        } else if (nomorhari == 6) {
            namahari = "Jumat";
        } else if (nomorhari == 7) {
            namahari = "Sabtu";
        }else {
            System.out.println("Masukkan nomor antara 1 - 7");
            System.exit(0);
        }
        System.out.println("Hari : " + namahari);
    }
}
