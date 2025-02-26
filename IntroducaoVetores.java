public class Aula01_EstruturaDeDados_vetores {
   
    public static void main(String[] args) {
        
        //Criando o Vetor
        int [] vetor = new int [10]; //Terá 10 posições [0 - 9]
        
        //Como colocar valores dentro de um vetor?
        vetor[0] = 3;
        vetor[1] = 4;
        vetor[2] = 8;
        vetor[3] = 13;
        vetor[4] = 22;
        vetor[5] = 51;
        vetor[6] = 33;
        
        
        //OBS*: Se alguma posição do vetor não tiver atribuição de valor, ele será inicializado com 0.
        
        
        //Jeito errado de printar vetor: 
        System.out.println(vetor); //(Imprime um HashCode/Referência na memória)
     
        
        //Jeito certo de printar vetor:   
        System.out.println("\nImprimindo vetor, posicao [0]... -> " +vetor[0]);
        System.out.println("Imprimindo vetor, posicao [1]... -> " +vetor[1]);
        System.out.println("Imprimindo vetor, posicao [6]... -> " +vetor[6]);
        System.out.println("Imprimindo vetor, posicao [8]... -> " +vetor[8]);
        
        System.out.println("\n");
        
        
        
        
        //Como andar no vetor e printar ele com mais praticidade?
        
        //Vamos utilizar for
        System.out.println("Inicializando for até o indice 9 do vetor...\n");
        
        for(int i = 0; i<=9; i++){  //Aqui estamos loopando até o índice fixo 9 do vetor
            
            System.out.println("Valor do vetor: " + vetor[i]);
            
        }
      
        
        
       
        
        System.out.println("\n\n Inicializando for até o final do vetor...\n"); //Aqui estamos loopando até o final do vetor, sem indice fixo definido, de uma forma mais eficiente [0 - 9] 
        for(int i = 0; i < vetor.length; i++){  //Aqui estamos loopando o vetor até o tamanho dele [0 - 9] ( .lenght pega o tamanho do vetor)
            
            System.out.println("Valor do vetor: " + vetor[i]);
            
        }
        
        //OBS*: Quando utilizar .lenght, colocar < em vez de  <= para não ultrapassar o índice do vetor.
        
    }
    
}
