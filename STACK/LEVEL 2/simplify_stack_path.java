class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] arr = path.split("/");

        for (String st : arr) {
            if (st.equals("") || st.equals(".")) {
                continue;
            } 
            else if (st.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } 
            else {
                s.push(st);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : s) {
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
