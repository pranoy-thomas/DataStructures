package stack;


public class ReverseNumberUsingStack {

    static Stack s = new Stack();


    private static double reverseNumber() {

        double reverse =0;

        for( int i =0 ; !s.isEmpty() ; i++  )    {

            reverse = reverse + ( s.pop() * Math.pow( 10 , i ) );
        }

        return reverse;
    }

    private static void pushToStack(Integer x) {

        while (x != 0)    {

            s.push( x % 10 );
            x = x /10;
        }
    }

    public static void main(String[] args) {

        Integer x = 35678;
        pushToStack(x);
        System.out.println(reverseNumber());
    }
}
