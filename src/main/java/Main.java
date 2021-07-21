import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println(StringUtils.swapCase(input));

        System.out.println("Is Numeric: " + StringUtils.isNumericSpace(input));

        System.out.println(StringUtils.reverse(input));



    }
    }
