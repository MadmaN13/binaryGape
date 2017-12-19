package my.train.codility.lesson1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class BinaryGapSolver {
    public int solve(int n) {
        int dividend = n;
        int currentGap = 0;
        int maxGap = 0;
        int prevRem = 1;
        boolean trailingNullsSkipped = false;
        StringBuffer binaryViewReverse = new StringBuffer();
        ArrayList<Integer> binaryList  = new ArrayList<>();
        while(dividend >= 1) {
            int quotient = dividend / 2;
            int remainder = dividend - (quotient * 2);
            if(remainder == 1) trailingNullsSkipped = true;
            if(trailingNullsSkipped) {
                if(remainder == 0 && prevRem == 1) {
                    currentGap = 0;
                    currentGap++;
                }
                else if(remainder == 0 && prevRem == 0) {
                    currentGap++;
                }
                else if(remainder == 1 && prevRem == 0) {
                    if(currentGap > maxGap) {
                        maxGap = currentGap;
                    }
                    currentGap = 0;
                }
            }
//            LOGGER.info("quotient: " + quotient + ", remainder: " + remainder);
            binaryViewReverse.append(remainder);
            dividend = quotient;
            prevRem = remainder;
            binaryList.add(remainder);
        }
//        for(Integer i: binaryList) {
//            LOGGER.info(String.valueOf(i));
//        }
        LOGGER.info("Binary(" + n + ") = " + binaryViewReverse.reverse().toString());
        LOGGER.info("MaxGap(" + n + ") = " + String.valueOf(maxGap));
        return maxGap;
    }
}
