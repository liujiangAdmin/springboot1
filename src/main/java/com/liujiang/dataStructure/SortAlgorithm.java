package com.liujiang.dataStructure;

/**
 * 冒泡排序 选择排序 插入排序
 *
 * @author isaac
 * @version 1.0.0
 * @since 2018.11.05
 */
public class SortAlgorithm {

    private void dubbleSort(int[] param) {
        for (int i = 1; i < param.length; i++) {
            boolean flag = true;
            for (int j = 0; j < param.length - i; j++) {
                if (param[j] > param[j + 1]) {
                    int temp = param[j];
                    param[j] = param[j + 1];
                    param[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    private void chooseSort(int[] param) {
        for (int i = 0; i < param.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < param.length; j++) {
                if (param[j] < param[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = param[i];
                param[i] = param[min];
                param[min] = temp;
            }
        }
    }

    //遍历显示数组
    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] param = {5, 4, 7, 8, 10, 9, 10};
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        sortAlgorithm.dubbleSort(param);
        sortAlgorithm.display(param);
    }
}
