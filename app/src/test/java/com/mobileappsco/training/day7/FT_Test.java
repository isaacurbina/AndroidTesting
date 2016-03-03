package com.mobileappsco.training.day7;

import com.mobileappsco.training.day7.testPackage.FT_Math;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by admin on 3/3/2016.
 */
public class FT_Test {

    @Test
    public void addTest() {
        FT_Math fM = new FT_Math();
        assertEquals(7, fM.ftAdd(3,4));
    }

    @Test
    public void multiTest() {
        FT_Math fM = new FT_Math();
        assertEquals(12, fM.ftMulti(3,4));
    }
}
