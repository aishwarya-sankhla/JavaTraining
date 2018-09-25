import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements Iterable<Integer>{

	private int capacity=10;
	private int[] elements= new int[capacity];
	private int index=0;
	public MyArrayList() {
		super();
	}
	
	public boolean add(int e){
		if(index<capacity){
			elements[index]=e;
			index++;
		}
		else{
			ensureArray(e);
			capacity = elements.length;
			elements[index]=e;
			index++;
		}
		return true;
	}

	private void ensureArray(int e) {
		elements = Arrays.copyOf(elements, 2*elements.length);
	}
	
	public int findById(int id){
		for(int i=0;i<elements.length;i++){
			if(i==id){
				return elements[i];
			}
		}
		return 0;
	}

	public boolean remove(int value) {
		for(int i=0;i<elements.length;i++) {
			if(elements[i]==value) {
				for(int j=i;j<elements.length-2;j++) {
					elements[j]=elements[j+1];
				}
			}
		}
		return true;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> itr = new Iterator<Integer>() {
			
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				 return currentIndex < elements.length && elements[currentIndex] != 0;
			}

			@Override
			public Integer next() {
				return elements[currentIndex++];
			}
		}; 
		return itr;
	}
	
}
