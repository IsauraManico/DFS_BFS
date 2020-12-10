



/**
 *Autor:Isaura
 * Implementação da Busca em profundiadade: pre-ordem, pos-ordem e ordem simetrica ou In ordem
 */
public class Main
{
 
    public static void main(String[] args) 
    {
        
        System.out.println("-----------------------------------------");
        
        Busca arvore = new Busca("A");
         
        arvore.AdicionarNo("A","B", Busca.ModoRL.esquerda);
        arvore.AdicionarNo("B", "D", Busca.ModoRL.esquerda);
        arvore.AdicionarNo("A", "C", Busca.ModoRL.direita);
        arvore.AdicionarNo("C", "E",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("E", "G",  Busca.ModoRL.direita);
        arvore.AdicionarNo("C", "F",  Busca.ModoRL.direita);
        arvore.AdicionarNo("F", "H",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("F", "I",  Busca.ModoRL.direita);
         
        System.out.println("PreOrdem (RED): " + arvore.PreOrdem());
        System.out.println("InOrdem (ERD): " + arvore.InOrdem());
        System.out.println("PosOrdem (EDR): " + arvore.PosOrdem());
        System.out.println("-----------------------------------------");
         
        arvore.Clear("F");
         
        arvore.AdicionarNo("F","B",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("B","A",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("B","D",  Busca.ModoRL.direita);
        arvore.AdicionarNo("D","C",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("D","E",  Busca.ModoRL.direita);
        arvore.AdicionarNo("F","G",  Busca.ModoRL.direita);
        arvore.AdicionarNo("G","I",  Busca.ModoRL.direita);
        arvore.AdicionarNo("I","H",  Busca.ModoRL.esquerda);
         
        System.out.println("PreOrdem (RED): " + arvore.PreOrdem());
        System.out.println("InOrdem (ERD): " + arvore.InOrdem());
        System.out.println("PosOrdem (EDR): " + arvore.PosOrdem());
        System.out.println("-----------------------------------------");
         
        arvore.Clear("A");
         
        arvore.AdicionarNo("A","B",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("B","C",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("C","E",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("E","I",  Busca.ModoRL.direita);
        arvore.AdicionarNo("C","F",  Busca.ModoRL.direita);
        arvore.AdicionarNo("F","J",  Busca.ModoRL.direita);
        arvore.AdicionarNo("B","D",  Busca.ModoRL.direita);
        arvore.AdicionarNo("D","G",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("D","H",  Busca.ModoRL.direita);
        arvore.AdicionarNo("H","K",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("H","L",  Busca.ModoRL.direita);
         
        System.out.println("PreOrdem (RED): " + arvore.PreOrdem());
        System.out.println("InOrdem (ERD): " + arvore.InOrdem());
        System.out.println("PosOrdem (EDR): " + arvore.PosOrdem());
        System.out.println("-----------------------------------------");
        
        
        arvore.Clear("A");
        arvore.AdicionarNo("A", "B",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("B", "D",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("D", "G",  Busca.ModoRL.direita);
        arvore.AdicionarNo("A", "C",  Busca.ModoRL.direita);
        arvore.AdicionarNo("C", "F",  Busca.ModoRL.direita);
        arvore.AdicionarNo("C", "E",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("E", "H",  Busca.ModoRL.esquerda);
        arvore.AdicionarNo("E", "I",  Busca.ModoRL.direita);
        
          
        System.out.println("PreOrdem (RED): " + arvore.PreOrdem());
        System.out.println("InOrdem (ERD): " + arvore.InOrdem());
        System.out.println("PosOrdem (EDR): " + arvore.PosOrdem());
        System.out.println("-----------------------------------------");
        
        
        
        
    }
 
}

/*
 
    Saída
    -----------------------------------------
    PreOrdem (RED): A,B,D,C,E,G,F,H,I
    InOrdem (ERD): D,B,A,E,G,C,H,F,I
    PosOrdem (EDR): D,B,G,E,H,I,F,C,A
    -----------------------------------------
    PreOrdem (RED): F,B,A,D,C,E,G,I,H
    InOrdem (ERD): A,B,C,D,E,F,G,H,I
    PosOrdem (EDR): A,C,E,D,B,H,I,G,F
    -----------------------------------------
    PreOrdem (RED): A,B,C,E,I,F,J,D,G,H,K,L
    InOrdem (ERD): E,I,C,F,J,B,G,D,K,H,L,A
    PosOrdem (EDR): I,E,J,F,C,G,K,L,H,D,B,A
    -----------------------------------------
 
*/
