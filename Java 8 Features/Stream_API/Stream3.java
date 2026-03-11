/*
Write a java Program to where string caontains "a" then the string convert into UpperCase and 
which are not cantians "a" then remove those string.

*/

import java.util.Arrays;
import java.util.List;

public class Stream3 {

    public static void main(String[] args) {
        
        List<String> l = Arrays.asList("Ayvak","Abhav","Ram","Sita","Rose","Jack");
        List<String> list = l.stream().filter(i->i.contains("a")).map(i->i.toUpperCase()).toList();
        System.out.println(list );
    }
}

//[AYVAK, ABHAV, RAM, SITA, JACK]
