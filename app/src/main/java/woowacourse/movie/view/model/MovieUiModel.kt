package woowacourse.movie.view.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate
import java.time.LocalTime

typealias TheaterName = String
typealias ScreeningTimes = List<LocalTime>

@Parcelize
data class MovieUiModel(
    val title: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val runningTime: Int,
    val posterResourceId: Int,
    val summary: String,
    val schedule: Map<TheaterName, ScreeningTimes>,
) : Parcelable
