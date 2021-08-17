package ruanko.newspublish.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ruanko.newspublish.entity.Article;



/**
 * �������ݿ����
 * 
 * @author
 *
 */
public class ArticleDao extends BaseDao{

	/**
	 * ���
	 * @param article 
	 * 			����
	 */
	public void add(Article article) {
		String sql = "INSERT INTO article(title, author, content) VALUES('" +
				article.getTitle() +
				"','" +
				article.getAuthor() +
				"','" +
				article.getContent() +
				"')";
		executeUpdate(sql);
	}
	
	

	/**
	 * ɾ��
	 * @param id
	 */
	public void delete(int id) {
		String sql = "DELETE FROM article WHERE id=" + id;
		executeUpdate(sql);
	}
	
	/**
	 * ����
	 * @param article
	 * 			����
	 * 
	 */
	public void update(Article article) {
		String sql = "UPDATE article SET title='" +
				article.getTitle() +
				"', author='" +
				article.getAuthor() +
				"', content='" +
				article.getContent() +
				"' WHERE id=" + article.getId();
		executeUpdate(sql);
	}
	
	/**
	 * �õ�һ������
	 * @param id 
	 * 			���±��
	 * @return ����
	 */
	public Article get(int id) {
		
		String sql = "SELECT * FROM article WHERE id=" + id;
		Connection connection = getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				Article article = new Article();
				article.setId(resultSet.getInt("id"));
				article.setTitle(resultSet.getString("title"));
				article.setAuthor(resultSet.getString("author"));
				article.setContent(resultSet.getString("content"));
				
				closeAll(connection, statement, resultSet);
				return article;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * �õ���������
	 * @return ��������
	 */
	public List<Article> getAll(){
		List<Article> articles;
		String sql = "SELECT * FROM article";
		Connection connection = getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			articles = new ArrayList<Article>();
			while (resultSet.next()) {
				Article article = new Article();
				article.setId(resultSet.getInt("id"));
				article.setTitle(resultSet.getString("title"));
				article.setAuthor(resultSet.getString("author"));
				article.setContent(resultSet.getString("content"));
				articles.add(article);
			}
			closeAll(connection, statement, resultSet);
			return articles;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
