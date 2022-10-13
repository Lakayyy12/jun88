package ic.saeroyi.dbpub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.*
import android.view.Window
import android.view.animation.Animation
import android.widget.Button
import android.widget.Toast
import ic.saeroyi.dbpub.mini.Tiktak
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonWeb: Button = findViewById(R.id.buttonWeb)
        buttonWeb.setOnClickListener {
            val intent = Intent(this, WebActivity::class.java)
            startActivity(intent)
        }
        val buttonTerms: Button = findViewById(R.id.buttonTerms)
        buttonTerms.setOnClickListener {
            val intent = Intent(this, TermsPage::class.java)
            startActivity(intent)
        }
        val buttonPrivacy: Button = findViewById(R.id.buttonPrivacy)
        buttonPrivacy.setOnClickListener {
            val intent = Intent(this, PrivacyPage::class.java)
            startActivity(intent)
        }
        val buttonPlay: Button = findViewById(R.id.buttonPlay)
        buttonPlay.setOnClickListener {
            val intent = Intent(this, Tiktak::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}