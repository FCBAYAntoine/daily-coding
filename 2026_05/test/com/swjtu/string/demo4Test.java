package com.swjtu.string;

import org.junit.Test;
import static org.junit.Assert.*;

public class demo4Test {

    /**
     * 测试正常整数数组转换
     */
    @Test
    public void testArrayToStringNormal() {
        int[] arr = {1, 2, 3, 4};
        String result = demo4.arrayToString(arr);
        assertEquals("[1,2,3,4]", result);
    }

    /**
     * 测试单个元素的数组
     */
    @Test
    public void testArrayToStringSingleElement() {
        int[] arr = {42};
        String result = demo4.arrayToString(arr);
        assertEquals("[42]", result);
    }

    /**
     * 测试空数组
     */
    @Test
    public void testArrayToStringEmpty() {
        int[] arr = {};
        String result = demo4.arrayToString(arr);
        assertEquals("[]", result);
    }

    /**
     * 测试包含负数的数组
     */
    @Test
    public void testArrayToStringWithNegativeNumbers() {
        int[] arr = {-1, -2, -3};
        String result = demo4.arrayToString(arr);
        assertEquals("[-1,-2,-3]", result);
    }

    /**
     * 测试包含零的数组
     */
    @Test
    public void testArrayToStringWithZeros() {
        int[] arr = {0, 0, 0};
        String result = demo4.arrayToString(arr);
        assertEquals("[0,0,0]", result);
    }

    /**
     * 测试包含正负数和零的混合数组
     */
    @Test
    public void testArrayToStringMixedNumbers() {
        int[] arr = {-5, 0, 5, 10};
        String result = demo4.arrayToString(arr);
        assertEquals("[-5,0,5,10]", result);
    }

    /**
     * 测试大数数组
     */
    @Test
    public void testArrayToStringLargeNumbers() {
        int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        String result = demo4.arrayToString(arr);
        assertEquals("[2147483647,-2147483648]", result);
    }
}
