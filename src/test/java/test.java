import org.junit.Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] gray = new String[(int) Math.pow(2, n)];
        for (int i = 0; i < gray.length; i++) {
            gray[i] = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(i)));
        }
        for (int i = 0; i < gray.length; i++) {
            System.out.println(gray[i]);
        }
    }
}
