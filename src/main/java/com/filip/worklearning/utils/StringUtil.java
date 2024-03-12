package com.filip.worklearning.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    private StringUtil() {
        throw new IllegalStateException(
                "Cannot instantiate StringUtil class! This is a utility class.");
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static boolean isNullOrWhitespace(String s) {
        return s == null || isWhitespace(s);

    }

    private static boolean isWhitespace(String s) {
        final int length = s.length();
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static String sanitizeFileName(String filePath) {
        return filePath.replaceAll(":", "_");
    }

    // returns first match of p in s for nth group in regular expression
    public static String getRegexMatch(String s, String pattern, int group) {
        Matcher m = Pattern.compile(pattern).matcher(s);
        return m.find() ? m.group(group) : "";
    }

    // returns all matches of p in s for nth group in regular expression
    public static List<String> getRegexMatches(String s, String pattern, int group) {
        List<String> matches = new ArrayList<>();
        Matcher m = Pattern.compile(pattern).matcher(s);
        while(m.find()) {
            matches.add(m.group(group));
        }
        return matches;
    }

    public static String getRegexMatch(String s, String pattern) {
        Matcher m = Pattern.compile(pattern).matcher(s);
        return m.find() ? m.group(0) : "";
    }

    public static List<String> getRegexMatches(String s, String pattern) {
        List<String> matches = new ArrayList<>();
        Matcher m = Pattern.compile(pattern).matcher(s);
        while(m.find()) {
            matches.add(m.group(0));
        }
        return matches;
    }

}