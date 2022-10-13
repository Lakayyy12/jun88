package ic.saeroyi.dbpub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class TermsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_page)

        val webTerms = findViewById<WebView>(R.id.webTerms)

        webTerms.webViewClient = WebViewClient()
        webTerms.apply {
            loadUrl("file:///android_asset/terms.html")
        }
    }
}