package JavaCollectionsFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        
        LinkedList<Integer> todoItems = new LinkedList<>();
        todoItems.add(870);
        todoItems.add(32);
        todoItems.add(45);
        Collections.sort(todoItems);
        for (int temp : todoItems){
            System.out.println(temp);
        }

        ArrayList<Integer> todoItems2 = new ArrayList<>();
        todoItems2.add(870);
        todoItems2.add(323);
        todoItems2.add(453);
        for (int temp : todoItems2){
            System.out.println(temp);
        }
    }
}