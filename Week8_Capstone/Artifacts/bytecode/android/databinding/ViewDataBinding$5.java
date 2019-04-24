final class android.databinding.ViewDataBinding$5 extends android.databinding.b$a<android.databinding.g, android.databinding.ViewDataBinding, java.lang.Void> {
  android.databinding.ViewDataBinding$5();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/databinding/b$a."<init>":()V
       4: return

  public void a(android.databinding.g, android.databinding.ViewDataBinding, int, java.lang.Void);
    Code:
       0: iload_3
       1: tableswitch   { // 1 to 3
                     1: 41
                     2: 35
                     3: 29
               default: 28
          }
      28: return
      29: aload_1
      30: aload_2
      31: invokevirtual #20                 // Method android/databinding/g.c:(Landroid/databinding/ViewDataBinding;)V
      34: return
      35: aload_1
      36: aload_2
      37: invokevirtual #23                 // Method android/databinding/g.b:(Landroid/databinding/ViewDataBinding;)V
      40: return
      41: aload_1
      42: aload_2
      43: invokevirtual #26                 // Method android/databinding/g.a:(Landroid/databinding/ViewDataBinding;)Z
      46: ifne          55
      49: aload_2
      50: iconst_1
      51: invokestatic  #29                 // Method android/databinding/ViewDataBinding.a:(Landroid/databinding/ViewDataBinding;Z)Z
      54: pop
      55: return

  public void a(java.lang.Object, java.lang.Object, int, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #16                 // class android/databinding/g
       5: aload_2
       6: checkcast     #7                  // class android/databinding/ViewDataBinding
       9: iload_3
      10: aload         4
      12: checkcast     #32                 // class java/lang/Void
      15: invokevirtual #34                 // Method a:(Landroid/databinding/g;Landroid/databinding/ViewDataBinding;ILjava/lang/Void;)V
      18: return
}
