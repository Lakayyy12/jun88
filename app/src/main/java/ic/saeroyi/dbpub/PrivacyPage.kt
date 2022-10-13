package ic.saeroyi.dbpub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_privacy_page.*

class PrivacyPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_page)

        webViewSetUp()
    }

    private fun webViewSetUp() {
        webPrivacy.webViewClient = WebViewClient()
        webPrivacy.apply {
            loadUrl("file:///android_asset/privacy.html")
        }
    }
}