public class Pair { 
    int a;
    int b;
    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = map.entrySet()
            .stream()
            .map(entry -> new Pair(entry.getValue(), entry.getKey()))
            .collect(Collectors.toCollection(
                () -> new PriorityQueue<>((p1, p2) -> Integer.compare(p2.a, p1.a))
            ));

        for(int i=0; i<k; i++) {
            res[i] = pq.poll().b;
        }
        return res;
    }
}
