import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bazę wejściową (2-16)");
        int in_base = scanner.nextInt();
        System.out.println("Podaj wartość do przekonwertowania");
        String in_value = scanner.next();
        System.out.println("Podaj bazę wyjściową (2-16)");
        int out_base = scanner.nextInt();
        int value = 0;
        for(int i = 0;i<in_value.length();i++)
        {
            char c = in_value.charAt(i);
            int digit = 0;
            if('0' <= c && c <= '9')
                digit = c - '0';
            else if ('A' <= c && c <= 'F') {
                digit = c - 'A' + 10;
            }
            value = value * in_base + digit;
        }
        StringBuilder out_value = new StringBuilder();
        while(value > 0)
        {
            int digit_v = value % out_base;
            char digit = ' ';
            if(digit_v <= 9)
                digit = (char)(digit_v + '0');
            else if (digit_v <= 15) {
                digit = (char)(digit_v - 10 + 'A');
            }
            out_value.append(digit);
            value /= out_base;
        }
        System.out.println(out_value.reverse());

    }
}