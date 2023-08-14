package s0824;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("구예성");
		list.add("김준");
		list.add("권순호");
		list.add("이승재");
		list.add("유재석");
		System.out.println(list.toString());
		list.remove("유재석");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("---------------------------------------------------------------");
		for (String s : list) {
			System.out.println(s);
		}
		list.removeAll(list);
		System.out.println("지운후 사이즈"+list.size());
		
		System.out.println("--------------------------------------------------------------");
		list.add("서울");
		list.add("로봇");
		if(list.contains("서 울")==true) {
			System.out.println("서울을 포함하고 있음");
		}
		
		
		
		
		
		
		
	}

}
