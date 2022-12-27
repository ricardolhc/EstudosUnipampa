public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("ALine");
        Conta c2 = new Conta("Maria");
        Conta c3 = new Conta("Joao");

        c1.setLimite(1000);
        c1.setTitular("Ana");

        deposita(c1, 1000);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println("Saldo = " + c1.getSaldo());

        saca(c1, 2000);
        System.out.println("Saldo = " + c1.getSaldo());
        
        saca(c1, 100);
        System.out.println("Saldo = " + c1.getSaldo());
    }

    public static void saca(Conta cliente, double valor) {
        try {
            cliente.saca(valor);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void deposita(Conta cliente, double valor) {
        try {
            cliente.deposita(valor);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}