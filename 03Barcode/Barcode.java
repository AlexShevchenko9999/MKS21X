import java.util.*;
public class Barcode implements Comparable<Barcode>{
    // instance variables
    //A checkDigit is added to the right of a zip code. The check digit is equal
    //to the sum of the digits of the zip code modulo 10.

    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zip) {
	if (zip.length() != 5){
	    throw new IllegalArgumentException();
	}
	try {
	    for (int i = 0;i < 5;i ++){
		Integer.parseInt(zip.substring(i));
	    }
	}catch (NumberFormatException e){
	    
	}
	_zip = zip;
	_checkDigit = checkSum() % 10;
    }

    public String getZip(){
	return _zip;
    }

    public int getCheckDigit(){
	return _checkDigit;
    }


    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	int ans = 0;
	for (int i = 1; i <= 5; i++){
	    ans += Integer.parseInt(_zip.substring(i-1,i));
	}
	return ans;
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	return _zip + _checkDigit + "  " + toCode(_zip); 
    }
    

    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return _zip.compareTo(other._zip);
    }

    public static String toCode(String zip){
	String ans = "|";
        for (int i = 0; i < 5;i++){
            switch (Integer.parseInt(zip.substring(i))){
            case 0: ans+= "||:::";
            case 1: ans+= ":::||";
            case 2: ans+= "::|:|";
            case 3: ans+= "::||:";
            case 4: ans += ":|::|";
            case 5: ans += ":|:|:";
            case 6: ans += ":||::";
            case 7: ans += "|:::|";
            case 8: ans += "|::|:";
            case 9: ans += "|:|::";
            }
        }
	int check = 0;
        for (int i = 1; i <= 5; i++){
            check += Integer.parseInt(zip.substring(i-1,i));
        }
        switch (check % 10){
        case 0: ans+= "||:::";
        case 1: ans+= ":::||";
        case 2: ans+= "::|:|";
        case 3: ans+= "::||:";
        case 4: ans += ":|::|";
        case 5: ans += ":|:|:";
        case 6: ans += ":||::";
        case 7: ans += "|:::|";
        case 8: ans += "|::|:";
        case 9: ans += "|:|::";
        }
	return ans + "|";
    }

    

    
    public static void main (String [] arg){
	Barcode b1;

	b1 = new Barcode("37053");
	System.out.println(b1);
    }
    
}