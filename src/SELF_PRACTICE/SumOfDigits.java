package SELF_PRACTICE;

public class SumOfDigits {

    public static void main(String[] args) {

        String num="A1B2C3D4E5F6G7";

        int sum=0;

        for(char each:num.toCharArray()){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);


       /* ArrayList <String> list = new ArrayList<>();
        list.add("ayhan"); list.add("hulagu"); list.add ("theatre");
       String a= list.get(2);
        System.out.println(a);
       Boolean b= list.contains("theatre");
        System.out.println(b);
        System.out.println(list.indexOf("hulagu"));
     //  System.out.println(list.clear("ayhan"));
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        System.out.println(list.set(0, "hulagu"));
        System.out.println(list);
        System.out.println(list.remove(0));
       // System.out.println(list.clear()); */
       /*  ArrayList <String> earlyBirds = new ArrayList<>();
        earlyBirds.add("Ayhan");
        earlyBirds.add("Hulagu");
        earlyBirds.add("lol");
        earlyBirds.set(1, "ayhan");
        earlyBirds.set (2,"hulagu");
        System.out.println(earlyBirds);
      //  earlyBirds.clear();
      //  System.out.println(earlyBirds);
        System.out.println(earlyBirds.size());
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add (2);
        System.out.println(list);
        list.remove (0);
        ArrayList <String> karagozArt = new ArrayList<>();
        karagozArt.add("karagoz");
        karagozArt.add("hacivat");
        karagozArt.add ("tuzsuz deli bekir");
        System.out.println(karagozArt);
      int b=  karagozArt.indexOf("karagoz");
       int a = karagozArt.size();
      boolean c= karagozArt.contains("tuzsuz");
      boolean d = karagozArt.remove("karagoz");
      boolean e =karagozArt.isEmpty();
      String f = karagozArt.get(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("=======================");
        String [] group1 = {"ayhan", "hulagu", "karagoz", "theatre", "company"};
        String [] group2 = {"tuzsuz", "deli", "bekir"};
        ArrayList <String> list2 = new ArrayList<>();
        for (String each: group1) {
            list2.add(each);
        }
        for (String each: group2) {
            list2.add(each);
        }
        System.out.println(list2);
        System.out.println("-------------------------------------");
        ArrayList <Integer> list3 = new ArrayList<>();
        list3.add(20);
        list3.add(234);
        list3.add(3423);
        list3.add (2);
        list3.add(1);
        // arrayPrac.sort(list3);
        for (int r=0; r<=list3.size()-1; r++) {
            System.out.print(list3.get(r) + ", ");
        }
        System.out.println(list3.equals(list));
        System.out.println("==========================");
        ArrayList <Integer> list0 = new ArrayList<>();
        list0.add(1);
        list0.add(2);
        list0.add(3);
        list0.add(4);
        list0.add(5);
        System.out.println(list0);
        for (Integer each :list0) {
            if (!list0.contains(each)) {
                list0.add (each);
            }
        }
      //  System.out.println("The min number is " + list0.get(0));
       // System.out.println("The max number is " + list0.get(list0.size()-1));
*/
       /* ArrayList <String> students = new ArrayList<>();
        students.addAll(Arrays.asList("ayhan", "emine", "mike", "Ian"));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        Collections.swap(students, 0,3);
        System.out.println(students);
        int a =  Collections.frequency(students,"ayhan");
        System.out.println(a);
        ArrayList <Integer> numbers = new ArrayList <> ();
        numbers.addAll(Arrays.asList(2,34,234,2342));
           //OPTION 1
      int min=  Collections.min (numbers);
      System.out.println(min);
      int max = Collections.max (numbers);
       System.out.println(max);
            //OPTION 2
        System.out.println("Min. number is " + numbers.get(0));
        System.out.println("Max. number is " + numbers.get(numbers.size()-1));
      Collections.replaceAll(numbers,2,34);
      System.out.println(numbers); */
      /*8  ArrayList <Integer> number = new ArrayList<>();
        number.add(0);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);
        System.out.println(number.set(0,3) + (number.set (2,5)));
        System.out.println(number);
        //  number.clear();  // System.out.println(number);
        number.remove(3);
        System.out.println(number);
        int a= number.indexOf(9);
        System.out.println(a);
        int b= number.lastIndexOf(8);
        System.out.println(b);
        boolean x = number.contains(3);
        System.out.println(x); */
      /*  for (int num = number.size()-1; num >=0; num--) {
            System.out.print(number.get(num) + ", ");
        }
        int a = Collections.max (number);
        int b = Collections.min (number);
        System.out.println(a);
        System.out.println(b);
        Collections.sort(number);
        System.out.println(number);
        System.out.println("min is" + number.get(0));
        System.out.println("max is" + number.get (number.size()-1)); */
      /*  ////COLLECTION ILE YAPAMADIK... NORMAL OLMASI GEREKIYORDU.
        ArrayList <Character> list = new ArrayList<>();
        Collections.addAll(Arrays.asList('A','B','C','C', 'D', 'D', 'E'));
        System.out.println();
        ArrayList <Character> dublicate = new ArrayList<>();
        for (Character each: dublicate) {
            if (!dublicate.contains(each)){
                dublicate.add (each);
            }
        }
        System.out.println(dublicate); */
           /*
                ///frequncy///

                ArrayList <Integer> number = new ArrayList<>();
                number.add (10);
                number.add (1);
                number.add (13);
                number.add (120);
                number.add (11);
                number.add (0);
                number.add (0);
                number.add (0);
                number.add (120);
                System.out.println(number);
                ArrayList <Integer> unique = new ArrayList<>();
                for (int each : number) {
                    if (Collections.frequency(number, each) == 1) {
                        unique.add(each);
                    }
                }
                System.out.println(unique);
                */
            }







    }

