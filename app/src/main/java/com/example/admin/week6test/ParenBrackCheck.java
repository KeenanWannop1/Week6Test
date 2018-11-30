package com.example.admin.week6test;

public class ParenBrackCheck {
    public static void main(String[] args) {

    }
    //TO-DO, implement a stack that holds beginning and end
    private boolean check(String str){
        char[] sqBrackets = new char[str.length()];
        char[] parenthesis = new char[str.length()];
        char[] curlBrackets = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' ){

            }
            else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){

            }
        }

        return false;
    }
}
