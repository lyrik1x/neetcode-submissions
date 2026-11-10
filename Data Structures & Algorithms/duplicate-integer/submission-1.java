class Solution {
    public boolean hasDuplicate(int[] nums) {
        
HashMap<Integer,Integer> maapa = new HashMap<>();
for(int i = 0; i<nums.length;i++)
{int c=0;
if(maapa.containsKey(nums[i]))
{return true;}

maapa.put(nums[i], c++);



}






        return false;
    }
}