class Solution {
    public String frequencySort(String s) {
        // char ch[]=s.toCharArray();
        // Arrays.sort(ch);
        // String str=new String(ch);
        // return str;
      HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
PriorityQueue<Map.Entry<Character,Integer>>maxHeap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
  maxHeap.addAll(map.entrySet());
  StringBuilder sb=new StringBuilder();
  while(!maxHeap.isEmpty()){
    Map.Entry<Character,Integer>entry=maxHeap.poll();
    char ch=entry.getKey();
    int freq=entry.getValue();
   for (int i = 0; i < freq; i++) {
               sb.append(ch);
            }
  }
  return sb.toString();

    }
}