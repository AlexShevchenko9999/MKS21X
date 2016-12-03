abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    
    String callNumber;

    public LibraryBook(String author, String title, int ISBN, String callNumber){
	super.set ("author",author);
	super.set ("title", title);
	super.set ("ISBN", ISBN);
	this.callNumber = callNumber;
    }

    public void set(String type,String input){
	super.set(type,input);
    }

    public String get(String type){
	return super.get(type);
    }
    
    //abstract================================================
    abstract void checkout(String patron, String due);

    abstract void returned();

    abstract String circulationStatus();
    //========================================================

    public int compareTo(String callNumber){
	return this.callNumber.compareTo(callNumber);
    }

    public String toString (){
	return circulationStatus() + callNumber;
    }
}
