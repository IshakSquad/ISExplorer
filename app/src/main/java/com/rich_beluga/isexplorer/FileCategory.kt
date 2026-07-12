package com.rich_beluga.isexplorer

import androidx.annotation.AttrRes
import androidx.annotation.DrawableRes
import com.google.android.material.R as MaterialR

enum class FileCategory(
    @DrawableRes val iconRes: Int,
    @AttrRes  val containerColorAttr: Int,
    @AttrRes  val onContainerColorAttr: Int
) {
    /* images */
    IMAGE(
        R.drawable.image,
        MaterialR.attr.colorTertiaryContainer,
        MaterialR.attr.colorOnTertiaryContainer
    ),
    
    /* videos */
    VIDEO(
        R.drawable.video,
        MaterialR.attr.colorErrorContainer,
        MaterialR.attr.colorOnErrorContainer
    ),
    
    /* audio */
    AUDIO(
        R.drawable.audio,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    
    /* pdf */
    PDF(
        R.drawable.pdf,
        MaterialR.attr.colorErrorContainer,
        MaterialR.attr.colorOnErrorContainer
    ),
    
    /* microsoft office files (*.docx, *.pptx, etc) */
    DOCUMENT(
        R.drawable.doc,
        MaterialR.attr.colorPrimaryContainer,
        MaterialR.attr.colorOnPrimaryContainer
    ),
    XLS(
        R.drawable.xls,
        MaterialR.attr.colorPrimaryContainer,
        MaterialR.attr.colorOnPrimaryContainer
    ),
    
    /* code files */
    SHELL(
        R.drawable.shell,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    PYTHON(
        R.drawable.python,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    KOTLIN(
        R.drawable.kotlin,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    JAVA(
        R.drawable.java,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    HTML(
        R.drawable.html,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    CSS(
        R.drawable.css,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    PHP(
        R.drawable.php,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    MARKDOWN(
        R.drawable.markdown,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    CLASS(
        R.drawable.java,
        MaterialR.attr.colorSurfaceVariant,
        MaterialR.attr.colorOnSurfaceVariant
    ),
    CODE(
        R.drawable.shell,
        MaterialR.attr.colorSecondaryContainer,
        MaterialR.attr.colorOnSecondaryContainer
    ),
    
    /* archives */
    ARCHIVE(
        R.drawable.archive,
        MaterialR.attr.colorTertiaryContainer,
        MaterialR.attr.colorOnTertiaryContainer
    ),
    RAR(
        R.drawable.rar,
        MaterialR.attr.colorTertiaryContainer,
        MaterialR.attr.colorOnTertiaryContainer
    ),
    JAR(
        R.drawable.java,
        MaterialR.attr.colorTertiaryContainer,
        MaterialR.attr.colorOnTertiaryContainer
    ),
    
    /* android application */
    APK(
        R.drawable.apk,
        MaterialR.attr.colorPrimaryContainer,
        MaterialR.attr.colorOnPrimaryContainer
    ),
    
    /* text documents */
    TEXT(
        R.drawable.text,
        MaterialR.attr.colorSurfaceVariant,
        MaterialR.attr.colorOnSurfaceVariant
    ),
    
    /* configurations */
    CONFIG(
        R.drawable.config,
        MaterialR.attr.colorSurfaceVariant,
        MaterialR.attr.colorOnSurfaceVariant
    ),
    
    /* fonts */
    FONT(
        R.drawable.font,
        MaterialR.attr.colorSurfaceVariant,
        MaterialR.attr.colorOnSurfaceVariant
    ),
    
    /* keys */
    KEY(
        R.drawable.key,
        MaterialR.attr.colorSurfaceVariant,
        MaterialR.attr.colorOnSurfaceVariant
    ),
    
    /* databases */
    DATABASE(
        R.drawable.database,
        MaterialR.attr.colorTertiaryContainer,
        MaterialR.attr.colorOnTertiaryContainer
    ),
    
    /* folders */
    FOLDER(
        R.drawable.folder,
        MaterialR.attr.colorPrimaryContainer,
        MaterialR.attr.colorOnPrimaryContainer
    ),
    PARENT_DIR(
        R.drawable.back,
        MaterialR.attr.colorSurfaceVariant,
        MaterialR.attr.colorOnSurfaceVariant
    ),
    
    /* unknown file types */
    UNKNOWN(
        R.drawable.unknown,
        MaterialR.attr.colorSurfaceVariant,
        MaterialR.attr.colorOnSurfaceVariant
    )
}
