public class SuperArrayIterator implements Iterator<String>{
    SuperArray ary; 
    int start; 
  
    public SuperArrayIterator (SuperArray a){
        this.ary = a;
        start = 0;
    }
  
    public boolean hasNext (){
        return start < ary.isze;
    }
  
    public String next(){
        if (hasNext()){
            return ary.get(start);
        }
    }
    
    public void remove(){
           throw new UnsupportedOperationException();
    }
