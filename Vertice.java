
//package Busca_Largura;

import java.util.ArrayList;

/**
 *
 * 
 */
public class Vertice 
{
    private String cor;
    private int distancia;
    private Vertice pai;
    private String nome;
    public ArrayList<Vertice> vizinhos = new ArrayList<Vertice>();
    
    public void adicionarVizinho( Vertice v)
    {
        this.vizinhos.add(v);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Vertice> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(ArrayList<Vertice> vizinhos) {
        this.vizinhos = vizinhos;
    }
    
    
    
}
