import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSum {
    @Test 
    public void TestCase001()
    {
        // arrange
        SumCal base = new SumCal();
        double expectation = 1.7187719275874787770135214520444;
        // act
        double result = base.calculation(3,0);
        // assert
        assertEquals(expectation, result , 1);
    }
    // Testing a(nom) = 3 and b(min) = 1 value
    @Test 
    public void TestCase002()
    {
        // arrange
        SumCal base = new SumCal();        
        double expectation = 1.8205642030260802643794210547055;
        // act
        double result = base.calculation(3,1);
        // assert
        assertEquals(expectation, result , 1);
    }
    // Testing a(nom) = 3 and b(min +) = 2 value
    @Test 
    public void TestCase003()
    {
        // arrange
        SumCal base = new SumCal();
        double expectation = 1.9036539387158784898961472881191; 
        //act       
        double result = base.calculation(3,2);
        // assert
        assertEquals(expectation, result , 1);
    }
    // Testing a(nom) = 3 and b(max - ) = 3 value
    @Test 
    public void TestCase004()
    {
        // arrange
        SumCal base = new SumCal();
        double expectation = 1.9743504858348198426728361724085;        
        // act
        double result = base.calculation(3,3);
        // assert
        assertEquals(expectation, result , 1);
    }
    // Testing a(nom) = 3 and b(max  ) = 4 value
    @Test 
    public void TestCase005()
    {
        // arrange
        SumCal base = new SumCal();
        double expectation = 2.0361680046403980173608741641453;        
        // act
        double result = base.calculation(3,4);
        // assert
        assertEquals(expectation, result , 1);
    }
    // Testing a(nom) = 3 and b(max + ) = 5 value
    @Test 
    public void TestCase006()
    {
        // arrange
        SumCal base = new SumCal();
        double expectation = 2.091279105182546461305970582441;        
        // act
        double result = base.calculation(3,5);
        // assert
        assertEquals(expectation, result , 1);
    }
    // Testing a( min - ) = 0 and b(nom) = 2 value
    @Test 
    public void TestCase007()
    {
        // arrange
        SumCal base = new SumCal();
        double expectation = 1.5848931924611134852021013733915;        
        // act
        double result = base.calculation(0,2);
        // assert
        assertEquals(expectation, result , 1);
    }
     // Testing a( min ) = 1 and b(nom) = 2 value
     @Test 
     public void TestCase008()
     {
         // arrange
         SumCal base = new SumCal();
         double expectation = 1.7187719275874787770135214520444;         
        // act
         double result = base.calculation(1,2);
         // assert
         assertEquals(expectation, result , 0);
     }
      // Testing a( min + ) = 2 and b(nom) = 2 value
      @Test 
      public void TestCase009()
      {
          // arrange
          SumCal base = new SumCal();
          double expectation = 1.8205642030260802643794210547055;           
          // act
          double result = base.calculation(2,2);
          // assert
          assertEquals(expectation, result , 0);
      }
      // Testing a( max - ) = 4 and b(nom) = 2 value
      @Test 
      public void TestCase010()
      {
          // arrange
          SumCal base = new SumCal();
          double expectation = 1.9743504858348198426728361724085;          
          // act
          double result = base.calculation(4,2);
          // assert
          assertEquals(expectation, result , 1);
      }
       // Testing a( max ) = 5 and b(nom) = 2 value
       @Test 
       public void TestCase011()
       {
           // arrange
           SumCal base = new SumCal();
           double expectation = 2.0361680046403980173608741641453;           
           // act
           double result = base.calculation(5,2);
           // assert
           assertEquals(expectation, result , 1);
       }
       // Testing a( max + ) = 6 and b(nom) = 2 value
       @Test 
       public void TestCase012()
       {
           // arrange
           SumCal base = new SumCal();
           double expectation = 2.091279105182546461305970582441;
           // act
           double result = base.calculation(6,2);
           // assert
           assertEquals(expectation, result , 1);
       }
        // Testing a( nom ) = 3 and b(nom) = 2 value
        @Test 
        public void TestCase013()
        {
            // arrange
            SumCal base = new SumCal();
            double expectation = 1.9036539387158784898961472881191;
            // act
            double result = base.calculation(3,2);
            // assert
            assertEquals(expectation, result , 1);
        }
}