public class Book{
    String author;
    String title;
    int ISBN;

    //constructors==============================================
    public Book(){};
    
    public Book(String author,String title,int ISBN){
	this.author = author;
	this.title = title;
	this.ISBN = ISBN;
    }

    //setters===================================================
    public void set(String field, String type){
	if (field == "author"){
            this.author = type;
	}
        if (field == "title"){
            this.title = type;
	}
    }
    
    public void set(String field, int type){
        if (field == "ISBN"){
            this.ISBN = type;
        }       
    }
    
    //getter====================================================
    public String get(String n){
	if (n == "author"){
	    return this.author;
	}
	if (n == "title"){
            return this.author;
	}
	if (n == "ISBN"){
            return (String)this.author;
	}
	else {return "";}
    }
    
    //toString==================================================
    public String toString(){
	return "" + author + " " + title + " " + ISBN;
    }


    //main======================================================
    public static void main(String[] args){
	
    }
	

}