package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ResumeDetailsActivity extends AppCompatActivity {

    EditText edtNAME,edtNUMBER,edtEMAIL,edtADDRESS, edtJob,edtSSC,edtHSC,edtClgName,edt10th_yr,edt12th_yr,edtGRADUATION_yr,edtPAST_EXP;

    CheckBox cbENGLISH,cbHINDI,cbMARATHI,cbGUJARATI,cbSINGING,cbDANCING,cbREADING,cbTRAVELLING,cbMOVIE,cbLEARNING_hobby,cbPLAYING,cbWRITING,
            cbLEADERHIP,cbCODDING,cbLEARNING_skill,cbUSER_INTERFACE,cbTEAM_WORK,cbCOMMMUNICATE;
    RadioGroup gbMARITAL_STATUS,rbGENDER;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_details);


            initview();



    }

    private void initview() {



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

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = edtNAME.getText().toString();
                String SSC = edtSSC.getText().toString();
                String HSC = edtHSC.getText().toString();
                String CLGname = edtClgName.getText().toString();

                String add = edtADDRESS.getText().toString();
                String job = edtJob.getText().toString();
                String number = edtNUMBER.getText().toString();
                String mail = edtEMAIL.getText().toString();
                String sscYR = edt10th_yr.getText().toString();
                String hscYR = edt12th_yr.getText().toString();
                String clgYR = edtGRADUATION_yr.getText().toString();
                String pastExp = edtPAST_EXP.getText().toString();
              /*  String sing = cbSINGING.getText().toString();
                String dance = cbDANCING.getText().toString();
                String read = cbREADING.getText().toString();
                String travel = cbTRAVELLING.getText().toString();
                String movie = cbMOVIE.getText().toString();
                String learn = cbLEARNING_hobby.getText().toString();
                String play = cbPLAYING.getText().toString();
                String write = cbWRITING.getText().toString();*/

                StringBuilder selectedHobbies = new StringBuilder();

                if (cbSINGING.isChecked()) {
                    selectedHobbies.append("SINGING, ");
                }
                if (cbDANCING.isChecked()) {
                    selectedHobbies.append("DANCING,");
                }
                if (cbREADING.isChecked()) {
                    selectedHobbies.append("READING, ");
                }
                if (cbTRAVELLING.isChecked()) {
                    selectedHobbies.append("TRAVELLING, ");
                }
                if (cbMOVIE.isChecked()) {
                    selectedHobbies.append("MOVIE,");
                }
                if (cbLEARNING_hobby.isChecked()) {
                    selectedHobbies.append("LEARNING, ");
                }
                if (cbPLAYING.isChecked()) {
                    selectedHobbies.append("PLAYING,");
                }
                if (cbWRITING.isChecked()) {
                    selectedHobbies.append("WRITING.");
                }
                // Add more checkboxes as needed

                // Get the selected checkboxes as a string
                String selectedHobbiesStr = selectedHobbies.toString();

                // Put the string into the intent


                StringBuilder selectedSkills = new StringBuilder();

                if (cbLEADERHIP.isChecked()) {
                    selectedSkills.append("LEADERSHIP, ");
                }
                if (cbCODDING.isChecked()) {
                    selectedSkills.append("CODDING,");
                }
                if (cbLEARNING_skill.isChecked()) {
                    selectedSkills.append("LEARNING, ");
                }
                if (cbUSER_INTERFACE.isChecked()) {
                    selectedSkills.append("USER INTERFACE, ");
                }

                if (cbCOMMMUNICATE.isChecked()) {
                    selectedSkills.append("COMMUNICATION, ");
                }
                if (cbTEAM_WORK.isChecked()) {
                    selectedSkills.append("TEAM WORK.");
                }

                String selectedSkillsStr = selectedSkills.toString();

            if (name.isEmpty() || SSC.isEmpty() || HSC.isEmpty() || CLGname.isEmpty() || add.isEmpty() ||
                        job.isEmpty() || number.isEmpty() || mail.isEmpty() || sscYR.isEmpty() ||
                        hscYR.isEmpty() || clgYR.isEmpty() || pastExp.isEmpty())

                {
                    Toast.makeText(ResumeDetailsActivity.this, "Please complete all the required details", Toast.LENGTH_SHORT).show();
                }

                else {


                    Intent i = new Intent(ResumeDetailsActivity.this, MainActivity.class);


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