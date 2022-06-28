package com.promedia.fragments2.Fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.promedia.fragments2.Fragments.myDialogFragment.Companion.Companion.TAG
import com.promedia.fragments2.Fragments.myDialogFragment.Companion.TAG
import com.promedia.fragments2.R


class myDialogFragment : DialogFragment() {

    val dialog = myDialogFragment()
    dialog.setArguments(bundle)
    dialog.show(supportFragmentManager, DialogFragment.TAG)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        dialog!!.setTitle("Dialog Fragment")
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)
        return view
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(context!!)
            .setMessage(R.string.DialogFragment)
            .setPositiveButton(R.string.Aceptar) { dialog, id ->
                Toast.makeText(context, "Has borrado los datos", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton(R.string.Cancelar) { dialog, id ->
                Toast.makeText(context, "Has cancelado el borrado", Toast.LENGTH_SHORT).show()
            }
            .create()
    }

    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }
}


    fun onClickDialog(view: View) {
        DialogFragment().show(supportFragmentManager, DialogFragment.TAG)
    }


    fun newInstance(param1: String, param2: String) =
        DialogFragment().apply {

    }


