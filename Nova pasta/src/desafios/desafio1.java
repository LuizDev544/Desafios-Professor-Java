package desafios;

public class desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// forma estruturada
		double JanAlimentacao , JanAgua , JanLuz , FevAlimentacao , FevAgua , FevLuz;
		
		// gastos janeiro
		
		JanAlimentacao = 1000;
		JanAgua = 350 ;
		JanLuz = 500;
		
		//Gastos Fevereiro
		
		FevAlimentacao = 3500;
		FevLuz = 100;
		FevAgua = 400;
		
		// Gasto total
		
		double gastoTotalJan = JanAlimentacao + JanLuz + JanAgua;
		double gastoTotalFev = FevAlimentacao + FevLuz + FevAgua;
		
		// Print 
		
		if (gastoTotalJan > gastoTotalFev) {
			System.out.println("O gasto de janeiro foi maior");
		}else if(gastoTotalFev > gastoTotalJan){
			System.out.println("O gasto de fevereiro foi maior");
		}else {
			System.out.println("Error");
		}
	}

}
