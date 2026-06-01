package JavaCollectionsFramework.Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo{
    public static void main(String[] args) {

        Set<String> books = new HashSet<>();
        books.add("demo");
        books.add("ee");
        books.add("books");
        if (books.remove("books")) {
            System.out.println("books removed");
        }

        for (String temp : books){
            System.out.println(temp);
        }
        
    }
}