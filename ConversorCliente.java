import java.rmi.Naming;

public class ConversorCliente {
    private static Conversor calc = null;

    public static void main(String[] args) {
        try {
            calc = (Conversor) Naming.lookup("rmi://10.0.2.15:11099/RMIInterface");
            System.out.println(String.valueOf(calc.euro_real(10)));
            System.out.println(String.valueOf(calc.real_euro(10)));
            System.out.println(String.valueOf(calc.dolar_real(10)));
            System.out.println(String.valueOf(calc.real_dolar(10)));
        }
        catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
}