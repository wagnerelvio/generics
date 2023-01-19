 package br.com.welc.programa;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Aluguel {

	private List<Carro> carrosDisponiveis = new ArrayList<>();
	{
		carrosDisponiveis.add(new Carro("Volkswagen Gol"));
		carrosDisponiveis.add(new Carro("Fiat Argo"));
		carrosDisponiveis.add(new Carro("Honda Civic"));
		carrosDisponiveis.add(new Carro("Tigo 8"));
		carrosDisponiveis.add(new Carro("Jaguar"));
		carrosDisponiveis.add(new Carro("Ferrari"));
		carrosDisponiveis.add(new Carro("Mercedes Benz"));
		carrosDisponiveis.add(new Carro("Dodge Charger"));
		carrosDisponiveis.add(new Carro("Nissan Skyline"));
		carrosDisponiveis.add(new Carro("Mazda RX-7"));
		carrosDisponiveis.add(new Carro("Toyota Supra"));
		carrosDisponiveis.add(new Carro("Mitsubishi Eclipse"));
		carrosDisponiveis.add(new Carro("Ford Mustang Fastback"));
		carrosDisponiveis.add(new Carro("Nissan 350Z"));

	}

	public Carro getCarroDisponivel() {
		int c1 = carrosDisponiveis.size();
		// System.out.println("\n");

		System.out.printf("1) Quantidade de carros disponiveis:\n\n");
		System.out.println(c1);

		System.out.println("\n2) Lista de carros disponíveis: \n ");
		for (int i = 0; i < carrosDisponiveis.size(); i++)
			System.out.println(carrosDisponiveis.get(i));
		// System.out.printf("%s \n", carrosDisponiveis.get(i));

		// Aluguel do carro Toyota Supra
		Carro c11 = carrosDisponiveis.remove(10);
		System.out.println("\n3)Aluguel do: " + c11);

		System.out.printf("\n4) Carros disponíveis após o empréstrimo :\n " + carrosDisponiveis, "\n\n");

		int c2 = carrosDisponiveis.size();
		System.out.printf("\n5) Quantidade de carros disponiveis após o empréstimo:\n");
		System.out.println(c2);

		return c11;

	}

	// Devolver Carro
	public void devolverCarro(Carro c11) {
		System.out.println("\n6) Devolvendo carro após as férias : " + c11);
		carrosDisponiveis.add(c11);
		System.out.println("Carro disponiveis: " + carrosDisponiveis);
	}

}