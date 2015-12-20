package sort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		int num = 100000;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i++) {
			list.add((int) (Math.random() * num));
			
		}
		System.out.println("before----------------------------");
		System.out.println(new Date().toString());
		BabbleSort.sort(list);
		System.out.println("after----------------------------");
		System.out.println(new Date().toString());
	}
}
