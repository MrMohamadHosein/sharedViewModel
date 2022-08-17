package ir.MrMohamadHosein.sharedViewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ir.MrMohamadHosein.sharedViewModel.databinding.FragmentMyMailBinding
import ir.MrMohamadHosein.sharedViewModel.databinding.FragmentPersonBinding

class PersonFragment : Fragment() {
    lateinit var binding : FragmentPersonBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPersonBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainViewModel = ViewModelProvider( requireActivity() ).get(MainViewModel::class.java)
        binding.btnNext.setOnClickListener {

            mainViewModel.firstName = binding.editTextTextPersonName.text.toString()
            mainViewModel.lastName = binding.editTextTextPersonName2.text.toString()

            findNavController().navigate(R.id.action_personFragment_to_myMailFragment)

        }

    }


}