package com.softserve;


import java.util.Scanner;

class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                System.out.println(word.charAt(i));
                break;
            }
        }

    }
}
