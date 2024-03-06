package banco;

public class contaBanco {

    public int conta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("Conta: " + this.getConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta de " + this.dono);
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
        }

    }

    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depositado R$" + v + " na conta de " + this.dono);
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.dono);
            } else if (this.getSaldo() < v) {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal() {
        int va  = 0;
        if (this.tipo == "CC") {
            va  = 12;
        } else if (this.tipo == "CP") {
            va  = 20;
        }

        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - va);
        } else {
            System.out.println("Impossivel pagar");
        }
    }

    public contaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getConta() {
        return conta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
}
