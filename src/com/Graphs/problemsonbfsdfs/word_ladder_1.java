package com.Graphs.problemsonbfsdfs;
import java.util.*;

// TC : O(N*M*26)  N = size of wordList Array and M = word length of words present in the wordList..
public class word_ladder_1 {
    private static class Pair {
        String first;
        int second;
        public Pair(String _first, int _second) {
            this.first = _first;
            this.second = _second;
        }
    }

    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {

        Queue <Pair> q = new LinkedList<>();                        // Creating a queue ds of type {word,transitions to reach ‘word’}
        q.add(new Pair(startWord, 1));                  // BFS traversal with pushing values in queue
                                                                // when after a transformation, a word is found in wordList

        Set <String>st = new HashSet<String>();                   // Push all values of wordList into a set to make deletion from it easier and in less time complexity
        int len = wordList.length;
        for (int i = 0; i < len; i++) {
            st.add(wordList[i]);
        }
        st.remove(startWord);
        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if (word.equals(targetWord) == true) return steps;      // we return the steps as soon as the first occurence of targetWord is found


            for (int i = 0; i < word.length(); i++) {                // Now, replace each character of ‘word’ with char from a-z then check if ‘word’ exists in wordList
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char replacedCharArray[] = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if (st.contains(replacedWord) == true) {                // check if it exists in the set and push it in the queue
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord, steps + 1));
                    }
                }

            }
        }

        return 0;                       // if no transformation possible
    }
    public static void main(String[] args) {
        String startWord = "der", targetWord = "dfs";
        String[] wordList = {
                "des",
                "der",
                "dfr",
                "dgt",
                "dfs"
        };
        word_ladder_1 obj = new word_ladder_1();
        int ans = obj.wordLadderLength(startWord, targetWord, wordList);

        System.out.print(ans);
        System.out.println();
    }
}