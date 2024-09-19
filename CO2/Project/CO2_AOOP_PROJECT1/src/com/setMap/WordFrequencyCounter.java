package com.setMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordFrequencyCounter {
	public Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        Set<String> wordSet = new HashSet<>();
        String[] words = text.split("\\W+");
        for (String word : words) {
            word = word.toLowerCase(); 
            wordSet.add(word);
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }

    public void printWordFrequencies(Map<String, Integer> wordCountMap) {
        System.out.println("Word Frequencies:");
        
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
