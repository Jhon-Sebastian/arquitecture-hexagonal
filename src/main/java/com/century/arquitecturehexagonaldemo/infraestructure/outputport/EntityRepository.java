package com.century.arquitecturehexagonaldemo.infraestructure.outputport;

import java.util.List;

public interface EntityRepository {

    <T> T save(T reg);

    <T> T getById(String id, Class<T> clazz);

    <T> List<T> getAll(Class<T> clazz);

}
