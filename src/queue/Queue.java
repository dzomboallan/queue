/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author hunnytaggy
 */
public class Queue {

    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    
    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1)%5;
        size++;
    }
    
    public int deQueue(){
        int data = queue[front];
        front = (front + 1)%5;
        size --;
        
        return data;
    } 
    
    public void show(){
        System.out.print("Elements :  ");
        for(int i=0; i<size; i++){
            System.out.print(queue[(front + i)%5] + " ");
        }
        
        System.out.println();
        
        for(int n : queue){
            System.out.print(n + " ");
        }
         
    }
    
    
}
