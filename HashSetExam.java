package s0828;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hash = new HashSet<>();
		
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(4);
		System.out.println(hash.toString());
		
		//hash의 사이즈 출력
		
		System.out.println(hash.size());
		
		
		//hash에 5가 들어있는지 확인하기
		
		
		if(hash.contains(5)) {
			System.out.println("5있음");
		}
		
		//hash에서 4 지우기
		hash.remove(4);
		System.out.println(hash.toString());
		
		
		//hash에 1을 추가하고 출력
		hash.add(1);
		System.out.println(hash.toString());
		
		//hash  다 지우고 출력
		hash.clear();
		System.out.println(hash.toString());
		
		
		
		
		
	}

}
