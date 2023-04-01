package org.docvel;

/** Task 2
 * Создать файл file.txt. Если файл уже создан, ничего делать не надо.
 * Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
 */
public class Task2 {
    public static void main(String[] args) {
        Infrastructure.createFileWithText("file1", "TEXT", 100);
    }
}