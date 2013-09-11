package tmp.dao;

/*import java.util.List;

 import org.hibernate.SQLQuery;
 import org.hibernate.Session;*/
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TmpDao extends HibernateDaoSupport {
	public String getTmpInfo() {
		System.out.println("dao");
		return null;
	}
	/*
	 * public String getTmpInfo(long id) { String sql =
	 * "select ciadm_pw from ding95.cinema_admin where ciadm_id = ?"; Session
	 * session = this.getSession(); SQLQuery query =
	 * session.createSQLQuery(sql); query.setLong(0, id); List<?> result =
	 * query.list(); this.releaseSession(session); return result == null ||
	 * result.size() <= 0 ? null : (String) result .get(0); }
	 */
}
