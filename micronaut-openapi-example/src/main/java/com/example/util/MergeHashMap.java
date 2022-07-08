package com.example.util;

import java.util.LinkedHashMap;

public class MergeHashMap {

    public static void doMergeHashMap(){
        LinkedHashMap<Integer, String> fromMap = new LinkedHashMap<>();
        fromMap.put(1,"L");
        fromMap.put(2,"M");
        fromMap.put(3,"N");
        fromMap.put(4,"X");

        LinkedHashMap<Integer, String> desMap = new LinkedHashMap<>();
        desMap.put(20,"B");
        desMap.put(21,"G");
        desMap.put(32,"R");
        desMap.put(53,"ME");

        // print map details
        System.out.println("HashMap1: "
                +fromMap.toString());

        System.out.println("HashMap2: "
                +desMap.toString());

        // provide value for new key which is absent
        // using computeIfAbsent method
        desMap.forEach(
                (key,value)->fromMap.merge(key,value,(v1,v2)->v1));

        // print new mapping
        System.out.println("New HashMap: "+fromMap);
    }

}
