import java.util.LinkedList;
/*
Реализуйте очередь с помощью LinkedList со следующими методами:enqueue()
- помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */

public class MyQueue {
    LinkedList<Integer> linkedList;

    MyQueue(){
        linkedList = new LinkedList<>();
    }

   void enqueue(int element){
       linkedList.offerLast(element);
    }



    int dequeue(){
        int val = linkedList.get(0);
        linkedList.pollFirst();
        return val;
    }
    int first(){
        int val = linkedList.get(0);
        return val;
    }


}
