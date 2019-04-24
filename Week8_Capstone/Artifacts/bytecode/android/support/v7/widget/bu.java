public class android.support.v7.widget.bu extends android.content.res.Resources {
  public android.support.v7.widget.bu(android.content.Context, android.content.res.Resources);
    Code:
       0: aload_0
       1: aload_2
       2: invokevirtual #13                 // Method android/content/res/Resources.getAssets:()Landroid/content/res/AssetManager;
       5: aload_2
       6: invokevirtual #17                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
       9: aload_2
      10: invokevirtual #21                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      13: invokespecial #24                 // Method android/content/res/Resources."<init>":(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
      16: aload_0
      17: new           #26                 // class java/lang/ref/WeakReference
      20: dup
      21: aload_1
      22: invokespecial #29                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      25: putfield      #31                 // Field a:Ljava/lang/ref/WeakReference;
      28: return

  public static boolean a();
    Code:
       0: invokestatic  #38                 // Method android/support/v7/app/g.l:()Z
       3: ifeq          16
       6: getstatic     #44                 // Field android/os/Build$VERSION.SDK_INT:I
       9: bipush        20
      11: if_icmpgt     16
      14: iconst_1
      15: ireturn
      16: iconst_0
      17: ireturn

  final android.graphics.drawable.Drawable a(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #48                 // Method android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
       5: areturn

  public android.graphics.drawable.Drawable getDrawable(int);
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #52                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #54                 // class android/content/Context
      10: astore_2
      11: aload_2
      12: ifnull        25
      15: invokestatic  #59                 // Method android/support/v7/widget/m.a:()Landroid/support/v7/widget/m;
      18: aload_2
      19: aload_0
      20: iload_1
      21: invokevirtual #62                 // Method android/support/v7/widget/m.a:(Landroid/content/Context;Landroid/support/v7/widget/bu;I)Landroid/graphics/drawable/Drawable;
      24: areturn
      25: aload_0
      26: iload_1
      27: invokespecial #48                 // Method android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      30: areturn
}
