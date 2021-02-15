package com.hulk.store.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.hulk.store.web.app.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

}
