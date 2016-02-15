package org.usfirst.frc.team5839.robot;

import java.util.ArrayList;

public class GRIPReader {
	
	public static Countours getCountours(){
		Countours countours = new Countours(new ArrayList<Countour>());
		
		//use  
		/*
		for (int i = 0; i < countours.size(); i++) {
			countours.add(new Countour(solidity[i], height[i], centerX[i], centerY[i], area[i], width[i]));
		}
		*/
		return countours;
	}
	
	public static  Lines getLines(){
		return null;
	}

}
