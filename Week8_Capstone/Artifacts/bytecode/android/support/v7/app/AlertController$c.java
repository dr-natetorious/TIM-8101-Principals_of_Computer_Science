class android.support.v7.app.AlertController$c extends android.widget.ArrayAdapter<java.lang.CharSequence> {
  public android.support.v7.app.AlertController$c(android.content.Context, int, int, java.lang.CharSequence[]);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: aload         4
       6: invokespecial #13                 // Method android/widget/ArrayAdapter."<init>":(Landroid/content/Context;II[Ljava/lang/Object;)V
       9: return

  public long getItemId(int);
    Code:
       0: iload_1
       1: i2l
       2: lreturn

  public boolean hasStableIds();
    Code:
       0: iconst_1
       1: ireturn
}
