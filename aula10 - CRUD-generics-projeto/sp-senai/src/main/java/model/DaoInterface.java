package model;

import java.util.List;

public interface DaoInterface<T> {
	
	public List<T> listar();
	public T buscarPorId(Integer id);
	public Boolean salvar(T entidade);
	public T atualizar(T entidade);
	public Boolean remover(T entidade);
}
