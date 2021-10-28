import java.util.Scanner;

public class Enormous_input_test {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x % k == 0) {
                count++;
                System.out.println(count);
            }

        }
    }

}
