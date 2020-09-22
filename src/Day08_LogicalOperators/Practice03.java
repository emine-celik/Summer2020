package Day08_LogicalOperators;

public class Practice03 {
    public static void main(String[] args) {
        String firstName = "Khabib";
        String lastName = "Legend";
        int age = 17;
        String citizen1 = "Russia";
        String citizen2 = "USA";

        boolean eligibleAge = age >= 18;
        //21 >= 18 ==> true

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        //   "USA" =="USA"  ||   "france" == "USA"
        //            true      ||     false
        //  true

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                         true    &&  true  ==> true

        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is eligible to vote for Trump: " + eligibleToVote);
        // Conor Mcgragor is eligible to vote for Trump: false
    }

    public static class LittersToGallons {
        public static void main(String[] args) {
            double  liters = 200;
               double gallons=liters/3.785;

               System.out.println(liters+ " liters equal to "+gallons+" gallons");
            System.out.println(liters+ " liters equal to "+(int)gallons+" gallons");




        }
    }

    /*
        3. manually calculate the following code fragements:
                        1. int a = 200;
                            int b = -a++ + - --a * a-- % 2
                            b = ?
                        2. int x = 300;
                           int y = 400;
                           int z = x + y - x * y +x / y;
        Collapse
        ++a,--a: pre,changes the variables value by 1 riht away
        a++,a--:post,first passes the current value,then changes the variables value by 1
         */
    public static class Post_Pre {
        public static void main(String[] args) {


        }
    }
}
