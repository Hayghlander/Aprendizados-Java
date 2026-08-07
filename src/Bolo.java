
public class Bolo {

    int quantidadeAcucar = 288;

    public static void main(String[] args) {

        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeAcucar = 200;

        Bolo boloDeQueijo = new Bolo();
        boloDeQueijo.quantidadeAcucar = 150;

        System.out.println("Quantidade de açucar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);
        System.out.println("Quantidade de açucar no bolo de queijo: " + boloDeQueijo.quantidadeAcucar);
    }
}
