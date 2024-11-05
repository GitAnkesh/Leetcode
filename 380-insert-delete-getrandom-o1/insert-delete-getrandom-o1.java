

class RandomizedSet {
    private Map<Integer, Integer> map;  // Map to store element to index mapping
    private List<Integer> list;         // List to store the elements
    private Random random;              // Random number generator

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;  // Element already exists
        }
        // Add the element to the end of the list and update the map
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;  // Element doesn't exist
        }
        // Swap the element to be removed with the last element in the list
        int lastElement = list.get(list.size() - 1);
        int idx = map.get(val);
        
        list.set(idx, lastElement); // Set last element to the index of the element to remove
        map.put(lastElement, idx);  // Update map with new index for last element
        
        // Remove the last element in the list and remove the element from the map
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        // Return a random element from the list
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */