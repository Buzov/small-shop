package just4.fun.smallshop.services.impl;

import just4.fun.smallshop.dao.UserDao;
import just4.fun.smallshop.model.identity.User;
import just4.fun.smallshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zinjvi.repository.Repository;
import zinjvi.service.impl.BaseService;

@Service
public class UserServiceImpl extends BaseService<User, Long> implements UserService {

    @Autowired
    public UserServiceImpl(UserDao repository) {
        super(repository);
    }
}
