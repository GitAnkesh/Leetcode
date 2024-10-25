class Solution {
    public int majorityElement(int[] nums) {
    //     Map<Integer,Integer>countMap= new HashMap<>();
    //    for(int num :nums){
    //     countMap.put(num,countMap.getOrDefault(num,0)+1);
    //    }
    //     for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
    //         System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue());
    //     }
    //     for(Map.Entry<Integer,Integer>entry: countMap.entrySet()){
    //         if(entry.getValue()<nums.length){
    //             return entry.getKey();
    //         }
    //     }
    //     return 0;
     Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int majorityCount = nums.length / 2;
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }
        return -1; // Just a fallback, although the problem guarantees a majority element.
    }
        
    
}