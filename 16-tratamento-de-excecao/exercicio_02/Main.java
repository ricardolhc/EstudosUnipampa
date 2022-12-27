public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        metodo1();
        System.out.println("fim da main");
    }

    public static void metodo1() {
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Inicio do método 2");
        try {
            int[] array = new int[10];
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }
        System.out.println("fim do método 2");
    }
}