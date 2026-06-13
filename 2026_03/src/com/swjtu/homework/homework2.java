package com.swjtu.homework;
import java.util.Scanner;

public class homework2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 读取用户输入的N值
            System.out.print("请输入实数的个数N：");
            int n = scanner.nextInt();

            // 声明并初始化数组
            double[] nums = new double[n];

            // 读取N个实数存入数组
            System.out.println("请输入" + n + "个实数：");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextDouble();
            }

            // 排序（使用冒泡排序）
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        double temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }

            // 输出排序后的数组
            System.out.println("排序后的数组：");
            for (double num : nums) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }

