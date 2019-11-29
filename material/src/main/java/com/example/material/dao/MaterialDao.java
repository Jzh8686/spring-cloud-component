package com.example.material.dao;

import com.example.material.entity.MaterialOutSheet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Component
@Mapper
public interface MaterialDao {

     Optional<MaterialOutSheet> getMaterialOutSheetById(String id);
}
