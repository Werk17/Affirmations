package com.example.affirmations.model.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation


class Datasource {

    fun loadAffirmations(): List<Affirmation> {
         return listOf<Affirmation>(
             Affirmation(R.string.affirm1, R.drawable.image1),
             Affirmation(R.string.affirm2, R.drawable.image2),
             Affirmation(R.string.affirm3, R.drawable.image3),
             Affirmation(R.string.affirm4, R.drawable.image4),
             Affirmation(R.string.affirm5, R.drawable.image5),
             Affirmation(R.string.affirm6, R.drawable.image6),
             Affirmation(R.string.affirm7, R.drawable.image7),
             Affirmation(R.string.affirm8, R.drawable.image8),
             Affirmation(R.string.affirm9, R.drawable.image9),
             Affirmation(R.string.affirm10, R.drawable.image10)
         )
    }
}