package Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String str= scanner.nextLine();
            System.out.println(str);
        }
        scanner.close();
    }
}
