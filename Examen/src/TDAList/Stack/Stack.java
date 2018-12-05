/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAList.Stack;

import TDAList.INode;
import TDAList.List;

/**
 *
 * @author yago
 */
public class Stack<E> extends List<E> {
    INode <E> ultimo = null;
    
    public void Push(INode<E> unNodo){
        if(this.isEmpty()){
            this.primero = unNodo;
            this.ultimo = unNodo;
        }
        
        
        ultimo.setNext(unNodo);
        unNodo.setPrev(ultimo);
        ultimo = unNodo;
    }
    
    public INode<E>  Pop(){
        if(this.isEmpty())
            return null;
        
        INode aux = ultimo;     
        ultimo = ultimo.getPrev();      
        this.remove(aux.getTag());        
        return aux;
    }
}
