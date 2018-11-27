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

	public static void main(String[]args){


	}

}