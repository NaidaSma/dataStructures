package task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Algorithm {
    public static Double calculate(String s1) {
    	Stack<Double> number=new Stack<Double>();
    	Stack<Character> operator=new Stack<Character>();
        char[] token= new char[s1.length()];
        int i;
        for( i=0;i<s1.length();i++){
            token[i]=s1.charAt(i);
        }

       for(i=0;i<token.length;i++){
            if      (token[i]=='(') {;}
            else if (token[i]=='+')   {
                operator.push(token[i]);
            }
            else if (token[i]=='-')   {
                operator.push(token[i]);
            }
            else if (token[i]=='*')   {
                operator.push(token[i]);
            }
            else if (token[i]=='/')   {
                operator.push(token[i]);
            }
            else if (token[i]=='%')   {
                operator.push(token[i]);
            }
            else if (token[i]=='^')   {
                operator.push(token[i]);
            }
            else if (token[i]==')') {
                char ope=operator.pop();
                double num=number.pop();
                if(ope=='+') {
                    num=num+number.pop();
                }
                else if(ope=='-') {
                    num=number.pop()-num;
                }
                else if(ope=='*') {
                    num=number.pop()*num;
                }
                else if(ope=='/') {
                    num=number.pop()/num;
                }
                else if(ope=='%') {
                	num=number.pop()%num;
                }
                number.push(num);
            }
            else {
                double num2=Double.parseDouble(Character.toString(token[i]));
                number.push(num2);
            }


        }
        System.out.println(number.pop());
        return null;
    }


    public static ArrayList<Double> calculateFromFile(String filePath) throws FileNotFoundException {
    	ArrayList<String> expressions = FileUtils.readFile(filePath);
        ArrayList<Double> results = new ArrayList<>();
        for (String expression : expressions) {
            double result = calculate(expression);
            results.add(result);
        }
        return results;
    
    }
}
