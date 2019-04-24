class android.support.v4.app.o$a$1 implements java.lang.Runnable {
  final android.support.v4.app.o$a a;

  android.support.v4.app.o$a$1(android.support.v4.app.o$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/v4/app/o$a;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/support/v4/app/o$a;
       4: getfield      #27                 // Field android/support/v4/app/o$a.a:Landroid/view/View;
       7: iconst_0
       8: aconst_null
       9: invokevirtual #33                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
      12: return
}
