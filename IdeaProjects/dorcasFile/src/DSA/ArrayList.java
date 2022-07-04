package DSA;

import java.util.Objects;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private int size;

    private String[] elements = new String[5];


    @Override
    public boolean isEmpty() {
//        if (size == 0) return true;
        return size == 0;
    }

    @Override
    public void add(String item) {
        elements[size++] = item;
//        isEmpty = false;
//        size++;
    }



    @Override
    public void remove(String item) {
      String[] newElement = new String[elements.length];
        for (int i = 0; i < newElement.length; i++) {
            for (String value : elements ){
                if (!Objects.equals(value, item)){
                    newElement[i] = value;
                    i++;
                }

        }
        }
        elements = newElement;
        --size;
//       if (size == 0) isEmpty = true;

    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public String getIndex(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {

        return elements.length;
    }


}
