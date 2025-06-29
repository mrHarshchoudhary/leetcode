class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>freqMap=new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
            
        }
       PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]  
        );

     
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            minHeap.offer(new int[]{num, freq});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
             int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll()[0];
        }
        
   
        
             return result;
    }
}