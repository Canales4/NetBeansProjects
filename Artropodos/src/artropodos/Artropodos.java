package artropodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*@author Canales-PC*/
public class Artropodos {
    public static void main(String[] args) {
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String ins = br.readLine();
            StringTokenizer st = new StringTokenizer(ins);
            if(5 == st.countTokens()){
                char []a = ins.toCharArray();
                //int o = Integer.parseInt(a[0]);
                //System.out.println(o);
            }

        }catch(IOException ioe){System.err.println(ioe);}   
    }
    
}
