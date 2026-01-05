class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> d=new ArrayDeque<>();
        int[] arr=new int[deck.length];
        Arrays.sort(deck);
        int n=deck.length;
        d.offer(deck[n-1]);
        for(int i=n-2;i>=0;i--){
            d.addFirst(d.removeLast());
            d.addFirst(deck[i]);
        }
        for(int j=0;j<n;j++){
            arr[j]=d.pollFirst();
        }
        return arr;
    }
}
