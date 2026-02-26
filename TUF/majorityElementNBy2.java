// 169. Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// Example 1:
// Input: nums = [3,2,3]
// Output: 3
// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


public class majorityElementNBy2 {
    public int Solution(int []nums){
        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count++;
                ele=nums[i];
            }else if(nums[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == ele){
                count1++;
            }
            if(count1 > nums.length / 2){
                return ele;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,3,4,5,1,3,1,1,1,1};

        majorityElementNBy2 ans = new majorityElementNBy2();
        int majority = ans.Solution(arr);
        System.out.println("Majority element is: " + majority);
    }
}
