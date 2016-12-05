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
    public void setAuthor(String input){
	author = input;
    }

    public void setTitle(String input){
	title = input;
    }
    
    public void setISBN(int input){
	ISBN = input;
    }
    
    //getter====================================================
    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }

    public int getISBN(){
	return ISBN;
    }
    
    //toString==================================================
    public String toString(){
	return "" + author + " " + title + " " + ISBN;
    }


    //main======================================================
    public static void main(String[] args){
	
    }
	

}