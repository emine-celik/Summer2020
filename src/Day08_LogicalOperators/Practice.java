package Day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "emine";
        String lastName = "celik";
        int age = 19;
        String citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                        19 >= 18 && "USA" == "USA"
        //                          TRUE && TRUE




        String fullName = firstName + " " +lastName;
        System.out.println(fullName+ " is eligible to vote: " + eligibleToVote);


    }
}
