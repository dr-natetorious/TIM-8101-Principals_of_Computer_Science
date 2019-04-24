class android.support.design.widget.m {
  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: getstatic     #14                 // Field android/support/v7/a/a$a.colorPrimary:I
       8: iastore
       9: putstatic     #16                 // Field a:[I
      12: return

  static void a(android.content.Context);
    Code:
       0: aload_0
       1: getstatic     #16                 // Field a:[I
       4: invokevirtual #24                 // Method android/content/Context.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
       7: astore_0
       8: aload_0
       9: iconst_0
      10: invokevirtual #30                 // Method android/content/res/TypedArray.hasValue:(I)Z
      13: istore_1
      14: aload_0
      15: invokevirtual #33                 // Method android/content/res/TypedArray.recycle:()V
      18: iload_1
      19: iconst_1
      20: ixor
      21: ifeq          34
      24: new           #35                 // class java/lang/IllegalArgumentException
      27: dup
      28: ldc           #37                 // String You need to use a Theme.AppCompat theme (or descendant) with the design library.
      30: invokespecial #41                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: return
}
