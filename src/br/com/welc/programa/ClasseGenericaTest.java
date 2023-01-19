package br.com.welc.programa;

/**
 * 
 * @author wagne
 *
 */
public class ClasseGenericaTest {
	public static void main(String[] args) {
		Aluguel carroAluguavel = new Aluguel();
		Carro carroAlugado = carroAluguavel.getCarroDisponivel();
		System.out.println(" ...usando o carro nas férias ...  ");
		carroAluguavel.devolverCarro(carroAlugado);

	}

}
