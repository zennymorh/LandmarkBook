package com.zennymorh.landmarkbook

import android.graphics.Bitmap

class Globals {
    companion object Chosen{
        val chosenImage : Bitmap? = null
        fun returnImage(): Bitmap{
            return chosenImage!!
        }
    }
}