/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author hunnytaggy
 */
public class Runner {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(9);
        q.enQueue(8);
        
        q.deQueue();
        q.deQueue();
        
        q.enQueue(9);
        q.enQueue(1);
        
        q.show();
    }
    
}
