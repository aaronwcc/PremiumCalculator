package com.example.premiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerAge.onItemSelectedListener = this

        btnCalculate.setOnClickListener {
            calculatePremium()
        }

        btnReset.setOnClickListener { reset() }
    }

    private fun calculatePremium(){
        val position = spinnerAge.selectedItemPosition
        val age = spinnerAge.getChildAt(position)
        val gender = radioGroupGender.checkedRadioButtonId
        if(gender == R.id.radMale){

        }
        else if(gender == R.id.radFemale){

        }

        if(chkSmoker.isChecked){

        }



    }

    private fun reset(){
        
    }


}
