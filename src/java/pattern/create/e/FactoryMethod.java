package pattern.create.e;

public class FactoryMethod {
    
    public static void main(String[]args){
        System.out.println("------------Ejemplo de Factory Method-----------");
        ComplexNumber imaginario = ComplexNumber.valueOf(4.3f, 5.6f);
        ComplexNumber imaginario2 = ComplexNumber.valueOf(22.55f, 77.11f);
        System.out.println(imaginario);
        System.out.println(imaginario2);
        System.out.println("------------Ejemplo de Factory Method-----------");
    }
    
}

class ComplexNumber {

  public static ComplexNumber valueOf(float aReal, float aImaginary) {
    return new ComplexNumber(aReal, aImaginary);
  }

  private ComplexNumber (float aReal, float aImaginary) {
    fReal = aReal;
    fImaginary = aImaginary;
  }

  private float fReal;
  private float fImaginary;
  @Override
  public String toString(){
      return "" + fReal + " + " + fImaginary + "i";
  }
} 