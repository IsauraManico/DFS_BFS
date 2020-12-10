# DFS_BFS


Segua o grafo :

            1
          /    \
         2      3
         |      / \
        / \    6   7
       4   5    \
          /  \   10
          8   9       
                
       
DFS(Busca em profundidade)
Para a implementação de busca em profundidade,  devemos olhar os nó adjacentes a ele.

Para o nosso caso de pesquisa, implementamos em 3 percursos:
               -Pré-ordem (RED)
               -Pós-ordem(ERD)
               -Ordem simétrica(EDR)

	No Percurso pré-ordem, visitamos primeiro a raiz, depois a sub árvore a esquerda, finalmente a sub-árvore a direita.
	No Percurso Ordem simétrica, visitamos primeiro a sub-árvore a esquerda, em seguidamente a raiz, depois a sub-árvore a direita.
	No percurso pós-ordem, visitamos a sub-árvore a esquerda primeiramente, em seguidamente a sub-árvore a direita e por último a raíz.



Pré-ordem: 1 2 3 4 5 8 9 6 9 7
Pós-ordem:  4,8,9,5,2,10,6,7,3,1
Ordem simétrica: 4,2,8,5,9,1,6,10,3,7








BFS(Busca em largura)
Na busca em largura, os nós são expandidos de acordo a ordem em que foram criados.

EX:1,2,3,4,5,6,7,8,9,10

	


