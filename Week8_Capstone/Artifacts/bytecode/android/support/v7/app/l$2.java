class android.support.v7.app.l$2 implements android.support.v4.view.p {
  final android.support.v7.app.l a;

  android.support.v7.app.l$2(android.support.v7.app.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/app/l;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public android.support.v4.view.ab a(android.view.View, android.support.v4.view.ab);
    Code:
       0: aload_2
       1: invokevirtual #28                 // Method android/support/v4/view/ab.b:()I
       4: istore_3
       5: aload_0
       6: getfield      #17                 // Field a:Landroid/support/v7/app/l;
       9: iload_3
      10: invokevirtual #32                 // Method android/support/v7/app/l.g:(I)I
      13: istore        4
      15: aload_2
      16: astore        5
      18: iload_3
      19: iload         4
      21: if_icmpeq     44
      24: aload_2
      25: aload_2
      26: invokevirtual #34                 // Method android/support/v4/view/ab.a:()I
      29: iload         4
      31: aload_2
      32: invokevirtual #37                 // Method android/support/v4/view/ab.c:()I
      35: aload_2
      36: invokevirtual #40                 // Method android/support/v4/view/ab.d:()I
      39: invokevirtual #43                 // Method android/support/v4/view/ab.a:(IIII)Landroid/support/v4/view/ab;
      42: astore        5
      44: aload_1
      45: aload         5
      47: invokestatic  #47                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/ab;)Landroid/support/v4/view/ab;
      50: areturn
}
