package stack;

class QNode {
    int key;
    QNode next;

    // constructor to create a new linked list node
    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

class StackLL   {

    QNode top;

    public void push(Integer value)  {

        QNode temp = new QNode(value);

        if ( top == null )   {
            top = temp;
        }
        else    {
            QNode t = top;
            top = temp;
            top.next= t;
        }
    }

    public QNode pop()  {

        if (top == null) {
            return null;
        }
        else    {
            QNode temp = top;
            top = top.next;
            return temp;
        }
    }

    void printStack()    {

        QNode temp = top;
        System.out.println("printing Stack...");
        while(temp!=null) {
            System.out.println(temp.key);
            temp = temp.next;
        }
        System.out.println("printing Stack finished");
    }
}

public class StackUsingLL {

    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(10);
        s.push(20);
        s.printStack();
        System.out.println("Popped item is " + s.pop().key);
        s.printStack();
        s.push(30);
        s.push(40);
        s.push(50);
        s.printStack();
        System.out.println("Popped item is " + s.pop().key);
        s.printStack();
    }
}

