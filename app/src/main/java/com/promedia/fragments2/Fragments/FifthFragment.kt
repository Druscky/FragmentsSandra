package com.promedia.fragments2.Fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.promedia.fragments2.R

class FifthFragment : Fragment() {
    private var myView:View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setHasOptionsMenu(true)
        }

    override fun onCreateOptionsMenu (menu:Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.fragment_menu, menu)
        }
    override fun onOptionsItemSelected(item: MenuItem):Boolean {
        super.onOptionsItemSelected(item)
        when (item.itemId) {
            R.id.itCopy -> {
                Toast.makeText(context, "Copiando...", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.itPaste ->{
                Toast.makeText(context, "Pegando...", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.itCut ->{
                Snackbar.make(myView!!, "SnackBar: Cortando...", Snackbar.LENGTH_SHORT).show()
//                Toast.makeText(context, "Cortando...", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return false
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_fifth, container, false)
        return myView
        }
}
