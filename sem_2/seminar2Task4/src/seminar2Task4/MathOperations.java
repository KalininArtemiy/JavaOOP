package seminar2Task4;

public interface MathOperations {
    int add(int a, int b);
   
    
    default int substract (int a, int b){
        return a - b; 
    }
}
