import AppContaBanco.ContaBanco;

public class AppConta {
    //Operações com as contas.
    public static void main(String[] args){
        ContaBanco c1 = new ContaBanco(); //Abrir conta corrente para p1.
        c1.setDono("Jonas");
        c1.setNumConta(1111);
        c1.setStatus(true);
        c1.abrirConta("Corrente"); //Método que atribui o valor R$50 ao saldo na abertura da conta do tipo Corrente.

        ContaBanco c2 = new ContaBanco(); //Abrir conta corrente para p2.
        c2.setDono("Júnior");
        c2.setNumConta(22222);
        c2.setStatus(true);
        c2.abrirConta("Poupança"); //Método que atribui o valor R$150 ao saldo na abertura da conta do tipo Poupança.

        //Operação de depósito
        c1.dopositar(400);
        c2.dopositar(500);

        //Operação de saque
        c1.sacar(200);
        c2.sacar(100);

        //Operação fechar conta
        c1.fecharConta();
        c2.fecharConta();

        //Operação pagar mensalidade
        c1.pagarMensal();
        c2.pagarMensal();

        //Mostrar operações
        c1.estadoAtual(); //Não vai permitir porque tem saldo. Chama a função sacar para c1 e c2 antes de fechar.
        c2.estadoAtual();
    }
}
