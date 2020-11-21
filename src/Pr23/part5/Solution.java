package Pr23.part5;

import java.util.*;

public class Solution {

   public <T> ArrayList<T> newArrayList(T[] mass){
        ArrayList<T> list = new ArrayList<T>();
        for(int i =0;i< mass.length;i++){
            list.add(mass[i]);
        }
        return list;
   }

   public <T> HashSet newHashSet(T[] mass){
        HashSet<T> hashSet = new HashSet<>();
        for(int i =0;i<mass.length;i++){
            hashSet.add(mass[i]);
        }
        return hashSet;
   }

   public <K,V> HashMap newHashMap(Cont<K,V>[] mass){
       HashMap<K,V> hashMap = new HashMap<>();
       for(int i =0;i< mass.length;i++){
           hashMap.put(mass[i].getKey(),mass[i].getValue());
       }
       return hashMap;
   }

}
