package questao04;
public class MainTestaQuestao04 {
	public static void main(String [ ]args) throws TamanhosDiferentesException{
		Bits bits = new Bits(2);
		boolean [] b= new boolean []{false,true};
		bits.setBits(b);
		System.out.println(bits);
		boolean [] a= new boolean []{false,true};
		bits.and(a);
		System.out.println(bits);
		boolean [] c= new boolean []{true,true};
		bits.or(c);
		System.out.println(bits);
		bits.not();
		System.out.println(bits);
		
	}

}
