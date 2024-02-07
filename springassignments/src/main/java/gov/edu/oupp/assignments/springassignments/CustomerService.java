package gov.edu.oupp.assignments.springassignments;

public class CustomerService {
	
	private String cid;
	private String cname;
	private String services;
	
	
	
	
	public CustomerService(String cid, String cname, String services) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.services = services;
	}
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return "CustomerService [cid=" + cid + ", cname=" + cname + ", services=" + services + "]";
	}
	
	

}
