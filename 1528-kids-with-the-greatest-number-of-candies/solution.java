class Solution {
    public static int amax(int arr[]){
        int max=arr[0];
        int i=0;
         for(i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
    }
    return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i=1;
        List<Boolean> result=new ArrayList<>();
        int max= amax(candies);
        for(i=0;i< candies.length;i++){
            
            int a=candies[i]+extraCandies;
            result.add(a>=max);
            
        }
        return result;
     }
}

