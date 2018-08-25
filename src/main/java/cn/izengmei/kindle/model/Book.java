package cn.izengmei.kindle.model;

import java.util.Date;
import javax.persistence.*;

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_date")
    private Date bookDate;

    @Column(name = "book_publisher")
    private String bookPublisher;

    @Column(name = "book_abstract")
    private String bookAbstract;

    @Column(name = "book_dir")
    private String bookDir;

    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return book_name
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return book_author
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * @param bookAuthor
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * @return book_date
     */
    public Date getBookDate() {
        return bookDate;
    }

    /**
     * @param bookDate
     */
    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    /**
     * @return book_publisher
     */
    public String getBookPublisher() {
        return bookPublisher;
    }

    /**
     * @param bookPublisher
     */
    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    /**
     * @return book_abstract
     */
    public String getBookAbstract() {
        return bookAbstract;
    }

    /**
     * @param bookAbstract
     */
    public void setBookAbstract(String bookAbstract) {
        this.bookAbstract = bookAbstract;
    }

    /**
     * @return book_dir
     */
    public String getBookDir() {
        return bookDir;
    }

    /**
     * @param bookDir
     */
    public void setBookDir(String bookDir) {
        this.bookDir = bookDir;
    }

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}