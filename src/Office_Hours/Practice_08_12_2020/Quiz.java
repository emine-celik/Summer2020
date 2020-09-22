package Office_Hours.Practice_08_12_2020;


import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));
                                // 0 1 2
       // int a=1;  // index   (it will remove  2)
        Integer a=1; // object  it will remove 1


        list1.remove(a);

        System.out.println(list1);

        String[] names ={"Rob","Emine","Emine","Zehra"};
        ArrayList<String> nameList= new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

       if(nameList.remove("Emine")){
           nameList.remove("Yusuf");
       }

        System.out.println(nameList);



    }
}
