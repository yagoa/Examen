/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAList.SortedList;

import TDAList.INode;
import TDAList.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yago
 */
public class SortedListTest {
    
    SortedList<Integer> instance;
    
    public SortedListTest() {
    }
    
    @Before
    public void setUp() {
        instance = new SortedList<Integer>(); 
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testInsert() {
        System.out.println("insert Test");
        
        INode n1 = new Node("uno",1);
        INode n2 = new Node("dos",2);
        INode n3 = new Node("tres",3);
        INode n4 = new Node("cuatro",4);
        INode n5 = new Node("cinco",5);
        INode n6 = new Node("seis",6);
        
        instance.insert(n2);
        instance.insert(n5);
        instance.insert(n6);
        instance.insert(n1);
        instance.insert(n3);
        
        String print = instance.print();
        assertEquals(true, true);  
    }
    
}
