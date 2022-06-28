package com.promedia.fragments2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.promedia.fragments2.Fragments.FifthFragment
import com.promedia.fragments2.Fragments.FourthFragment
import com.promedia.fragments2.Fragments.ThirdFragment
import com.promedia.fragments2.Fragments.myDialogFragment
import com.promedia.fragments2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var b: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(b.root)

        val frag3 = ThirdFragment()
        val frag4 = FourthFragment()
        val frag5 = FifthFragment()

        b.btnFifth.setOnClickListener {setFragmentAnim(frag5)}
        b.btnFourth.setOnClickListener {setFragmentAnim(frag4)}
        b.btnThird.setOnClickListener {setFragmentAnim(frag3)}
    }

    fun setFragmentAnim (fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .setCustomAnimations(                   // <- Con animación
                R.anim.slide_in, // Enter
                R.anim.fade_out, // Exit
                R.anim.fade_in, // Pop Enter
                R.anim.slide_out) // Pop Exit
            .replace(R.id.fragContainer, fragment)
            .commit()
    }
    fun onClickDialog(view: View) {
        DialogFragment().show(supportFragmentManager, myDialogFragment.TAG)
    }
    fun clickNext(view: View){
        val myIntent = Intent(this, )    //<- Me falta añadir
    }
}

//        b.btnFourth.setOnClickListener {
//            supportFragmentManager
//                .beginTransaction()                       <-Botón Sin Animación
//                .replace(R.id.fragContainer, frag4)
//                    .addToBackStack(null)
//                    .commit()
//        }

//        fun setFragment(fragment: Fragment){
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.fragContainer, frag5)                <- Sin Animación
//                addToBackStack(null)
//                commit()
//        }

