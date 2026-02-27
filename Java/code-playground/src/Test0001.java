import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Test0001 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);// Am Ende hinzugefügt
        list.add(2);
        list.add(4);
        list.add(5);
        list.addLast(6);
        list.addFirst(7);

        //Integer[] myArray = list.toArray(new Integer[0]);
        Integer[] myArray = list.toArray(new Integer[0]);

        System.out.println(myArray.getClass());
        int[] myArray2 = new int[myArray.length];

        for(int i =0;i<myArray.length;i++){
            //System.out.println(myArray[i]);
             myArray[i]= myArray2[i];
        }


        System.out.println("Array2 Class: "+myArray2); // Integer


        //Collections col = new Collections();


    }
}
