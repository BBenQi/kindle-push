package cn.izengmei.kindle.service.impl;

import cn.izengmei.kindle.dao.UserMapper;
import cn.izengmei.kindle.model.User;
import cn.izengmei.kindle.service.UserService;
import cn.izengmei.kindle.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/19.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
