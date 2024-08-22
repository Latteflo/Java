
public class JavaBasics {

    public static void main(String[] args) {

        // Variables
        int myNumber = 88;
        short myShort = 847;
        long myLong = 9797;
        double myDouble = 7.3243;
        float myFloat = 324.3f;
        char myChar = 'y';
        boolean myBoolean = true;
        byte myByte = 127;

        // Print
        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);

        // Strings
        String text = "Hello";
        String blank = " ";
        String name = "Bob";
        String greeting = text + blank + name;

        System.out.println(greeting);

        // Print Formatting
        System.out.printf("This is a format string %s", "Yay");

        // New Line
        System.out.println("Hello\nWorld");

        // Tab
        System.out.println("Hello\tWorld");

        // Arrays
        int[] myIntArray = new int[5];
        int[] myIntArray2 = {1, 2, 3, 4, 5};
        myIntArray[0] = 100;
        myIntArray[1] = 90;
        myIntArray[2] = 80;
        myIntArray[3] = 70;
        myIntArray[4] = 60;

        System.out.println(myIntArray[3]);
        System.out.println(myIntArray2[2]);

        // Multi-Dimensional Arrays
        int[][] myNumbers = {
            {1, 2, 3, 4},
            {5, 6, 7}
        };

        int x = myNumbers[1][2];
        System.out.println(x);

        // If Statements
        int loop = 0;

        if (loop == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.printf("The value of i is: %d\n", i);
        }

        // While Loop
        int j = 0;

        while (j < 5) {
            System.out.printf("The value of j is: %d\n", j);

            j++;
        }

        // Do While Loop
        int k = 0;

        do {
            System.out.printf("The value of k is: %d\n", k);

            k++;
        } while (k < 5);

        // Switch Statement
        int day = 4;

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        // For Each Loop
        int loopingNumber= 5; 

        for (int i = 0; i < 10; i++) {
            System.out.println(loopingNumber++);

        }

        //For Each Loop
        int[] numbers = {3, 7, 5, 2, 9};

        for (int number : numbers) {
            System.out.println(number);
        }

    }

}



