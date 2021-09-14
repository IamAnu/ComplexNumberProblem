
public class ComplexNumbers {
	// Complete this class
	int real;
    int img;
     ComplexNumbers(int real,int img){
         this.real=real;
         this.img=img;
         
     }
public void plus( ComplexNumbers b){
    this.real=this.real+b.real;
    this.img=this.img+b.img; 
    
}
    public void multiply(ComplexNumbers b){
        int n;
        n=(this.real*b.real)-(this.img*b.img);
        int a=(this.real*b.img);
       int c= (this.img*b.real);
        this.img=a+c;
        this.real=n;
        
    }
     public void print()
    {
        System.out.println(this.real + " + i" + this.img);
    }
    
}








