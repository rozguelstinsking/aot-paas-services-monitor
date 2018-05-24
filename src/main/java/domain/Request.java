package domain;

import javax.persistence.Entity;

@Entity
public class Request {
	
	public String uri;
	
	public String method;
	
	/* this is the responseBody spected to say okidoki */ 
	public String bodyToMatch;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getBodyToMatch() {
		return bodyToMatch;
	}

	public void setBodyToMatch(String bodyToMatch) {
		this.bodyToMatch = bodyToMatch;
	}

}
