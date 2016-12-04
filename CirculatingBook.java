public class CirculatingBook extends LibraryBook{
    String currentHolder;
    String dueDate;
    
    public CirculatingBook(String author, String title, int ISBN, String callNumber){
	super.set ("author",author);
        super.set ("title", title);
        super.set ("ISBN", ISBN);
        super.set("callNumber",callNumber);
    }

    public void set(String type, String input){
	super.set(type,input);
    }

    public String get(String type, String input){
	return super.get(type);
    }
    
    public void checkout(String patron, String due){
	currentHolder = patron;
	dueDate = due;
    }
    
    public void returned(){
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus(){
	if (currentHolder == null){
	    return "book available on shelves";
	}
	else{
	    return currentHolder + " " + dueDate;
	}
    }
}