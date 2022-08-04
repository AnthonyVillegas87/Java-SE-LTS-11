public class VarLoops {

    static float tax_rate = 0.06F;
    public static void main(String[] args) {


        var result = 0;
        var tax_rate = 0.05;    // Line 1
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2
    //    result = price + adjusted_tax;  // Line 3
        System.out.println("Adjusted price = " + result);




        // use LVTI var in a regular for loop
        for(var i = 0; i < 10; i++) {
            System.out.println("i was inferred to be an int, value = " + i);
        }


        // use LVTI var in an enhanced for loop
        for(var arg : args) {
            System.out.println("arg inferred to be a String: " + arg);
        }
    }

}
