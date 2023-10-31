package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edtNAME,edtNUMBER,edtEMAIL,edtADDRESS, edtJob,edtSSC,edtHSC,edtClgName,edt10th_yr,edt12th_yr,edtGRADUATION_yr,edtPAST_EXP;

    CheckBox cbENGLISH,cbHINDI,cbMARATHI,cbGUJARATI,cbSINGING,cbDANCING,cbREADING,cbTRAVELLING,cbMOVIE,cbLEARNING_hobby,cbPLAYING,cbWRITING,
            cbLEADERHIP,cbCODDING,cbLEARNING_skill,cbUSER_INTERFACE,cbTEAM_WORK,cbCOMMMUNICATE;
    RadioGroup gbMARITAL_STATUS,rbGENDER;
    Button btnSubmit;

    ImageView imgFirst,imgSecond,imgThird,imgFourth,imgFifth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // EDIT TEXT

        edtNAME=findViewById(R.id.edtNAME);
        edtNUMBER=findViewById(R.id.edtNUMBER);
        edtEMAIL=findViewById(R.id.edtEMAIL);
        edtADDRESS=findViewById(R.id.edtADDRESS);
        edt10th_yr=findViewById(R.id.edt10th_yr);
        edt12th_yr=findViewById(R.id.edt12th_yr);
        edtJob=findViewById(R.id.edtJob);
        edtSSC=findViewById(R.id.edtSSC);
        edtHSC=findViewById(R.id.edtHSC);
        edtClgName=findViewById(R.id.edtClgName);
        edtGRADUATION_yr=findViewById(R.id.edtGRADUATION_yr);
        edtPAST_EXP=findViewById(R.id.edtPAST_EXP);
        //CHECK BOX
        cbENGLISH=findViewById(R.id.cbENGLISH);
        cbHINDI=findViewById(R.id.cbHINDI);
        cbSINGING=findViewById(R.id.cbSINGING);
        cbDANCING=findViewById(R.id.cbDANCING);
        cbREADING=findViewById(R.id.cbREADING);
        cbTRAVELLING=findViewById(R.id.cbTRAVELLING);
        cbMOVIE=findViewById(R.id.cbMOVIE);
        cbLEARNING_hobby=findViewById(R.id.cbLEARNING_hobby);
        cbPLAYING=findViewById(R.id.cbPLAYING);
        cbWRITING=findViewById(R.id.cbWRITING);
        cbLEADERHIP=findViewById(R.id.cbLEADERHIP);
        cbCODDING=findViewById(R.id.cbCODDING);
        cbLEARNING_skill=findViewById(R.id.cbLEARNING_skill);
        cbUSER_INTERFACE=findViewById(R.id.cbUSER_INTERFACE);
        cbTEAM_WORK=findViewById(R.id.cbTEAM_WORK);
        cbCOMMMUNICATE=findViewById(R.id.cbCOMMMUNICATE);
        //RADIO GROUP
        gbMARITAL_STATUS=findViewById(R.id.gbMARITAL_STATUS);
        rbGENDER=findViewById(R.id.rbGENDER);
        //BUTTON
        btnSubmit=findViewById(R.id.btnSubmit);



        imgFirst=findViewById(R.id.imgFirst);
        imgSecond=findViewById(R.id.imgSecond);
        imgThird=findViewById(R.id.imgThird);
        imgFourth=findViewById(R.id.imgFourth);
        imgFifth=findViewById(R.id.imgFifth);

        intent();




    }

    private void intent() {

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String SSC = intent.getStringExtra("SSC");
        String HSC = intent.getStringExtra("HSC");
        String CLGname = intent.getStringExtra("CLGname");
        String add = intent.getStringExtra("add");
        String job = intent.getStringExtra("job");
        String number = intent.getStringExtra("number");
        String mail = intent.getStringExtra("mail");
        String sscYR = intent.getStringExtra("sscYR");
        String hscYR = intent.getStringExtra("hscYR");
        String clgYR = intent.getStringExtra("clgYR");
        String pastExp = intent.getStringExtra("pastExp");

        String selectedHobbiesStr = intent.getStringExtra("selectedHobbies");

        String selectedSkillsStr = intent.getStringExtra("selectedSkills");



        imgFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


              if (name.isEmpty() || SSC.isEmpty() || HSC.isEmpty() || CLGname.isEmpty() || add.isEmpty() ||
                        job.isEmpty() || number.isEmpty() || mail.isEmpty() || sscYR.isEmpty() ||
                        hscYR.isEmpty() || clgYR.isEmpty() || pastExp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please complete all the required details", Toast.LENGTH_SHORT).show();
                } else {


                    Intent i = new Intent(MainActivity.this, MainResumeActivity.class);


                    i.putExtra("name", name);
                    i.putExtra("number", number);
                    i.putExtra("add", add);
                    i.putExtra("mail", mail);
                    i.putExtra("sscYR", sscYR);
                    i.putExtra("hscYR", hscYR);
                    i.putExtra("clgYR", clgYR);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("job", job);
                    i.putExtra("SSC", SSC);
                    i.putExtra("HSC", HSC);
                    i.putExtra("CLGname", CLGname);
                    i.putExtra("sscY", job);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("selectedHobbies", selectedHobbiesStr);
                    i.putExtra("selectedSkills", selectedSkillsStr);
                    startActivity(i);
                }
         }

        });

        imgSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.isEmpty() || SSC.isEmpty() || HSC.isEmpty() || CLGname.isEmpty() || add.isEmpty() ||
                        job.isEmpty() || number.isEmpty() || mail.isEmpty() || sscYR.isEmpty() ||
                        hscYR.isEmpty() || clgYR.isEmpty() || pastExp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please complete all the required details", Toast.LENGTH_SHORT).show();
                } else {


                    Intent i = new Intent(MainActivity.this, Design2Activity.class);


                    i.putExtra("name", name);
                    i.putExtra("number", number);
                    i.putExtra("add", add);
                    i.putExtra("mail", mail);
                    i.putExtra("sscYR", sscYR);
                    i.putExtra("hscYR", hscYR);
                    i.putExtra("clgYR", clgYR);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("job", job);
                    i.putExtra("SSC", SSC);
                    i.putExtra("HSC", HSC);
                    i.putExtra("CLGname", CLGname);
                    i.putExtra("sscY", job);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("selectedHobbies", selectedHobbiesStr);
                    i.putExtra("selectedSkills", selectedSkillsStr);
                    startActivity(i);
                }
            }
        });

        imgThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.isEmpty() || SSC.isEmpty() || HSC.isEmpty() || CLGname.isEmpty() || add.isEmpty() ||
                        job.isEmpty() || number.isEmpty() || mail.isEmpty() || sscYR.isEmpty() ||
                        hscYR.isEmpty() || clgYR.isEmpty() || pastExp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please complete all the required details", Toast.LENGTH_SHORT).show();
                } else {


                    Intent i = new Intent(MainActivity.this, Design3Activity.class);


                    i.putExtra("name", name);
                    i.putExtra("number", number);
                    i.putExtra("add", add);
                    i.putExtra("mail", mail);
                    i.putExtra("sscYR", sscYR);
                    i.putExtra("hscYR", hscYR);
                    i.putExtra("clgYR", clgYR);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("job", job);
                    i.putExtra("SSC", SSC);
                    i.putExtra("HSC", HSC);
                    i.putExtra("CLGname", CLGname);
                    i.putExtra("sscY", job);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("selectedHobbies", selectedHobbiesStr);
                    i.putExtra("selectedSkills", selectedSkillsStr);
                    startActivity(i);
                }
            }
        });
        imgFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (name.isEmpty() || SSC.isEmpty() || HSC.isEmpty() || CLGname.isEmpty() || add.isEmpty() ||
                        job.isEmpty() || number.isEmpty() || mail.isEmpty() || sscYR.isEmpty() ||
                        hscYR.isEmpty() || clgYR.isEmpty() || pastExp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please complete all the required details", Toast.LENGTH_SHORT).show();
                } else {


                    Intent i = new Intent(MainActivity.this, Design4Activity.class);


                    i.putExtra("name", name);
                    i.putExtra("number", number);
                    i.putExtra("add", add);
                    i.putExtra("mail", mail);
                    i.putExtra("sscYR", sscYR);
                    i.putExtra("hscYR", hscYR);
                    i.putExtra("clgYR", clgYR);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("job", job);
                    i.putExtra("SSC", SSC);
                    i.putExtra("HSC", HSC);
                    i.putExtra("CLGname", CLGname);
                    i.putExtra("sscY", job);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("selectedHobbies", selectedHobbiesStr);
                    i.putExtra("selectedSkills", selectedSkillsStr);
                    startActivity(i);
                }
            }
        });
        imgFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.isEmpty() || SSC.isEmpty() || HSC.isEmpty() || CLGname.isEmpty() || add.isEmpty() ||
                        job.isEmpty() || number.isEmpty() || mail.isEmpty() || sscYR.isEmpty() ||
                        hscYR.isEmpty() || clgYR.isEmpty() || pastExp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please complete all the required details", Toast.LENGTH_SHORT).show();
                } else {


                    Intent i = new Intent(MainActivity.this, Design5Activity.class);


                    i.putExtra("name", name);
                    i.putExtra("number", number);
                    i.putExtra("add", add);
                    i.putExtra("mail", mail);
                    i.putExtra("sscYR", sscYR);
                    i.putExtra("hscYR", hscYR);
                    i.putExtra("clgYR", clgYR);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("job", job);
                    i.putExtra("SSC", SSC);
                    i.putExtra("HSC", HSC);
                    i.putExtra("CLGname", CLGname);
                    i.putExtra("sscY", job);
                    i.putExtra("pastExp", pastExp);
                    i.putExtra("selectedHobbies", selectedHobbiesStr);
                    i.putExtra("selectedSkills", selectedSkillsStr);
                    startActivity(i);
                }
            }
        });

    }
}