package org.example.arraysHashing.StringReduction;

import java.util.HashSet;
import java.util.Set;

public class StringReduction {

    public static int getMinReductions(String s){
        Set<Character> set=new HashSet<>();

       for (int i=0;i<s.length();i++){
           set.add(s.charAt(i));
       }
       return s.length()-set.size();
    }
}
