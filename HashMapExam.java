package s0828;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		map.put(20302, "구예성");
		map.put(20303, "권순호");
		map.put(20304, "김동현");
		map.put(20305, "김시겸");
		map.put(20901, "김준");

		System.out.println(map.toString());
		System.out.println(map.size());

		// 20302학생의 이름을 출력
		System.out.println(map.get(20303));
		map.put(20306, "김로봇");
		System.out.println(map.toString());

		for (Integer a : map.keySet()) {
			System.out.println(a);

		}

		for (String s : map.values()) {
			System.out.println(s);
		}

		for (Integer a : map.keySet()) {
			System.out.println("학번:" + a);
			System.out.println("이름: " + map.get(a));
		}
		
		map.remove(20306);
		map.clear();
		System.out.println(map.toString());
		
		
		
		
	}

}
