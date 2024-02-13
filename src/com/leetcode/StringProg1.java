package com.leetcode;

import java.util.*;

class WordDictionary {
    List<String> words = new ArrayList<>();

    public WordDictionary() {

    }

    public void addWord(String word) {
        words.add(word);

    }

    public boolean search(String word) {
        return words.contains(word);
    }


    public List<String> display() {
        return words;
    }

}

public class StringProg1 {
    public static void main(String[] argxs) {

        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("..ab");
        wordDictionary.addWord("b...");

        System.out.println(wordDictionary.display());

        System.out.println(wordDictionary.search("..ab"));

    }

}
