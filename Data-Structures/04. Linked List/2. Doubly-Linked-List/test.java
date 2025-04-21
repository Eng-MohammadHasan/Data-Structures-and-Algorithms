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
public class test {

    public static void main(String[] args) {
        DoubleyLinkedList x=new DoubleyLinkedList();
        x.addFirst(0);
        x.addLast(55);
        x.addLast(88);
        x.addFirst(99);
        //x.delLast();
      x.delIn(1);
      x.delIn(1);
      x.delIn(1);
      x.delIn(1);
      x.delIn(1);
        System.out.println(x.size);
       x.report();
        
      
    }
    
}
