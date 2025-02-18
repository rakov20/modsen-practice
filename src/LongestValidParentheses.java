public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "(()"; // Пример
        System.out.println("Ввод: " + s + " Вывод: " + longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        int lastInvalid = -1;
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    lastInvalid = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        maxLength = Math.max(maxLength, i - lastInvalid);
                    } else {
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                }
            }
        }
        return maxLength;
    }
}