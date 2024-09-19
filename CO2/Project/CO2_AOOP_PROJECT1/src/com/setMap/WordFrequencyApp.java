package com.setMap;

import java.util.Map;
import java.util.Scanner;

public class WordFrequencyApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String text = sc.nextLine() ;      
        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> frequencyMap = counter.countWordFrequency(text);       
        counter.printWordFrequencies(frequencyMap);
        sc.close();
    }
}
