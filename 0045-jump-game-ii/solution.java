class Solution {
    public int jump(int[] nums) {
        // If the array has only 1 element, you are already at the destination
        if (nums.length <= 1) {
            return 0;
        }
        
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        // Iterate through the array except for the last element
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest index we can reach from the current position
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we have reached the end of the current jump's range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                // If the current jump can already reach or exceed the last index, stop early
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }
        
        return jumps;
    }
}

