class android.support.transition.y$a extends android.support.transition.v {
  android.support.transition.y a;

  android.support.transition.y$a(android.support.transition.y);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/support/transition/v."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/support/transition/y;
       9: return

  public void a(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/transition/y;
       4: invokestatic  #21                 // Method android/support/transition/y.b:(Landroid/support/transition/y;)I
       7: pop
       8: aload_0
       9: getfield      #15                 // Field a:Landroid/support/transition/y;
      12: invokestatic  #24                 // Method android/support/transition/y.c:(Landroid/support/transition/y;)I
      15: ifne          34
      18: aload_0
      19: getfield      #15                 // Field a:Landroid/support/transition/y;
      22: iconst_0
      23: invokestatic  #27                 // Method android/support/transition/y.a:(Landroid/support/transition/y;Z)Z
      26: pop
      27: aload_0
      28: getfield      #15                 // Field a:Landroid/support/transition/y;
      31: invokevirtual #30                 // Method android/support/transition/y.k:()V
      34: aload_1
      35: aload_0
      36: invokevirtual #35                 // Method android/support/transition/u.b:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
      39: pop
      40: return

  public void d(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/transition/y;
       4: invokestatic  #39                 // Method android/support/transition/y.a:(Landroid/support/transition/y;)Z
       7: ifne          26
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/transition/y;
      14: invokevirtual #42                 // Method android/support/transition/y.j:()V
      17: aload_0
      18: getfield      #15                 // Field a:Landroid/support/transition/y;
      21: iconst_1
      22: invokestatic  #27                 // Method android/support/transition/y.a:(Landroid/support/transition/y;Z)Z
      25: pop
      26: return
}
