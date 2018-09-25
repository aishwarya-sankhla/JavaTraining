import java.util.Arrays;

public class MyArrayList {

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
			return true;
		}
		else{
			ensureArray(e);
			return true;
		}
	}

	private void ensureArray(int e) {
		elements = Arrays.copyOf(elements, 2*elements.length);
		capacity = elements.length;
		elements[index]=e;
		index++;
	}
	
	public int findById(int id){
		for(int i=0;i<elements.length;i++){
			if(i==id){
				return elements[i];
			}
		}
		return 0;
	}
	
}
