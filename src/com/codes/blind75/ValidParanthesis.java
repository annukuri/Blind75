package com.codes.blind75;

public class ValidParanthesis 
{
	public boolean isValid(String s) 
    {
        Stack <Character> myStack = new Stack<Character>();
        for(char c: s.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
                myStack.push(c);
            else
            {
                if(myStack.isEmpty())
                    return false;
                char top= myStack.peek();
                if(( c == ')' && top == '(') || (c == '}' && top == '{' ) || (c == ']' && top == '['))
                    myStack.pop();
                else
                    return false;
            }
        }
        return myStack.isEmpty();
    }
}
