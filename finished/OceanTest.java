


/**
 * Write a description of class OceanTest here.
 * 
 * @author (Marius Laurinaitis) 
 * @version (12 04 2017 )
 */




import org.junit.Test;
import static org.junit.Assert.*;


public class    OceanTest {
Ocean test = new Ocean() ;
   
   
    
  
     
                @Test
    public void  test1( )
    
    {
              
               assertNotNull( test) ;
     
          
    }
  
     @Test(timeout=2000)
    public void  test2( )
    
    {
                test.placeAllShipsRandomly();
             
    }
    
       
    @Test(timeout=2000)
    public void  test3( )
    
    {
       Ship flotila [] = {new Battleship (),new Cruiser(),new Cruiser(), new Destroyer (),new Destroyer (),new Destroyer (), new Submarine(), new Submarine(),new Submarine(),new Submarine() };
            for ( int jj =0; jj <flotila.length; jj++ )
         {    
            assertEquals (true , test.place ( flotila [jj]) ) ;
        }
                
             
    }
        
      @Test(expected = IllegalArgumentException.class) 
    public void  test4( )
    
    {
        
                test.place(null );
             
    }
    
       
      @Test
    public void  test5( )
    
    {
        test.placeAllShipsRandomly();
        for (int i =0 ;i <10 ; i++ )
              for (int j =0 ;j <10 ; j++ )
              {
                  
                     assertEquals (true,   test.indexPositions (i,j)== (0) || test.indexPositions (i,j)== (1) || test.indexPositions (i,j)== (2) || test.indexPositions (i,j)== (3)  ) ; 
                  
                
                  
                  
                }
             
    }
    
      
     @Test(expected = IndexOutOfBoundsException.class) 
    public void  test6( )
    
    {
         assertEquals(IndexOutOfBoundsException.class ,  test.indexPositions(0,-2 )) ;
    }
          
     @Test(expected = IndexOutOfBoundsException.class) 
    public void  test7( )
    
    {
           assertEquals(IndexOutOfBoundsException.class ,  test.indexPositions(10,0 )) ;
    }
    
           @Test(expected = IndexOutOfBoundsException.class) 
    public void  test8( )
    
    {
        test.placeAllShipsRandomly();
        
            assertEquals(false ,  test.extraPoints(0,-2  )) ;
       
             
    }
    
             @Test(expected = IndexOutOfBoundsException.class) 
    public void  test9( )
    
    {
        test.placeAllShipsRandomly();
            assertEquals(false ,  test.extraPoints(0,10 )) ;    
    }
    
    
    
    
              @Test(expected = IndexOutOfBoundsException.class) 
    public void  test10( )
    
    {
        test.placeAllShipsRandomly();
        
            assertEquals(false ,  test.pointCheck(0,-2  )) ;
       
             
    }
    
        
              @Test(expected = IndexOutOfBoundsException.class) 
    public void  test11( )
    
    {
        test.placeAllShipsRandomly();
        
            assertEquals(false ,  test.pointCheck(0,20  )) ;
       
             
    }
    
                  @Test(expected = IndexOutOfBoundsException.class) 
    public void  test12( )
    
    {
        test.placeAllShipsRandomly();
        
            test.pointCheck(10,100  ) ;
       
             
    }
    
    
    
    
      @Test(expected = IndexOutOfBoundsException.class) 
    public void  test13( )
    {
           assertEquals(IndexOutOfBoundsException.class , test.shootAt(-1,-1) ) ;
       
          
    }
       
      @Test(expected = IndexOutOfBoundsException.class) 
    public void  test14( )
    {
           assertEquals(IndexOutOfBoundsException.class , test.shootAt(0,25) ) ;
       
          
    }
    
    
    
    
    
   @Test
    public void  test15( )
    
    {
        
             assertEquals(false , test.shootAt(1,1 ) ) ;
    }
    
       @Test(expected = IndexOutOfBoundsException.class) 
    public void  test16( )
    
    {
        
           assertEquals(IndexOutOfBoundsException.class , test.shootAt(-1,0) ) ; 
    }
    
  
    
     @Test(expected = IndexOutOfBoundsException.class) 
    public void  test17( )
    
    {
         assertEquals(IndexOutOfBoundsException.class ,  test.isOccupied(-5,0  )) ;
        
        
             
    }
    
         @Test(expected = IndexOutOfBoundsException.class) 
    public void  test18( )
    
    {
         assertEquals(IndexOutOfBoundsException.class ,  test.isOccupied(10,0  )) ;
        
        
             
    }

    
                     @Test
    public void  test19( )
    
  {
        test.placeAllShipsRandomly();
        
        for (int i =0 ;i <10 ; i++ )
              for (int j =0 ;j <10 ; j++ )
              {
        
            assertEquals( false ,  test.hasSunkShipAt (i,j) ) ;
       
             
            }        

}

                     @Test(expected = IndexOutOfBoundsException.class) 
    public void  test20( )
    
  {
            test.hasSunkShipAt (-10,0 ) ;
    }        

                        @Test(expected = IndexOutOfBoundsException.class) 
    public void  test21( )
    
  {
            test.hasSunkShipAt (0,245 ) ;
    }   



                
 @Test
            // check 4 methods     
    public void  test22( )
    
    {
        test.placeAllShipsRandomly();
        for (int i =0 ;i <10 ; i++ )
        {
              for (int j =0 ;j <10 ; j++ )
              {
        
              test.shootAt(i,j);
              test.hasSunkShipAt(i, j);
              
            }  
        }
        
         assertEquals( true ,  test.isGameOver () ) ;
            assertEquals( 100 ,  test.getShotsFired() ) ;
               assertEquals(20 ,  test. getHitCount ( )) ;
                    assertEquals(10 ,  test.getShipsSunk ()) ;
               
               
    }

    
                 @Test
    public void  test23( )
    
    {
          test.setShipSunk ( 7 ) ;
          assertTrue( test.getShipsSunk()==7 ) ;
               
         test.setShipSunk ( 0 ) ;
        assertTrue( test.getShipsSunk()==7) ;
              
    }

                   @Test(expected = IndexOutOfBoundsException.class)
    public void  test24( )
    
    {
       test.setShipSunk ( -1 ) ;   
    }

    
                     @Test(expected = IndexOutOfBoundsException.class)
    public void  test25( )
    
    {
       test.getShipTypeAt( -1,-100 ) ;   
    }

    
    
    
    
    
    
    
    
    

}


