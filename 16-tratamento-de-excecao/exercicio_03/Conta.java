public class Conta {
    
    private static int totalDeContas = 0;
    private static int numeroContaGeral = 10000;

    private int numero;
    private String titular;
    private double saldo;
    private double limite;

    public Conta(String titular) {
        totalDeContas++;
        this.numero = numeroContaGeral++;
        this.titular = titular;
        this.saldo = 500;
        this.limite = 1000;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo");
        }
        saldo = saldo + valor;
    }

    public void saca(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo");
        }
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        if (valor <= saldo + limite) {
            saldo = saldo - valor;
        }
    }

    public String toString() {
        return "Numero: " + numero + " Titular: " + titular + " Saldo: " + saldo + " Limite: " + limite;
    }
}