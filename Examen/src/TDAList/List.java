/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAList;

/**
 *
 * @author yago
 */
public class List <E> implements IList<E>  {
    
    protected INode<E> primero;

    public List() 
    {
        primero = null;
    }

    public List(INode<E> unNodo) 
    {
        this.primero = unNodo;
    }

    @Override
    public void insert(INode<E> unNodo) 
    {
        if (isEmpty())
        {
            primero = unNodo;
        } 
        else 
        {
            INode<E> aux = primero;
            while (aux.getNext()!= null) 
            {
                aux = aux.getNext();
            }
            aux.setNext(unNodo);
            unNodo.setPrev(aux);
        }
    }

    @Override
    public INode<E> search(Comparable key) 
    {
        INode<E> result = null;      
        if (!isEmpty()) 
        {
            INode<E> aux = primero;
            while (aux != null)
            {
                if (aux.getTag().equals(key)) 
                {
                    return aux;
                }
                aux = aux.getNext();
            }
        }     
        return result;
    }

    @Override
    public boolean remove(Comparable key) 
    {
        if (isEmpty())  return false;
        
        INode<E> lToRemove = this.search(key);   
        
        if(lToRemove == null) {return false;}
        
        INode<E> lToRemovePrev = lToRemove.getPrev();
        INode<E> lToRemoveNext = lToRemove.getNext();

        if(lToRemovePrev != null)
            lToRemovePrev.setNext(lToRemove.getNext());
        else
            this.primero = lToRemoveNext;
        
        if(lToRemoveNext != null)
            lToRemoveNext.setPrev(lToRemove.getPrev());

        lToRemove.setNext(null);
        lToRemove.setPrev(null);     
        return true;
    }

    @Override
    public String print() 
    {
        String aux = "";
        if (!isEmpty()) 
        {
            INode<E> temp = primero;
            
            while (temp != null) 
            {
                temp.printTag();
                temp = temp.getNext();
            }
        }
        return aux;
    }

    @Override
    public String print(String separador) 
    {
        String aux = "";
        if (!isEmpty()) 
        {
            INode<E> temp = primero;
            aux = temp.getData().toString();
            while (temp.getNext()!= null) 
            {
                aux = aux + separador + temp.getNext().getData().toString();
                temp = temp.getNext();
            }
        }     
        return aux;
    }

    @Override
    public int count() 
    {
        int count = 0;
        if (!isEmpty()) 
        {
            INode aux = primero;
            while (aux != null) 
            {
                count++;
                aux = aux.getNext();
            }
        } 
        
        return count;
    }

    @Override
    public boolean isEmpty() 
    {
        return primero == null;
    }

    @Override
    public INode<E> getFirst() 
    {
        return primero;
    }
    
    @Override
    public void append(IList<E> listToAppend)
    {
        INode<E> node = this.getFirst();
        if (node != null)
        {
            while (node.getNext()!= null)
            {
                node = node.getNext();
            }           
            node.setNext(listToAppend.getFirst());      
        } 
        else 
        {
            this.primero = listToAppend.getFirst();
        }        
    }
    
    @Override
    public void Sort()
    {
        if(!this.isEmpty())
        {
            IList<E> sortedList = new List<E>();                       
            while(!this.isEmpty())
            {
                INode minor = this.getFirst();       
                
                // busca el nodo mas chico de la lista y lo agrega como el primero de la nueva
                for(INode current = this.getFirst(); current != null; current = current.getNext()){                                     
                    if(minor.getTag().compareTo(current.getTag()) > 1) {
                        minor = current;
                    }
                }
                
                this.remove(minor.getTag());
                minor.setNext(null);
                sortedList.insert(minor);
            }
           
            this.primero = sortedList.getFirst();
        }
    }
}
