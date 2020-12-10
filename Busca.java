
/**
 *
 * Autor:Isaura
 */

public class Busca
{
     
    /**
     * ao invés deste enum, poderia ser usado um boolean
     */
    public enum ModoRL 
    {
        esquerda, direita
    }
     
    private Node arvore;
 
    public Node getArvore()
    { 
        return arvore;
    }
    public void setArvore(Node arvore)
    {
        this.arvore = arvore;
    }
     
    /**
     * 
     * @param raiz raiz da árvore
     */
    public Busca(String raiz)
    {
        setArvore(new Node(raiz));
    }
     
    /**
     * adiciona um novo nó
     * @param noPai nome do nó pai
     * @param nomeNo nome do novo nó
     * @param modo posição: direita / esquerda
     */
    public void AdicionarNo(String noPai, String nomeNo, Busca.ModoRL modo)
    {
        if (modo ==Busca.ModoRL.direita) 
        {
            
            AdicionarNoDireita(noPai, nomeNo);
        } 
        else if (modo == Busca.ModoRL.esquerda) 
        {
            AdicionarNoEsquerda(noPai, nomeNo);
        }
    }
     
    public void AdicionarNoEsquerda(String noPai, String nomeNo)
    {
        Node no = findNode(getArvore(), noPai);
        
        if (no == null) 
        {
            return; 
        }
        no.setEsquerda(new Node(nomeNo));
    }
     
    public void AdicionarNoDireita(String noPai, String nomeNo)
    {
        Node no = findNode(getArvore(), noPai);
        
        if (no == null) 
        {
            return;
        }
        
        no.setDireita(new Node(nomeNo));
    }
    
   
     
    /**
     * 
 
     * A principal ideia é permitir criar qualquer tipo
     * de árvore, com qualquer tipo de ordenação.
     * @param no
     * @param nome
     * @return
     */
    private Node findNode(Node no, String nome)
    {
        if (no == null || nome == null || nome.isEmpty()) 
        { 
            return null;
        }
        if (no.getNome().equals(nome))
        { 
            return no; 
        }
        
        Node noesquerda = findNode(no.getEsquerda(), nome);
        
        if (noesquerda != null)
        {
            return noesquerda; 
        }
        
        return findNode(no.getDireita(), nome);
    }
     
    /**
     * limpa a árvore
     * @param raiz raiz da arvore
     */
    public void Clear(String raiz)
    {
        nullnodes(getArvore());
        setArvore(new Node(raiz));
    }
     
    /**
     * método recursivo auxiliar para limpar a árvore
     * @param no
     */
    private void nullnodes(Node no)
    {
        if (no == null) 
        { 
            return; 
        }
        nullnodes(no.getDireita());
        nullnodes(no.getEsquerda());
        no.setEsquerda(null);
        no.setDireita(null);
        no = null;
    }
     
    /**
     * RED
     * @return
     */
    public String PreOrdem()
    {
        if (getArvore() == null)
        { 
            return "";
        }
        return readPreOrdem(getArvore());
    }
     
    /**
     * RED
     * @param no
     * @return
     */
    private String readPreOrdem(Node no)
    {
        if (no == null)
        {
            return "";
        }
        
        String rt = no.toString();
        
        if (no.getEsquerda() != null) 
        {
            rt += (rt.isEmpty() ? "" : ",") + readPreOrdem(no.getEsquerda());
        }
        if (no.getDireita() != null) 
        {
            rt += (rt.isEmpty() ? "" : ",") + readPreOrdem(no.getDireita());
        }
        return rt;
    }
     
    /**
     * ERD
     * @return
     */
    public String InOrdem()
    {
        if (getArvore() == null) 
        { 
            return "";
        }
        return readInOrdem(getArvore());
    }
     
    /**
     * ERD
     * @param no
     * @return
     */
    private String readInOrdem(Node no)
    {
        if (no == null)
        {
            return "";
        }
        
            String rt = "";
        if (no.getEsquerda() != null)
        {
            rt += (rt.isEmpty() ? "" : ",") + readInOrdem(no.getEsquerda());
        }
        
         rt += (rt.isEmpty() ? "" : ",") + no.toString();
             
        if (no.getDireita() != null) 
        {
            rt += (rt.isEmpty() ? "" : ",") + readInOrdem(no.getDireita());
        }
        return rt;
    }
     
    /**
     * EDR
     * @return
     */
    public String PosOrdem()
    {
        if (getArvore() == null) 
        { return ""; 
        }
        return readPosOrdem(getArvore());
    }
     
    /**
     * EDR
     * @param no
     * @return
     */
    private String readPosOrdem(Node no)
    {
        if (no == null)
        {
            return "";
        }
        String rt = "";
        if (no.getEsquerda() != null)
        {
            rt += (rt.isEmpty() ? "" : ",") + readPosOrdem(no.getEsquerda());
        }
        if (no.getDireita() != null) 
        {
            rt += (rt.isEmpty() ? "" : ",") + readPosOrdem(no.getDireita());
        }
        
        rt += (rt.isEmpty() ? "" : ",") + no.toString();
        return rt;
    }
     
}
