package _03_cat;

public class CatRunner {
public static void main(String[] args) {
	new Cat(null);
	Cat Cat2 = new Cat("cat3");
	Cat2.meow();
	Cat2.printName();
	Cat2.kill();
}
}
