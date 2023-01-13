package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;


class FindWordsTest {

    private final List<String> stringList = ReadFromFile.readFromFile("/Users/HU900849/Desktop/CodeKata/CodeKata-08/src/main/resources/wordlist.txt");

    private FindWords findWords = new FindWords();


    @Test
    @RepeatedTest(3)
    void findConcatWordsTest() {
        //Arrange
        Random random = new Random();

        //Act
        List<List<String>> concatWords = findWords.findConcatWords(stringList);
        int randNum = random.nextInt(concatWords.size());

        //Assert
        List<String> words = concatWords.get(randNum);

        System.out.println(words);
        Assertions.assertTrue(stringList.containsAll(words));
    }

}