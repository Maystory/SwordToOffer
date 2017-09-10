package cn.swun.swordToOffer;

import java.util.Arrays;
/**
 * 
 * @author 梅凡
 *  快速排序的实现代码
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 6, 3, 7, 2, 9, 4, 0, 8};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 快排
     *
     * @param nums  目标排序数组
     * @param left  目标数组开始角标
     * @param right 目标数组最后的角标
     */
    private static void quickSort(int[] nums, int left, int right) {
        //角标未越界
        if (left < right) {
            //临时角标
            int i = left, j = right;
            //临时值
            int temp = nums[i];
            //当i < j ，一旦i == j，退出循环
            while (i < j) {
                //先从右侧开始比较，若当前最右侧的值大于等于临时值，角标减1
                while (i < j && nums[j] >= temp) {
                    j--;
                }
                //左侧开始比较，若当前最左侧的值小于等于临时值，角标加1
                while (i < j && nums[i] <= temp) {
                    i++;
                }
                //到了这一步，就说明右侧找到了一个比临时值小，而左侧找到了一个比临时大的值
                if (i < j) {
                    //进行交换,将大的值放在右边，小的值放在左面
                    swap(nums, i, j);
                }
            }
            //出了while循环，说明i == j ，因为i在++ ， j在--
            //将j位置上的值赋予最左侧
            nums[left] = nums[j];
            //此时的临时值，还是最左侧的值，将最左侧的值赋予j位置，也就是说将基准值与相遇值进行交换
            //此时j左侧都比j位置上的值小，而j右侧都比j位置上的值大，也就是中间值
            nums[j] = temp;
            //再对left到中间值角标的数组进行排序，递归调用
            quickSort(nums, left, i - 1);
            //再对中间值角标到right的数组进行排序，递归调用
            quickSort(nums, i + 1, right);
        }
    }

    /**
     * 交换值
     */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}