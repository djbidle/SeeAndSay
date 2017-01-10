package com.tentwentysix.seeandsay;

import java.util.Random;

/**
 * @author David Bidle
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal[] animalPen = {new Otter(), 
							  new Penguin(), 
							  new Kitten(),
							  new Jenna()};
		
		
		int index = new Random().nextInt(animalPen.length);
		Animal animal = animalPen[index];
		String output = String.format("The %s goes %s",animal.getName(), animal.getSound());
		System.out.println(output);
		
	}

}
