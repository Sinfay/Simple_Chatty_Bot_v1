import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pierwsza = scanner.nextInt();
        int druga = scanner.nextInt();
        int trzecia = scanner.nextInt();
        boolean pozytyw = pierwsza > 0 && druga <= 0 && trzecia <= 0;
        boolean pozytyw2 = pierwsza <= 0 && druga > 0 && trzecia <= 0;
        boolean pozytyw3 = pierwsza <= 0 && druga <= 0 && trzecia > 0;
        System.out.println(pozytyw || pozytyw2 || pozytyw3);
       

    }
}
