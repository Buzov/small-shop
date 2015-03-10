package just4.fun.smallshop.dao;

import just4.fun.smallshop.model.product.AttributeType;
import zinjvi.repository.Repository;

import java.util.List;

public interface AttributeTypeDao extends Repository<AttributeType, Long> {

    List<AttributeType> findBySubCategoryId(Long subCategoryId);

}
