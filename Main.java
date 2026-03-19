public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("João", 2000.00);
        funcionario1.calcularSalario();

        Gerentes funcionario2 = new Gerentes("Maria", 4000.00, 1500.00);
        funcionario2.calcularSalario();

        Desenvolvedor funcionario3 = new Desenvolvedor("Carlos", 3000, 10, 50);
        funcionario3.calcularSalario();
    }
}
        
