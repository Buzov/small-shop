package just4.fun.smallshop.dao;

import just4.fun.smallshop.model.product.Product;
import zinjvi.repository.Repository;

import java.util.List;

public interface ProductDao extends Repository<Product, Long> {

    List<Product> getBySubCategoryId(Long subCategoryId);

    List<Product> getBySubCategoryIdAndAttrValueId(Long subCategoryId, Long attributeValueId);

    List<Product> findByIds(List<Long> ids);

}
