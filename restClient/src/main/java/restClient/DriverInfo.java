package restClient;

public class DriverInfo {

	/*
	 * "oper_nbr":69,
	 * "carrier_cd":"GLX ",
	 * "last_name":"GARCIA",
	 * "first_name":"ABEL",
	 * "middle_init":null,
	 * "home_loc_6":910327,
	 * "home_loc_3":"NLX",
	 * "oper_class":"T"
	 * */
	
	private int oper_nbr;
	private String carrier_cd;
	private String last_name;
	private String first_name;
	private String middle_init;
	private int home_loc_6;
	private String home_loc_3 ;
	private String oper_class ;
	
	
	public DriverInfo () {}
	
	
	public DriverInfo(int oper_nbr, String carrier_cd, String last_name, String first_name, String middle_init,
			int home_loc_6, String home_loc_3, String oper_class) {
		super();
		this.oper_nbr = oper_nbr;
		this.carrier_cd = carrier_cd;
		this.last_name = last_name;
		this.first_name = first_name;
		this.middle_init = middle_init;
		this.home_loc_6 = home_loc_6;
		this.home_loc_3 = home_loc_3;
		this.oper_class = oper_class;
	}





	public int getOper_nbr() {
		return oper_nbr;
	}
	public void setOper_nbr(int oper_nbr) {
		this.oper_nbr = oper_nbr;
	}
	public String getCarrier_cd() {
		return carrier_cd;
	}
	public void setCarrier_cd(String carrier_cd) {
		this.carrier_cd = carrier_cd;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_init() {
		return middle_init;
	}
	public void setMiddle_init(String middle_init) {
		this.middle_init = middle_init;
	}
	public int getHome_loc_6() {
		return home_loc_6;
	}
	public void setHome_loc_6(int home_loc_6) {
		this.home_loc_6 = home_loc_6;
	}
	public String getHome_loc_3() {
		return home_loc_3;
	}
	public void setHome_loc_3(String home_loc_3) {
		this.home_loc_3 = home_loc_3;
	}
	public String getOper_class() {
		return oper_class;
	}
	public void setOper_class(String oper_class) {
		this.oper_class = oper_class;
	}
	
	
	
	
}
