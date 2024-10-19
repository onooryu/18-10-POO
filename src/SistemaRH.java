public class SistemaRH {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pedrão Lights", 1500.0);
        System.out.println(gerente.calcularSalario());
        System.out.println(gerente.getNome() + gerente.descreverResponsabilidade());

        Desenvolvedor dev = new Desenvolvedor("Patrick Grenade", 1500.0);
        System.out.println(dev.calcularSalario());
        System.out.println(dev.getNome() + dev.descreverResponsabilidade());
    }
}
