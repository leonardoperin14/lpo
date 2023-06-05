import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        Map<String, String> mapa = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(" ");

            if (partes.length == 2) {
                String chave = partes[0];
                String valor = partes[1];
                mapa.put(chave, valor);
            }
        }
        
        
        
        // Lendo a chave fornecida pelo usuário para remover um valor do mapa
        String chaveRemover = scanner.hasNext() ? scanner.next() : "";
        
        System.out.println(mapa);

        // Removendo o valor associado à chave fornecida
        String valorRemovido = mapa.remove(chaveRemover);

        // Imprimindo novamente todos os elementos do mapa
        System.out.println(mapa);

        // Imprimindo a quantidade de elementos no mapa
        System.out.println("Quantidade de elementos no mapa: " + mapa.size());

        scanner.close();
    }
}
