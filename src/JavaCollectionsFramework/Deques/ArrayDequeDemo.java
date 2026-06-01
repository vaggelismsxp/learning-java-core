package JavaCollectionsFramework.Deques;

import java.util.ArrayDeque;
import java.util.Deque;


//Double ended queues = Deque
public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<String> cards = new ArrayDeque<String>();
        cards.add("king");
        cards.add("queen");
        cards.add("queen2");
        cards.add("queen3");
        cards.add("queen4");

        for (String temp:cards){
            System.out.println(temp);
        }
        System.out.println(cards.peekFirst());

        if (cards.contains("king")){
            System.out.println("true");
        }//true
        cards.contains("queen");//true



    }
    
}
