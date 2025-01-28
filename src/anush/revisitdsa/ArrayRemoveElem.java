package anush.revisitdsa;

public class ArrayRemoveElem {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 1){   //if one element
            if(val == nums[0]){
                return 0;
            }
        }
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            if(nums.length ==2 && nums[i]==nums[k-1] && i!=k-1 && nums[i]==val){
                return 0;
            }
            if(nums.length==2 && nums[i]==val){
                int temp= nums[i];
                nums[i]=nums[k-1];
                nums[k-1]=temp;
                k--;
                return k;
            }


            if (nums[i] == val) {
                if(nums[i]==nums[nums.length-1]){
                    nums[k-1]=-1;
                    nums[i]=nums[k-2];
                    k--;
                    return k;
                }
                int temp = nums[i];
                nums[i] = nums[k - 1];
                nums[k -1]=temp;
                k--;

            }

        }
        return k;

    }





    public static void main(String[] args) {
        int[] nums = {2,2,3};
        ArrayRemoveElem removeElem = new ArrayRemoveElem();
        removeElem.removeElement(nums, 2);
    }
}
