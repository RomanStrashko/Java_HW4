import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class program {
    public static void main(String[] args) {
        ex1();

    }
    static void ex0(){
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
         */
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        System.out.println(list);
        ex0_1(list);
    }
    static void ex0_1(LinkedList<Integer> list){
        LinkedList<Integer> list1 = new LinkedList<>();
        for (Integer integer: list){
            list1.addFirst(integer);
        }
        System.out.println(list1);


    }
    static void ex1(){
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:enqueue()
        - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
        MyQueue queue = new MyQueue();
        queue.enqueue(5);
        queue.enqueue(23);
        queue.enqueue(4);
        System.out.println(queue.linkedList);
        System.out.println(queue.dequeue());
        System.out.println(queue.linkedList);
        System.out.println(queue.first());
        System.out.println(queue.linkedList);

    }
    static void ex2(){
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */

        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

//        for (Integer i: list){
//            i = random.nextInt(10);
//            list.add(i);
//        }
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        list.add(random.nextInt(10));
        System.out.println(list);

        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            iterator.remove();
            sum += integer;
        }
        System.out.println("Сумма элементов массива равна" + " " + sum);
    }
}
