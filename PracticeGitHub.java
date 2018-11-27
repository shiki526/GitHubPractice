import java.util.ArrayList;
public class PracticeGitHub{

	public static ArrayList <Integer> combineList (ArrayList <Integer> list1, ArrayList <Integer> list2){
		ArrayList<Integer> list3 = new ArrayList<Integer> ();
		for(int x = 0; x<list1.size(); x++){
			list3.add(list1.get(x));
		}
		for(int x = 0; x<list2.size(); x++){
			list3.add(list2.get(x));
		}
		    return list3;
	}



	public static void main (String[]args){
		ArrayList<Integer> list11 = new ArrayList<Integer> ();
		ArrayList<Integer> list22 = new ArrayList<Integer> ();

		list22.add(1);
	    list22.add(2);
	    list22.add(3);
        list22.add(4);
        list22.add(5);
	    list22.add(6);
	    list22.add(7);
		list22.add(8);
		list22.add(9);

		list11.add(3);
	    list11.add(2);
		list11.add(4);
		list11.add(5);
		list11.add(9);
		list11.add(10);
		list11.add(12);

		System.out.println(combineList(list11, list22));

   }
}




