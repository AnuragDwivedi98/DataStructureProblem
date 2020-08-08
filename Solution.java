import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int testCase= in.nextInt();
        
        while(testCase-- >0)
        {
            String st = in.next();
            new Solver();
            if (Solver.isBalanced(st) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        
        }
    }
}


class Solver
{
    static boolean isBalanced(String s)
    {
        
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
        if (c == '(')
            stack.push(')');
        else if (c == '{')
            stack.push('}');
        else if (c == '[')
            stack.push(']');
        else if (stack.isEmpty() || stack.pop() != c)
            return false;
        }
        return stack.isEmpty();
        
    }
}

