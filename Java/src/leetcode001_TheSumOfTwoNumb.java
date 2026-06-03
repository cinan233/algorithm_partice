import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class leetcode001_TheSumOfTwoNumb {

    public static void main(String[] args) {
        int[] nums  = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        // 创建Hash表
        HashMap<Integer, Integer> map = new HashMap<>();
        // 创建结果数组
        int[] array = new int[2];

        for (int i = 0; i < nums.length; i++) {
            // 假如当前数组中存在一个key 等于target 减去当前元素 那么 key + 当前元素就等于target
            if (map.containsKey(target - nums[i])) {
                // 下标 0 等于我们存入hashmap里的key值
                array[0] = map.get(target - nums[i]);
                // 下标 1 等于当前元素
                array[1] = i;
            }
            //如果当前不存在这样的值，我们就把当前值插入hash表，value为他的下标
            map.put(nums[i], i);
        }

        return array;
    }
}