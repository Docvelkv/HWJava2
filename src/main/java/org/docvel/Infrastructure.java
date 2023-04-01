package org.docvel;

import java.io.IOException;
import java.nio.file.*;

public class Infrastructure {

    /**
     * Метод создаёт строку из указанного количества чередующихся символов
     * @param num количество символов
     * @param c1 первый символ
     * @param c2 второй символ
     * @return String строка
     */
    public static String stringAlternatingChar(int num, char c1, char c2) {
        StringBuilder strRes = new StringBuilder();
        if (num % 2 == 0) {
            for (int i = 0; i < num / 2; i++) strRes.append(c1).append(c2);
        } else {
            for (int i = 0; i < num / 2; i++) strRes.append(c1).append(c2);
            strRes.append(c1);
        }
        return strRes.toString();
    }

    /**
     * Метод создаёт текстовый файл (если его не было) и
     * записывает в него строку,
     * состоящую из n указанных подстрок
     * @param fName имя файла
     * @param strInput входящая подстрока
     * @param count количество подстрок в строке
     */
    public static void createFileWithText(String fName, String strInput, int count) {
        fName += ".txt";
        Path newpath = Path.of(fName);
        if (Files.exists(newpath)) {
            StringBuilder strA = new StringBuilder();
            strA.append(String.valueOf(strInput).repeat(count));
            try {
                Files.writeString(newpath, strA);
            } catch (IOException e) {
                System.out.println("Ошибка: " + e);
            }
        }
        else {
            try {
                Files.createFile(newpath);
                StringBuilder strA = new StringBuilder();
                strA.append(String.valueOf(strInput).repeat(count));
                Files.writeString(newpath, strA);
            } catch (IOException e) {
                System.out.println("Ошибка: " + e);
            }
        }
    }
}