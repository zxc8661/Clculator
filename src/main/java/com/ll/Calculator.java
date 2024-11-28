package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculator {
    public String run(String cmd){
       String rear = changeFormula(cmd).trim();
       return rear;
    }

    public String changeFormula(String cmd){
        StringBuilder sb= new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<cmd.length();i++){
            char ch= cmd.charAt(i);

            if(Character.isDigit(ch)){

                while(i<cmd.length() && Character.isDigit(cmd.charAt(i))){
                    sb.append(ch);
                    i++;
                }
                i--;
                sb.append(" ");
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while( st.peek()=='('){
                    sb.append(st.pop()).append(" ");
                }
                st.pop();
            }else{
                while(!st.isEmpty() &&priority(st.peek())>priority(ch)){
                    sb.append(st.pop()).append(" ");
                }
                st.push(ch);
            }

        }

        while(!st.isEmpty()){
            sb.append(st.pop()).append(" ");
        }
        return sb.toString();
    }
    public int priority(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
        }
        return -1;
    }





}
