package com.mx.CrudEmpleados.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudEmpleados.dominio.dto.Empleados;

@Repository// indica que va a tener el acceso a adatos por medio de Spring data JPA 
public interface EmpladosDao extends JpaRepository<Empleados, Integer>{

	/*CrudRepository es una interface de spirng data y contiene todos los metodos del CRUD
	 * esta orientado a objetos de java para sql 
	 * 
	 * 
	 * 
	 * 
	 * */
}
