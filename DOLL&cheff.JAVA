//using HASHMAP CONCEPTS:: KEYS AND VALUES GAME//


class Solution {
   public List<Integer> findDuplicates(int[] nums) { //nums is the elements in the arrays.
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {//ELEMENTS WHICH ARE PRESENT ARE < THE LENGTH OF THE ARRAY
            int index = Math.abs(nums[i])-1;//THE VISITED MARK VALUE WILL BE || {MODED} AS IF THE VALUE IS IN -VE TERMINATED
            if (nums[index] < 0) //THE  VALUE WHICH HAS BEEN VISITED IF IT IS -VE
                res.add(Math.abs(nums[i]));//ADD IT AFTER || {IF -VE MAKE IT +VE}
            nums[index] = -nums[index];
        }
        return res;// RETURN THE LIST
    }
}
