package woowacourse.movie.util

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Parcelable

inline fun <reified T : Parcelable> Intent.getParcelableCompat(key: String): T? {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        return getParcelableExtra(key, T::class.java)
    }
    @Suppress("DEPRECATION")
    return getParcelableExtra(key) as? T
}

inline fun <reified T : Parcelable> Bundle.getParcelableCompat(key: String): T? {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        return getParcelable(key, T::class.java)
    }
    @Suppress("DEPRECATION")
    return getParcelable(key) as? T
}
