package AppContaBanco;
//Atribuos encapsulados
public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    //Método contrutor - Rotina de inicialização
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    //Métodos especiais
    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "Corrente"){
            this.setSaldo(50);
        } else if (t == "Poupança"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Conta não pode ser fechada enquando o saldo não for igual a 0 (zero). O seu saldo" +
                    "atual é = R$"+getSaldo()+".");
        } else if (getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada enquando o saldo não for igual a 0 (zero)." +
                    " O seu saldo atual é = R$"+getSaldo()+".");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void dopositar(float v){
        if (this.getStatus()){
           this.setSaldo(getSaldo() + v);
            System.out.println("Depósito R$"+v+" na conta de "+getDono()+".");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque R$"+v+" realizado na conta de "+getDono()+".");
            } else {
                System.out.println("Saldo insuficiente para saque. O saldo disponível em conta é R$"+getSaldo()+".");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "Corrente"){
            v = 12;
        } else if (this.getTipo() == "Poupança") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade R$"+v+" pago na conta de "+getDono()+".");
        } else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
