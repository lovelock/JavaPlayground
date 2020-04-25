package fun.happyhacker.java.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        new Array().game();

    }

    private void basic() {
        // 总之数组就是定长的，要么给定长度，要么给定元素让它自己计算长度
        int[] a = new int[10];
        int n = 100;
        int[] b = new int[n];

        int[] c = {1,2,3,4,};
        int[] d = new int[]{1,2,3,4,};

        // 还有一点需要注意，下面的e和f两个变量会共用同一个数组，所以改变其中一个也会改变另外一个
        int[] e = {1,2,3,4,};
        int[] f = e;
        f[2] = 5;
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
        // 如果要拷贝数组，则需要用Arrays.copy方法
        int[] g = {1,2,3,4,};
        int[] h = Arrays.copyOf(g, g.length);
        h[2] = 8;
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(h));
    }

    private void game() {
        int size = 50;
        int[] source = new int[size];

        for (int i = 0; i < size; i++) {
            source[i] = i;
        }

        System.out.println("输入要抽的数字个数: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int r = (int)(Math.random() * size);
            result[i] = source[r];
            source[r] = source[size-1];
            size--;
        }

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
