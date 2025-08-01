package com.proyecto.crudfullstack.crud_fullstack.service;

import java.util.List;

import com.proyecto.crudfullstack.crud_fullstack.entity.Column;

public interface ColumnService {
    List<Column>getColumnByIdBoard(Long idBoard);

}
