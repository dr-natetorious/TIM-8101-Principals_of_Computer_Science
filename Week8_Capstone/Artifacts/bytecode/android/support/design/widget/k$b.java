class android.support.design.widget.k$b {
  final java.lang.ref.WeakReference<android.support.design.widget.k$a> a;

  int b;

  boolean c;

  boolean a(android.support.design.widget.k$a);
    Code:
       0: aload_1
       1: ifnull        17
       4: aload_0
       5: getfield      #16                 // Field a:Ljava/lang/ref/WeakReference;
       8: invokevirtual #22                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      11: aload_1
      12: if_acmpne     17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn
}
