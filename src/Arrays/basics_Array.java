package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class basics_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*ArrayList<Integer> list = new ArrayList<>(10);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);

        System.out.println(list);
        list.set(0,3);
        System.out.println(list.contains(18));
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i ++)
        {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i ++)
        {
            System.out.println(list.get(i));
        }
        //System.out.println(list);*/

        //MULTIPLE ARRAY LIST :-

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        for (int i = 0; i < 3; i ++)
        {
            list.add(new ArrayList<>());
        }

        //add elements

        for (int i = 0; i < 3; i ++)
        {
            for (int j = 0; j < 3; j ++)
            {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
