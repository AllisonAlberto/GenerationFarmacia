package br.org.generation.genfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.genfarmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
	
	public List<Produto> findByPrecoGreaterThanOrderByPreco (float preco);
	
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(float preco);

}
