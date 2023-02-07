
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int max = 0;
        int max2 = 0;

        for(int value : nums){
            if(value + 1 > max){
                max2 = max;
                max = value;
            }else if (value > max2 && value < max){
                max2 = value;
            }
        }
        return max + max2;
    }
}