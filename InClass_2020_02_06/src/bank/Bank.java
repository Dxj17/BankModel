package bank;
/***
 * Model a bank corporation like us bank
 * @author Dom12
 *
 */
public class Bank {
private String BrickAndMotar;
private String CafeBranch;
private String URL;
public Bank() {}
public Bank(String BrickAndMotar, String CafeBranch, String URL) {}

public String getBrickAndMotar() {
	return BrickAndMotar;
}

public void setBrickAndMotar(String brickAndMotar) {
	if (BrickAndMotar.trim().length() == 0) {
	}
	BrickAndMotar = brickAndMotar;
}

public String getCafeBranch() {
	return CafeBranch;
}

public void setCafeBranch(String cafeBranch) {
	if (CafeBranch.trim().length() == 0) {
	}
	CafeBranch = cafeBranch;
}

public String getURL() {
	return URL;
}

public void setURL(String uRL) {
	if (URL.trim().length() == 0) {
	}
	URL = uRL;
}
public String toString() {
	return "Brick and Motar = " + BrickAndMotar + ", Cafe Branch = " + CafeBranch + ", URL = " + URL; 
}

}
