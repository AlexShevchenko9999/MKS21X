public class CirculatingBook extends LibraryBook{
    String currentHolder;
    String dueDate;
    
    public CirculatingBook(String author, String title, int ISBN, String callNumber){
	super(author,title,ISBN,callNumber);
    }

    public void setCurrentHolder (String input){
	currentHolder = input;
    }

    public String getCurrentHolder(){
	return currentHolder;
    }

    public void setDueDate (String input){
	dueDate = input;
    }

    public String getDueDate(){
	return dueDate;
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

    public String toString(){
	if(currentHolder != null){
	    return super.toString() + " This is currently checked out by "+currentHolder+" and is due by "+dueDate+".";
	}
	else{
	    return super.toString() + "This is book is available on shelves.";
	}
    }
    
}