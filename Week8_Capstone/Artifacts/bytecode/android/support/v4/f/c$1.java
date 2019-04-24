class android.support.v4.f.c$1 implements android.os.Handler$Callback {
  final android.support.v4.f.c a;

  android.support.v4.f.c$1(android.support.v4.f.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v4/f/c;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #26                 // Field android/os/Message.what:I
       4: tableswitch   { // 0 to 1
                     0: 46
                     1: 30
               default: 28
          }
      28: iconst_1
      29: ireturn
      30: aload_0
      31: getfield      #14                 // Field a:Landroid/support/v4/f/c;
      34: aload_1
      35: getfield      #30                 // Field android/os/Message.obj:Ljava/lang/Object;
      38: checkcast     #32                 // class java/lang/Runnable
      41: invokestatic  #35                 // Method android/support/v4/f/c.a:(Landroid/support/v4/f/c;Ljava/lang/Runnable;)V
      44: iconst_1
      45: ireturn
      46: aload_0
      47: getfield      #14                 // Field a:Landroid/support/v4/f/c;
      50: invokestatic  #37                 // Method android/support/v4/f/c.a:(Landroid/support/v4/f/c;)V
      53: iconst_1
      54: ireturn
}
