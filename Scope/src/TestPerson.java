
public class TestPerson {
    static String type = "this";
    public static void main(String[] args) {


        // First we'll create a person, JOE using 2 args constructor.
        Person joe = new Person("JOE", "55");

        // Next we'll create a person, using 1 arguments
        Person deb = new Person("DEB", "85");

        // And now the noargs constructor, and using setters
        Person ann = new Person();



        System.out.println(joe);
        System.out.println(deb);
        System.out.println("---- ANN BEFORE ----");
        System.out.println(ann);
        ann.setAge("21");
        ann.setInstanceName("ANN");

        System.out.println("---- ANN AFTER ----");
        System.out.println(ann);

        String s = (args.length > 0) ? "switch" : "";
        String caseVal = (args.length > 1) ? args[1] : "";

        if (s == "switch") {
            String type;  // Line 1
            switch (caseVal) {

                case "this":
                    type = "that";
                    break;
                case "that":
                    type = "this";
                    break;
                case "other":
                default:
                    type = "somethingelse";
            }
            if (type=="that") type="this";  //Line 2

        }
        System.out.println("this is " + type);  //Line 3



    }

}
