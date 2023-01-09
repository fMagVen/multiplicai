public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tabela de multiplicação de 10");
        for(int i = 1; i <= 10; i++){
            for(int j = i; j <= 10; j++){
                System.out.println(i + " * " + j + " : " + i*j);
            }
        }
    }
}
