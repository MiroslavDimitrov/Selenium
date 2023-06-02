import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicJava {
    public static void main(String[] args) {
       int number = 5;
       double doubleNUmber = 2.5d;
       float floatNumber = 5.5f;
       char character = 'a';
       boolean isTrue = true;
       String name = "my name";

       //arrays
        int[] array = new int[5];//declare how many values will store the array, static size
        array[0] = 1;//store value at first index
        array[2] = 5;

        Integer[] secondArray = {1, 2, 3};//declare an array with directly added values
        System.out.println(secondArray[0]);

        //for loop
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int iterations = secondArray.length;
        for(int i = iterations -1; i >= 0; i--) {//reversed loop
            System.out.println(secondArray[i]);
        }

        //foreach loop
        String[] names = {"Peter", "Ivan", "Nadya"};

        for (String n : names) {
            System.out.println(n);
        }

        //if-else conditions
        int[] thirdArray = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < thirdArray.length; i++) {//print numbers divisible by 2
            if (thirdArray[i] % 2 == 0) {
                System.out.println(thirdArray[i]);
            } else if (thirdArray[i] % 2 != 0) {
                System.out.println(thirdArray[i] + " is not divisible by 2!");
            }
        }

        //arrayList
        ArrayList arrayList = new ArrayList();//without specific type of data
        arrayList.add("name");
        arrayList.add(5);
        arrayList.add('w');

        for (Object o : arrayList) {
            System.out.println(o);
        }

        ArrayList <String> secondArrayList = new ArrayList<>();//they are flexible to extend them and also to dd or remove values
        secondArrayList.add("Hello");
        secondArrayList.add(" ");
        secondArrayList.add("how");
        secondArrayList.add(" ");
        secondArrayList.add("are");
        secondArrayList.add(" ");
        secondArrayList.add("you");
        secondArrayList.add("?");

        for (Object o : secondArrayList) {
            System.out.print(o);
        }
        System.out.println();

        if (secondArrayList.contains("?")) {
            System.out.println("It contains the sign '?'");
        }

        //convert array to arrayList
        List<Integer> convertedArray = new ArrayList<Integer>(Arrays.asList(secondArray));
        convertedArray.add(4);

        for (Integer i : convertedArray) {
            System.out.println(i);
        }

        //Strings - in Java strings are objects
        String stringOne = "Just a words";
        /*
        first Java will check if there is already the same value in the memory, instead of creating a new object
        it will refer to the first one
         */
        String stringTwo = "Just a words";

        /*
        when we are using the "new" keyword, it will create a new object
         */
        String stringThree = new String("Just a words");
        String[] splitedString = stringThree.split(" ");//we can split in a different ways

        for (String s : splitedString) {
            System.out.print(s);
        }
    }
}