package _06_vault; 

public class VaultRunner {
public static void main(String[] args) {
	Vault VaultObject = new Vault();
	VaultObject.tryCode(1);
	System.out.println(VaultObject.tryCode(0));
}
}
