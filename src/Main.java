import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    @Override
    public String toString() {
        return "esta certo";
    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<String> listaDescricao = new ArrayList<>();

    System.out.println("Digite o valor do limite do cartão: ");
    double limiteCartao = in.nextDouble();
    CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);

    int escolhaOpcao = 1;

    while (escolhaOpcao != 0) {

        System.out.println("Digite a descrição da compra: ");
        String descricaoCompra = in.next();

        listaDescricao.add(descricaoCompra);
        System.out.println("Digite o valor da compra");
        double valorCompra = in.nextDouble();

        Compra compra = new Compra(descricaoCompra, valorCompra);
        Boolean lancaCompra = cartao.lancaCompra(compra);

        if (lancaCompra) {
            System.out.println("Compra realizada com sucesso!"); 
            System.out.println("Digite 0 para sair ou 1 para continuar");
            escolhaOpcao = in.nextInt();
            
        }else{

            System.out.println("Você não tem limite o suficiente!");
            escolhaOpcao = 0;
            }
        }
        System.out.println("\n*******************");
        System.out.println("Compras realizadas:\n");
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao()+ " - " + c.getValor());
        }
        System.out.println("\n*******************");
        System.out.println("\nSaldo do cartão: "+ cartao.getSaldo());
        in.close();
    }
}

