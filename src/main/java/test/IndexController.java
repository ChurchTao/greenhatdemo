package test;


import com.greenhat.annotation.Autowired;
import com.greenhat.annotation.Controller;
import com.greenhat.annotation.Mapping;
import com.greenhat.mvc.DataContext;
import com.greenhat.mvc.RequestMethod;
import com.greenhat.mvc.bean.View;
import java.util.List;

/**
 * Created by jiacheng on 2017/7/20.
 */
@Controller
public class IndexController {
    @Autowired
    private Man man;

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @Mapping(value = "/index",method = RequestMethod.get)
    public View index(){
        //man= BeanHelper.getBean(Man.class);
        man.setName("church");
        DataContext.Session.put("loginUser",man);

        String jsonStr = "{\n" +
                "  \"username\":\"admin\",\n" +
                "  \"password\":\"admin\"\n" +
                "}";

        return new View("index.jsp");
    }


//    @Mapping(value = "/upload",method = RequestMethod.post)
//    public Data uploadFile(Param param, HttpServletRequest request){
//        //获取表单数据
//        Map<String,Object> formMap = param.getFieldMap();
//        //获取上传文件
//        FileParam fileParam = param.getFile("photo");
//        //保存文件  -- uploadFile() 如果上传文件想存在项目目录内，请使用 2 或 3
//        //1
//
//            UploadHelper.uploadFile("/tmp/upload/",fileParam);
//
//        //2
//        //UploadHelper.uploadFile(DataContext.getRequest().getSession().getServletContext().getRealPath("/tmp/upload/"),fileParam);
//        //3
//        //UploadHelper.uploadFile(request.getSession().getServletContext().getRealPath("/tmp/upload/"),fileParam);
//        return new Data(fileParam.getFileName()+" "+fileParam.getFileSize());
//    }

    @Mapping(value = "/conn")
    public List<Book> conn(){
        return bookService.findBookByName("鲁滨逊漂流记");
    }

    @Mapping(value = "/stringPath")
    public String str(){
        return "index.html";
    }
}
