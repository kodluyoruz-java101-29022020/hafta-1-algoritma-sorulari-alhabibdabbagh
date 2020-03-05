package odev;

public class WordDocument {
	private String body = "";
	public WordDocument() {
		this.body="no bady";
	}
	public WordDocument(String Body ) {
		this.body=Body;
	}
	public String getBody() {
		System.out.println(body);
		return body;
	}

}
