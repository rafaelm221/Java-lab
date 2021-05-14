package Introducao.Aula03;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        double valorTotal= 30000;

        for ( int parcela = 0; parcela <= valorTotal; parcela++){
            double valorParcela =valorTotal / parcela;
            if (valorParcela  >= 1000) {
                System.out.println("Parcela "+ parcela + " R$ " +  valorParcela);
            }else{
                System.out.println("saindo do laço");
                break;
            }
        }
    }
}
