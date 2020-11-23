package com.example.spiiceapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.PagerAdapter

class OnBoardingPagerAdapter(
    val context: Context,
    private val onBoardingItems: List<OnBoardingItem>
) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val layoutScreen: View = inflater.inflate(R.layout.fragment_onboarding, null)
        val imgSlide = layoutScreen.findViewById<ImageView>(R.id.img_onboarding)
        val title = layoutScreen.findViewById<TextView>(R.id.intro_title)
        val backgroundSlide = layoutScreen.findViewById<ImageView>(R.id.background_image)

        title.text = onBoardingItems[position].title
            backgroundSlide.setImageResource(onBoardingItems[position].background)
        imgSlide.setImageResource(onBoardingItems[position].image)
        container.addView(layoutScreen)
        return layoutScreen
    }

    override fun getCount(): Int {
        return onBoardingItems.size
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view === obj
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }
}