package Area;
public class Calculando {
	public static void main(String[]args){
		AreaCalculavel[] ac = new AreaCalculavel[]{new Quadrado(5.0), new Retangulo(2.0,4.0), 
				new Circulo(2.0)};
		for(int k =0; k<ac.length;k++){
				System.out.println(ac[k]+"\nÁrea = \n"+ac[k].calculaArea()+
						"\nPerimetro = "+ac[k].CalculaPerimetro()+"\n");	
		}
	}
}
