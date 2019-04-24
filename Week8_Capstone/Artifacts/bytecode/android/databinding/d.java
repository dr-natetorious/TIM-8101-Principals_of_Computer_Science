class android.databinding.d extends android.databinding.c {
  public android.databinding.d();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/databinding/c."<init>":()V
       4: return

  public int a(java.lang.String);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_1
       7: invokevirtual #17                 // Method java/lang/String.hashCode:()I
      10: ldc           #18                 // int 99656972
      12: if_icmpeq     17
      15: iconst_0
      16: ireturn
      17: aload_1
      18: ldc           #20                 // String layout/item_activity_log_0
      20: invokevirtual #24                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      23: ifeq          29
      26: ldc           #25                 // int 2131427402
      28: ireturn
      29: iconst_0
      30: ireturn

  public android.databinding.ViewDataBinding a(android.databinding.e, android.view.View, int);
    Code:
       0: iload_3
       1: ldc           #25                 // int 2131427402
       3: if_icmpeq     8
       6: aconst_null
       7: areturn
       8: aload_2
       9: invokevirtual #32                 // Method android/view/View.getTag:()Ljava/lang/Object;
      12: astore        4
      14: aload         4
      16: ifnonnull     29
      19: new           #34                 // class java/lang/RuntimeException
      22: dup
      23: ldc           #36                 // String view must have a tag
      25: invokespecial #39                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      28: athrow
      29: ldc           #20                 // String layout/item_activity_log_0
      31: aload         4
      33: invokevirtual #24                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      36: ifeq          49
      39: new           #41                 // class ryey/easer/a/a
      42: dup
      43: aload_1
      44: aload_2
      45: invokespecial #44                 // Method ryey/easer/a/a."<init>":(Landroid/databinding/e;Landroid/view/View;)V
      48: areturn
      49: new           #46                 // class java/lang/StringBuilder
      52: dup
      53: invokespecial #47                 // Method java/lang/StringBuilder."<init>":()V
      56: astore_1
      57: aload_1
      58: ldc           #49                 // String The tag for item_activity_log is invalid. Received:
      60: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      63: pop
      64: aload_1
      65: aload         4
      67: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      70: pop
      71: new           #58                 // class java/lang/IllegalArgumentException
      74: dup
      75: aload_1
      76: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      79: invokespecial #63                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      82: athrow

  public android.databinding.ViewDataBinding a(android.databinding.e, android.view.View[], int);
    Code:
       0: aconst_null
       1: areturn
}
