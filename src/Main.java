import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố cần in ra");
        int number = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)){
                System.out.print(N+";");
                count++;
            }
            N++;
        }
    }
    //check số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int canBac2 = (int) Math.sqrt(n);
        for (int i = 2; i <= canBac2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}