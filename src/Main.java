import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Digite o valor do limite do cartão: ");
    double limiteCartao = in.nextDouble();
    int escolhaOpcao = 2;
    while (escolhaOpcao != 0) {
        System.out.println("Digite a descrição da compra: ");
        String descricaoCompra = in.next();
        System.out.println("Digite o valor da compra");
        double valorCompra = in.nextDouble();
        if (valorCompra < limiteCartao) {
            System.out.println("Compra realizada com sucesso!"); 
            System.out.println("Digite 0 para sair ou 1 para continuar");
            escolhaOpcao = in.nextInt();
        }else{
            System.out.println("Você não tem limite o suficiente!");
            escolhaOpcao = 0;
        }
    }
    }
}
