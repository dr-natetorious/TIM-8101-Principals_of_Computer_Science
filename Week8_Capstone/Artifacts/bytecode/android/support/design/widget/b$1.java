final class android.support.design.widget.b$1 implements android.os.Handler$Callback {
  android.support.design.widget.b$1();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: return

  public boolean handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #21                 // Field android/os/Message.what:I
       4: tableswitch   { // 0 to 1
                     0: 46
                     1: 30
               default: 28
          }
      28: iconst_0
      29: ireturn
      30: aload_1
      31: getfield      #25                 // Field android/os/Message.obj:Ljava/lang/Object;
      34: checkcast     #8                  // class android/support/design/widget/b
      37: aload_1
      38: getfield      #28                 // Field android/os/Message.arg1:I
      41: invokevirtual #32                 // Method android/support/design/widget/b.b:(I)V
      44: iconst_1
      45: ireturn
      46: aload_1
      47: getfield      #25                 // Field android/os/Message.obj:Ljava/lang/Object;
      50: checkcast     #8                  // class android/support/design/widget/b
      53: invokevirtual #34                 // Method android/support/design/widget/b.b:()V
      56: iconst_1
      57: ireturn
}
