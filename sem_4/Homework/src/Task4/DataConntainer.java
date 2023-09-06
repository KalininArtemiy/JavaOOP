package Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * DataConntainer
 */
public class DataConntainer <T> {
    private List<T> data;
    
    public DataConntainer() {
        this.data = new ArrayList<>();       
    }

    public void addToContainer(T element){
        data.add(element);
    }

    public T getFromContainer(int index){
        return this.data.get(index);
    }
    public void sort(Comparator<T> comparator){
        data.sort(comparator);
    }
    public void printData(){
        for (T element : data) {
            System.out.println(element);
        }
    }
}