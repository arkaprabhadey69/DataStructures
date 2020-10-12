package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedHashMapTest {

    @Test
    public void givenSentenceReturnParanoidFrequency() {
        String sentence = "Paranoid people are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word, value);
        }

        int frequency = myLinkedHashMap.get("paranoid");
        Assert.assertEquals(4, frequency);

    }

    @Test
    public void givenSentenceDeleteOccurrenceOfParticularWord() {
        String sentence = "Paranoid people are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        String deletedWord = myLinkedHashMap.delete("avoidable");

        Assert.assertEquals("avoidable", deletedWord);

    }

}