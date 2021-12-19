package com.company;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class CaesarCodec {
    Map mp = new HashMap();
    public CaesarCodec(int key, String s){
        for (int i = 97; i <= 122; i++) {
            char ch = (char) i;
            mp.put(i, ch);
        }
        //System.out.printf("After: %s%n", mp);
        System.out.print("Раскодируем: ");
        System.out.print(decode(key, s, mp));
        System.out.println();
        System.out.print("Закодируем: ");
        System.out.print(encode(key, s, mp));
    }
    public String decode(int key, String s, Map<Integer, Character> mp) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            int z = ch;
            if (z - key < 97) {
                z = z - key + 26;
            } else {
                z = z - key;
            }
            ch = (char)z;
            ans += ch;
        }
        return ans;
    }
    public String encode(int key, String s, Map<Integer, Character> mp) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            int z = ch;
            z = 97 + (z - 97 + key) % 26;
            ch = (char)z;
            ans += ch;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        int key = 1; // сдвиг
        CaesarCodec cd = new CaesarCodec(key, s);
        /*char ch = 120;
        int i = ch;
        System.out.println(ch);*/
    }
}
