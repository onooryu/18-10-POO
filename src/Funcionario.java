public abstract class Funcionario implements IFuncionario {
    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
}