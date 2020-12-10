
//package Busca_Largura;

/**
 *
 * 
 */
public class BuscaLargura
{
    public static void main(String[] args) 
    {
        Grafo g = new Grafo();
        Vertice achei;
        
        //cria vertices
        
        Vertice A = new Vertice();
        Vertice B = new Vertice();
        Vertice C = new Vertice();
        Vertice D = new Vertice();
        Vertice E = new Vertice();
        //cria vertices
        
        //Adiciona vertices no grafo
        
        g.adicionarVertices(A);
        g.adicionarVertices(B);
        g.adicionarVertices(C);
        g.adicionarVertices(D);
        g.adicionarVertices(E);
         //Adiciona vertices no grafo
        
        //inicializar os atributos nome e vizinhos dos vertices
        
        g.inicializarVertices();
        //inicializar os atributos nome e vizinhos dos vertices
        
        //Preenche o atributos nome e vizinhos dos vertices
        
        A.setNome("A");
        A.setDistancia(1);
        
        B.setNome("B");
        B.setDistancia(1);
        
        C.setNome("C");
        C.setDistancia(1);
        
        D.setNome("D");
        D.setDistancia(1);
        
        E.setNome("E");
        
        
        A.adicionarVizinho(B);
        A.adicionarVizinho(C);
        
        B.adicionarVizinho(A);
        B.adicionarVizinho(C);
        B.adicionarVizinho(D);
        
        C.adicionarVizinho(A);
        C.adicionarVizinho(B);
        C.adicionarVizinho(D);
        C.adicionarVizinho(E);
        
        D.adicionarVizinho(B);
        D.adicionarVizinho(C);
        D.adicionarVizinho(E);
        
        E.adicionarVizinho(C);
        E.adicionarVizinho(D);
        //Preenche os atributos nome e vizinho dos vertices
        
        //onde a magica acontece
        
        achei = g.buscaVertice(B, A);
        g.imprimeBusca(achei);
        
       g.imprimeVerticesDoGrafo(g);
        
        
        
    }
}
