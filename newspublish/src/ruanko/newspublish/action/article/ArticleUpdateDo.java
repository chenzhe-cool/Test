package ruanko.newspublish.action.article;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.ArticleBiz;
import ruanko.newspublish.entity.Article;


/**
 * ִ�����������¸��²���,ָ�û�����˱༭������������ִ�еĲ���
 * 
 * @author
 * @see ArticleUpdate
 */
public class ArticleUpdateDo extends HttpServlet {
	private static final long serialVersionUID = 506610760643155054L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�漰�û�������Ϣ�ĵط���Ҫ����������������
		//��������������⣬��ȡ����ǰ̨jspҳ�������õı����ʽ
		request.setCharacterEncoding("gb2312");
		
		//�ɼ��û����������
		Article article = new Article();
		article.setId(Integer.parseInt(request.getParameter("id")));
		article.setTitle(request.getParameter("title"));
		article.setAuthor(request.getParameter("author"));
		article.setContent(request.getParameter("content"));
		
		//����ҵ���߼�����ִ�и���(�޸�)����
		ArticleBiz articleBiz = new ArticleBiz();
		articleBiz.update(article);
		
		/*��ת����ҳ
		��������������ת�������б�ҳ�������һЩ
		Ҳ��������������һ��ġ���С���ŷ���ϵͳ���ڽ����*/
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
