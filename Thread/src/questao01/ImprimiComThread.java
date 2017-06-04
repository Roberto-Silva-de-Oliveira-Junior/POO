package questao01;

public class ImprimiComThread implements Runnable{
	
	public static boolean verificaNumero(int num) {
		if(num==1){
			return true;
		}
		int cont=1;
		for(int k=1;k<=num/2;k++){
			if(num%k==0){
				cont++;
			}
			if(cont>2){
				return false;
			}
		}
		if(cont==2){
			return true;
		}
		return false;
}

	@Override
	public void run() {
		int k;
		int tamanho = 99999;
		for (k = 1; k < tamanho+1; k++) {
			if (verificaNumero(k)) {
				System.out.println(k);
			}
		}
	}
}