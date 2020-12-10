
//package Busca_Largura;
import java.util.ArrayList;
import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Stack;

/**
 *
 * 
 */
public class Grafo 
{
    private Vertice inicial, destino;
    private ArrayList<Vertice> vestices = new ArrayList();
    private Stack<Vertice> fronteira = new Stack< Vertice>();
    private ArrayList<Vertice> caminho = new ArrayList();
     private ArrayList<Vertice> visitado = new ArrayList();
     
     public void setVestices(ArrayList<Vertice> vestices)
     {
         this.vestices = vestices;
     }
     public ArrayList<Vertice> getVestices()
     {
         return this.vestices;
     }
     public void adicionarVertices( Vertice v)
     {
         vestices.add(v);
     }
     public void inicializarVertices()
     {
         for ( Vertice v: vestices)
         {
             v.setNome(null);
             v.setCor("BRANCO");
             v.setPai(null);
             v.setDistancia(-1);
         }
     }
     
     public boolean foiVisitado( Vertice no)
     {
         return "PRETO".equals(no.getCor());
     }
     public Vertice buscaVertice( Vertice ini, Vertice f)
     {
         this.inicial =  ini;
         this.destino = f;
         Vertice no;
         inicial.setPai( null);
         inicial.setDistancia(0);
         fronteira.add(this.inicial);
         
         while( !fronteira.isEmpty())
         {
             no = fronteira.pop();
             
             caminho.add(no);
             
             if ( destino.equals(no))
             {
                 this.imprimeCaminho(caminho);
                 return no;
             }
             for ( int i = 0 ; i<no.getVizinhos().size();i++)
             {
                 if( !foiVisitado( no.getVizinhos().get(i)) && 
                         !pesquisaNaFronteira( fronteira,no.getVizinhos().get(i)))
                         {
                             no.getVizinhos().get(i).setCor("CINZA");
                             
                             no.getVizinhos().get(i).setDistancia(no.getDistancia()+1);
                             fronteira.add(no.getVizinhos().get(i));
                             
                         }
             }
             no.setCor("PRETO");
         }
         return null;
     }
     
     public void imprimeBusca( Vertice v)
     {
         System.out.println("Cidade onde esta:"+this.inicial.getNome()+
                 "\n Cidade Procurada:"+this.destino.getNome()+
                 "\n");
     }
     //imprime o caminho em razao da marcacao de preto no vertice visitado
     
     public void imprimeCaminho( ArrayList<Vertice> c)
     {
         for( int i = 0; i<c.size();i++)
         {
             System.out.println("("+c.get(i).getNome()+")");
             
             if(i<caminho.size()-1)
             {
                 System.out.println(">>");
             }
         }
         System.out.println("\n");
     }
     
     //imprime o caminho em razao da marcacao de preto no vertice visitado
     //calcula a distancia percorrida em razao do caminho feito
     
     public int calculaDistancia()
     {
         int i;
         int cont = 0;
         
         for ( i=0;i<caminho.size();i++)
         {
             cont = cont +caminho.get(i).getDistancia();
         }
         return cont;
     }
     //calcula a distancia percorrida em razao do caminho feito
     
     public void imprimeVerticesDoGrafo( Grafo g)
     {
         for ( int i =0;i<g.getVestices().size();i++)
         {
             System.out.println("\n Nome:"+g.getVestices().get(i).getNome()+
                     "\n Cor:"+g.getVestices().get(i).getCor()+
                     "\n Pai:"+g.getVestices().get(i).getPai()+
                     "\n Distancia:"+g.getVestices().get(i).getDistancia());
             
             if( g.getVestices().get(i).getVizinhos()!= null)
             {
                 for ( int j=0;j<g.getVestices().get(i).getVizinhos().size();j++)
                 {
                     System.out.println("Vizinho:"
                             +g.getVestices().get(i).getVizinhos().get(j).getNome()+"\n");
                 }
             }
             else
             {
                 System.out.println("Vizinhos:"+g.getVestices().get(i).getVizinhos()+"\n");
             }
                
         }
     }
     
     private boolean pesquisaNaFronteira( Stack<Vertice> f, Vertice no)
     {
         for ( int i = 0;i<f.size();i++)
         {
             if( no.equals(f.get(i)))
             {
                 System.out.println(""+no.getNome());
                 return true;
             }
         }
         return false;
     }
    
    
    
 
}
