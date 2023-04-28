package woowacourse.movie.view.moviemain.reservationlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import woowacourse.movie.R
import woowacourse.movie.data.ReservationMockRepository
import woowacourse.movie.view.ReservationCompletedActivity
import woowacourse.movie.view.mapper.toUiModel

class ReservationListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_reservation_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        val reservations = ReservationMockRepository.findAll().map { it.toUiModel() }
        recyclerView.adapter = ReservationListAdapter(reservations) { reservation ->
            val intent = ReservationCompletedActivity.newIntent(requireContext(), reservation)
            startActivity(intent)
        }
    }
}
