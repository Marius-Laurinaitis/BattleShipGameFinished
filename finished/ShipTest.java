


/**
 * Write a description of class ShipTest here.
 * 
 * @author (Marius Laurinaitis) 
 * @version (13 03 2017)
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class ShipTest
{
     Ship test = new Submarine ();
    

       @Test
   public void Test1() {
       Ship test = new EmptySea ();
             assertNotNull(test) ;
       assertEquals( 1 ,test.getLength()) ;
        assertEquals( false ,test.isRealShip () )  ;
          assertEquals( "EmptySea" ,test.getShipType ( )) ;
                assertEquals( false ,test.shootAt (0,1 )) ;
               assertEquals( false ,test.isSunk()) ;
    }
    
          @Test
   public void Test2() {
       Ship test = new Destroyer ();
             assertNotNull(test) ;
       assertEquals( 2 ,test.getLength()) ;
       assertEquals( "Destroyer" ,test.getShipType ( )) ;
         assertEquals( true ,test.isRealShip () )  ;
       
    }
    
              @Test
   public void Test3() {
       Ship test = new Battleship ();
             assertNotNull(test) ;
       assertEquals( 4 ,test.getLength()) ;
            assertEquals( "Battleship" ,test.getShipType ( )) ;
         assertEquals( true ,test.isRealShip () )  ;
       
       
    }
    
    
                 @Test
   public void Test4() {
       Ship test = new Cruiser ();
             assertNotNull(test) ;
       assertEquals( 3 ,test.getLength()) ;
           assertEquals( "Cruiser" ,test.getShipType ( )) ;
         assertEquals( true ,test.isRealShip () )  ;
       
    }
    
                    @Test
   public void Test5() {
       Ship test = new Submarine ();
             assertNotNull(test) ;
       assertEquals( 1 ,test.getLength()) ;
         assertEquals( "Submarine" ,test.getShipType ( )) ;
         assertEquals( true ,test.isRealShip () )  ;
       
    }
    
                    @Test
   public void Test6() {
       
       assertEquals( false ,test. hitArray()[0] ) ;
    
    }
    
       
                    @Test
   public void Test7() {
               
       test.position(3);
       assertEquals( 3 ,test.positionPos ( ) ) ;
       
       
    }
    
              @Test(expected = IndexOutOfBoundsException.class) 
   public void Test8() {

               
       test.position(-1);
     
        
    }
    
                       @Test(expected = IndexOutOfBoundsException.class)  
   public void Test9() {
         
             
       test.setBowRow(-1);
    
       
       
    }
    
       @Test(expected = IndexOutOfBoundsException.class) 
                           
   public void Test10() {
          
           
       test.setBowColumn(-1);
     
       
       
    }
           
                    @Test
   public void Test11() {
         
       test.setHorizontal(true);
       assertEquals( true ,test.isHorizontal ( ) ) ;
       
       
    }
    
                      @Test
   public void Test12() {
       
       test.setHorizontal(false);
       assertEquals( false ,test.isHorizontal ( ) ) ;
       
       
    }
    
                         @Test
   public void Test13() {
        
       assertEquals( true ,test.shootAt(0,0) ) ;
        
        
    }
    
    
                      @Test(expected = IndexOutOfBoundsException.class) 
   public void Test14() {
          
       test.shootAt(-100,0)  ;
        
        
    }
  
        
                      @Test(expected = IndexOutOfBoundsException.class) 
   public void Test15() {
       
       test.shootAt(-100,100)  ;
        
        
    }
    
                        @Test
   public void Test16() {
      
       test.shootAt(0,0);
       assertEquals( true ,test. hitArray()[0] ) ;
       
       
    }
    
    
    
                          @Test
   public void Test117() {
        
       assertEquals( false ,test.isSunk() ) ;
        
        
    }

    
    
    
    
    
    
    
    
    
}
