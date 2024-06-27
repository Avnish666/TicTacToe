package com.model.tictactoe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var flag=0
    var count=0
private lateinit var btn1 : Button
    private lateinit var btn2: Button
    private lateinit var btn3 : Button
    private lateinit var btn4: Button
    private lateinit var btn5 : Button
    private lateinit var btn6 : Button
    private lateinit var btn7 : Button
    private lateinit var btn8 : Button
    private lateinit var btn9 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)
        btn4 = findViewById<Button>(R.id.btn4)
        btn5 = findViewById<Button>(R.id.btn5)
        btn6 = findViewById<Button>(R.id.btn6)
        btn7 = findViewById<Button>(R.id.btn7)
        btn8 = findViewById<Button>(R.id.btn8)
        btn9 = findViewById<Button>(R.id.btn9)

        btn1.setOnClickListener {
            check(it)
        }
        btn2.setOnClickListener {
            check(it)
        }
        btn3.setOnClickListener {
            check(it)
        }
        btn4.setOnClickListener {
            check(it)
        }
        btn5.setOnClickListener {
            check(it)
        }
        btn6.setOnClickListener {
            check(it)
        }
        btn7.setOnClickListener {
            check(it)
        }
        btn8.setOnClickListener {
            check(it)
        }
        btn9.setOnClickListener {
            check(it)
        }



    }
    fun check(view: View) {
        val btnCurrent = view as Button
        if (btnCurrent.text == "") {
            count++
            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1
            } else {
                btnCurrent.text = "O"
                flag = 0
            }

            val b1 = findViewById<Button>(R.id.btn1).text.toString()
            val b2 = findViewById<Button>(R.id.btn2).text.toString()
            val b3 = findViewById<Button>(R.id.btn3).text.toString()
            val b4 = findViewById<Button>(R.id.btn4).text.toString()
            val b5 = findViewById<Button>(R.id.btn5).text.toString()
            val b6 = findViewById<Button>(R.id.btn6).text.toString()
            val b7 = findViewById<Button>(R.id.btn7).text.toString()
            val b8 = findViewById<Button>(R.id.btn8).text.toString()
            val b9 = findViewById<Button>(R.id.btn9).text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this, "Winner is ${b1}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this, "Winner is ${b4}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is ${b7}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this, "Winner is ${b1}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this, "Winner is ${b2}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is ${b3}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is ${b5}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this, "Winner is ${b5}", Toast.LENGTH_LONG).show()
                newGame()
            }

            else if (count==9) {
                Toast.makeText(this, "Match is Draw", Toast.LENGTH_LONG).show()
                newGame()
            }
        }
    }
    fun newGame(){
        val bu1 = findViewById<Button>(R.id.btn1)
        val bu2 = findViewById<Button>(R.id.btn2)
        val bu3 = findViewById<Button>(R.id.btn3)
        val bu4 = findViewById<Button>(R.id.btn4)
        val bu5 = findViewById<Button>(R.id.btn5)
        val bu6 = findViewById<Button>(R.id.btn6)
        val bu7 = findViewById<Button>(R.id.btn7)
        val bu8 = findViewById<Button>(R.id.btn8)
        val bu9 = findViewById<Button>(R.id.btn9)
        bu1.text=""
        bu2.text=""
        bu3.text=""
        bu4.text=""
        bu5.text=""
        bu6.text=""
        bu7.text=""
        bu8.text=""
        bu9.text=""
        flag=0
        count=0
    }

}