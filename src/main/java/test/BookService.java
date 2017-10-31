package test;

import com.greenhat.annotation.Autowired;
import com.greenhat.annotation.Service;

import java.util.List;

/**
 * Created by jiacheng on 2017/8/16.
 */
@Service
public class BookService {
    @Autowired
    BookDAO bookDAO;
    public List<Book> findBookByName(String name){
        return bookDAO.findBookByName(name);
    }
}
