import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Startup {
	private String permalink;
	private String company;
	private int numEmps; // convert
	private String category;
	private String city;
	private String state;
	private Date fundedDate; // convert
	private int raisedAmt; // convert
	private String raisedCurrency;
	private String round;

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getNumEmps() {
		return numEmps;
	}

	public void setNumEmps(String numEmps) {
		this.setNumEmps(Integer.valueOf(numEmps));
	}

	public void setNumEmps(int numEmps) {
		this.numEmps = numEmps;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getFundedDate() {
		return fundedDate;
	}

	public void setFundedDate(String fundedDate) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		Date date = formatter.parse(fundedDate);
		this.fundedDate = date;
	}

	public int getRaisedAmt() {
		return raisedAmt;
	}

	public void setRaisedAmt(String raisedAmt) {
		this.setRaisedAmt(Integer.valueOf(raisedAmt));
	}
	
	public void setRaisedAmt(int raisedAmt) {
		this.raisedAmt = raisedAmt;
	}

	public String getRaisedCurrency() {
		return raisedCurrency;
	}

	public void setRaisedCurrency(String raisedCurrency) {
		this.raisedCurrency = raisedCurrency;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

}
