public class MyStack extends AbstractStack{
    public MyStack(int capacity){
        super(capacity);
    }
    public void displayStack(String s){
        System.out.println(s);
        System.out.println("Stack (bottom-->):");
        for (int i = 0; i < size(); i++){
            System.out.println(peekN(i));
            System.out.println(' ');
        }
    }
    public int peekN(int n){
        return arr[n];
    }
}


