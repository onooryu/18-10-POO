public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public String descreverResponsabilidade() {
        return " responsável por desenvolver os softwares.";
    }
}
