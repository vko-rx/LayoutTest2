package kr.hs.emirim.kjminn.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class Direct5_3Activity : AppCompatActivity() {
    lateinit var edit: EditText
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear1 = LinearLayout(this)
        linear1.orientation = LinearLayout.VERTICAL
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1, params)

        edit = EditText(this)
        edit.hint = "Enter any text..."
        edit.textSize = 20f
        linear1.addView(edit)

        var btn = Button(this)
        btn.text = "버튼입니다."
        btn.setBackgroundColor(Color.rgb(255, 255, 0))
        linear1.addView(btn)

        text = TextView(this)
        text.text = "Part of result"
        text.textSize = 20f
        text.setTextColor(Color.rgb(128, 0, 128))
        linear1.addView(text)

        btn.setOnClickListener {
            text.text = edit.text
        }
    }
}