package org.levelup.lesson2.homework2;

public class Sort {
    public static void main(String[] args) {
        int a = 234;
        int b = 13;
        int c = 108943;
        int[] nums = new int[3];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j - 1] > nums[j]) {
                    int tmp = a;
                    a = b;
                    b = tmp;
                }
            }
        }

        System.out.println("Возрастающая последовательность чисел: " + a + "," + b + "," + c);
    }
}
