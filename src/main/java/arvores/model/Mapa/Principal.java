package arvores.model.Mapa;

public class Principal {
	public static void main(String[] args) {

		MapaDispersao<String, Veiculo> mp = new MapaDispersao<String, Veiculo>(2000);

		Veiculo v = new Veiculo();

		v.setPlaca("AAA-0123");
		v.setModelo("Hyundai Creta");
		v.setAno(2017);
		v.setProprietario("João da Silva");

		System.out.println("Inserindo carro placa \"AAA-0123\": " + mp.inserir(v.getPlaca(), v));

		System.out.println("Quantidade de elementos no mapa: " + mp.quantosElementos());

		System.out.println("--------------");

		Veiculo v1 = new Veiculo();

		v1.setPlaca("KXS-1111");
		v1.setModelo("Corsa");
		v1.setAno(2008);
		v1.setProprietario("Maria Joaquina");

		System.out.println("Inserindo carro placa \"KXS-1111\": " + mp.inserir(v1.getPlaca(), v1));

		System.out.println("Quantidade de elementos no mapa: " + mp.quantosElementos());

		System.out.println("--------------");

		Veiculo v2 = new Veiculo();

		v2.setPlaca("OKX-1345");
		v2.setModelo("Fusca");
		v2.setAno(1980);
		v2.setProprietario("Ana Maria");

		System.out.println("Inserindo carro placa \"OKX-1345\": " + mp.inserir(v2.getPlaca(), v2));

		System.out.println("Quantidade de elementos no mapa: " + mp.quantosElementos());

		System.out.println("--------------");

		Veiculo v3 = new Veiculo();

		v3.setPlaca("OKX-1345");
		v3.setModelo("HB20");
		v3.setAno(2016);
		v3.setProprietario("Angela");

		System.out
				.println("Inserindo carro placa \"OKX-1345\" (Já existente no mapa): " + mp.inserir(v3.getPlaca(), v3));

		System.out.println("Quantidade de elementos no mapa: " + mp.quantosElementos());

		System.out.println("--------------");

		Veiculo v4 = new Veiculo();

		v4.setPlaca("XYZ-4567");
		v4.setModelo("Ranger");
		v4.setAno(2020);
		v4.setProprietario("Maria Eduarda");

		System.out.println("Removendo carro placa \"AAA-0123\"");
		System.out.println("Objeto retornado: " + mp.remover(v.getPlaca()));
		System.out.println("Quantidade de elementos no mapa: " + mp.quantosElementos());

		System.out.println("--------------");

		System.out.println("Removendo carro placa \"XYZ-4567\" (Não existente no mapa)");
		System.out.println("Objeto retornado: " + mp.remover(v4.getPlaca()));
		System.out.println("Quantidade de elementos no mapa: " + mp.quantosElementos());

		System.out.println("--------------");

		System.out.println("Buscando carro placa \"ABC-1111\"");
		System.out.println("Objeto retornado: " + mp.buscar(v1.getPlaca()));

		System.out.println("--------------");

		System.out.println("Buscando carro placa \"XYZ-4567\" (Não existente no mapa)");
		System.out.println("Objeto retornado: " + mp.buscar(v4.getPlaca()));

		System.out.println("--------------");
	}
}
