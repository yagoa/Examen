/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAList.SortedList;

import TDAList.IList;
import TDAList.INode;
import TDAList.List;

/**
 *
 * @author yago
 */
public class SortedList<E> extends List<E> {

    @Override
    public void insert(INode<E> unNodo) 
    {
        if (isEmpty()){
            primero = unNodo;
            return;
        }
        
        if(unNodo.getTag().compareTo(primero.getTag()) < 0){
            unNodo.setNext(primero);
            primero = unNodo;
            return;
        }

        INode<E> prev = null;
        for(INode current = primero; current != null; current = current.getNext()){         
            INode next = current.getNext();
            if(next != null){
                if(current.getTag().compareTo(unNodo.getTag()) < 0 && next.getTag().compareTo(unNodo.getTag()) > 0)
                {
                    current.setNext(unNodo);
                    unNodo.setNext(next);
                    return;
                }
            }
            else{
                current.setNext(unNodo);
                return;
            }
                     
            prev = current;
        }
    }
}
