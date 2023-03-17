package ASD.Stack.Array;

public class Main {
    public static void main(String[] args) {
        StackArray tumpukanArray = new StackArray(5);
        tumpukanArray.push(100);
        tumpukanArray.push(300);
        tumpukanArray.push(200);
        tumpukanArray.push(500);
        tumpukanArray.push(700);
        tumpukanArray.pop();
        tumpukanArray.pop();
        tumpukanArray.pop();
        tumpukanArray.pop();
        tumpukanArray.pop();
        tumpukanArray.pop();

        tumpukanArray.print();
    }
}
