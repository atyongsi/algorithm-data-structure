import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * Created by atyongsi@163.com on 2020/8/9
 */
public class BubbleSort {

    /**
     * param:[arr, n]
     * return:void
     * description:冒泡排序
     * 冒泡排序只会比较相邻的两个数，如果不满足大小关系，则交换。
     * 一次冒泡至少会让一个数据移动到它应该在的位置,假如有n个元素,一次冒泡比较n次,一共有n次冒泡
     * 总的平均时间复杂度为O(n*n)
     */
    private static int[] bubbleSort(int[] arr, int n) {
        if (n <= 1) return arr;   //如果只有一个元素,不需要进行排序

        for (int i = 0; i < n; ++i) {
            boolean flag = false;//提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }
            }
            if (!flag) break;//没有数据交换,数组已经排好序
        }
        return arr;
    }

    public static void main(String[] args) {
        int array[] = {4, 7, 2, 8, 6, 2, 9, 0};

        int[] sortedArr = BubbleSort.bubbleSort(array, array.length);

        for (int i : sortedArr) {
            System.out.print(i+",");
        }
    }
}
