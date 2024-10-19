public class Gerente extends Funcionario{


    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }


    @Override
    public Double calcularSalario() {
        return getSalarioBase()*1.5;
    }

    @Override
    public String descreverResponsabilidade() {
        return (" responsável por gerenciar os funcionarios XD");
    }
}
