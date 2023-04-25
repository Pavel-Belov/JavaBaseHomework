package org.example.homework4.task02;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * <p>
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '([)'.
 */
public class Hw4Task02 {
    public static void main(String[] args) {
        boolean b = isValid("(([]){})");
        System.out.println(b);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') st.push(ch);
            else {
                if (!st.isEmpty() && ch == ')' && st.peek() == '(') st.pop();
                else if (!st.isEmpty() && ch == '}' && st.peek() == '{') st.pop();
                else if (!st.isEmpty() && ch == ']' && st.peek() == '[') st.pop();
                else return false;
            }
            i++;
        }
        return st.isEmpty();
    }
}
