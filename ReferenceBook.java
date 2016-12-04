public class ReferenceBook extends LibraryBook{
    
    String collection;

    public ReferenceBook( String author, String title, int ISBN, String callNumber, String collection){
	super.set("author",author);
	super.set ("title", title);
        super.set ("ISBN", ISBN);
        super.set("callNumber", callNumber);
	this.collection = collection;
    }

    public void set(String type, String input){
	if (type == "collection"){
	    collection = input;
	}
	else{
	    super.set(type,input);
	}
    }

    public String get(String type){
	if (type == "collection"){
	    return collection;
	}
	else{
	    return super.get(type);
	}
    }

    public void checkout(String patron, String due){
	System.out.println("cannot check out a reference book");
    }

    public void returned (){
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus(){
	return "non-circulating reference book";
    }
    
}