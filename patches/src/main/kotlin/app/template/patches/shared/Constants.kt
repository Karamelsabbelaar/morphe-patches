package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_PEPPER = Compatibility(
        name = "Pepper", // App name as it appears in the Android launcher.
        packageName = "com.tippingcanoe.pepper",
        // Not available on APKMirror or Uptodown, APKPure distributes it as a split XAPK.
        apkFileType = ApkFileType.XAPK,
        appIconColor = 0xFF3400,
        targets = listOf(
            // Version the patches were developed and verified against.
            AppTarget(
                version = "8.20.00"
            )
        )
    )
}
