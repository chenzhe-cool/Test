package ruanko.newspublish.action.article;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.ArticleBiz;
import ruanko.newspublish.entity.Article;


/**
 * ��ʾ�����б�
 * 
 * @author
 *
 */
public class ArticleShowList extends HttpServlet {
	private static final long serialVersionUID = 8850679539463822306L;

	/**
	 * ֻ������get��ʽ����
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//����ҵ���߼�����ȡ����������
		ArticleBiz articleBiz = new ArticleBiz();
		List<Article> articles = articleBiz.getAll();
		
		//��ȡ����������ӵ�request��Ա�����ת��jsp֮�����ȡ����Щ����
		request.setAttribute("articles", articles);
		
		//��ת����ʾ���ŵ��б�ҳ
		request.getRequestDispatcher("shownews.jsp").forward(request, response);
	}
}
