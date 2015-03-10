package just4.fun.smallshop.services.impl;

import just4.fun.smallshop.dao.CategoryDao;
import just4.fun.smallshop.model.product.Category;
import just4.fun.smallshop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zinjvi.service.impl.BaseService;

@Service
public class CategoryServiceImpl extends BaseService<Category, Long> implements CategoryService {

    @Autowired
    public CategoryServiceImpl(CategoryDao repository) {
        super(repository);
    }

}
