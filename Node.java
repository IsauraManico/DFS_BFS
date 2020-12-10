
//package Busca_Profundidade;

/**
 *Criação dos No
 * 
 */

public class Node 
{
 
    private String nome;
    private Node esquerda;
    private Node direita;
     
    public String getNome() 
    { 
        return nome; 
    }
    public void setNome(String nome) 
    { 
        this.nome = nome; 
    } 
    public Node getEsquerda() 
    { 
        return esquerda;
    }
    public void setEsquerda(Node esquerda) 
    {
        this.esquerda = esquerda; 
    }
    public Node getDireita() 
    { 
        return direita; 
    }
    public void setDireita(Node direita)
    { 
        this.direita = direita;
    }
     
    public Node()
    {
        this(null, null, null);
    }
    public Node(String nome)
    {
        this(nome, null, null);
    }
     
    public Node(String nome, Node esquerda, Node direita)
    {
        setNome(nome);
        setEsquerda(esquerda);
        setDireita(direita);
    }
    
   
    @Override
    public String toString()
    {
        return getNome() == null ? "" : getNome();
    }
     
}
