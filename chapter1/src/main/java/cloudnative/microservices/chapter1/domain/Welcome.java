package cloudnative.microservices.chapter1.domain;

public class Welcome {

	private String msg;
	
	public Welcome(String msg ) {
		super();
		this.msg=msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
