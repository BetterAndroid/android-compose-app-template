package __PACKAGE_NAME__.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.highcapable.flexiui.FlexiTheme
import com.highcapable.flexiui.defaultColors

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = defaultColors(darkTheme)
    // Customize Flexi UI theme styles.
    FlexiTheme(
        colors = colorScheme,
        content = content
    )
}