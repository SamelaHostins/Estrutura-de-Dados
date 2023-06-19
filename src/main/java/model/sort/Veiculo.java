package model.sort;

public class Veiculo implements Comparable<Veiculo> {
    private final String placa;
    private final String modelo;
    private final int ano;
    private final String proprietario;

    public Veiculo(String placa, String modelo, int ano, String proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String toString() {
        return "Veículo " + modelo + ", placa " + placa + ", ano " + ano + ", de " + proprietario;
    }

    @Override
    public int compareTo(Veiculo veiculo) {
        return getPlaca().compareTo(veiculo.getPlaca());
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
