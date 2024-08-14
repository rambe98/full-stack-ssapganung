package hashSet_ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		// hashSet과 arraylist를 이용하여 5*5 랜덤 빙고판 만들기
		// 1 ~50 난수 중 25개 넣기
		// ArrayList<Integer> list = new ArrayList<Integer>();
		// Collection.shuffle(list);
		
		int[][] board = new int[5][5];

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; set.size() < 25; i++) {
			int Rnum = new Random().nextInt(50) + 1;
			set.add(Rnum);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);

		Iterator<Integer> iter = list.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
	}
}
