package com.projeto.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.projeto.primeiroexemplo.Model.Produto;

@Repository // injeção de dependencia do repository
public class ProdutoRepository {
    
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Metodo para retornar uma lista de produtos.
     * @return Lista de Produtos.
     */
    public List<Produto> obterTodos(){
        return produtos;
    }

    
    /**
     * Metodo que retorna o produto encontrado pelo Id
     * @param id do produto que será localizado.
     * @return Retorna o produto caso seja encontrado.
     */
    public Produto obterPorId(Integer id){
        return produtos
            .stream()
            .filter(produto -> produto.getId() == id)
            .findFirst();
    }

    /**
     * Metodo para adicionar Produto na lista.
     * @param produto a ser adicionado na lista.
     * @return retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto){
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }

    /**
     * Metodo para deletar o produto pelo ID.
     * @param id do produto que deverá ser deletado.
     */
    public void deletar(integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Metodo para atualizar o produto na lista.
     * @param produto que será atualizado.
     * @return o produto apos ser atualizado a lista.
     */
    public Produto atualizar(Produto produto){
        // Encontrar o produto na lista.
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());
            if(produtoEncontrado.isEmpty()){
                throw new InputMismatchException("Produto Não Encontrado");
            }
        // Remover o produto antigo da lista.
        deletar(produto.getId());

        //Adicionar novo produto atualizado na lista.
        produto.add(produto);

        return produto;
    }
}
