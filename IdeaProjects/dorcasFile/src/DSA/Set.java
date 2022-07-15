package DSA;

public class Set {
    private boolean isEmpty = true;
    private ArrayList arrayList = new ArrayList();
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }


    public void add(String item) {
        if(!contains(item)) {
            arrayList.add(item);
        }
    }

    public void remove(String item) {
       // if(contains(item)) {
            arrayList.remove(item);
      //  }
    }

    int size() {
        return arrayList.size();
    }

    public String getIndex(int index) {
        return arrayList.getIndex(index);
    }

    public boolean contains(String item) {
        if (arrayList.contains(item)){
            return true;
        }else {
            return false;
        }
    }
}
