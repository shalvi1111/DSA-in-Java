import java.util.ArrayList;
public class arrayList{
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	//	list.add(2,22);
		System.out.println(list);

	//	System.out.println(list.get(3));

	/*	//set
		list.set(1,11);
		System.out.println(list);

		//get
		System.out.println(list.get(0));*/

		//contains
	/*	System.out.println(list.contains(5));
		System.out.println(list.contains(11));*/

		//remove  
	/*	list.remove(4);
		System.out.print(list);*/

		//PRINT THE ARRAYLIST

		for (int i=0;i<list.size() ;i++ ) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
}