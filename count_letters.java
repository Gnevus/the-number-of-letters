package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        
        int count = 0;
        for ( char x : alphabet) { //пробегаемся по массиву алфавита
            for ( String s : list) { //пробегаемся по массиву введённых строк и извлекаем построчно
                for ( char i : s.toCharArray()) { //пробегаемся по строке извлекая по символу, сконвертировав строку в массив символов
                    if (x == i) { //если символ из алфавита совпадает с символом строки
                        count++; //увеличиваем счетчик
                    }
                }
            }
            System.out.println(x + " " + count); //выводим результат буква - колличество
            count = 0; //обнуляем счетчик
        }
    }

}
