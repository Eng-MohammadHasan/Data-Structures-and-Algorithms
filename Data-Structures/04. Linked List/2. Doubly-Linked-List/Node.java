/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleylinkedlist;

/**
 *
 * @author Ali
 */
public class Node {
    public Node next;
    public Node prev;
    public int element;
    
    public Node(int data){
       next=null;
       prev=null;
       element=data ;
       
       
    
    }
    
}
