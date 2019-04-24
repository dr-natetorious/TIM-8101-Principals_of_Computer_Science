final class android.support.v4.app.v$1 implements java.lang.Runnable {
  final java.util.ArrayList a;

  android.support.v4.app.v$1(java.util.ArrayList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Ljava/util/ArrayList;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Ljava/util/ArrayList;
       4: iconst_4
       5: invokestatic  #24                 // Method android/support/v4/app/v.a:(Ljava/util/ArrayList;I)V
       8: return
}
