package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Response {

	@Id
	@GeneratedValue(generator="id", strategy=GenerationType.AUTO)
	public Long id;
	
	public String status;
	
	public String bodyResponse;
	
	public Date responseDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBodyResponse() {
		return bodyResponse;
	}

	public void setBodyResponse(String bodyResponse) {
		this.bodyResponse = bodyResponse;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	
}
