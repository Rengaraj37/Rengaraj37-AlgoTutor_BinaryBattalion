import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(sequence(num));
    }

    public static int sequence(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 2;
        }
        return sequence(num - 2) + sequence(num - 1) + sequence(num - 3) + num;
    }
}
