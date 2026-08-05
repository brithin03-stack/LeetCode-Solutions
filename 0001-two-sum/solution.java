class Solution { 
    public int[] twoSum(int[] nums, int target) { 
        int[] result = new int[2]; // Fix 1: Declare and initialize the array
        
        for (int i = 0; i < nums.length; i++) { 
            // Fix 2: Start j at i + 1 so you don't reuse the same element
            for (int j = i + 1; j < nums.length; j++) { 
                if (nums[i] + nums[j] == target) { 
                    result[0] = i; 
                    result[1] = j; 
                    return result; 
                } 
            } 
        } 
        return result; 
    } 
}

