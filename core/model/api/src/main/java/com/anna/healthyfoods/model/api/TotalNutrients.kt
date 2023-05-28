package com.anna.healthyfoods.model.api

import com.google.gson.annotations.SerializedName


data class TotalNutrients (

  @SerializedName("ENERC_KCAL"  ) var ENERCKCAL   : ENERCKCAL?   = ENERCKCAL(),
  @SerializedName("FAT"         ) var FAT         : FAT?         = FAT(),
  @SerializedName("FASAT"       ) var FASAT       : FASAT?       = FASAT(),
  @SerializedName("FATRN"       ) var FATRN       : FATRN?       = FATRN(),
  @SerializedName("FAMS"        ) var FAMS        : FAMS?        = FAMS(),
  @SerializedName("FAPU"        ) var FAPU        : FAPU?        = FAPU(),
  @SerializedName("CHOCDF"      ) var CHOCDF      : CHOCDF?      = CHOCDF(),
  @SerializedName("FIBTG"       ) var FIBTG       : FIBTG?       = FIBTG(),
  @SerializedName("SUGAR"       ) var SUGAR       : SUGAR?       = SUGAR(),
  @SerializedName("PROCNT"      ) var PROCNT      : PROCNT?      = PROCNT(),
  @SerializedName("CHOLE"       ) var CHOLE       : CHOLE?       = CHOLE(),
  @SerializedName("NA"          ) var NA          : NA?          = NA(),
  @SerializedName("CA"          ) var CA          : CA?          = CA(),
  @SerializedName("MG"          ) var MG          : MG?          = MG(),
  @SerializedName("K"           ) var K           : K?           = K(),
  @SerializedName("FE"          ) var FE          : FE?          = FE(),
  @SerializedName("ZN"          ) var ZN          : ZN?          = ZN(),
  @SerializedName("P"           ) var P           : P?           = P(),
  @SerializedName("VITA_RAE"    ) var VITARAE     : VITARAE?     = VITARAE(),
  @SerializedName("VITC"        ) var VITC        : VITC?        = VITC(),
  @SerializedName("THIA"        ) var THIA        : THIA?        = THIA(),
  @SerializedName("RIBF"        ) var RIBF        : RIBF?        = RIBF(),
  @SerializedName("NIA"         ) var NIA         : NIA?         = NIA(),
  @SerializedName("VITB6A"      ) var VITB6A      : VITB6A?      = VITB6A(),
  @SerializedName("FOLDFE"      ) var FOLDFE      : FOLDFE?      = FOLDFE(),
  @SerializedName("FOLFD"       ) var FOLFD       : FOLFD?       = FOLFD(),
  @SerializedName("FOLAC"       ) var FOLAC       : FOLAC?       = FOLAC(),
  @SerializedName("VITB12"      ) var VITB12      : VITB12?      = VITB12(),
  @SerializedName("VITD"        ) var VITD        : VITD?        = VITD(),
  @SerializedName("TOCPHA"      ) var TOCPHA      : TOCPHA?      = TOCPHA(),
  @SerializedName("VITK1"       ) var VITK1       : VITK1?       = VITK1(),
  @SerializedName("WATER"       ) var WATER       : WATER?       = WATER()

)