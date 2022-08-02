public class TestFQCN {

    public static void main(String[] args) {


        //using FQCN when using the String class int the java.lang package
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        // any class in any other packages must be qualified or imported
        garden.vegetable.VineVegetable.main(args);
    }
}
