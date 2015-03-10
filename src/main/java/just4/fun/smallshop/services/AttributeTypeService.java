package just4.fun.smallshop.services;

import just4.fun.smallshop.model.product.AttributeType;
import zinjvi.service.Service;

import java.util.List;

public interface AttributeTypeService extends Service<AttributeType, Long> {

    List<AttributeType> findBySubCategoryId(Long subCategoryId);

}
