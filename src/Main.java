import java.time.temporal.JulianFields;

public class Main
{
    public static void main(String[] args)
    {
        boolean flag = true;
        Tree lemonTree = new Tree();
        while(flag)
        {
            switch (JUtil.optionD("Elige que quiere hacer.",new String[]{"Añadir","Ver","Salir"})+1) {
                case 1 ->
                {
                    if (lemonTree.father == null) lemonTree.initialize(JUtil.stringIn("Inicializa el nodo padre... \n Dame una palabra."));
                    else
                        lemonTree.add(JUtil.stringIn("Dame una palabra."));
                }
                case 2 -> lemonTree.print();
                case 3 -> flag = false;
            }
        }
        JUtil.message("Saliendo");
    }
}




