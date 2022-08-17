package ir.MrMohamadHosein.sharedViewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ir.MrMohamadHosein.sharedViewModel.databinding.FragmentMyMailBinding

class MyMailFragment : Fragment() {
    lateinit var binding: FragmentMyMailBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMyMailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.editTextTextPersonName2.setText(mainViewModel.emailAddress)
        binding.btnNext.setOnClickListener {
            mainViewModel.emailAddress = binding.editTextTextPersonName2.text.toString()
            findNavController().navigate(R.id.action_myMailFragment_to_resultFragment)
        }

    }

}