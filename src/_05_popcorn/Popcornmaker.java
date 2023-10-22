package _05_popcorn;

import javax.swing.JOptionPane;

import _03_cat.Cat;

public class Popcornmaker {
public static void main(String[] args) {
	Popcorn Butter = new Popcorn("Butter");
	Microwave Microwave2 = new Microwave();
	Microwave2.putInMicrowave(Butter);
	String Popcorn3;
	Popcorn3 = JOptionPane.showInputDialog("How much time do you want to cook the popcorn for?");
	Microwave2.setTime(Integer.parseInt(Popcorn3));
	Microwave2.startMicrowave();
	Butter.eat();
	Butter.applyHeat();
	

}
}
