package cn.izengmei.kindle.service.impl;

import cn.izengmei.kindle.dao.BookMapper;
import cn.izengmei.kindle.model.Book;
import cn.izengmei.kindle.service.BookService;
import cn.izengmei.kindle.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/19.
 */
@Service
@Transactional
public class BookServiceImpl extends AbstractService<Book> implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public int findNum() {
        return this.bookMapper.selectAllCount();
    }
}
