package coda.expamle.com.danyuanceshi;

import junit.framework.Assert;

import static org.junit.Assert.*;

/**
 * Created by ASUS-PC on 2017/7/10.
 */
public class CalucalterTestTest {
    Calucalter calucalter=new Calucalter();
@org.junit.Test
    public  void testAdd(){
        int a=1;
        int b=2;
        int result = calucalter.add(a, b);

        Assert.assertEquals(result,3);
    }

}