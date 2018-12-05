/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAList.BinaryTree;

import TDAList.IList;
import TDAList.Node;

/**
 *
 * @author yago
 */
public class TreeNode<T> implements ITreeNode  {
   
    private T data;
    private Comparable tag;
    
    private ITreeNode<T> rigth;
    private ITreeNode<T> left;
    
    public TreeNode(T Data,Comparable Tag) {
        tag = Tag;
        data = Data;
    }
    
    public TreeNode(T Data,Comparable Tag, ITreeNode<T> Left, ITreeNode<T> Rigth) {
        tag = Tag;
        data = Data;
        left = Left;
        rigth = Rigth;
    }

    @Override
    public T getData() {
        return data;
    }
    
    @Override
    public Comparable getTag() {
       return tag;
    }

    @Override
    public ITreeNode getLeftSon() {
        return this.left;
    }

    @Override
    public ITreeNode getRigthSon() {
        return this.rigth;
    }

    @Override
    public void setLeftSon(ITreeNode node) {
        this.left = node;
    }

    @Override
    public void setRigthSon(ITreeNode node) {
       this.rigth = node;
    }
    
    
    
    
    
    
    


    @Override
    public ITreeNode search(Comparable tag) {
        if(this.tag.compareTo(tag) == 0){
            return this;
        }      
        if(tag.compareTo(this.tag) < 0 && this.left != null){
            return this.left.search(tag);
        }
        else if (tag.compareTo(this.tag) > 0 && this.rigth != null){
            return this.rigth.search(tag);
        }
        else{
            return null;
        }
    }

    @Override
    public boolean add(ITreeNode node) {
       if(node.getTag().compareTo(tag) > 0)
       {
           if(this.rigth == null)
           {
               this.rigth = node;
               return true;
           }
           else
           {
               return this.rigth.add(node);
           }
       }
       else if(node.getTag().compareTo(tag) < 0)
       {
           if(this.left == null)
           {
               this.left = node;
               return true;
           }
           else
           {
               return this.add(node);
           }
       }
       else
           return false;
    }

    @Override
    public void preOrden(IList unaLista) {
        unaLista.insert(new Node(this.data, this.tag));
        
        if(this.left != null){
            this.left.preOrden(unaLista);
        }
        if(this.rigth != null){
            this.rigth.preOrden(unaLista);
        }
    }

    @Override
    public void inOrden(IList unaLista) {
        if(this.left != null){
            this.left.preOrden(unaLista);
        }  
        unaLista.insert(new Node(this.data, this.tag)); 
        
        if(this.rigth != null){
            this.rigth.preOrden(unaLista);
        }
    }

    @Override
    public void postOrden(IList unaLista) {
        if(this.left != null){
            this.left.preOrden(unaLista);
        }  
        if(this.rigth != null){
            this.rigth.preOrden(unaLista);
        }
        
        unaLista.insert(new Node(this.data, this.tag)); 
    }

    @Override
    public ITreeNode delete(Comparable mtag)
    {
        if (mtag.compareTo(this.tag) < 0) 
        {
            if (this.left != null) {
                this.left = left.delete(mtag);
            }
            return this;
        }

        if (mtag.compareTo(this.tag) > 0) 
        {
            if (this.rigth != null) {
                this.rigth = rigth.delete(mtag);

            }
            return this;
        }

        return deleteNode();
    }
    
    
    @Override
    public int size(ITreeNode node){
        if(node == null){
            return 0;
        }
        
        return 1 + size(node.getLeftSon()) + size(node.getRigthSon());
    }
    
    @Override
    public int heigth(ITreeNode node){
        if(node == null)
            return 0;
        
        return 1 + Math.max(heigth(node.getLeftSon()), heigth(node.getRigthSon()));
    }
    

    private ITreeNode deleteNode() 
    {
        if (left == null) {
            return rigth;
        }

        if (rigth == null) {
            return left;
        }

        ITreeNode elHijo = left;
        ITreeNode elPadre = this;

        while (elHijo.getRigthSon() != null) {
            elPadre = elHijo;
            elHijo = elHijo.getRigthSon();
        }

        if (elPadre != this) {
            elPadre.setRigthSon(elHijo.getLeftSon());
            elHijo.setLeftSon(left);
        }

        elHijo.setRigthSon(rigth);
        return elHijo;
    }
}
