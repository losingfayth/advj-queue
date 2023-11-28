package edu.bloomu;

/**
 * Test Driver for Queue
 *
 * @author fayth quinn
 */
public class App 
{
    public static void main( String[] args )
    {
        Queue<String> q1 = new Queue<>();
        Queue<Integer> q2 = new Queue<>();

        q1.queue("Hello");
        q1.queue("Goodbye");
        q1.queue("What's Up");
        q1.queue("No Thanks");

        System.out.println(q1.empty());
        System.out.println(q2.empty());
        System.out.println(q1.size());
        System.out.println(q2.size());

        System.out.println(q1.contains("Hello"));
        System.out.println(q1.contains("Hallo"));
        System.out.println(q2.contains(7));


        System.out.println(q1.deQueue());
        System.out.println(q1.peek());
        System.out.println(q1.deQueue());
        System.out.println(q1.deQueue());

        q1.queue("Hello");
        q1.queue("Goodbye");
        q1.queue("What's Up");
        q1.queue("No Thanks");

        q1.clear();
        System.out.println(q1.empty());
    }
}
