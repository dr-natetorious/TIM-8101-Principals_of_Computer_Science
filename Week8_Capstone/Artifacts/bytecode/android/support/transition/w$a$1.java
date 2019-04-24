class android.support.transition.w$a$1 extends android.support.transition.v {
  final android.support.v4.g.a a;

  final android.support.transition.w$a b;

  android.support.transition.w$a$1(android.support.transition.w$a, android.support.v4.g.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Landroid/support/transition/w$a;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/support/v4/g/a;
      10: aload_0
      11: invokespecial #24                 // Method android/support/transition/v."<init>":()V
      14: return

  public void a(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/g/a;
       4: aload_0
       5: getfield      #19                 // Field b:Landroid/support/transition/w$a;
       8: getfield      #29                 // Field android/support/transition/w$a.b:Landroid/view/ViewGroup;
      11: invokevirtual #35                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
      14: checkcast     #37                 // class java/util/ArrayList
      17: aload_1
      18: invokevirtual #41                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      21: pop
      22: return
}
