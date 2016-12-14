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

    public static int helper(int [] data, int x){
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
	    int min = data[helper(data,i)];
	    data[helper(data,i)] = data[i];
	    data[i] = min;
	}

    }

    public static void main(String [] arg){
	int [] test = {5,7,3,9,35,456,4,567,34};
	
	//System.out.println(helper(test,4));

	selectionSort(test);
	for (int x: test){
	  System.out.print(x + " ");
	}
    }

}
