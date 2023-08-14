package s0824;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("서준민");
		list.add("김시겸");
		list.add("임필묵");
		
		System.out.println(list.toString());
		
		System.out.println(list.getFirst());
		
		System.out.println(list.getLast());
		
		list.addFirst("김기훈");
		
		list.addLast("박승철");
		
		for (String str : list) {
			System.out.println(str);
			
			
			
			
		}
		
		
		
		

	}

}
