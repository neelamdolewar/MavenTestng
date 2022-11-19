package com;

public class ArrayMultiDimensional {
    public static void main(String[] args) {

        //Dimensional integer array:-
        int[][] intArray = new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println("2D Array int[3][3]:");
        for (int i = 0; i <= intArray.length - 1; i++) {
            for (int j = 0; j <= intArray.length - 1; j++) {
                System.out.println(intArray[i][j] + " ");
            }
            System.out.println();
        }
        // Dimensional character array:-
        char[][] charArray = new char[][]{{'n', 'i', 'l', 'a', 'm'}, {'t', 'i', 'g', 'e', 'r'}, {'b', 'l', 'e', 's', 's'}, {'j', 'y', 'o', 't', 'i'},
                {'s', 'h', 'i', 'l', 'a'}};
        System.out.println("2D array char[5][5]:");
        for (int i = 0; i <= charArray.length - 1; i++) {
            for (int j = 0; j <= charArray.length - 1; j++) {
                System.out.println(charArray[i][j] + " ");
            }
            System.out.println();
        }

        // Dimensional string array:-
        System.out.println("3D array string[4][4][4]:");
        String[][][] stringarray = new String[][][]{{{"Satyen", "Rantnmala", "Yashodhan", "Neelam",}, {"Mon", "Tue", "Wed", "Thu",}, {"Black", "Blue", "White", "Red",},
                {"Leg", "Nose", "Ear", "Hair"}},
                {{"aaa", "bbb", "ccc", "ddd"}, {"maz", "pillu", "good", "boy"}, {"cake", "banana", "choclate", "apple"}, {"Lion", "tiger", "dog", "elephant"}},
                {{"rose", "lily", "sunflower", "chameli"}, {"water", "paper", "wood", "books"}, {"rangoli", "jewellery", "Toys", "spring"}, {"ball", "bat", "football", "hockey"}},
                {{"dress", "pant", "top", "kurti"}, {"mno", "pqr", "stu", "vwx"}, {"raja", "rani", "chor", "police"}, {"joker", "Don", "teacher", "doctor"}}};
        for (int i = 0; i <= stringarray.length - 1; i++) {
            for (int j = 0; j <= stringarray.length - 1; j++) {
                System.out.println();
                for (int k = 0; k <= stringarray.length - 1; k++) {
                    System.out.println(stringarray[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}

















