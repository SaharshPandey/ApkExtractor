package com.github.saharsh.models

import android.content.pm.ApplicationInfo

data class Apk(val appInfo: ApplicationInfo,
               val appName: String,
               val packageName: String? = "",
               val version: String? = "")