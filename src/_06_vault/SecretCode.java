package _06_vault;

public class SecretCode {
	public int findCode(Vault v) {
		for(int i = 0; i<10000001;i++) {
			if (v.tryCode(i)) {
				return i;
			}
			
			
		}
		return -1;
	}
	
}
