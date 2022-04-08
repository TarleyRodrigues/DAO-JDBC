package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); //Fun��o para consultar obj atrav�s do id
	List<Department> findAll(); //Retornar todos Department encontrados
}
