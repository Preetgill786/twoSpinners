package com.example.twospinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp1,sp2;
    EditText edtSalary,edtNetSalary;
    String[] salary= {"60000","65000","90000","80000","90000","75000"};
    String[] netSalary={"60000","65000","90000","80000","90000","75000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSalary = findViewById(R.id.salary);
        edtNetSalary=findViewById(R.id.netSalary);
//list for jobs
        List<String> jobList=new ArrayList<String>();
        jobList.add("Programmer");
        jobList.add("Accountant");
        jobList.add("Manager");
        jobList.add("App Developer");
        jobList.add("Data scientist");
        jobList.add("Engineer");
//list  for qualification
        List<String> qualList=new ArrayList<String>();
        qualList.add("PhD");
        qualList.add("Masters");
        qualList.add("Bachelors");
        qualList.add("Diploma");
        qualList.add("Certificate");
        qualList.add("High School");








        sp1 = findViewById(R.id.jobspin);
      sp2 = findViewById(R.id.qualSpin);
        //creating adapter
        ArrayAdapter<String> jobAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,jobList);
        //make drop down style
        jobAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        sp1.setAdapter(jobAdapter);
        sp1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        //creating adapter
     ArrayAdapter<String> qualAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,qualList);
        //make drop down style
      qualAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
      sp2.setAdapter(qualAdapter);
        sp2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

     if(v.getId() == R.id.jobspin) {
    String item = salary[position];
    edtSalary.setText(item);
}

        else if(v.getId()== R.id.qualSpin){
            String item2 = netSalary[position];
            edtNetSalary.setText(item2);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
