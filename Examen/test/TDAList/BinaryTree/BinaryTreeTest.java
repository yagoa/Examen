/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAList.BinaryTree;

import TDAList.IList;
import TDAList.INode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yago
 */
public class BinaryTreeTest {
    
    IBinaryTree<Integer> instance;
    
    public BinaryTreeTest() {
    }
    
    
    @Before
    public void setUp() {
        instance = new  BinaryTree<Integer>();
    }
 
    
    @Test
    public void testHeigth() {
        
        ITreeNode root = new TreeNode(2,2);
        ITreeNode left = new TreeNode(1,1);
        ITreeNode rigth = new TreeNode(3,3);
        ITreeNode rigth2 = new TreeNode(4,4);
        ITreeNode rigth3 = new TreeNode(5,5);
        
        assertTrue(instance.add(root));
        assertTrue(instance.add(left));
        assertTrue(instance.add(rigth));
        assertTrue(instance.add(rigth2));
        assertTrue(instance.add(rigth3));
        assertFalse(instance.isEmpty());

        assertEquals(instance.heigth(), 4);
    }
    
    
   @Test
    public void testSize() {
        
        ITreeNode root = new TreeNode(2,2);
        ITreeNode left = new TreeNode(1,1);
        ITreeNode rigth = new TreeNode(3,3);

        assertTrue(instance.add(root));
        assertTrue(instance.add(left));
        assertTrue(instance.add(rigth));
        assertFalse(instance.isEmpty());

        assertEquals(instance.size(), 3);
    }
    

    @Test
    public void testAdd() {
        
        ITreeNode root = new TreeNode(2,2);
        ITreeNode left = new TreeNode(1,1);
        ITreeNode rigth = new TreeNode(3,3);

        assertTrue(instance.add(root));
        assertTrue(instance.add(left));
        assertTrue(instance.add(rigth));
        assertFalse(instance.isEmpty());

        ITreeNode rootSearch = instance.search(2);

        assertEquals(rootSearch.getLeftSon(), left);
        assertEquals(rootSearch.getRigthSon(), rigth);  

    }

    @Test
    public void testSearch() {
        
        instance.add( new TreeNode(2,2));
        instance.add(new TreeNode(1,1));
        instance.add(new TreeNode(3,3));
        
        ITreeNode search = instance.search(2);
        assertEquals(search.getData(), 2);  
        
        search = instance.search(1);
        assertEquals(search.getData(), 1); 
        
        search = instance.search(3);
        assertEquals(search.getData(), 3); 
    }

    @Test
    public void testDelete() {
        instance.add( new TreeNode(2,2));
        instance.add(new TreeNode(1,1));
        instance.add(new TreeNode(3,3));
        
        instance.delete(1);
        ITreeNode search = instance.search(1);
        assertNull(search);  
        
        instance.delete(3);
        search = instance.search(3);
        assertNull(search);  
        
        search = instance.search(2);
        assertEquals(search.getData(), 2); 
    }

    @Test
    public void testPreOrden() {
        instance.add( new TreeNode(2,2));
        instance.add(new TreeNode(1,1));
        instance.add(new TreeNode(3,3));
        
        IList list = instance.preOrden();
        System.out.println("PreOrden");
        System.out.println(list.print(","));
        System.out.println("-------------------------");
        
        assertTrue(true);
    }

    @Test
    public void testInOrden() {
        instance.add( new TreeNode(2,2));
        instance.add(new TreeNode(1,1));
        instance.add(new TreeNode(3,3));
        
        IList list = instance.inOrden();
        System.out.println("testInOrden");
        System.out.println(list.print(","));
        System.out.println("-------------------------");
        
        assertTrue(true);
    }

    @Test
    public void testPostOrden() {
        instance.add( new TreeNode(2,2));
        instance.add(new TreeNode(1,1));
        instance.add(new TreeNode(3,3));
        
        IList list = instance.postOrden();
        System.out.println("postOrden");
        System.out.println(list.print(","));
        System.out.println("-------------------------");
        
        assertTrue(true);
    }

    @Test
    public void testClear() {    
        instance.add( new TreeNode(2,2));
        instance.add(new TreeNode(1,1));
        instance.add(new TreeNode(3,3));
        
        assertTrue(instance.clear());       
        assertTrue(instance.isEmpty());
              
        ITreeNode search = instance.search(2);
        assertNull(search);  
    }

    @Test
    public void testIsEmpty() {
        instance.add( new TreeNode(2,2)); 
        assertFalse(instance.isEmpty());
          
        instance.clear();
        assertTrue(instance.isEmpty());   
    }
    
}
