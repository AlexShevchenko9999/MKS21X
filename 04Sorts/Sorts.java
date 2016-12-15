public class Sorts{
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static String name(){
    return "01.Shevchenko.Alex"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */

    public static int selectionHelper(int [] data, int x){
	int ans = x;
	for (int i = x;i < data.length-1;i++){
	    if (data[ans] > data[i+1]){
		ans = i+1;
	    }
	}
	return ans;
    }
	  
	
    
    
    public static void selectionSort(int[] data){  
	for (int i = 0; i < data.length; i++){
	    int min = data[selectionHelper(data,i)];
	    data[selectionHelper(data,i)] = data[i];
	    data[i] = min;
	}
    }

    public static void insertionHelper(int [] data, int start){
	for (int i = start-1; i > 0;i--){
	    if (data[i]<data[i-1]){
		int replacement = data[i];
		data[i] = data[i-1];
		data[i-1] = replacement;
	    }
	    else{break;}
	}
    }

    public static void insertionSort(int [] data){
	for (int i = 1; i < data.length;i++){
	    insertionHelper(data,i);
	}
    }


    public static void main(String [] arg){
	int [] test = {5,7,3,9,35,456,4,567,34,5678,34,890,-56,56,5893,6};
	
	//System.out.println(helper(test,4));

	insertionSort(test);
	for (int x: test){
	  System.out.print(x + " ");
	}
    }

}
