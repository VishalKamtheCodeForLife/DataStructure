  public int singleNumber(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        for(int num: nums){
            if(seen.contains(num)){
                seen.remove(num);
            }else{
                seen.add(num);
            }
        }
        return seen.iterator().next();        
}

public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i< nums.length - 1){
            if(nums[i] == nums[i+1]){
                i+=2;
            }else{
                return nums[i];
            }
        }     
        return nums[i];
}

public int singleNumber(int[] nums) {
       int res = 0;
        for (int num : nums) {
            res ^= num;
            System.out.println(res);
        }
        return res;
    }
