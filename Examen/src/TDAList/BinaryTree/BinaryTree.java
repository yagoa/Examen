/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAList.BinaryTree;

import TDAList.IList;
import TDAList.List;

/**
 *
 * @author yago
 */
public class BinaryTree<T> implements IBinaryTree<T> {

    private ITreeNode<T> root;
    
    public BinaryTree() {
        root = null;
    }
      
    public BinaryTree(ITreeNode<T> Root)
    {
        this.root = root;
    }
    
    @Override
    public boolean add(ITreeNode node) {
        if(this.isEmpty())
        {
            this.root = node;
            return true;
        }
        return this.root.add(node);
    }

    @Override
    public ITreeNode search(Comparable tag) {
        if(this.isEmpty()){
            return null;
        }
        return root.search(tag);
    }

    @Override
    public void delete(Comparable tag) {
        if(!this.isEmpty()){
            this.root.delete(tag);
        }
    }
    
    @Override
    public IList<T> preOrden() {
        IList<T> list = new List<T>();     
        if(!this.isEmpty()){
            this.root.preOrden(list);
        }    
        return list;
    }

    @Override
    public IList<T> inOrden() {
        IList<T> list = new List<T>();     
        if(!this.isEmpty()){
            this.root.inOrden(list);
        }    
        return list;
    }

    @Override
    public IList<T> postOrden() {
        IList<T> list = new List<T>();     
        if(!this.isEmpty()){
            this.root.postOrden(list);
        }    
        return list;
    }

    @Override
    public boolean clear() {
        if (!isEmpty()) 
        {
            root = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (root == null);
    }
    
    @Override
    public int size(){
        if(this.isEmpty()){
            return 0;
        }
        else{
            return root.size(root);
        }
    }
    
    @Override
    public int heigth(){
        if(this.isEmpty()){
            return 0;
        }
        return root.heigth(root);
    }
    
    @Override
    public ITreeNode findMin() throws UnsupportedOperationException
    {
        if(this.isEmpty()){
            throw new UnsupportedOperationException("The tree is empty");
        }
        
        return root.findMin(root);
    }
    
    @Override
    public ITreeNode findMax() throws UnsupportedOperationException
    {
        if(this.isEmpty()){
            throw new UnsupportedOperationException("The tree is empty");
        }
        
        return root.findMax(root);
    }
}
