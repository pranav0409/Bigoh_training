package com.pranav.blockingQueue;

import java.util.concurrent.BlockingQueue ;
import java.util.concurrent.ArrayBlockingQueue ;
public class example {
    public static void main( String[ ] args ) {
        // declaring the BlockingQueue of ' bounded ' nature using ArrayBlockingQueue
        BlockingQueue< String > alph = new ArrayBlockingQueue< >( 3 ) ;
        try {
            // Insert element to blocking queue
            alph.put( " A " ) ;
            alph.put( " B " ) ;
            alph.put( " C " ) ;

//            alph.put( " E " ) ;
//            alph.put( " F " ) ;
            //alph.put( " G " ) ;
            System.out.println( " Content of BLockingQueue : " + alph ) ;
            // deleting some elements from the queue
            String temp = alph.take( ) ;
//            String temp1 = alph.take( ) ;
//            String temp2 = alph.take( ) ;
            System.out.println( " The number removed is : " + temp ) ;

           alph.put( " d " ) ;
            // BlockingQueue after deleting one element
            System.out.println( " Content of BLockingQueue after deleting one element : " + alph ) ;
        }
        catch( Exception e ) {
            e.getStackTrace( ) ;
        }
    }
}
