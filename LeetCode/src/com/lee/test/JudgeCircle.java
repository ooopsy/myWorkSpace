package com.lee.test;

import org.junit.Test;

public class JudgeCircle {
	@Test
	public void test(){
		
	}
	
	
	public boolean judgeCircle(String moves) {
	       int y = 0;
			int x = 0;
			char[] chats = moves.toCharArray();
			for (char c : chats) {
				switch (c) {
				case 'U':
					y++;
					break;
				case 'D':
					y--;
					break;
				case 'L':
					x--;
					break;
				case 'R':
					x++;
					break;
				default:
					break;
				}
			}
			return x==0 && y==0;
	    }
	
}
