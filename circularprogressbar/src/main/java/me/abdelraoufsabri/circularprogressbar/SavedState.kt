package me.abdelraoufsabri.circularprogressbar

import android.os.Parcel
import android.os.Parcelable
import android.view.View

class SavedState : View.BaseSavedState {
        var progress:Float = 0F
        var progressMax:Float = 0F

        constructor(parcelable: Parcelable?) : super(parcelable)

        private constructor(parcel: Parcel) : super(parcel) {
            progress = parcel.readFloat()
            progressMax = parcel.readFloat()
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            super.writeToParcel(parcel, flags)
            parcel.writeFloat(progress)
            parcel.writeFloat(progressMax)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<SavedState> {
            override fun createFromParcel(parcel: Parcel): SavedState {
                return SavedState(parcel)
            }

            override fun newArray(size: Int): Array<SavedState?> {
                return arrayOfNulls(size)
            }
        }

    }
