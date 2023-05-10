package details;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CardDetails implements Serializable{
	
	private int cardNo;
	private String holderName;
	private int expiryTime;
	private int cvvNo;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getExpiryTime() {
		return expiryTime;
	}
	public void setExpiryTime(int expiryTime) {
		this.expiryTime = expiryTime;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}

}
