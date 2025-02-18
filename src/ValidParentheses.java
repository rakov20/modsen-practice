public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()"; // Пример
        System.out.println("Ввод: " + s + " Вывод: " + isValid(s));
    }

    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                top++;
                stack[top] = c;
            }
            else {
                if (top == -1) {
                    return false;
                }
                char open = stack[top];
                top--;
                if (!isMatchingPair(open, c)) {
                    return false;
                }
            }
        }
        return top == -1;
    }
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}