package DSA;

public class Stack {

    public boolean isEmpty = true;

    public boolean isFull;

    int elements[];

    int size;

    int top;

    public Stack(int size) {
        this.elements = new int [size];
        this.size = size;
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }


    public void push(int item) {
        if (!isFull()) {
            top++;
            elements[top] = item;

        } else {
            System.out.println("Stack is full !");
        }

    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public int pop() throws Exception {
        int popped = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                popped = elements[i - 1];
                elements[i-1] = 0;
                break;
            }else if(elements[elements.length-1] != 0) {
                popped = elements[elements.length - 1];
                elements[elements.length - 1] = 0;
                break;
            }
//            else {
//                throw new Exception("Stack is empty !");
////                return -1;
//            }
        }
            return popped;


//        if (!isEmpty()) {
//            int returnedTop = top;
//            top--;
//           // System.out.println("Popped element :" + elements[returnedTop]);
//            return elements[returnedTop];
//
        }

    public int peep() {
        return elements[elements.length-1];


        }

    public int search(int item) {
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == item){
                return i + 1;
            }
        }
        return -1;
    }
}
//    }

