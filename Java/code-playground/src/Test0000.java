import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Test0000 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(1);// Am Ende hinzugefügt
        list.add(2);
        //Integer i3 = list.add(3);// Integer
        list.add(4);
        //Integer i9 = list.add(2,99);
        Object element = list.get(1);

        if(element instanceof Integer){
            System.out.println( "ist Objekt");
        }
        System.out.println(element.getClass());

        //int ele = element; // Unboxing
        System.out.println("Primitiv int : ");
        int a = 234;
        //System.out.println(a.getClass());  X a ist kein Objekt

        list.add(5);
        list.addLast(6);
        list.addFirst(7);
        System.out.println(list);
        Collections.sort(list); // alle CollectionS Methoden sind static
        /*Collection ist das Interface für Array, List , ArrayList*/
        Integer[] myArray = list.toArray(new Integer[0]);
        for(Integer i : myArray){
            System.out.println(myArray[i]);
        }

        //Collections col = new Collections();


    }
}
