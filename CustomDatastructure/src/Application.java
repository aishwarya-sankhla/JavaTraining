
public class Application {
	public static void main(String[] args) {
		MyArrayList obj = new MyArrayList();
		System.out.println(obj.add(21));
		System.out.println(obj.add(11));
		System.out.println(obj.add(1));
		System.out.println(obj.add(2));
		System.out.println(obj.add(23));
		System.out.println(obj.add(4));
		System.out.println(obj.add(98));
		System.out.println(obj.add(90));
		System.out.println(obj.add(7));
		System.out.println(obj.add(6));
		System.out.println(obj.add(100));
		System.out.println(obj.findById(10));
		
		obj.remove(1);
		obj.forEach(System.out::println);
		
//		while (obj.iterator().hasNext())
//			System.out.println(obj.iterator().next());
	}
}
