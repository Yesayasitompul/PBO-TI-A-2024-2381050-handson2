package Latihansoal;
import  java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < bilangan.length; i ++){
            System.out.println("Masukkan bilangan ke- " + i + " : ");
            bilangan[i] = input.nextInt();
        }
            int largestNum = bilangan[0];
            for(int i = 1; i < bilangan.length; i++) {
                if (largestNum < bilangan [i]){
                    largestNum = bilangan[i];
                }
        }
        System.out.println(largestNum);
    }

}
