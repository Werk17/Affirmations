package com.example.affirmations.model.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation


class Datasource {

    fun loadAffirmations(): List<Affirmation> {
         return listOf<Affirmation>(
             Affirmation(R.string.affirm1),
             Affirmation(R.string.affirm2),
             Affirmation(R.string.affirm3),
             Affirmation(R.string.affirm4),
             Affirmation(R.string.affirm5),
             Affirmation(R.string.affirm6),
             Affirmation(R.string.affirm7),
             Affirmation(R.string.affirm8),
             Affirmation(R.string.affirm9),
             Affirmation(R.string.affirm10)
         )
    }
}