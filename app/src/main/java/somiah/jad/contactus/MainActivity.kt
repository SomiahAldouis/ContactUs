package somiah.jad.contactus

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageButton

private val CONTACT_RESULT = 0

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

        //------------------------- Share ----------------------------//
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
            val pickContactIntent = Intent( ).apply {
                    action = Intent.ACTION_PICK
                    data = ContactsContract.Contacts.CONTENT_URI
                }
            if (pickContactIntent.resolveActivity(packageManager) != null) {
                startActivityForResult(pickContactIntent,CONTACT_RESULT)
            }
        }
        emailButton.setOnClickListener {
            val emailIntent = Intent().apply {
                Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("somiahjamal1997@gmail.com"))
                putExtra(Intent.EXTRA_TEXT,"Subject No.1" )
                putExtra(Intent.EXTRA_SUBJECT, "this is Message from my App to Email")
            }
            if(emailIntent.resolveActivity(packageManager) != null ){
                startActivity(emailIntent)
            }
        }

        //------------------------- Result Contact ----------------------------//
//        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//            when {
//                resultCode != RESULT_OK -> return
//                requestCode == CONTACT_RESULT && data != null -> {
//                    val contactUri: Uri? = data.data
//                    val queryFields = arrayOf(ContactsContract.Contacts.DISPLAY_NAME)
//                    val cursor = requireActivity().contentResolver
//                        .query(contactUri, queryFields, null, null, null)
//                    cursor?.use {
//                        if (it.count == 0) {
//                            return
//                        }
//                        it.moveToFirst()
//                    }
//                }
//            }
//        }

    }
}