package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sim {
@Id
long phone_no;
String sim_id;
String phone_name;

@OneToOne
Whatsapp_account w;

public long getPhone_no() {
	return phone_no;
}

public void setPhone_no(long phone_no) {
	this.phone_no = phone_no;
}

public String getSim_id() {
	return sim_id;
}

public void setSim_id(String sim_id) {
	this.sim_id = sim_id;
}

public String getPhone_name() {
	return phone_name;
}

public void setPhone_name(String phone_name) {
	this.phone_name = phone_name;
}

public Whatsapp_account getW() {
	return w;
}

public void setW(Whatsapp_account w) {
	this.w = w;
}



}