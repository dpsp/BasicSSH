package tmp.service;

import tmp.dao.TmpDao;
import tmp.iservice.ITmpInterface;

public class TmpManager implements ITmpInterface {

	private TmpDao tmpDao;

	@Override
	public int tmpIservice() {
		tmpDao.getTmpInfo();
		System.out.println("service");
		return 0;
	}

	public TmpDao getTmpDao() {
		return tmpDao;
	}

	public void setTmpDao(TmpDao tmpDao) {
		this.tmpDao = tmpDao;
	}

}
