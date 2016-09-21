package watcharin.sutfriend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by User on 21/9/2559.
 */
public class MyAlert {

    // Explicit
    private Context context;
    private  int anInt;
    private String titlestring, messageString;

    public MyAlert(Context context, int anInt, String titlestring, String messageString) {
        this.context = context;
        this.anInt = anInt;
        this.titlestring = titlestring;
        this.messageString = messageString;
    }
    public  void  myDialong(){
     AlertDialog.Builder builder = new  AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titlestring);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

} //main Class
