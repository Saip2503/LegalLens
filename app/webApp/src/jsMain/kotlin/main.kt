import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.legallens.ui.MainAppView

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("LegalLens") {
        MainAppView()
    }
}
