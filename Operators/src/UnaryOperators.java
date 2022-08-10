public class UnaryOperators {

    public static void main(String[] args) {
        System.out.println("--------- Test 1 -----------");
        int a = 0;

        /*
        If you do no assignment & the operator is not participating in a more complex expression the following statements
        are the same. The value in the variable 'a' gets incremented by 1.
         */

        a = 1;
        ++a; // a = a + 1
        System.out.println("a after ++a = " + a);

        a = 1;
        a++;
        System.out.println("a after a++ = " + a);

        // What happens here?
        System.out.println("--------- Test 2 -----------");
        a = 1;
        System.out.println("a after ++a = " + ++a);

        a = 1;
        System.out.println("a after a++ = " + a++);


        a = 1;
        int a2 = a++;

        System.out.println("The value of a is " + a);
        System.out.println("The value of a2 is " + a2);
        // Postfix in an expression
        System.out.println("--------- Test 3 -----------");

        a = 1;
        if (++a == 1) {

            System.out.println("If statement, now the value of a is " + a);
        } else {
            System.out.println("-------- End 3 -------");
        }

        System.out.println("----------Test 4 ----------");
        int b = 5;
        int loopiterations = 0;
        while (--b > 0) {  // Use a prefix decrement
            loopiterations++;
        }
        System.out.println("Prefix decrement operator used, loopiterations = " +
                loopiterations + ", b = " + b);

        // Reset values, all things equal except the type of increment operator
        b = 5;
        loopiterations = 0;
        while (b-- > 0) {  // Use a postfix decrement
            loopiterations++;
        }
        System.out.println("Postfix decrement operator used, loopiterations = " +
                loopiterations + ", b = " + b);


    }

}
