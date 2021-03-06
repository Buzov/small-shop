package just4.fun.smallshop.services;

import just4.fun.smallshop.model.product.Product;
import zinjvi.service.Service;

import java.util.List;

public interface ProductService extends Service<Product, Long> {

    List<Product> getBySubCategoryId(Long subCategoryId);

    List<Product> getBySubCategoryIdAndAttrValueId(Long subCategoryId, Long attributeValueId);

    List<Product> findByIds(List<Long> ids);

    void saveOrUpdate(Product product);
}
