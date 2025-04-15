package com.leet.code.arrays.maximum_subarray_53;

import com.leet.code.arrays.gas_station_134.GasStation134;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarray53Test {

    @Test
    public void caseOne() {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int result = MaximumSubarray53.maxSubArray(arr);
        Assertions.assertEquals(6, result);
    }


    @Test
    public void caseTwo() {
        int[] arr = {5,4,-1,7,8};

        int result = MaximumSubarray53.maxSubArray(arr);
        Assertions.assertEquals(23, result);
    }

}