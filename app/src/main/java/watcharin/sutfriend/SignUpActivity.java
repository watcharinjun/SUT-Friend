package watcharin.sutfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SignUpActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
private EditText nameEditText,addressEditText,phoneEditText,userEditText,passwordEditText;
    private String nameSting, addressSting, phoneSting, userSting, passwordSting,imageSting, genderSting;
    private RadioButton maleRadioButton, femaleRedioButton;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        addressEditText = (EditText) findViewById(R.id.editText2);
        phoneEditText = (EditText) findViewById(R.id.editText3);
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);
        maleRadioButton = (RadioButton) findViewById(R.id.radioButton);
        femaleRedioButton = (RadioButton) findViewById(R.id.radioButton2);
        imageView = (ImageView) findViewById(R.id.imageView);
        // ImagrView Controller
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("imge/*");
                startActivityForResult(Intent.createChooser(intent,"โปรเลือกรูปภาพ"),1);
            }//onCilck
        });


    } // Main Metthod


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((resultCode == 1)&&(resultCode == RESULT_OK)) {
            Log.d("SUTfriendV1","Resule ==> Success");
        }

    }

    public  void  clickStingUpsing(View view){

        //Get value From Edit Text
        nameSting = nameEditText.getText().toString().trim();
        addressSting = addressEditText.getText().toString().trim();
        phoneSting = phoneEditText.getText().toString().trim();
        userSting = userEditText.getText().toString().trim();
        passwordSting = passwordEditText.getText().toString().trim();
         //Chrck Space
        if (nameSting.equals("")|| addressSting.equals("")|| phoneSting.equals("")|| userSting.equals("")||passwordSting.equals("")){
             //Have Space
            MyAlert myAler = new MyAlert(this,R.drawable.doremon48,"มีช่องว่าง","กรุณากรอกทุกช่องค่ะ" );
            myAler.myDialong();

        } else if (!(maleRadioButton.isChecked() || femaleRedioButton.isChecked())) {
            //Non Checkr
            MyAlert myAlert = new MyAlert(this, R.drawable.nobita48,"ยังไม่เลือก Gender","กรุณาเลือก Gende");
            myAlert.myDialong();
        }




    }//clickSing
}//Main class
