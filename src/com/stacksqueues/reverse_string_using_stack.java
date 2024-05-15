package com.stacksqueues;
import java.util.Stack;

public class reverse_string_using_stack {

    public class Reverse_a_String_using_Stack {

        public static String reverse(String str){

            Stack <Character> stack=new Stack<>();
            for(int i=0;i<str.length();i++){
                stack.push(str.charAt(i));
            }
            String ans="";

            while(!stack.isEmpty()){
                char top=stack.peek();
                ans = ans + top;
                stack.pop();
            }
            return ans;
        }

        public static void main(String[] args) {

            String str="abcde";
            System.out.println(reverse(str));
        }
    }
}
