public class Funcionario {


    double desc_inss = 0.15f;
    double salario_bruto;
    double salario_liquido;

    public double bruto(double x) {
        desc_inss = x * desc_inss;
        return desc_inss;
    }


    public double liquido(double y) {
        salario_liquido = y - desc_inss;
        return salario_liquido;
    }
}