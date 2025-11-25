import java.util.*;
public class DemoIterator{
    //iterator and ListIterator
public static void main(String[] args){
    ArrayList list=new ArrayList();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);
    System.out.println(list);

    //calling the Iterator Interface
    Iterator iterator=list.iterator();
    System.out.println("Forward Traversal");
    while(iterator.hasNext()){
        System.out.print(iterator.next()+" ");


    }
    System.out.println();
    iterator.remove();
    System.out.println(list);
    
//ListIterator  Interface
    ListIterator listIterator=list.listIterator();
    System.out.println("Forward Traversal");
    while(listIterator.hasNext()){
        System.out.print(listIterator.next()+" ");
    }
    System.out.println();
    System.out.println("Backward Traversal");
    while(listIterator.hasPrevious()){
        System.out.print(listIterator.previous()+" ");
    }

//Linked list iteration
LinkedList linkedlist=new LinkedList();
linkedlist.add(100);
linkedlist.add(200);
linkedlist.add(300);
System.out.println(linkedlist);
Iterator itr=linkedlist.iterator();
while(itr.hasNext()){
    System.out.print(itr.next()+" ");
}

}}