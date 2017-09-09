package com.lee.test;

import org.junit.Test;

public class IslandPerimeter {
	@Test
	public void test(){
		int[][] ints = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		
		int result = islandPerimeter(ints);
	}
	
    public int islandPerimeter(int[][] grid) {
    
    	int perimeter = 0;
    	
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1){
					perimeter +=4;	
				
				try {	
					if(grid[i-1][j] == 1){
						perimeter--;
					}
				} catch (Exception e) {
					
				}
				try {	
					if(grid[i+1][j] == 1){
						perimeter--;
					}
				} catch (Exception e) {
					
				}
				
				try {
					if(grid[i][j-1] == 1){
						perimeter--;
					}
				} catch (Exception e) {
						
				}
				try {
					if(grid[i][j+1] == 1){
						perimeter--;
					}
				} catch (Exception e) {
					
				}	
					
				}
			}
		}
    	
    	
    	return perimeter;
    }
    
    
}
