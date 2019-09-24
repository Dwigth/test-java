package com.company.controllers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Words {
    public static void SwapFirstLastLetters(String word) {
        char[] letters = word.toCharArray();
        char first = letters[0];
        char last = letters[letters.length - 1];
        letters[0] = last;
        letters[letters.length - 1] = first;
        System.out.println(letters);
    }

    public static void ScrambleLetters(String word) {
        char[] letters = word.toCharArray(); // Obtener el arreglo de letras
        Arrays.sort(letters);
        System.out.println(letters);
    }
}
