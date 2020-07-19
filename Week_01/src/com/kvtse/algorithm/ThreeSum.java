package com.kvtse.algorithm;

import java.util.*;

/**
 * 三数求和
 * https://leetcode-cn.com/problems/3sum/
 *
 * @author Tsing Tse
 * @date 2020-07-14 1:16
 */
public class ThreeSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Set<List<Integer>> result = new LinkedHashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            Map<Integer, Integer> hashMap = new HashMap<>(nums.length - i);
            for (int j = i + 1; j < nums.length; j++) {
                int v = target - nums[j];
                Integer exist = hashMap.get(v);
                if (exist != null) {
                    List<Integer> list = Arrays.asList(nums[i], exist, nums[j]);
                    list.sort(Comparator.naturalOrder());
                    result.add(list);
                } else {
                    hashMap.put(nums[j], nums[j]);
                }
            }
        }

        return new ArrayList<>(result);
    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        // 暴力解决之...
//        Set<List<Integer>> resultSet = new HashSet<>();
//        for (int i = 0; i < nums.length-2; i++) {
//            for (int j = i+1;j<nums.length-1;j++){
//                for(int k = j+1;k<nums.length;k++){
//                    if (nums[i]+nums[j]+nums[k] == 0){
//                        List<Integer> res = new ArrayList<>();
//                        res.add(nums[i]);
//                        res.add(nums[j]);
//                        res.add(nums[k]);
//                        Collections.sort(res);
//                        resultSet.add(res);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(resultSet);
//    }
}
