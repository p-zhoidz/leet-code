package com.leet.code.arrays.gas_station_134;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GasStation134Test {


    @Test
    public void caseOne() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int result = GasStation134.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(3, result);
    }


    @Test
    public void caseTwo() {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};

        int result = GasStation134.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(-1, result);
    }

}