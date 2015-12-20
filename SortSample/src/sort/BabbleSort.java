package sort;

import java.util.List;

/**
 * バブルソートを行う
 * @author mIwao
 *
 */
public class BabbleSort {

	public static void sort(List<Integer> list) {
		
		boolean isChange = false;
		int tmp1 = 0;
		int tmp2 = 0;
		
		do{
			isChange = false;
			for(int i = 0; i < list.size()-1; i++) {
				tmp1 = list.get(i);
				tmp2 = list.get(i+1);
				
				if(tmp1 > tmp2) {
					list.set(i, tmp2);
					list.set(i+1, tmp1);
					isChange = true;
				}
				
			}
		} while(isChange);
	}
}
