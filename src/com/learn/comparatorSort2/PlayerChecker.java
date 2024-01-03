package com.learn.comparatorSort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.learn.comparableSort.Laptop;

public class PlayerChecker {

	public static void main(String[] args) {
	
		List<Player> list = new ArrayList();
		
		list.add(new Player("Sachin", 10006));
		list.add(new Player("Ajay", 8025));
		list.add(new Player("Dravid", 9050));
		list.add(new Player("Glenn", 9050));
		
		Comparator khiladi = new Comparator<Player>() {

			@Override
			public int compare(Player a, Player b) {
				if(a.getScore() == b.getScore())
//					return a.getName().compareTo(b.getName());
//				else
//				return b.getScore() - a.getScore();
					return -1; else return 1;
			}
		};
		Collections.sort(list, khiladi);
		
		 for(Player player1:list) { 
			  System.out.println(player1); 
			  }
	}

}
