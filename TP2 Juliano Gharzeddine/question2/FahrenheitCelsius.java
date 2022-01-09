package question2;
public class FahrenheitCelsius
{

    public static  float  fahrenheitEnCelsius ( int  f ) 
    {  
        float converted = ((int)(5/9f*(f-32)*10)/10.0f);
        return converted ;
    }
    
    public static void main(String[] args) {
        int i =0;
        float cel ;
        int fah ;
        
        try { 
        while(i<args.length){
            fah = Integer.parseInt(args[i]);
            cel = fahrenheitEnCelsius(fah);
            System.out.println(fah +"°F -> "+cel+"°C");
            i++;
        }
    } catch(NumberFormatException ex) {
        System.out.println("Erreur : "+ex);
    }
    }

}
