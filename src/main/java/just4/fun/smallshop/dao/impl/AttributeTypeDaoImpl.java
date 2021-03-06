package just4.fun.smallshop.dao.impl;

import just4.fun.smallshop.model.product.AttributeType;
import just4.fun.smallshop.dao.AttributeTypeDao;
import org.hibernate.SessionFactory;
import org.hibernate.transform.DistinctRootEntityResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zinjvi.repository.impl.BaseHibernateRepository;

import java.util.List;

@Repository
public class AttributeTypeDaoImpl extends BaseHibernateRepository<AttributeType, Long>
        implements AttributeTypeDao {

    @Autowired
    public AttributeTypeDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<AttributeType> findBySubCategoryId(Long subCategoryId) {
        return getSession()
                .createQuery("select at from SubCategory sc " +
                    "join sc.attributeTypes as at where sc.id = :subCategoryId")
                .setLong("subCategoryId", subCategoryId)
                .setResultTransformer(DistinctRootEntityResultTransformer.INSTANCE)
                .list();
    }
}
