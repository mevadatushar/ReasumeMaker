package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Design3Activity extends AppCompatActivity {


    TextView txtName,txtJobName,txtNumber,txtMail,txtAddress
            ,txtSscName,txtSscYear,txtHscName,txtHscYear,txtGradName
            ,txtClgYear,txtSkills,txtExperience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design3);

        initview();

    }


    private void initview() {
        txtName=findViewById(R.id.txtName);
        txtJobName=findViewById(R.id.txtJobName);
        txtNumber=findViewById(R.id.txtNumber);
        txtMail=findViewById(R.id.txtMail);
        txtAddress=findViewById(R.id.txtAddress);
        txtSscName=findViewById(R.id.txtSscName);
        txtSscYear=findViewById(R.id.txtSscYear);
        txtHscName=findViewById(R.id.txtHscName);
        txtHscYear=findViewById(R.id.txtHscYear);
        txtGradName=findViewById(R.id.txtGradName);
        txtClgYear=findViewById(R.id.txtClgYear);
        txtSkills=findViewById(R.id.txtSkills);

        txtExperience=findViewById(R.id.txtExperience);


        if (getIntent()!=null)
        {
            String getData = getIntent().getStringExtra("name");
            txtName.setText(getData);

            String getData1 = getIntent().getStringExtra("job");
            txtJobName.setText(getData1);

            String getData2 = getIntent().getStringExtra("number");
            txtNumber.setText(getData2);

            String getData3 = getIntent().getStringExtra("mail");
            txtMail.setText(getData3);

            String getData4 = getIntent().getStringExtra("add");
            txtAddress.setText(getData4);

            String getData5 = getIntent().getStringExtra("SSC");
            txtSscName.setText(getData5);

            String getData6 = getIntent().getStringExtra("sscYR");
            txtSscYear.setText(getData6);

            String getData7 = getIntent().getStringExtra("HSC");
            txtHscName.setText(getData7);

            String getData8 = getIntent().getStringExtra("hscYR");
            txtHscYear.setText(getData8);

            String getData9 = getIntent().getStringExtra("CLGname");
            txtGradName.setText(getData9);

            String getData10 = getIntent().getStringExtra("clgYR");
            txtClgYear.setText(getData10);

            String getData13 = getIntent().getStringExtra("pastExp");
            txtExperience.setText(getData13);


            String selectedSkills = getIntent().getStringExtra("selectedSkills");
            txtSkills.setText(selectedSkills);
         /*
            String getData11 = getIntent().getStringExtra("");
            txtSkills.setText(getData11);

            String getData12 = getIntent().getStringExtra("");
            txtHobbies.setText(getData12);

            String getData13 = getIntent().getStringExtra("dance"+","+"sing"+","+"travel"+","+"travel"+","+"movie"+","+"learn"+","+"play"+","+"write");
            txtExperience.setText(getData13);

*/


        }

    }
}



