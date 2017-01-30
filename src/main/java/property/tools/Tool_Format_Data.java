package property.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tool_Format_Data {
    public String getActualData() {
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateActual = formatter.format(now);

        return dateActual;
    }
    public String toCharacterArray(String s){
        if ( s == null ) {
            return null;
        }

        int len = s.length();
        char[] array = new char[len];
        for (int i = 0; i < len ; i++) {
            array[i] = new Character(s.charAt(i));
        }
       Integer a= Character.getNumericValue(s.charAt(5));
        int b= Character.getNumericValue(s.charAt(6));
         if(a==1){
             a=0;
             array[5]='0';
         }
      
        String data= new String(array);
        return data;

    }

}
