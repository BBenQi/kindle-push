package cn.izengmei.kindle.web;

import cn.izengmei.kindle.core.Result;
import cn.izengmei.kindle.core.ResultGenerator;
import cn.izengmei.kindle.model.Book;
import cn.izengmei.kindle.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/08/19.
*/
@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Resource
    private BookService bookService;

    @PostMapping
    public Result add(@RequestBody Book book) {
        bookService.save(book);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        bookService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        bookService.update(book);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Book book = bookService.findById(id);
        return ResultGenerator.genSuccessResult(book);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Book> list = bookService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("count")
    public Result count() {
        int count = bookService.findNum();
        return ResultGenerator.genSuccessResult(count);
    }
}
