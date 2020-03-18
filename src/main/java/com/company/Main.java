package com.company;

import java.util.HashMap;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
      for (int i=1;i<=10;i++){
          hashMap.put(i,"Student"+i);
      }
      hashMap.entrySet().stream().
                filter(x->x.getKey()>5).
                forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
      hashMap.entrySet().stream().
              filter(x->x.getKey()%3==0).forEach(x-> System.out.print(x.getValue()+","));
      Optional<Integer>hash= Optional.ofNullable(hashMap.entrySet().stream().filter(x -> x.getValue().length() > 5).
              map(x -> x.getKey()).
              reduce(1, (x, y) -> x * y));

        System.out.println("\n"+hash.get());

    }
}
