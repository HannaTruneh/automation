package org.example;

import java.util.Scanner;

public class Tirgul {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = "מייק";
        int age = 30;
        double height = 1.75;
        boolean isMarried = false;
        String marriedStatus = isMarried ? "נשוי" : "רווק";


        // תרגיל 1
        System.out.println("שמי " + name + " אני בן " + age +
                " הגובה שלי הוא " + height + " מטר, מצב משפחתי: " + marriedStatus + ".");

        System.out.println("-----------------------------------");
        // תרגיל 2

        int userAge;
        String userName;

        System.out.println("הכנס את שמך:");
        userName = in.nextLine();
        System.out.println("הכנס את גילך:");
        userAge = in.nextInt();
        System.out.println("שלום " + userName + ", אתה בן " + userAge);


        System.out.println("-----------------------------------");
        // תרגיל 3

        System.out.println("הכנס מספר ראשון:");
        int num1 = in.nextInt();
        System.out.println("הכנס מספר שני:");
        int num2 = in.nextInt();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (double) num1 / num2;

        System.out.println("סכום: " + sum);
        System.out.println("חיסור: " + difference);
        System.out.println("כפל: " + product);
        System.out.println("חילוק: " + quotient);


        System.out.println("-----------------------------------");
        // תרגיל 4

        System.out.println("הכנס גיל:");
        int userAge2 = in.nextInt();
        if (userAge2 < 18) {
            System.out.println("קטין");
        } else if (userAge2 < 67) {
            System.out.println("מבוגר");
        } else {
            System.out.println("פנסיונר");
        }

        System.out.println("-----------------------------------");
        // תרגיל 5

        System.out.println("הכנס מספר:");
        int userNum = in.nextInt();
        if (userNum % 2 == 0) {
            System.out.println("המספר זוגי");
        } else {
            System.out.println("המספר אי זוגי");
        }

        System.out.println("-----------------------------------");
        // תרגיל 6

        System.out.println("הכנס מספר:");
        int userNum2 = in.nextInt();
        for (int i = 1; i <= userNum2; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------");
        // תרגיל 7

        {
            int count = 0;
            int sum2 = 0;
            int number3;

            System.out.println("הכנס מספרים, הקש 0 כדי לסיים");
            do {
                System.out.println("הכנס מספר:");
                number3 = in.nextInt();
                if (number3 != 0) {
                    sum2 += number3;
                    count++;
                }
            } while (number3 != 0);
            System.out.println("סכום המספרים שהוזנו: " + sum2);
            System.out.println("כמות המספרים שהוזנו: " + count);
        }


        System.out.println("-----------------------------------");

        // תרגיל 8
        {
            in.nextLine();

            System.out.println("הכנס מילה:");
            String word = in.nextLine().trim();

            System.out.println("אורך המילה: " + word.length());
            System.out.println("אות ראשונה: " + word.charAt(0));
            System.out.println("אות אחרונה: " + word.charAt(word.length() - 1));

        }

        in.close();
    }
}