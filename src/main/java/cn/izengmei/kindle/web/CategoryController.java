package cn.izengmei.kindle.web;

import cn.izengmei.kindle.core.Result;
import cn.izengmei.kindle.core.ResultGenerator;
import cn.izengmei.kindle.model.Category;
import cn.izengmei.kindle.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/08/19.
*/
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @PostMapping
    public Result add(@RequestBody Category category) {
        categoryService.save(category);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        categoryService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Category category) {
        categoryService.update(category);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Category category = categoryService.findById(id);
        return ResultGenerator.genSuccessResult(category);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Category> list = categoryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
