package DaysOfCode.Day18;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    Stack<Character> st = new Stack<>();
    Queue<Character> qu = new ArrayDeque<>();

    public void pushCharacter(char ch) {
        st.push(ch);
    }

    public void enqueueCharacter(char ch) {
        qu.add(ch);
    }

    public char popCharacter() {
        return st.pop();
    }

    public char dequeueCharacter() {
        return qu.poll();
    }
}
