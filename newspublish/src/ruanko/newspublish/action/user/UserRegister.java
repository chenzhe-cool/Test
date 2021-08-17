package ruanko.newspublish.action.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.UserBiz;
import ruanko.newspublish.entity.User;



public class UserRegister extends HttpServlet {
//    private static final long serialVersionUID = 8814713545848991778L;

    /**
     * 只允许post方式添加
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //解决中文乱码问题，这取决于前台jsp页面上设置的编码格式
        request.setCharacterEncoding("gb2312");

        //采集用户输入的信息
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setSex(request.getParameter("sex"));
        user.setArrive(request.getParameter("arrive"));
        user.setBeizhu(request.getParameter("beizhu"));

        //创建业务逻辑对象
        UserBiz userBiz = new UserBiz();


        if((user.getUsername()).equals("")||(user.getPassword()).equals("")){
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }else {
            //注册用户，添加到数据库
            userBiz.addUser(user);
            //跳转到登录页面
            request.getRequestDispatcher("userlogin.jsp").forward(request, response);
        }

    }
}
