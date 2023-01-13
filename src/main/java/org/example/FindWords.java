package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindWords {

    public List<List<String>> findConcatWords(List<String> stringList) {

        List<List<String>> result = new ArrayList<>();
        List<String> sixLetters = FindWords.sixLetterWords(stringList);
        List<String> underSixLetters = FindWords.underSixLetterWords(stringList);

        for (String sixLetterWords : sixLetters) {
            if (underSixLetters.contains(sixLetterWords.substring(0, 1)) && underSixLetters.contains(sixLetterWords.substring(1, 6))) {
                result.add(List.of(sixLetterWords, sixLetterWords.substring(0, 1), sixLetterWords.substring(1, 6)));

            } else if ((underSixLetters.contains(sixLetterWords.substring(0, 2)) && underSixLetters.contains(sixLetterWords.substring(2, 6)))) {
                result.add(List.of(sixLetterWords, sixLetterWords.substring(0, 2), sixLetterWords.substring(2, 6)));

            } else if ((underSixLetters.contains(sixLetterWords.substring(0, 3)) && underSixLetters.contains(sixLetterWords.substring(3, 6)))) {
                result.add(List.of(sixLetterWords, sixLetterWords.substring(0, 3), sixLetterWords.substring(3, 6)));

            } else if ((underSixLetters.contains(sixLetterWords.substring(0, 4)) && underSixLetters.contains(sixLetterWords.substring(4, 6)))) {
                result.add(List.of(sixLetterWords, sixLetterWords.substring(0, 4), sixLetterWords.substring(4, 6)));

            } else if ((underSixLetters.contains(sixLetterWords.substring(0, 5)) && underSixLetters.contains(sixLetterWords.substring(5, 6)))) {
                result.add(List.of(sixLetterWords, sixLetterWords.substring(0, 5), sixLetterWords.substring(5, 6)));
            }
        }
        return result;
    }

    private static List<String> sixLetterWords(List<String> strList) {
        return strList.stream()
                .filter(s -> s.length() == 6)
                .collect(Collectors.toList());
    }

    private static List<String> underSixLetterWords(List<String> strList) {
        return strList.stream()
                .filter(s -> s.length() < 6)
                .collect(Collectors.toList());
    }
}
