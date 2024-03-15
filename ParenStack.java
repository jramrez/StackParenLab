import java.util.ArrayList;

public class ParenStack {
    ArrayList<Character> stackList = new ArrayList<Character>();
    
    public ParenStack() {}  // homemade Stack class 

    public void push(char p){
        stackList.add(0, p);
    }
    public char pop(){
        char r = stackList.get(0);
        stackList.remove(0);
        return r;
    }
    public char peek(){
        char r = stackList.get(0);
        return r;
    }
}
