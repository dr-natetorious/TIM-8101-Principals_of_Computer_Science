class android.support.v4.f.c$2$1 implements java.lang.Runnable {
  final java.lang.Object a;

  final android.support.v4.f.c$2 b;

  android.support.v4.f.c$2$1(android.support.v4.f.c$2, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Landroid/support/v4/f/c$2;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Ljava/lang/Object;
      10: aload_0
      11: invokespecial #23                 // Method java/lang/Object."<init>":()V
      14: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v4/f/c$2;
       4: getfield      #28                 // Field android/support/v4/f/c$2.c:Landroid/support/v4/f/c$a;
       7: aload_0
       8: getfield      #21                 // Field a:Ljava/lang/Object;
      11: invokeinterface #33,  2           // InterfaceMethod android/support/v4/f/c$a.a:(Ljava/lang/Object;)V
      16: return
}
