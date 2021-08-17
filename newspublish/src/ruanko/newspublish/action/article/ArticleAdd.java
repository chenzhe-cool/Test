package ruanko.newspublish.action.article;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.ArticleBiz;
import ruanko.newspublish.entity.Article;



/**
 * ִ����Ӳ���
 * 
 * @author
 *
 */
public class ArticleAdd extends HttpServlet {
	private static final long serialVersionUID = 8814713545848991778L;

	/**
	 * ֻ����post��ʽ���
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//��������������⣬��ȡ����ǰ̨jspҳ�������õı����ʽ
		request.setCharacterEncoding("gb2312");
		
		//�ɼ��û������������Ϣ
		Article article = new Article();
		article.setTitle(request.getParameter("title"));
		article.setAuthor(request.getParameter("author"));
		article.setContent(request.getParameter("content"));

		//����ҵ���߼�����ִ��������Ų���
		ArticleBiz articleBiz = new ArticleBiz();
		articleBiz.add(article);
		
		//��ת����ҳ
		//��������������ת�������б�ҳ�������һЩ
		//Ҳ��������������һ��ġ���С���ŷ���ϵͳ���ڽ����
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
