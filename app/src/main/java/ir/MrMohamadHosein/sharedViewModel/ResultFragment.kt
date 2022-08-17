package ir.MrMohamadHosein.sharedViewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import ir.MrMohamadHosein.sharedViewModel.databinding.FragmentPersonBinding
import ir.MrMohamadHosein.sharedViewModel.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    lateinit var binding : FragmentResultBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.txtName.text = mainViewModel.firstName
        binding.txtFamilyName.text = mainViewModel.lastName
        binding.txtEmail.text = mainViewModel.emailAddress

    }


}