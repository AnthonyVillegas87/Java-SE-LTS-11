// A single-type-import declaration
import nursery.vegetable.*;
import garden.vegetable.*;

public class TestImport {

    public static void main(String[] args) {
        // String class in the java.lang package, simple class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import statement
        VineVegetable.main(args);
        //FQCN
        nursery.vegetable.VineVegetable.main(args);

        //Using import statements
        // It is important to know that the single-type-import declaration:
        /*
        Takes precedence of the import-on-demand declaration
        Will prevent you from creating a class of the same name, in your source file
         */
    }

}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local vine vegetable");
    }
}
