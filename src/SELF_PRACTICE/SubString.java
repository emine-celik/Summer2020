package SELF_PRACTICE;

public class SubString {
    public static void main(String[] args) {

        String name="haYvAn cIFtLiGi";
        String publishedBy="gEoRgE oWeLL";

        System.out.println(books(name,publishedBy));
    }
    public static String books(String name,String publishedBy) {
        String result="";

        String name1= name.substring(0,1).toUpperCase()+name.substring(1,6).toLowerCase()+" "+name.substring(7,8).toUpperCase()+name.substring(8,15).toLowerCase();



        String publishedBy1= publishedBy.substring(0,1).toUpperCase()+publishedBy.substring(1,6).toLowerCase()+" "+
                publishedBy.substring(7,8).toUpperCase()+publishedBy.substring(8,12).toLowerCase();

        result=name1+"\n"+publishedBy1;


        return result;
    }
}
