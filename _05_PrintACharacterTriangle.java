import java.util.Scanner;

public class _05_PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = console.nextInt();
        String line = "";
        for (int i = 0; i < max; i++) {
            line += (char)('a' + i) + " ";
            System.out.println(line);
        }
        for (int i = 0; i < max; i++) {
            line = line.substring(0, line.length() - 2);
            System.out.println(line);
        }
    }
}
