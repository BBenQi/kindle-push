package cn.izengmei.kindle.service.impl;

import cn.izengmei.kindle.dao.CategoryMapper;
import cn.izengmei.kindle.model.Category;
import cn.izengmei.kindle.service.CategoryService;
import cn.izengmei.kindle.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/19.
 */
@Service
@Transactional
public class CategoryServiceImpl extends AbstractService<Category> implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

}
