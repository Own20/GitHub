import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Week7 {
    public static void main(String[] args) {
        /*
        Array[] vs ArrayList
        declaration and initialization
        Arrays.asList() Method
        */
        String[] myStudentArray = new String[5];
        String[] myStudentArray2 = {"Daniel", "Darryl", "Arish", "Arvin", "Owen"};

        ArrayList<String> myStudentList = new ArrayList<>();
        // ArrayList<String> myStudentList = new ArrayList<String>();
        ArrayList<String> myStudentList2 = new ArrayList<>(Arrays.asList("Daniel", "Darryl", "Arish", "Arvin", "Owen"));

        /*
        indexing and printing individual elements
        */
        // System.out.println(myStudentArray2[2]);
        System.out.println(myStudentList2.get(2));

        /*
        length vs size()
        */
        // System.out.println(myStudentArray2.length);
        System.out.println(myStudentList2.size());

        /*
        adding elements - cannot do with arrays
        add()
        Array - sorry - you cannot do this
        */
        System.out.println(myStudentList2);
        myStudentList2.add(0,"Alysha");
        System.out.println(myStudentList2);
        myStudentList2.add("Avariq");
        System.out.println(myStudentList2);

        /*
        set() an element = update the element
        */
        myStudentList2.set(0, "Maulidina");
        System.out.println(myStudentList2);

        /*
        removing elements - cannot do with arrays
        remove()
        Array - sorry - you cannot do this
        */
        myStudentList2.remove(5);
        System.out.println(myStudentList2);

        /*
        printing
        */
        // System.out.println(myStudentArray);
        System.out.println(Arrays.toString(myStudentArray2));

        /*
        LinkedList - doubly linked list
        */
        LinkedList<String> myStudentLList = new LinkedList<>();
        LinkedList<String> myStudentLList2 = new LinkedList<>(Arrays.asList("Daniel", "Darryl", "Arish", "Arvin", "Owen"));

        /*
        to do... use all the methods that you learned for ArrayList and do it with LinkedList
        */
        System.out.println(myStudentLList2.get(2));
        System.out.println(myStudentLList2.size());
        System.out.println(myStudentLList2);
        myStudentLList2.add(0,"Alysha");
        myStudentLList2.set(0, "Maulidina");
        myStudentLList2.remove(5);

        /*
        when to use an ArrayList and when to use a LinkedList
        for searching = use an ArrayList
        for inserting and deleting = use a LinkedList
        */

        /*
        Hashmap - a Python dictionary version of Java
        contains a key-value pair
        */
        HashMap<String, Integer> myStudentMark = new HashMap<>();
        myStudentMark.put("Alysha", 99);
        myStudentMark.put("Dio", 95);
        myStudentMark.put("Dafa", 90);
        myStudentMark.put("Bryan", 20);

        System.out.println(myStudentMark);
        System.out.println(myStudentMark.get("Bryan"));

        /*
        containsKey() - returns boolean
        containesValue() - returns boolean
        */
        System.out.println(myStudentMark.containsKey("Dio"));
        System.out.println(myStudentMark.containsValue(999));

        myStudentMark.put("Bryan", 100);
        System.out.println(myStudentMark);

        myStudentMark.replace("Bryan", 10); //replace if exist
        System.out.println(myStudentMark);

        myStudentMark.put("Arvin", 10);
        myStudentMark.replace("Arvin", 10); //if not exist, will not replace
        System.out.println(myStudentMark);

        myStudentMark.putIfAbsent("Anisa", 555); //put if not exist
        System.out.println(myStudentMark);

        myStudentMark.putIfAbsent("Anisa", 999); //if exist, not do anything
        System.out.println(myStudentMark);
    }
}