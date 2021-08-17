package ruanko.newspublish.biz;

import java.util.List;

import ruanko.newspublish.dao.ArticleDao;
import ruanko.newspublish.entity.Article;



/**
 * ����ҵ���߼�<br>
 * һ����˵����ֻ������Ĳ������ɾ���Ĺ���������ɣ�
 * ���磬��Ҫ�������ݿ��ˣ�����dao��ȥ��<br>
 * ��ʱ��ö�����Ϊҵ���߼���Ĵ�����û�б�Ҫ�ģ�
 * �ϲ��servlet��ȫ����ֱ�ӵ���dao��ȥ�������ݿ����<br>
 * 
 * ҵ���߼���������ϵͳ��ά������չ
 * 
 * @author
 *
 */
public class ArticleBiz {

	/**
	 * ����dao
	 */
	private ArticleDao articleDao;

	public ArticleBiz() {
		this.articleDao = new ArticleDao();
	}
	/**
	 * ���
	 * 
	 * @param article 
	 * 			����
	 */
	public void add(Article article) {
		articleDao.add(article);
	}
	
	/**
	 * ɾ��
	 * 
	 * @param id
	 * 			���¾���
	 */
	public void delete(int id) {
		articleDao.delete(id);
	}
	
	/**
	 * ����
	 * 
	 * @param article
	 * 			����
	 * 
	 */
	public void update(Article article) {
		articleDao.update(article);
	}
	
	/**
	 * �õ�һ������
	 * 
	 * @param id 
	 * 			���±��
	 * 
	 * @return ����
	 */
	public Article get(int id) {
		return articleDao.get(id);
	}
	
	/**
	 * �õ���������
	 * 
	 * @return ��������
	 */
	public List<Article> getAll(){
		return articleDao.getAll();
	}
	
	
}
