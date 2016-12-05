abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    
    String callNumber;

    public LibraryBook(String author, String title, int ISBN, String callNumber){
	super(author,title,ISBN);
	this.callNumber = callNumber;
    }

    public void setCallNumber(String input){
	callNumber = input;
    }

    public String getCallNumber(){
	return callNumber;
    }
    
    //abstract================================================
    abstract void checkout(String patron, String due);

    abstract void returned();

    abstract String circulationStatus();
    //========================================================

    public int compareTo(LibraryBook book){
	return this.callNumber.compareTo(book.getCallNumber());
    }

    public String toString (){
	return circulationStatus() + callNumber;
    }
}
