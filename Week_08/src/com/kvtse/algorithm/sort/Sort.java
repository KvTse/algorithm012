package com.kvtse.algorithm.sort;

import java.util.Random;

/**
 * 排序算法集
 *
 * @author Tsing Tse
 * @date 2020-08-30 16:44
 */
public class Sort {

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] descArray = genDisorderArray();
        System.out.println("原是数组->"+printResult(descArray));
        // 冒泡排序
//        sort.bubbleSort(descArray);

        // 快排
//        sort.quickSort(descArray);

        // 插入排序
//        sort.insertionSort(descArray);

        // 选择排序
        sort.selectionSort(descArray);
        System.out.println(printResult(descArray));
    }

    private void selectionSort(int[] descArray) {
        int currentMinimumIndex ;
        // 所有的元素
        for (int i = 0; i < descArray.length - 1; i++) {
            // 未排序的元素
            currentMinimumIndex = i;
            for (int j = i+1; j < descArray.length; j++) {
                // 从未排序的元素中,选出最小元素所在位置
                if (descArray[j] < descArray[currentMinimumIndex]){
                    currentMinimumIndex = j;
                }
            }
            // 交换位置,当前未排序的位置和未排序的最小值位置替换
            swap(descArray,i,currentMinimumIndex);
        }

    }

    private void insertionSort(int[] descArray) {
        int preIndex ;
        int current;
        for (int i = 1; i < descArray.length; i++) {
            preIndex = i-1;
            current = descArray[i];
            while(preIndex >= 0 && descArray[preIndex] > current){
                descArray[preIndex+1] = descArray[preIndex];
                preIndex--;
            }
            // 插入当前元素,while循环中多减了一次
            descArray[preIndex+1] = current;
        }

    }

    /**
     * 快排
     * 核心思想分治.如果要排序数组中p-->q之间的元素
     * 可在p,q之间任意选一点作为pivot(分区点)
     *
     * @param descArray 待排序数组
     */
    private void quickSort(int[] descArray) {
        quickSort(descArray, 0, descArray.length);
    }

    /**
     * 递归
     *
     * @param descArray 目标数组
     * @param left      左
     * @param right     右
     */
    private void quickSort(int[] descArray, int left, int right) {
        // 递归终止条件
        if (left >= right) {
            return;
        }
        // 获取分区点
        int pivot = partition(descArray, left, right);
        quickSort(descArray, left, pivot - 1);
        quickSort(descArray, pivot + 1, right);
    }

    private int partition(int[] descArray, int left, int right) {
        int pivot = left;
        int startIndex = pivot + 1;
        for (int i = startIndex; i < right; i++) {
            if (descArray[pivot] > descArray[i]) {
                swap(descArray, pivot, i);
                System.out.println(pivot+"->替换后的数组:" + printResult(descArray));
            }
        }
        return pivot;
    }

    /**
     * 冒泡排序
     *
     * @param descArray 待排序数组
     */
    private void bubbleSort(int[] descArray) {
        // 从第一个元素开始,依次比较两相邻元素,并比较其大小
        for (int i = 0; i < descArray.length - 1; i++) {
            // 依次替换每个元素
            for (int j = 0; j < descArray.length - 1 - i; j++) {
                // 交换位置
                if (descArray[j] > descArray[j + 1]) {
                    swap(descArray, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] descArray, int i, int j) {
        int temp = descArray[j];
        descArray[j] = descArray[i];
        descArray[i] = temp;
    }

    private static String printResult(int[] descArray) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < descArray.length; i++) {
            if (i != descArray.length - 1) {
                res.append(descArray[i]).append(",");
            } else {
                res.append(descArray[i]);
            }
        }
//        System.out.println(res);
        return res.toString();
    }

    private static int[] genDisorderArray() {
        int[] disorderArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < disorderArray.length; i++) {
            disorderArray[i] = random.nextInt(100);
        }
        return disorderArray;
    }
}

