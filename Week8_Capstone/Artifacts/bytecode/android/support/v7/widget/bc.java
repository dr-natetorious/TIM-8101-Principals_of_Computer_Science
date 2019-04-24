class android.support.v7.widget.bc extends android.content.res.Resources {
  public android.support.v7.widget.bc(android.content.res.Resources);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #12                 // Method android/content/res/Resources.getAssets:()Landroid/content/res/AssetManager;
       5: aload_1
       6: invokevirtual #16                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
       9: aload_1
      10: invokevirtual #20                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      13: invokespecial #23                 // Method android/content/res/Resources."<init>":(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
      16: aload_0
      17: aload_1
      18: putfield      #25                 // Field a:Landroid/content/res/Resources;
      21: return

  public android.content.res.XmlResourceParser getAnimation(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #30                 // Method android/content/res/Resources.getAnimation:(I)Landroid/content/res/XmlResourceParser;
       8: areturn

  public boolean getBoolean(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #34                 // Method android/content/res/Resources.getBoolean:(I)Z
       8: ireturn

  public int getColor(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #38                 // Method android/content/res/Resources.getColor:(I)I
       8: ireturn

  public android.content.res.ColorStateList getColorStateList(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #42                 // Method android/content/res/Resources.getColorStateList:(I)Landroid/content/res/ColorStateList;
       8: areturn

  public android.content.res.Configuration getConfiguration();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: invokevirtual #20                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
       7: areturn

  public float getDimension(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #46                 // Method android/content/res/Resources.getDimension:(I)F
       8: freturn

  public int getDimensionPixelOffset(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #49                 // Method android/content/res/Resources.getDimensionPixelOffset:(I)I
       8: ireturn

  public int getDimensionPixelSize(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #52                 // Method android/content/res/Resources.getDimensionPixelSize:(I)I
       8: ireturn

  public android.util.DisplayMetrics getDisplayMetrics();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: invokevirtual #16                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
       7: areturn

  public android.graphics.drawable.Drawable getDrawable(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #56                 // Method android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
       8: areturn

  public android.graphics.drawable.Drawable getDrawable(int, android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: aload_2
       6: invokevirtual #59                 // Method android/content/res/Resources.getDrawable:(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
       9: areturn

  public android.graphics.drawable.Drawable getDrawableForDensity(int, int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: iload_2
       6: invokevirtual #63                 // Method android/content/res/Resources.getDrawableForDensity:(II)Landroid/graphics/drawable/Drawable;
       9: areturn

  public android.graphics.drawable.Drawable getDrawableForDensity(int, int, android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: iload_2
       6: aload_3
       7: invokevirtual #66                 // Method android/content/res/Resources.getDrawableForDensity:(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
      10: areturn

  public float getFraction(int, int, int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: iload_2
       6: iload_3
       7: invokevirtual #70                 // Method android/content/res/Resources.getFraction:(III)F
      10: freturn

  public int getIdentifier(java.lang.String, java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: aload_1
       5: aload_2
       6: aload_3
       7: invokevirtual #74                 // Method android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
      10: ireturn

  public int[] getIntArray(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #78                 // Method android/content/res/Resources.getIntArray:(I)[I
       8: areturn

  public int getInteger(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #81                 // Method android/content/res/Resources.getInteger:(I)I
       8: ireturn

  public android.content.res.XmlResourceParser getLayout(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #84                 // Method android/content/res/Resources.getLayout:(I)Landroid/content/res/XmlResourceParser;
       8: areturn

  public android.graphics.Movie getMovie(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #88                 // Method android/content/res/Resources.getMovie:(I)Landroid/graphics/Movie;
       8: areturn

  public java.lang.String getQuantityString(int, int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: iload_2
       6: invokevirtual #92                 // Method android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
       9: areturn

  public java.lang.String getQuantityString(int, int, java.lang.Object...);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: iload_2
       6: aload_3
       7: invokevirtual #95                 // Method android/content/res/Resources.getQuantityString:(II[Ljava/lang/Object;)Ljava/lang/String;
      10: areturn

  public java.lang.CharSequence getQuantityText(int, int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: iload_2
       6: invokevirtual #99                 // Method android/content/res/Resources.getQuantityText:(II)Ljava/lang/CharSequence;
       9: areturn

  public java.lang.String getResourceEntryName(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #103                // Method android/content/res/Resources.getResourceEntryName:(I)Ljava/lang/String;
       8: areturn

  public java.lang.String getResourceName(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #106                // Method android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
       8: areturn

  public java.lang.String getResourcePackageName(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #109                // Method android/content/res/Resources.getResourcePackageName:(I)Ljava/lang/String;
       8: areturn

  public java.lang.String getResourceTypeName(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #112                // Method android/content/res/Resources.getResourceTypeName:(I)Ljava/lang/String;
       8: areturn

  public java.lang.String getString(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #115                // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
       8: areturn

  public java.lang.String getString(int, java.lang.Object...);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: aload_2
       6: invokevirtual #118                // Method android/content/res/Resources.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
       9: areturn

  public java.lang.String[] getStringArray(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #122                // Method android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
       8: areturn

  public java.lang.CharSequence getText(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #126                // Method android/content/res/Resources.getText:(I)Ljava/lang/CharSequence;
       8: areturn

  public java.lang.CharSequence getText(int, java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: aload_2
       6: invokevirtual #129                // Method android/content/res/Resources.getText:(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
       9: areturn

  public java.lang.CharSequence[] getTextArray(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #133                // Method android/content/res/Resources.getTextArray:(I)[Ljava/lang/CharSequence;
       8: areturn

  public void getValue(int, android.util.TypedValue, boolean);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: aload_2
       6: iload_3
       7: invokevirtual #137                // Method android/content/res/Resources.getValue:(ILandroid/util/TypedValue;Z)V
      10: return

  public void getValue(java.lang.String, android.util.TypedValue, boolean);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: aload_1
       5: aload_2
       6: iload_3
       7: invokevirtual #140                // Method android/content/res/Resources.getValue:(Ljava/lang/String;Landroid/util/TypedValue;Z)V
      10: return

  public void getValueForDensity(int, int, android.util.TypedValue, boolean);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: iload_2
       6: aload_3
       7: iload         4
       9: invokevirtual #144                // Method android/content/res/Resources.getValueForDensity:(IILandroid/util/TypedValue;Z)V
      12: return

  public android.content.res.XmlResourceParser getXml(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #147                // Method android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
       8: areturn

  public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet, int[]);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: aload_1
       5: aload_2
       6: invokevirtual #151                // Method android/content/res/Resources.obtainAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
       9: areturn

  public android.content.res.TypedArray obtainTypedArray(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #155                // Method android/content/res/Resources.obtainTypedArray:(I)Landroid/content/res/TypedArray;
       8: areturn

  public java.io.InputStream openRawResource(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #159                // Method android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
       8: areturn

  public java.io.InputStream openRawResource(int, android.util.TypedValue);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: aload_2
       6: invokevirtual #162                // Method android/content/res/Resources.openRawResource:(ILandroid/util/TypedValue;)Ljava/io/InputStream;
       9: areturn

  public android.content.res.AssetFileDescriptor openRawResourceFd(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #166                // Method android/content/res/Resources.openRawResourceFd:(I)Landroid/content/res/AssetFileDescriptor;
       8: areturn

  public void parseBundleExtra(java.lang.String, android.util.AttributeSet, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: aload_1
       5: aload_2
       6: aload_3
       7: invokevirtual #170                // Method android/content/res/Resources.parseBundleExtra:(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
      10: return

  public void parseBundleExtras(android.content.res.XmlResourceParser, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/content/res/Resources;
       4: aload_1
       5: aload_2
       6: invokevirtual #174                // Method android/content/res/Resources.parseBundleExtras:(Landroid/content/res/XmlResourceParser;Landroid/os/Bundle;)V
       9: return

  public void updateConfiguration(android.content.res.Configuration, android.util.DisplayMetrics);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #178                // Method android/content/res/Resources.updateConfiguration:(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
       6: aload_0
       7: getfield      #25                 // Field a:Landroid/content/res/Resources;
      10: ifnull        22
      13: aload_0
      14: getfield      #25                 // Field a:Landroid/content/res/Resources;
      17: aload_1
      18: aload_2
      19: invokevirtual #178                // Method android/content/res/Resources.updateConfiguration:(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
      22: return
}
