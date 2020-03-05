package odev;

public class PDFDocument {
	private String body = "";
	
public PDFDocument() {
	this.body="no bady";
}
public PDFDocument(String Bady ) {
	this.body=Bady;
}
public String getBody() {
	System.out.println(body);
	return body;
}

}
