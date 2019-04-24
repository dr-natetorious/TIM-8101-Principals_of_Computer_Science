class android.support.v7.widget.bo extends android.support.v7.widget.bc {
  public android.support.v7.widget.bo(android.content.Context, android.content.res.Resources);
    Code:
       0: aload_0
       1: aload_2
       2: invokespecial #12                 // Method android/support/v7/widget/bc."<init>":(Landroid/content/res/Resources;)V
       5: aload_0
       6: new           #14                 // class java/lang/ref/WeakReference
       9: dup
      10: aload_1
      11: invokespecial #17                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      14: putfield      #19                 // Field a:Ljava/lang/ref/WeakReference;
      17: return

  public android.graphics.drawable.Drawable getDrawable(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #24                 // Method android/support/v7/widget/bc.getDrawable:(I)Landroid/graphics/drawable/Drawable;
       5: astore_2
       6: aload_0
       7: getfield      #19                 // Field a:Ljava/lang/ref/WeakReference;
      10: invokevirtual #28                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      13: checkcast     #30                 // class android/content/Context
      16: astore_3
      17: aload_2
      18: ifnull        36
      21: aload_3
      22: ifnull        36
      25: invokestatic  #35                 // Method android/support/v7/widget/m.a:()Landroid/support/v7/widget/m;
      28: pop
      29: aload_3
      30: iload_1
      31: aload_2
      32: invokestatic  #38                 // Method android/support/v7/widget/m.a:(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z
      35: pop
      36: aload_2
      37: areturn
}
