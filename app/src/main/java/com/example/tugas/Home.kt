package com.example.tugas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas.Adapter.PromotionAdapter
import com.example.tugas.Adapter.TrendingAdapter
import com.example.tugas.Model.Promotion
import com.example.tugas.Model.Trending

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Home : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    private lateinit var promotionRecyclerView: RecyclerView
    private lateinit var trendingRecyclerView: RecyclerView

    private lateinit var promotionList : ArrayList<Promotion>
    private lateinit var trendingList : ArrayList<Trending>

    private lateinit var promotionAdapter: PromotionAdapter
    private lateinit var trendingAdapter: TrendingAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val icNotification = view.findViewById<ImageView>(R.id.icNotif)

        icNotification.setOnClickListener {
            startActivity(Intent(requireContext(), Notif::class.java))
        }


        // Promotion Recycler View
        promotionRecyclerView = view.findViewById(R.id.rv_promotion)
        promotionRecyclerView.setHasFixedSize(true)
        promotionRecyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)

        promotionList = ArrayList()

        promotionList.add(Promotion(R.drawable.landscape))
        promotionList.add(Promotion(R.drawable.landscape2))
        promotionList.add(Promotion(R.drawable.landscape3))
        promotionList.add(Promotion(R.drawable.landscape4))

        promotionAdapter = PromotionAdapter(promotionList)
        promotionRecyclerView.adapter = promotionAdapter

        // Trending Recycler View
        trendingRecyclerView = view.findViewById(R.id.rv_trending_album)
        trendingRecyclerView.setHasFixedSize(true)
        trendingRecyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

        trendingList = ArrayList()

        trendingList.add(Trending(R.drawable.potrait))
        trendingList.add(Trending(R.drawable.potrait2))
        trendingList.add(Trending(R.drawable.potrait3))
        trendingList.add(Trending(R.drawable.potrait4))
        trendingList.add(Trending(R.drawable.potrait5))
        trendingList.add(Trending(R.drawable.potrait6))

        trendingAdapter = TrendingAdapter(trendingList)
        trendingRecyclerView.adapter = trendingAdapter


        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}