package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void givenSentenceReturnFrequency() throws NullPointerException{
        String sentence= "To be or not to be to";
        MyHashMap<String,Integer> myHashMap= new MyHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");

        for(String word:words) {
            Integer value = myHashMap.get(word);
            if (value == null) value = 1;
            else value= value+1;
            myHashMap.add(word, value);
        }
        int frequency=myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(3,frequency);

    }

}