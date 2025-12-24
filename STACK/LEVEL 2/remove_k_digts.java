class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            while (k > 0 && !stack.isEmpty() && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // remove remaining k digits from end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // build result
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

while (sb.length() > 0 && sb.charAt(0) == '0') {
    sb.deleteCharAt(0);
}

String result = sb.toString();
return result.length() == 0 ? "0" : result;

    }
}
