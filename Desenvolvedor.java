public class Desenvolvedor {
    private double bonusSalarial;
    private double horaExtra;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, double horaExtra, double valorHoraExtra){
        super(nome);
        this.horaExtra = horaExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHoraExtra(){
        return this.horaExtra;
    }

    public void setHoraExtra(int horaExtra){
        this.horaExtra = horaExtra;
    }

    @Override
    public void calcularSalario(){
        super.calcularSalario();
        double salarioFinal;
        salarioFinal = getSalario() + (valorHoraExtra * horaExtra);
        System.out.println("Salário Final: " + salarioFinal);
    }
}
