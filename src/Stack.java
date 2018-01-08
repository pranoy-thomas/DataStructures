/**
 * @Author : Pranoy Thomas
 */
public class Stack {

    private Integer top;
    private static Integer MAX;
    private static Integer MIN;
    private Integer stack[];

    Stack() {
        MIN = - 1;
        MAX = 1000;
        top = MIN;
        stack = new Integer[MAX];
    }

    public void push( int x )  {

        // check overflow
        if ( top > MAX )    {

            System.out.println("Stack Overflow");
        }
        else    {

            stack[++top] = x;
        }
    }

    public Integer pop()  {

        //check Underflow
        if ( top < MIN )    {

            System.out.println("Stack Underflow");
            return null;
        }
        else    {

            Integer x = stack[top--];
            return x;
        }
    }

    public boolean isEmpty()    {

        return top < 0 ;
    }

    public void displayStack()  {

        for (int i=top ; i >=0 ;i --)   {

            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println("Is stack empty: "+ stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("After push, stack: ");

        stack.displayStack();

        stack.pop(); stack.pop(); stack.pop();

        System.out.println("After pop: ");

        stack.displayStack();

        System.out.println("Is stack empty: "+ stack.isEmpty());
    }
}
