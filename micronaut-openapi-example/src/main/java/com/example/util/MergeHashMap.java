package com.example.util;

import java.util.*;
import java.util.stream.Collectors;

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
    public static void doMergeHashMap2(){
        MapObject map1 = new MapObject();
        map1.map.put("1", "A");
        map1.map.put("2", "B");

        MapObject map2 = new MapObject();
        map2.map.put("2", "C");
        map2.map.put("3", "B");

        List<MapObject> mapList = new ArrayList<>();

        mapList.add(map1);
        mapList.add(map2);

        Map<String, String> result = mapList.stream()
                .filter(e -> e.map != null)
                .map(e -> e.map)
                .collect(Collectors.toMap(s -> s.get("key"),
                        s -> s.get("value")));

        System.out.println(result);
    }

    public static class MapObject{
        Map<String, String> map = new HashMap<>();
    }

}
