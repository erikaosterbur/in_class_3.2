package com.teksystems;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        QueueAndStack();
        MapPractice();
        SetPractice();
        UUID();
        ArrayListMapping();

    }

    public static void QueueAndStack () {
        //queue: first in, first out
        Queue<String> s = new LinkedList<>();
        s.add("Betty");
        s.add("Gloria");
        s.add("Mary");

        //poll gives back information and at the same time, deletes it from the list (first one first)
        String ss = s.poll();

        //prints: Betty
        System.out.println(ss);

        //prints: [Gloria, Mary]
        System.out.println(s);

        //stack: last in, last out
        Stack<String> stack = new Stack<>();
        stack.add("Betty");
        stack.add("Gloria");
        stack.add("Mary");

        //prints: [Betty, Gloria, Mary]
        System.out.println(stack);

        //pop gives back information and at the same time, deletes it from the list (last one first)
        String p = stack.pop();

        //prints: Mary
        System.out.println(p);

        //prints: [Betty, Gloria]
        System.out.println(stack);
    }

    public static void MapPractice () {
        Map<String, String> map = new LinkedHashMap<String, String>();

        map.put("z", "Susie");
        map.put("a", "Gloria");
        map.put("n", "Betty");
        map.put("c", "Mary");

        System.out.println(map);

        //enhanced for loop
        for (String s: map.keySet()) {
            System.out.printf("k: %s v: %s\n",s,map.get(s));
        }

        //lambda expression
        map.forEach((k, v) -> System.out.printf("k: %s v: %s\n",k,v));

        //tree map sorts it by key value: natural ordering
        Map<String, String> map2 = new TreeMap<>(map);

        System.out.println("______________");

        map2.forEach((k, v) -> System.out.printf("k: %s v: %s\n",k,v));

    }

    public static void SetPractice () {
        //does not allow duplicates
        Set<String> set = new TreeSet<String>();

        set.add("Susie");
        set.add("Gloria");
        set.add("Gloria");
        set.add("Betty");
        set.add("Mary");

        //prints: [bo, erika, jafer, laura]
        System.out.println(set);
    }

    public static void UUID () {

        while(true){
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }

    }

    public static void ArrayListMapping () {
        Map<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();

        ArrayList<String> s1 = new ArrayList<>(Arrays.asList("j1","j2","j3"));
        ArrayList<String> s2 = new ArrayList<>(Arrays.asList("a1","a2","a3"));
        ArrayList<String> s3 = new ArrayList<>(Arrays.asList("f1","f2","f3"));

        map.put("j", s1);
        map.put("a", s2);
        map.put("f", s3);

        for (String x: map.keySet()) {
            System.out.printf("k: %s v: %s\n",x,map.get(x));
        }
    }


}
