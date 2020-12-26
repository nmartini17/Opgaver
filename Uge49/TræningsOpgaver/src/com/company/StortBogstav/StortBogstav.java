package com.company.StortBogstav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StortBogstav {
    Scanner sc = new Scanner(System.in);
    List<String> sentences = new ArrayList<>();

    public void addSentence(String sentence) {
        sentence = sc.nextLine();
        sentences.add(sentence);

    }

    public List<String> getSentences() {
        return sentences;
    }

    public int checkForUpperCase() {
        int upperCaseCount = 0;
        for (String sentence : sentences) {
            char firstChar = sentence.charAt(0);
            if (Character.isUpperCase(firstChar)) {
                upperCaseCount++;
            }
        }
        System.out.println("Number of sentences with uppercase: ");
        return upperCaseCount;
    }

    public void showAllSentences() {
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

}
