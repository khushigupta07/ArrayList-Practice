import java.util.ArrayList;

public class GHArrayListPractice{

	public static ArrayList <Integer> combineLists (ArrayList <Integer> a, ArrayList <Integer> b){

		ArrayList <Integer> list = new ArrayList<>();

		for(int i = 0; i < a.size(); i++){

			list.add(a.get(i));
		}

		for(int i = 0; i < b.size(); i++){

			list.add(b.get(i));
		}

		return list;

	}

	public static void printList (ArrayList <Integer> list){

		for(int i = 0; i < list.size(); i++){

			System.out.print(list.get(i)+", ");
		}

	}

	public static void main(String[]args){

		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);

		System.out.println(combineLists(list1, list2));

		printList(list1);
	}

}