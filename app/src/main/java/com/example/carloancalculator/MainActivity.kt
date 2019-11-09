package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener()
        {
            calculate()
        }
    }

    fun calculate()
    {
        val carPrice:Double = txtCarPrice.text.toString().toDouble()
        val downPayment:Double = txtDownPayment.text.toString().toDouble()
        val carLoan:Double

        carLoan = carPrice - downPayment
        txtCarLoan.text = "RM " + "%.2f".format(carLoan)

        val rate:Double = txtInterestRate.text.toString().toDouble()
        val loanPeriod:Int = txtLoanPeriod.text.toString().toInt()
        val interest:Double

        interest = carLoan * rate * loanPeriod
        txtInterest.text = "RM " + "%.2f".format(interest)

        val monthlyRepayment:Double

        monthlyRepayment = (carLoan + interest) / loanPeriod / 12
        txtMonthlyRepayment.text = "RM " + "%.2f".format(monthlyRepayment)
    }


}
