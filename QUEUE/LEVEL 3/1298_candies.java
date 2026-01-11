class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys,
                           int[][] containedBoxes, int[] initialBoxes) {

        Deque<Integer> dq = new ArrayDeque<>();
        HashSet<Integer> waiting = new HashSet<>();
        int total = 0;

        for (int i : initialBoxes) {
            dq.offerLast(i);
        }

        while (!dq.isEmpty()) {
            int box = dq.pollFirst();

            if (status[box] == 1) {

                // collect candies
                total += candies[box];

                // use keys
                for (int key : keys[box]) {
                    status[key] = 1;
                    if (waiting.contains(key)) {
                        dq.offerLast(key);
                        waiting.remove(key);
                    }
                }

                // add contained boxes
                for (int cb : containedBoxes[box]) {
                    dq.offerLast(cb);
                }

            } else {
                // locked box → keep aside
                waiting.add(box);
            }
        }
        return total;
    }
}
