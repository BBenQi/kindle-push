package cn.izengmei.kindle.dao;

import cn.izengmei.kindle.core.Mapper;
import cn.izengmei.kindle.model.Book;
import org.apache.ibatis.annotations.Select;

public interface BookMapper extends Mapper<Book> {

    /**
     * 查询数据库中共有多少本书
     * @return count 书籍数量
     */
    @Select("SELECT COUNT(id) FROM book ")
    int selectAllCount();
}