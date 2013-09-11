package tmp.action;

import tmp.iservice.ITmpInterface;

import com.opensymphony.xwork2.Action;

public class TmpAction implements Action {

	private ITmpInterface tmpManager;

	@Override
	public String execute() throws Exception {
		tmpManager.tmpIservice();
		System.out.println("action");
		return Action.SUCCESS;
	}

	public ITmpInterface getTmpManager() {
		return tmpManager;
	}

	public void setTmpManager(ITmpInterface tmpManager) {
		this.tmpManager = tmpManager;
	}

}
