package Day3_sequences_Variables;

import jdk.swing.interop.SwingInterOpUtils;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Escape Sequences"); // MUST


        System.out.println(" Hello everyone\n My name is Emine");
        System.out.println("\tHello everyone My name is Emine");
        System.out.println("\tIm in Milwaukee"); // \t appends paragraph space

        System.out.println("\n\n\n\t\t\tI love programing"); // \n appends new line to the message

        System.out.println("\\");//this print me one back slash
        System.out.println("/"); // this prints me one front slash

        System.out.println("\\\\"); //this print me two back slash
        System.out.println("//"); // this print me two front slash

        System.out.println("My name is \'Emine\'");// This one append single quote
        System.out.println("My favarite TV-series:\"Game of Thrones\""); // \" This one is double quote (ONLY WAY)



    }






}
