package org.docvel;

/** Task 1
 * Дано число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N,
 * которая состоит из чередующихся символов c1 и c2, начиная с c1.
 * Пример. (n = 6, c1='a', c2='b') -> "ababab"
 * (n = 8, c1='x', c2='y') -> "xyxyxyxy"
 */
public class Task1 {
    public static void main(String[] args) {
        String str = Infrastructure.stringAlternatingChar(1, 'c', 'v');
        System.out.println(str);
        String str1 = Infrastructure.stringAlternatingChar(8, 's', 'w');
        System.out.println(str1);
    }
}