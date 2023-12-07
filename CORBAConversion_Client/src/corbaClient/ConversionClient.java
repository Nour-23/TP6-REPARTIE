package corbaClient;

import corbaConversion.IConversionRemote;
import corbaConversion.IConversionRemoteHelper;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            // Initialisation de l'ORB
            Context ctx = new InitialContext();
         java.lang.Object ref = ctx.lookup("0D");



            // Récupération de la référence de l'objet distant
            IConversionRemote stub = IConversionRemoteHelper.narrow((org.omg.CORBA.Object)ref);



            System.out.println(stub.ConvertirMontant(70.00)) ;
            System.out.println(stub.ConvertirMontant(150.00));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
