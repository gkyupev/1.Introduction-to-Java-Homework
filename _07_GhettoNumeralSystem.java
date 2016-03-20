import java.util.Scanner;

public class _07_GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = console.nextLine();

        String[] arr = input.split("");
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "0": output += "Gee";
                    break;
                case "1": output += "Bro";
                    break;
                case "2": output += "Zuz";
                    break;
                case "3": output += "Ma";
                    break;
                case "4": output += "Duh";
                    break;
                case "5": output += "Yo";
                    break;
                case "6": output += "Dis";
                    break;
                case "7": output += "Hood";
                    break;
                case "8": output += "Jam";
                    break;
                case "9": output += "Mack";
                    break;
            }
        }
        System.out.print("Ghetto number: ");
        System.out.println(output);
    }
}
