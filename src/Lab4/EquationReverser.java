package Lab4;

public class EquationReverser {


    public static String reverseEquation(String equation) {
        // create the object of the TokenStack class
        TokenStack stack = new TokenStack();

        int i = 0;

        // TODO 1 & 2 & 3: Traverse the equation from left to right.
        while (i < equation.length()) {
            char current = equation.charAt(i);

            // If the current character is a digit
            if (Character.isDigit(current)) {
                int start = i;
                // Move forward until the number ends
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                // Push the whole number as one item
                stack.push(equation.substring(start, i));
            } else {
                // Otherwise, push the operator
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // TODO 4: Pop all items from the stack and append them to a StringBuilder.
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
