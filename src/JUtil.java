import javax.swing.*;

public class JUtil {

    public static String stringIn()
    {
        boolean flag = false;
        String data = "";

        while (!flag) {
            data = JOptionPane.showInputDialog("Dame una palabra.");
            if (!data.isEmpty())
                flag = true;
        }
        return data;
    }

    public static int optionD(String dialog, String[] options){
        int o;
        do {
            o = JOptionPane.showOptionDialog(null, String.format("%s", dialog), "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        }while (o<0);
        return  o;
    }

    public static void message(String data)
    {

    }
}