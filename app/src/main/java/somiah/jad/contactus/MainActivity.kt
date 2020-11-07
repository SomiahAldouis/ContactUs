package somiah.jad.contactus

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private lateinit var mapButton: ImageButton
    private lateinit var githunButton: Button
    private lateinit var behanceButton: Button
    private lateinit var instagramButton: Button
    private lateinit var callButton: Button
    private lateinit var emailButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapButton = findViewById(R.id.map_button)
        githunButton = findViewById(R.id.github_button)
        behanceButton = findViewById(R.id.behance_button)
        instagramButton = findViewById(R.id.instagram_button)
        callButton = findViewById(R.id.call_button)
        emailButton = findViewById(R.id.email_button)

        mapButton.setOnClickListener {
            val mapIntent = Intent().apply {
                action =Intent.ACTION_VIEW
                data = Uri.parse("geo:33.2,44.8")
            }
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }
        githunButton.setOnClickListener {
            val githubIntent = Intent().apply {
                action =Intent.ACTION_VIEW
                data = Uri.parse("https://github.com/SomiahAldouis")
            }
            if (githubIntent.resolveActivity(packageManager) != null) {
                startActivity(githubIntent)
            }
        }
        behanceButton.setOnClickListener {
            val behanceIntent = Intent().apply {
                action =Intent.ACTION_VIEW
                data = Uri.parse("https://www.behance.net/somiahjama5dfa")
            }
            if (behanceIntent.resolveActivity(packageManager) != null) {
                startActivity(behanceIntent)
            }
        }
        instagramButton.setOnClickListener {
            val instaIntent = Intent().apply {
                action =Intent.ACTION_VIEW
                data = Uri.parse("https://www.instagram.com/somiahaldouis/")
            }
            if (instaIntent.resolveActivity(packageManager) != null) {
                startActivity(instaIntent)
            }
        }
        callButton.setOnClickListener {





        }
        emailButton.setOnClickListener {




        }
    }
}