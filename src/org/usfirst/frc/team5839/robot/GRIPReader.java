package org.usfirst.frc.team5839.robot;

import java.util.ArrayList;

import javax.swing.text.TabableView;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class GRIPReader {
	
	
	public static Countours getCountours(String name){
		//define different value from area to solidity in order to fit the contours.
		double[] area = new double[0];
		double[] centerX = new double[0];
		double[] centerY = new double[0];
		double[] height = new double[0];
		double[] width = new double[0];
		double[] solidity = new double[0];
		//get data source
		Countours countours = new Countours(new ArrayList<Countour>());
		NetworkTable tempNetworkTable = NetworkTable.getTable("GRIP/" + name);
		//read data
		area = getNumberArraysFromTable(tempNetworkTable, "area", area);
		centerX = getNumberArraysFromTable(tempNetworkTable, "centerX", centerX);
		centerY = getNumberArraysFromTable(tempNetworkTable, "centerY", centerY);
		height = getNumberArraysFromTable(tempNetworkTable, "height", height);
		width = getNumberArraysFromTable(tempNetworkTable, "width", width);
		solidity = getNumberArraysFromTable(tempNetworkTable, "solidity", solidity);
		
		for (int i = 0; i < tempNetworkTable.getKeys().size(); i++) {
			countours.add(new Countour(solidity[i], height[i], centerX[i], centerY[i], area[i], width[i]));
		}
		
		return countours;
	}
	
	public static  Lines getLines(String name){
		//define different value from area to solidity in order to fit the lines.
		double[] length = new double[0];
		double[] angle = new double[0];
		double[] x1 = new double[0];
		double[] y1 = new double[0];
		double[] x2 = new double[0];
		double[] y2 = new double[0];
		//get data source
		Lines lines = new Lines(new ArrayList<Line>());
		NetworkTable tempNetworkTable = NetworkTable.getTable("GRIP/" + name);
		//read data
		length = getNumberArraysFromTable(tempNetworkTable, "length", length);
		angle = getNumberArraysFromTable(tempNetworkTable, "angle", angle);
		x1 = getNumberArraysFromTable(tempNetworkTable, "x1", x1);
		y1 = getNumberArraysFromTable(tempNetworkTable, "y1", y1);
		x2 = getNumberArraysFromTable(tempNetworkTable, "x2", x2);
		y2 = getNumberArraysFromTable(tempNetworkTable, "y2", y2);
		
		for (int i = 0; i < tempNetworkTable.getKeys().size(); i++) {
			lines.add(new Line(angle[i], x1[i], y1[i], x2[i], y2[i], length[i]));
		}
		
		return lines;
		
	}
	
	private static double[] getNumberArraysFromTable(NetworkTable table, String key, double[] defaultValue){
		
		return table.getNumberArray(key,defaultValue);
		
	}
}
