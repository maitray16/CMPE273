import java.util.Scanner;
import java.util.Stack;

import static java.lang.StrictMath.max;

/**
 * Created by maitrayshah on 05/09/16.
 */
public class Brace_matching {

    public static void main(String args[])
    {
        String user_entry;
        Scanner x  = new Scanner(System.in);
        System.out.println("The pattern - ()()()))");
        user_entry = "()()())))";
        brace_match(user_entry);
    }

    static public int brace_match(String pattern) {
        int result = 0;
        int length = pattern.length();
        Stack<Integer> pattern_stack = new Stack<>();
        pattern_stack.push(-1);

        for (int i = 0; i < length; i++) {
            String n = pattern.valueOf(i);
            if (n.equals("(")) {
                pattern_stack.push(i);
            } else {
                pattern_stack.pop();

                if(!pattern_stack.empty())
                {
                    result = max(result , i - pattern_stack.firstElement());
                    System.out.println(result + " pairs");
                }
                else
                {
                    pattern_stack.push(i);
                }

            }
        }


        return result;
    }

}
