package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Whatsapp_account {
@Id
String name;
Long phone;
String w_otp;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
public String getW_otp() {
	return w_otp;
}
public void setW_otp(String w_otp) {
	this.w_otp = w_otp;
}


}
