import java.util.Scanner;


public class Aula02_EstruturaDeDados_vetorString_BuscaLinear {

    
    public static void main(String[] args) {
        
        //Criando um vetor do tipo String com 10 posições [0 - 9]
        String [] estados = new String [10];
        
        //Atribuindo valores
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";
        
        
        System.out.println("Imprimindo estados...\n");     // print(i): printa o índice
                                                          // print[i]: printa o valor do índice
        for (int i = 0; i < estados.length; i++){        
            System.out.println("Estado " + i + ": " + estados[i]);
        }
        
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("\nQual sigla de estado voce quer buscar?");
        String siglaBusca = leitor.nextLine();
        
        
        
        //Busca Linear (É uma busca que pesquisa desde a primeira posição do vetor até o final dele.)
        //Exige tempo e custo, pois tem que percorrer todos os índice até chegar no requirido.
        
        //Iniciando o algoritmo de Busca Linear
        
        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++){        
            String elemento = estados[i];
            if (elemento.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                break;
            } 
        }
        if(encontrou == true) {
            System.out.println("\nEstado encontrado!");
        }else{
            System.out.println("\nEstado NAO encontrado");
        }
        
        //equals = verifica se é igual
        //equalsIgnoreCase = verifica se é igual, ignorando MAIÚSCULAS e MINÚSCULAS
    }
    
    
    
}
