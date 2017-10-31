package test;

import com.greenhat.annotation.DAO;
import com.greenhat.annotation.DAOMethod;
import com.greenhat.jdbc.BaseDAO;

import java.util.List;

/**
 * Created by jiacheng on 2017/8/14.
 */
@DAO
public abstract class BookDAO extends BaseDAO<Book> {


    @DAOMethod
    public abstract List<Book> findBookByName(String name);

    @DAOMethod(sql = "select * from book where name=?")
    public abstract List<Book> ddd(String name);

}
