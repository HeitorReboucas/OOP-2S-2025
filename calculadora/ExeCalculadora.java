import calculadorapac.Calculadora;

public class ExeCalculadora {
public static void main(String[] args){
   Calculadora calc1 = new Calculadora();
   Calculadora calc2 = new Calculadora();

   calc1.Numero1 = 2.0;
   calc1.Numero2 = 3.0;

   calc2.Numero1 = 10.0;
   calc2.Numero2 = 5.0;

   calc1.somar();
   calc2.somar();
}


}
