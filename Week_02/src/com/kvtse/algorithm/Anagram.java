package com.kvtse.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/valid-anagram/description/
 * @author Tsing Tse
 * @date 2020-07-19 20:10
 */
public class Anagram {

    public static void main(String[] args) {

        String s = "anagram" ;
        String t = "nagaram";
        // 最差的暴力解法
        // 排序就行啊...
        isAnagramViolence( s,  t);

        // 计数器解法
        countZero(s,t);
    }

    /**
     * 执行用时： 2 ms , 在所有 Java 提交中击败了 99.79% 的用户
     *
     * 时间复杂度 O(m+n)
     * 空间复杂度 O(1)
     * @param s
     * @param t
     * @return
     */
    private static boolean countZero(String s, String t) {
        // 开辟一个字符数组即 26的长度
        int[] letterArray = new int[26];
        for (char c : s.toCharArray()) {
            letterArray[c-97] += 1;
        }
        for (char c : t.toCharArray()) {
            letterArray[c-97] -= 1;
        }
        for (int i = 0; i < letterArray.length; i++) {
            if (letterArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramViolence(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // 暴力之 如果两个字符串中每个字母出现的次数一样就行
        // 执行用时：
        //19 ms , 在所有 Java 提交中击败了 15.91% 的用户
        char[] sChars = s.toCharArray();
        Map<Character,Integer> sCharsMap = getCharMap(sChars);
        char[] tChars = t.toCharArray();
        Map<Character,Integer> tCharsMap = getCharMap(tChars);

        // 遍历比较
        Set<Map.Entry<Character, Integer>> entries = sCharsMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (!value.equals(tCharsMap.get(key))){
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> getCharMap(char[] sChars) {
        Map<Character,Integer> sCharsMap = new HashMap<>(sChars.length);
        for (char sChar : sChars) {
            Integer count = sCharsMap.get(sChar);
            if (count == null){
                sCharsMap.put(sChar,1);
            }else {
                sCharsMap.put(sChar,++count);
            }
        }
        return sCharsMap;
    }
}
