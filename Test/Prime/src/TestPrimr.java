import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrimr {
 //arrange
 PrimeNumberCheck basecase = new PrimeNumberCheck();

    @Test
    public void TestMinimumMinusOneCase()
    {
        //arrange
       
        //act
        boolean result = basecase.Check(0);
        //assert
        assertEquals(true, result );
    }
    //Testing minimum = 1  value
    @Test
    public void TestMinimumCase()
    {
      
        //act
        boolean result = basecase.Check(1);
        //assert
        assertEquals(true ,result ) ;
    }
    //Testing ( minimum + 1 ) = 2 value
    @Test
    public void TestMimimumPlusOneCase()
    {
       
        //act
        boolean result = basecase.Check(2);
        //assert
        assertEquals(false, result );
    }
    //Testing nominal = 500 value
    @Test
    public void TestNominal()
    {
       
        //act
        boolean result = basecase.Check(500);
        //assert
        assertEquals( true, result);
    }
    //Testing ( maximum - 1 ) = 999 value
    @Test
    public void TestMaximumMinusOneCase()
    {
       
        //act
        boolean result = basecase.Check(999);
        //assert
        assertEquals( true, result);
    }
    //Testing maximum = 1000  value
    @Test
    public void TestMaximumCase()
    {
       
        //act
        boolean result = basecase.Check(1000);
        //assert
        assertEquals( true, result );
    }
    //Testing  ( maximum + 1 ) = 1001 value
    @Test
    public void TestMaximumPlusOneCase()
    {
       
        //act
        boolean result = basecase.Check(1001);
        //assert
        assertEquals( true, result);
    }
}