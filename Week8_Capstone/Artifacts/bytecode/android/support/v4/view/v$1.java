final class android.support.v4.view.v$1 implements java.util.Comparator<android.support.v4.view.v$b> {
  android.support.v4.view.v$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public int a(android.support.v4.view.v$b, android.support.v4.view.v$b);
    Code:
       0: aload_1
       1: getfield      #22                 // Field android/support/v4/view/v$b.b:I
       4: aload_2
       5: getfield      #22                 // Field android/support/v4/view/v$b.b:I
       8: isub
       9: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #18                 // class android/support/v4/view/v$b
       5: aload_2
       6: checkcast     #18                 // class android/support/v4/view/v$b
       9: invokevirtual #26                 // Method a:(Landroid/support/v4/view/v$b;Landroid/support/v4/view/v$b;)I
      12: ireturn
}
